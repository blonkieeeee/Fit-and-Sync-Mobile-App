package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.registerpage), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
        Button verification = findViewById(R.id.registerBtn);
        verification.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, Verification.class);
            startActivity(intent);
        });

        TextView loginRedirect = findViewById(R.id.loginRedirect);
        loginRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to login screen
                Intent intent = new Intent(RegisterActivity.this, Login.class);
                startActivity(intent);
            }
        });
        Spinner planSpinner = findViewById(R.id.planSpinner);
        String[] plans = {"Select Plan", "Monthly", "Quarterly", "Yearly"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, plans);
        planSpinner.setAdapter(adapter);
    }
}