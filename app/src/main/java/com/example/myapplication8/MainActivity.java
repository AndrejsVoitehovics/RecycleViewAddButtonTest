package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecycleViewAdapter adapter;
    Button button;
    EditText editText;
    ArrayList<String> database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        database = new ArrayList<String>();
        database.add("sasasa");
        super.onCreate(savedInstanceState);
        this.onResume();
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view_window);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecycleViewAdapter(database);
        recyclerView.setAdapter(adapter);

    }
        @Override
        protected void onStart () {
            super.onStart();
            editText = findViewById(R.id.textView2);
            button = findViewById(R.id.button2);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    database.add(editText.getText().toString());
                }
            });

        }
    }

