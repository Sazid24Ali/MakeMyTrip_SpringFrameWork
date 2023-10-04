package com.trips;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext AppObject = new ClassPathXmlApplicationContext("Spring.config.xml");

        Trip trip_object = AppObject.getBean("TripObject", Trip.class);

        Scanner InputObject = new Scanner(System.in);
        System.out.println(""+
        "\n1 . Bus Ways "+
        "\n2 . Train Ways "+
        "\n3 . Air Ways ");
        System.out.print("\nEnter the Transaport For the Travel : ");
        int choice = InputObject.nextInt();

        switch (choice) {
            case 1:
                System.out.println(trip_object.getBus_object());
                trip_object.getBus_object().getjourney();
                trip_object.getBus_object().getcost();
                break;
            case 2:
                System.out.println(trip_object.getTrain_object());
                trip_object.getTrain_object().getjourney();
                trip_object.getTrain_object().getcost();
                break;
            case 3 :
                System.out.println(trip_object.getAirways_object());
                trip_object.getAirways_object().getjourney();
                trip_object.getAirways_object().getcost();
                break;
            default:
                System.out.println(" Wrong Input Closing THe Program ");
                break;
        }
        
        

        // Explicitly close the application context when done
        ((AbstractApplicationContext) AppObject).close();
        InputObject.close();
    }
}
