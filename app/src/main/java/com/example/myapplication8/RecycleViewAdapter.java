package com.example.myapplication8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder> {

    ArrayList<String> database = new ArrayList<String>();
    String[] testStringArray = new String[]{
            "Test1", "Test2", "Test3", "Test4"
    };

    RecycleViewAdapter(ArrayList<String> database) {
        this.database = database;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int numberForLayaut = R.layout.recycle_view_element;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(numberForLayaut, parent, false);
        RecycleViewHolder viewHolder = new RecycleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return database.size();
    }

    class RecycleViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_for_recycle_view_element);
        }

        void bindData(int listIndex) {
            textView.setText(String.valueOf(database.get(listIndex)));
        }
    }

    {

    }
}
