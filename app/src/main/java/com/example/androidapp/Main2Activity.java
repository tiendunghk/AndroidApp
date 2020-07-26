package com.example.androidapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import com.example.androidapp.models.Contact;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView lvlDb;
    ArrayList<Contact> lstContacts;
    ArrayAdapter<Contact> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvlDb=findViewById(R.id.lvlDb);

        lstContacts=new ArrayList<>();
        GetAllContacts();


        adapter=new ArrayAdapter<>(Main2Activity.this, android.R.layout.simple_list_item_1,lstContacts);
        lvlDb.setAdapter(adapter);
    }

    private void GetAllContacts() {


            Uri uri= ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            Cursor cursor=getContentResolver().query(uri,null,null,null,null);
            lstContacts.clear();

        while (cursor.moveToNext())
        {
            String tenCotContact=ContactsContract.Contacts.DISPLAY_NAME;
            String tenCotName=ContactsContract.CommonDataKinds.Phone.NUMBER;
            int vitriName=cursor.getColumnIndex(tenCotName);
            int vitriPhone=cursor.getColumnIndex(tenCotContact);
            String name=cursor.getString(vitriName);
            String phone=cursor.getString(vitriPhone);
            Contact ct=new Contact(name,phone);
            lstContacts.add(ct);
            //adapter.notifyDataSetChanged();
        }
    }
}
