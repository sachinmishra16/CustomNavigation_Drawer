package com.blueapple.customnavigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Navigation");



        //toolbar.setBackgroundColor(Color.parseColor("#EC79A3"));

        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);

        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();
                if (id == R.id.nav_gallery) {

                    Toast.makeText(MainActivity.this, "Gallery", Toast.LENGTH_SHORT).show();

                    // Handle the camera action
                } else if (id == R.id.nav_slideshow) {

                    Toast.makeText(MainActivity.this, "SlideShow", Toast.LENGTH_SHORT).show();


                } else if (id == R.id.nav_share) {

                    Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_send) {

                    Toast.makeText(MainActivity.this, "Send", Toast.LENGTH_SHORT).show();
                }
                DrawerLayout drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);

                return true;
            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.custom_menu, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_profile) {
           // startActivity(new Intent(mContext, MyAccountActivity.class));

            Toast.makeText(this, "User Profile", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.action_cart) {
            //startActivity(new Intent(mContext, CartActivity.class));

            Toast.makeText(this, "Welcome in Cart", Toast.LENGTH_SHORT).show();

        }
        else
            if (id==R.id.action_settings)
            {
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            }

        return super.onOptionsItemSelected(item);
    }
}
