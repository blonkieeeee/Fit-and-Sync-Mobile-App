package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TrainerLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trainer_login);

        Button verification = findViewById(R.id.trainerLoginBtn);
        verification.setOnClickListener(v -> {
            Intent intent = new Intent(TrainerLogin.this, TrainerHomeActivity.class);
            startActivity(intent);
        });
        Button customerlogin = findViewById(R.id.memberLogin);
        customerlogin.setOnClickListener(v -> {
            Intent intent = new Intent(TrainerLogin.this, MainActivity.class);
            startActivity(intent);
        });

    }
}