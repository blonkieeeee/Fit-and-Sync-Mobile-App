package com.example.fitandsync;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TrainerAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_account); // Make sure this matches your layout file name

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);

        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_sessions) {
                startActivity(new Intent(TrainerAccountActivity.this, TrainerHomeActivity.class));
                return true;
            }  else if (id == R.id.nav_income) {
                startActivity(new Intent(TrainerAccountActivity.this, TrainerIncomeActivity.class));
                return true;
            } else if (id == R.id.nav_setsession) {
                startActivity(new Intent(TrainerAccountActivity.this, SetScheduleActivity.class));
                return true;
            } else if (id == R.id.nav_attendance) {
                startActivity(new Intent(TrainerAccountActivity.this, TrainerAttendanceActivity.class));
                return true;
            }

            return false;
        });
    }


}
