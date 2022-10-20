package com.example.unparcheapp.cruds.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.unparcheapp.R;
import com.example.unparcheapp.cruds.friend.FriendActivity;
import com.example.unparcheapp.cruds.login.RegisterActivity;
import com.example.unparcheapp.cruds.site.MapSiteActivity;
import com.example.unparcheapp.cruds.site.ReadSiteActivity;

public class EventActivity extends AppCompatActivity {

    private Button mapBtn;
    private Button friBtn;
    private Button eveBtn;
    private Button proBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


        mapBtn = (Button) findViewById(R.id.idBtnEveMap);
        friBtn = (Button) findViewById(R.id.idBtnEveFri);
        eveBtn = (Button) findViewById(R.id.idBtnEveEve);
        proBtn = (Button) findViewById(R.id.idBtnEvePro);

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