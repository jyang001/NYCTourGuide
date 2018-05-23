package com.example.wobofet.nyctour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OtherActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        ViewPager v = (ViewPager) findViewById(R.id.viewpager);
        CategoryAdapter a = new CategoryAdapter(this, getSupportFragmentManager());
        v.setAdapter(a);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(v);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_menu_gallery).select();
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_menu_gallery);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_menu_gallery);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_menu_gallery);
    }
}

