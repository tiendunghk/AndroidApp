package com.example.androidapp;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    TextView txtMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btnMenu1);
        btn2=findViewById(R.id.btnMenu2);
        txtMenu=findViewById(R.id.txtMenu);
        registerForContextMenu(btn1);
        registerForContextMenu(btn2);
        registerForContextMenu(txtMenu);
    }

    public void MoMan(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=this.getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);
    }
}
