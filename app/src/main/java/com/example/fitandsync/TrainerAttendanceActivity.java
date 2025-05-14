package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class TrainerAttendanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BottomNavigationView bottomNav = findViewById(R.id.trainerBottomNav);

        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_sessions) {
                startActivity(new Intent(TrainerAttendanceActivity.this, TrainerHomeActivity.class));
                return true;
            }  else if (id == R.id.nav_income) {
                startActivity(new Intent(TrainerAttendanceActivity.this, TrainerIncomeActivity.class));
                return true;
            } else if (id == R.id.nav_schedule) {
                startActivity(new Intent(TrainerAttendanceActivity.this, SetScheduleActivity.class));
                return true;
            } else if (id == R.id.nav_account) {
                startActivity(new Intent(TrainerAttendanceActivity.this, TrainerAccountActivity.class));
                return true;
            }

            return false;
        });

        Button  historybutton = findViewById(R.id.historyButton);
        historybutton.setOnClickListener(v -> {
            Intent intent = new Intent(TrainerAttendanceActivity.this, AttendanceHistoryActivity.class);
            startActivity(intent);
        });

    }
}