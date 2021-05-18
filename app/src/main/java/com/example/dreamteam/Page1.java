/*
 * Page 1 is the first page the user sees, they have the choice of two buttons, one that leads to a team creation page, and the other that leads them
 * to a page that can be joined.
 */
package com.example.dreamteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Page1 extends AppCompatActivity implements View.OnClickListener {
    //Common Landing page for the app
    //Private Variables
    public Button joinTeamButton, createTeamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinTeamButton = (Button) findViewById(R.id.joinTeamButton);
        joinTeamButton.setOnClickListener(this);
        createTeamButton = (Button) findViewById(R.id.createTeamButton);
        createTeamButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //If the User clicks on joinTeam, they are taken to page 2.
            case R.id.joinTeamButton:
                Toast.makeText(Page1.this,"Join Team button clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, PageU1.class));
                break;

            case R.id.createTeamButton:
                Toast.makeText(Page1.this,"Create Team button clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, PageH1.class));
                break;
        }
    }
}