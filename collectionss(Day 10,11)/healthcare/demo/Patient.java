package com.healthcare.demo;

public class Patient {
    private String id;
    private String name;
    private String illness;
    
    public Patient(String id, String name, String illness) {
        this.id = id;
        this.name = name;
        this.illness = illness;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIllness() {
        return illness;
    }

    
}
