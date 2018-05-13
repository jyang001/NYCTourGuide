package com.example.wobofet.nyctour;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager v = (ViewPager) findViewById(R.id.viewpager);
        CategoryAdapter a = new CategoryAdapter(this,getSupportFragmentManager());
        v.setAdapter(a);
        TabLayout t = (TabLayout) findViewById(R.id.tabs);
        t.setupWithViewPager(v);
    }
}
