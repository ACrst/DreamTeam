/*
 * Page 1 is the first page the user sees, they have the choice of two buttons, one that leads to a team creation page, and the other that leads them
 * to a page that can be joined.
 */
package com.example.dreamteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Page1 extends AppCompatActivity implements View.OnClickListener {
    //Common Landing page for the app
    //Private Variables
    private Button joinTeamButton, createTeamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinTeamButton = (Button) findViewById(R.id.joinTeamButton);
        createTeamButton = (Button) findViewById(R.id.createTeamButton);
        joinTeamButton.setOnClickListener(this);
        createTeamButton.setOnClickListener(this);

        
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.createTeamButton:
                Toast.makeText(Page1.this,"Create Team button clicked",Toast.LENGTH_SHORT).show();
                Intent createTeamIntent=new Intent(Page1.this, PageH1.class);
                startActivity(createTeamIntent);
                break;


            case R.id.joinTeamButton:
                Toast.makeText(Page1.this,"Join Team button clicked",Toast.LENGTH_SHORT).show();
                Intent joinTeamIntent=new Intent(Page1.this, PageU1.class);
                startActivity(joinTeamIntent);
                break;


        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}