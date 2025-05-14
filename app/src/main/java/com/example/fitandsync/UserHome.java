package com.example.fitandsync;

import com.example.fitandsync.R;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UserHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home); // Set your layout

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_subscription) {
                startActivity(new Intent(UserHome.this, SubscriptionStatusActivity.class));
                return true;
            } else if (id == R.id.nav_attendance) {
                startActivity(new Intent(UserHome.this, UserAttendanceActivity.class));
                return true;
            } else if (id == R.id.nav_account) {
                startActivity(new Intent(UserHome.this, UserAccountSettingsActivity.class));
                return true;
            }
            return false;

        });



    }
}
