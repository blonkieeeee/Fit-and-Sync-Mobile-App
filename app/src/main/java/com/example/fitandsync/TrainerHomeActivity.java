package com.example.fitandsync;

import android.os.Bundle;
import android.view.MenuItem;
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

        scheduledList = findViewById(R.id.recyclerViewScheduled);
        bottomNav = findViewById(R.id.bottomNav);

        // Set up RecyclerView
        scheduledList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MemberAdapter(this); // Your actual adapter class
        scheduledList.setAdapter(adapter);

        // Navigation item selected listener


    }
}
