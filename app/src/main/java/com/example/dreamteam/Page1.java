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

public class Page1 extends AppCompatActivity implements View.OnClickListener {

    //Private Variables
    private Button joinTeamButton, createTeamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinTeamButton = (Button) findViewById(R.id.joinTeamButton);
        joinTeamButton.setOnClickListener(this);
        createTeamButton = (Button) findViewById(R.id.createTeamButton);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //If the User clicks on joinTeam, they are taken to page 2.
            case R.id.joinTeamButton:
                startActivity(new Intent(this, Page2.class));
                break;

            case R.id.createTeamButton:
                //startActivity(new Intent(this, Page5.class));
                break;
        }
    }
}