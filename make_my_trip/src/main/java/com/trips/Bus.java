package com.trips;

public class Bus implements Travel {

    private String Busway_object;

    public String getBusway_object() {
        return Busway_object;
    }

    public void setBusway_object(String busway_object) {
        Busway_object = busway_object;
    }

    public Bus() {
        //System.out.println("Bus Object Created");
        System.out.println("Initialsing Busways");
    }

    @Override
    public void getcost() {
        System.out.println("The Cost To Travel Bus is 200Rs");
    }

    @Override
    public void getjourney() {
        System.out.println("THe Journey is From Hyderbad To Warangal ");

    }
    
    @Override
    public String toString() {
        return "\nBus Way Selected ";
    }

}
