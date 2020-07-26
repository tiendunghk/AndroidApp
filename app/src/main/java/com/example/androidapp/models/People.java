package com.example.androidapp.models;

import androidx.annotation.NonNull;

public class People {
    public String name;
    public String city;
    public String company;

    public People(String name, String city, String company) {
        this.name = name;
        this.city = city;
        this.company = company;
    }

    @NonNull
    @Override
    public String toString() {
        return name+"-"+city+"-"+company;
    }
}
