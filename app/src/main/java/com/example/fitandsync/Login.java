package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button btnloginmember = findViewById(R.id.btnLoginMember);
        btnloginmember.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        });

        Button btnregister = findViewById(R.id.btnRegisterMember);
        btnregister.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, RegisterActivity.class);
            startActivity(intent);
        });

        Button btnlogintrainer = findViewById(R.id.btnLoginTrainer);
        btnlogintrainer.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, TrainerLogin.class);
            startActivity(intent);
        });

    }
}