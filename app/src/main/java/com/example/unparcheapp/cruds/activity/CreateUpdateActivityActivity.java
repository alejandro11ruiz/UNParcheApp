package com.example.unparcheapp.cruds.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.unparcheapp.R;

public class CreateUpdateActivityActivity extends AppCompatActivity {

    EditText teName, teDescription;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_update_activity);

        teName =findViewById(R.id.editTextActivityName);
        teDescription =findViewById(R.id.editTextActivityDescription);

        btnSave=findViewById(R.id.buttonActivitySave);

        btnSave.setOnClickListener(view -> {
            //
        });

    }
}