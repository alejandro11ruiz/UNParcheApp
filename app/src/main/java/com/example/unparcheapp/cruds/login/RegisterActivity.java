package com.example.unparcheapp.cruds.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.unparcheapp.R;
import com.example.unparcheapp.cruds.site.ReadSiteActivity;

public class RegisterActivity extends AppCompatActivity {

    private Button cnlBtn;
    private Button regisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        cnlBtn = (Button) findViewById(R.id.idBtnRigCnl);
        regisBtn = (Button) findViewById(R.id.idBtnRegReg);

        cnlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivity(intent);

            }
        });

        regisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}