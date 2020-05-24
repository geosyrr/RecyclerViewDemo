package com.codehub.testtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    String[] headings = {
            "Heading 1",
            "Heading 2",
            "Heading 3",
            "Heading 4",
            "Heading 5",
            "Heading 6",
            "Heading 7",
            "Heading 8",
            "Heading 9",
            "Heading 10"

    };

    String[] tagLine = {
            "tagLine 1",
            "tagLine 2",
            "tagLine 3",
            "tagLine 4",
            "tagLine 5",
            "tagLine 6",
            "tagLine 7",
            "tagLine 8",
            "tagLine 9",
            "tagLine 10"
    };
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main2, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.view1.setText(headings[position]);
        holder.view2.setText(tagLine[position]);
    }

    @Override
    public int getItemCount() {
        return headings.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView view1, view2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view1 = itemView.findViewById(R.id.view1);
            view2 = itemView.findViewById(R.id.view2);
        }
    }
}
