package com.example.unparcheapp.cruds.event;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.unparcheapp.R;

public class CreateUpdateEventActivity extends AppCompatActivity {

    EditText teName, teDescription, teDate, teTime;
    Spinner spinnerActivities;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_update_event);

        teName =findViewById(R.id.editTextEventName);
        teDate =findViewById(R.id.editTextEventDate);
        teTime =findViewById(R.id.editTextEventTime);
        teDescription =findViewById(R.id.editTextEventDescription);

        btnSave=findViewById(R.id.buttonEventSave);

        spinnerActivities=findViewById(R.id.spinnerActivities);

        btnSave.setOnClickListener(view -> {
            //
        });
    }
}