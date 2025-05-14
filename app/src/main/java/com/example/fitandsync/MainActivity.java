package com.example.fitandsync;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This will go to UserHome.java
                Intent intent = new Intent(MainActivity.this, UserHome.class);
                startActivity(intent);
            }
        });

        Button register = findViewById(R.id.appleLogin);
        register.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        Button trainerlogin = findViewById(R.id.googleLogin);
        trainerlogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TrainerLogin.class);
            startActivity(intent);
        });

    }
}