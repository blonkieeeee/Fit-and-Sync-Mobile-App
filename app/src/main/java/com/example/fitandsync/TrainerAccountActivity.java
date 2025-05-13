package com.example.fitandsync;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TrainerAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_account); // Make sure this matches your layout file name

        setField(findViewById(R.id.rowUsername), "Username", "trainer_john");
        setField(findViewById(R.id.rowEmail), "Email", "john@example.com");
        setField(findViewById(R.id.rowPhone), "Phone", "+63 912 345 6789");
        setField(findViewById(R.id.rowPassword), "Password", "********");
        setField(findViewById(R.id.rowAddress), "Address", "123 Makati City");
        setField(findViewById(R.id.rowGender), "Gender", "Male");
        setField(findViewById(R.id.rowBirthday), "Birthday", "1990-05-12");
    }

    private void setField(View includeView, String label, String value) {
        TextView labelView = includeView.findViewById(R.id.label);
        TextView valueView = includeView.findViewById(R.id.value);
        ImageView editIcon = includeView.findViewById(R.id.editIcon);

        labelView.setText(label);
        valueView.setText(value);

        editIcon.setOnClickListener(v -> {
            // TODO: Open dialog to edit the value
        });
    }
}
