package com.example.unparcheapp.cruds.event;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.unparcheapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReadEventActivity extends AppCompatActivity {

    TextView tvName, tvDescription, tvDate, tvTime, tvActivity;
    RecyclerView rvUsers;
    FloatingActionButton fabEdit, fabErase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_event);

        tvName=findViewById(R.id.textViewEventName);
        tvActivity=findViewById(R.id.textViewEventActivity);
        tvDate=findViewById(R.id.textViewEventDate);
        tvTime=findViewById(R.id.textViewEventTime);
        tvDescription=findViewById(R.id.textViewEventDescription);

        rvUsers=findViewById(R.id.recyclerViewUsers);

        fabEdit=findViewById(R.id.floatingActionButtonEditEvent);
        fabErase=findViewById(R.id.floatingActionButtonEraseEvent);

        fabEdit.setOnClickListener(view -> {
            //
        });

        fabErase.setOnClickListener(view -> {
            //
        });
    }
}