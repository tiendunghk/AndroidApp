package com.example.androidapp;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main7Activity extends AppCompatActivity {

    TextView getFragmentdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        getFragmentdata=findViewById(R.id.getFragmentdata);
        Intent intent=getIntent();
        getFragmentdata.setText(intent.getStringExtra("Data"));

    }

    public void showPopup(View view) {
        BlankFragment fragment=BlankFragment.newInstance();
        fragment.show(getSupportFragmentManager(),null);
    }
}
