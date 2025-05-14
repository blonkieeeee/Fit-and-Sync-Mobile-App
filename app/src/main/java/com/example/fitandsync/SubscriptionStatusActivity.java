package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SubscriptionStatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subscription_status);
        BottomNavigationView bottomNav = findViewById(R.id.userBottomNav);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_schedule) {
                startActivity(new Intent(SubscriptionStatusActivity.this, UserHome.class));
                return true;
            } else if (id == R.id.nav_attendance) {
                startActivity(new Intent(SubscriptionStatusActivity.this, UserAttendanceActivity.class));
                return true;
            } else if (id == R.id.nav_account) {
                startActivity(new Intent(SubscriptionStatusActivity.this, UserAccountSettingsActivity.class));
                return true;
            }
            return false;

        });

    }
}