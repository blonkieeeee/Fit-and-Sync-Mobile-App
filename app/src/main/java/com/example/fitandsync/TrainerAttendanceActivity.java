package com.example.fitandsync;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TrainerAttendanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView assignedMemberList = findViewById(R.id.assignedMemberList);
        AssignedMemberAdapter adapter = new AssignedMemberAdapter();
        assignedMemberList.setLayoutManager(new LinearLayoutManager(this));
        assignedMemberList.setAdapter(adapter);

        List<Member> members = new ArrayList<>();
        members.add(new Member("John Doe", "Plan A - MWF"));
        members.add(new Member("Jane Smith", "Plan B - TTh"));
        adapter.setMembers(members);


    }
}