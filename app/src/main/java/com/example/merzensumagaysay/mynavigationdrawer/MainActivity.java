package com.example.merzensumagaysay.mynavigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new CustomPagerAdapter(this));

        drawerLayout = findViewById(R.id.drawerId);


        NavigationView navigationView = findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Intent intent;

        if(item.getItemId()==R.id.mainMenuId)
        {
            intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }

        else if(item.getItemId()==R.id.opMessageMenuId)
        {
            intent = new Intent(this,ChatActivity.class);
            startActivity(intent);
        }

        else if(item.getItemId()==R.id.locationMenuId)
        {
            intent = new Intent(this,LocationActivity.class);
            startActivity(intent);
        }


        return false;
    }
}
