package com.example.fitandsync;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class UserAttendanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_attendance);
        CardView cardPrize = findViewById(R.id.cardPrize1);

        BottomNavigationView bottomNav = findViewById(R.id.userBottomNav);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_schedule) {
                startActivity(new Intent(UserAttendanceActivity.this, UserHome.class));
                return true;
            } else if (id == R.id.nav_subscription) {
                startActivity(new Intent(UserAttendanceActivity.this, SubscriptionStatusActivity.class));
                return true;
            } else if (id == R.id.nav_account) {
                startActivity(new Intent(UserAttendanceActivity.this, UserAccountSettingsActivity.class));
                return true;
            }
            return false;

        });



        Button customerlogin = findViewById(R.id.btnViewHistory);
        customerlogin.setOnClickListener(v -> {
            Intent intent = new Intent(UserAttendanceActivity.this, UserHistoryCheck.class);
            startActivity(intent);
        });

        cardPrize.setOnClickListener(v -> {
            View dialogView = getLayoutInflater().inflate(R.layout.dialog_claim_prize, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(dialogView);

            TextView tvPrizeTitle = dialogView.findViewById(R.id.tvPrizeTitle);
            TextView tvPointsNeeded = dialogView.findViewById(R.id.tvPointsNeeded);
            ImageView imgPrizeQr = dialogView.findViewById(R.id.imgPrizeQr);
            Button btnClaimPrize = dialogView.findViewById(R.id.btnClaimPrize);

            // Set placeholder content
            tvPrizeTitle.setText("Free Protein Shake");
            tvPointsNeeded.setText("Requires 10 Points");

            // Set QR placeholder manually (can be generated later)
            imgPrizeQr.setImageResource(R.drawable.sample_qr_code);

            // Claim button (UI only for now)
            btnClaimPrize.setOnClickListener(btnView -> {
                Toast.makeText(this, "Prize Claimed (UI only)", Toast.LENGTH_SHORT).show();
            });

            AlertDialog dialog = builder.create();
            dialog.show();
        });


    }
}