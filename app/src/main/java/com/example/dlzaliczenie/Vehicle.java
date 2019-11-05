package com.example.dlzaliczenie;

import androidx.annotation.NonNull;

public class Vehicle {

    private String vName;

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    public Vehicle(){
        vName = "default vehicle";
    }
    public Vehicle(String name){
        vName = name;
    }
}
