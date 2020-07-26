package com.example.androidapp.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Contact implements Serializable {
    public String Name;
    public String Phone;

    public Contact(String name, String phone) {
        Name = name;
        Phone = phone;
    }

    @NonNull
    @Override
    public String toString() {
        return Name+"-"+Phone;
    }
}
