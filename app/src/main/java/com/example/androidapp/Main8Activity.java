package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.example.androidapp.adapters.PaperAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Main8Activity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    TabItem item1,item2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        viewPager=findViewById(R.id.viewPaper);
        tabLayout=findViewById(R.id.tabLayout);
        item1=findViewById(R.id.item1);
        item2=findViewById(R.id.item2);

        PaperAdapter pagerAdapter=new PaperAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
    }
}
