package com.example.androidapp;

import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.androidapp.models.People;

import java.util.ArrayList;

public class main6 extends AppCompatActivity {

    ListView lvlData;
    ArrayList<People> lstPeople;
    ArrayAdapter<People> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        lvlData=findViewById(R.id.lvlDb);
        lstPeople=new ArrayList<>();
        adapter=new ArrayAdapter<>(main6.this, android.R.layout.simple_list_item_1,lstPeople);
        lvlData.setAdapter(adapter);
    }
    public class PeopleTask extends AsyncTask<Void,Void,ArrayList<People>>{

        @Override
        protected ArrayList<People> doInBackground(Void... voids) {
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            adapter.clear();
        }

        @Override
        protected void onPostExecute(ArrayList<People> people) {
            super.onPostExecute(people);
            adapter.clear();
            adapter.addAll(people);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }
}
