package com.example.unparcheapp.cruds.site;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.unparcheapp.R;
import com.example.unparcheapp.cruds.event.EventActivity;
import com.example.unparcheapp.cruds.friend.FriendActivity;
import com.example.unparcheapp.cruds.login.RegisterActivity;

public class MapSiteActivity extends AppCompatActivity {

    private Button mapBtn;
    private Button friBtn;
    private Button eveBtn;
    private Button proBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_site);

        mapBtn = (Button) findViewById(R.id.idBtnMapMap);
        friBtn = (Button) findViewById(R.id.idBtnMapFri);
        eveBtn = (Button) findViewById(R.id.idBtnMapEve);
        proBtn = (Button) findViewById(R.id.idBtnMapPro);

        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MapSiteActivity.class);
                startActivity(intent);

            }
        });

        eveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EventActivity.class);
                startActivity(intent);
            }
        });

        friBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FriendActivity.class);
                startActivity(intent);

            }
        });

        proBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });



    }
}