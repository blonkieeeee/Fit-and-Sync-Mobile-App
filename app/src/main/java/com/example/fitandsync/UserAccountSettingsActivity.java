package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UserAccountSettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_account_settings);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_schedule) {
                startActivity(new Intent(UserAccountSettingsActivity.this, UserHome.class));
                return true;
            } else if (id == R.id.nav_subscription) {
                startActivity(new Intent(UserAccountSettingsActivity.this, SubscriptionStatusActivity.class));
                return true;
            } else if (id == R.id.nav_attendance) {
                startActivity(new Intent(UserAccountSettingsActivity.this, UserAttendanceActivity.class));
                return true;
            }
            return false;

        });
    }
}