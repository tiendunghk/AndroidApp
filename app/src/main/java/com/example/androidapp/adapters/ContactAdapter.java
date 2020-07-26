package com.example.androidapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import com.example.androidapp.models.Contact;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    Activity context;
    int resource;
    List<Contact> objects;
    public ContactAdapter(@NonNull Activity context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
    }
}
