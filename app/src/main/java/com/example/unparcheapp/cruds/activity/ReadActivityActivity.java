package com.example.unparcheapp.cruds.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.unparcheapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReadActivityActivity extends AppCompatActivity {

    TextView tvName, tvDescription;
    FloatingActionButton fabEdit, fabErase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_activity);

        tvName=findViewById(R.id.textViewActivityName);
        tvDescription=findViewById(R.id.textViewActivityDescription);

        fabEdit=findViewById(R.id.floatingActionButtonEditActivity);
        fabErase=findViewById(R.id.floatingActionButtonEraseActivity);

        fabEdit.setOnClickListener(view -> {
            //
        });

        fabErase.setOnClickListener(view -> {
            //
        });
    }
}