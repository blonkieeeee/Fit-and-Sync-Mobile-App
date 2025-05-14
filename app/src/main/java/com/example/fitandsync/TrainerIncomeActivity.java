package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TrainerIncomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trainer_income);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);

        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_sessions) {
                startActivity(new Intent(TrainerIncomeActivity.this, TrainerHomeActivity.class));
                return true;
            }  else if (id == R.id.nav_setsession) {
                startActivity(new Intent(TrainerIncomeActivity.this, SetScheduleActivity.class));
                return true;
            } else if (id == R.id.nav_attendance) {
                startActivity(new Intent(TrainerIncomeActivity.this, TrainerAttendanceActivity.class));
                return true;
            }
            else if (id == R.id.nav_account) {
                startActivity(new Intent(TrainerIncomeActivity.this,TrainerAccountActivity.class));
                return true;
            }

            return false;
        });
    }
}