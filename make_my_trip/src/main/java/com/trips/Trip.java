package com.trips;

public class Trip {
    private Bus bus_object;
    private Train train_object;
    private Airways airways_object;
    

    public Train getTrain_object() {
        return train_object;
    }

    public void setTrain_object(Train train_object) {
        this.train_object = train_object;
    }

    public Airways getAirways_object() {
        return airways_object;
    }

    public void setAirways_object(Airways airways_object) {
        this.airways_object = airways_object;
    }

    public Trip() {
        System.out.println("Generating Trip ");
    }

    public Bus getBus_object() {
        return bus_object;
    }

    public void setBus_object(Bus bus_object) {
        this.bus_object = bus_object;
    }

}
