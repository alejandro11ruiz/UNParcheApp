package com.example.unparcheapp.cruds.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.unparcheapp.R;
import com.example.unparcheapp.cruds.site.ReadSiteActivity;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn;
    private Button regisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button) findViewById(R.id.idBtnLogLog);
        regisBtn = (Button) findViewById(R.id.idBtnLogReg);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ReadSiteActivity.class);
                startActivity(intent);

            }
        });

        regisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}