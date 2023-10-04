package com.trips;

public class Train implements Travel {

    private String Trainways_object;

    public String getTrainways_object() {
        return Trainways_object;
    }

    public void setTrainways_object(String trainways_object) {
        Trainways_object = trainways_object;
    }

    public Train() {
        //System.out.println("Train Object created");
        System.out.println("Initialsing Train Ways");
    }

    @Override
    public void getcost() {
        System.out.println("THe Cost To travl by train is : 500 Rs");
    }

    @Override
    public void getjourney() {
        System.out.println("The Journey is From Hyderbad to Bangalore");
    }
    
    @Override
    public String toString() {
        return "\nTrain Ways Selected ";
    }


}
