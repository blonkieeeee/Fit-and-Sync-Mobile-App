package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import com.example.fitandsync.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TrainerHomeActivity extends AppCompatActivity {

    RecyclerView scheduledList;
    MemberAdapter adapter; // Your custom adapter
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_home);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);

        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_setsession) {
                startActivity(new Intent(TrainerHomeActivity.this, SetScheduleActivity.class));
                return true;
            } else if (id == R.id.nav_income) {
                startActivity(new Intent(TrainerHomeActivity.this, TrainerIncomeActivity.class));
                return true;
            } else if (id == R.id.nav_attendance) {
                startActivity(new Intent(TrainerHomeActivity.this, TrainerAttendanceActivity.class));
                return true;
            } else if (id == R.id.nav_account) {
                startActivity(new Intent(TrainerHomeActivity.this, TrainerAccountActivity.class));
                return true;
            }

            return false;
        });


        // Navigation item selected listener


    }
}
