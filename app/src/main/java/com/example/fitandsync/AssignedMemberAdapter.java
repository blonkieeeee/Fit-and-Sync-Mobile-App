package com.example.fitandsync;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AssignedMemberAdapter extends RecyclerView.Adapter<AssignedMemberAdapter.ViewHolder> {

    private List<Member> members = new ArrayList<>();

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView memberName, memberDetails;

        public ViewHolder(View view) {
            super(view);
            memberName = view.findViewById(R.id.memberName);
            memberDetails = view.findViewById(R.id.memberDetails);
        }
    }

    @NonNull
    @Override
    public AssignedMemberAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.member_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Member member = members.get(position);
        holder.memberName.setText(member.getName());
        holder.memberDetails.setText(member.getDetails());
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    public void setMembers(List<Member> members) {
        this.members = members;
        notifyDataSetChanged();
    }
}
