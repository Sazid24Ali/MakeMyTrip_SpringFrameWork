package com.trips;

public class Airways implements Travel {
    private String Airways_object;

    public String getAirways_object() {
        return Airways_object;
    }

    public void setAirways_object(String airways_object) {
        Airways_object = airways_object;
    }

    public Airways() {
        //System.out.println("Airways Object Created");
        System.out.println("Initialsing Airways");
    }

    @Override
    public void getcost() {
        System.out.println("THe Cost To travl by Air is : 2000 Rs");

    }

    @Override
    public void getjourney() {
        System.out.println("The Journey is From Hyderbad to Chennai");

    }
    @Override
    public String toString() {
        return "\nAirways Selected ";
    }

    

}
