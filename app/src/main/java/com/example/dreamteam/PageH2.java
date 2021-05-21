package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
//Host creates 4 team names and saves it after clicking SAVE button
//Host Page 2

public class PageH2 extends AppCompatActivity {
    //Views
    private Button saveButton;
    private EditText team1Text, team2Text, team3Text,team4Text;
    private String team1Name, team2Name, team3Name, team4Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_h2);

        //Validate views
        saveButton = (Button) findViewById(R.id.button_save);
        /*team1Text = (EditText) findViewById(R.id.editText_team1);
        team2Text = (EditText) findViewById(R.id.editText_team2);
        team3Text = (EditText) findViewById(R.id.editText_team3);
        team4Text = (EditText) findViewById(R.id.editText_team4);

        //Extract strings from Views
        team1Name = team1Text.getText().toString();
        team2Name = team2Text.getText().toString();
        team3Name = team3Text.getText().toString();
        team4Name = team4Text.getText().toString();*/

        //Populate Team Master Object on button click
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                //Make sure no fields are left null
                while (team1Name == null && team1Name == null && team1Name == null && team1Name == null){
                    Toast.makeText(PageH2.this,"Please enter all 4 team names",Toast.LENGTH_SHORT).show();
                }

                //Add the new team names to the subTeam objects within Team Master
                PageH1.teamMaster.team1.setTeamName(team1Name);
                PageH1.teamMaster.team2.setTeamName(team2Name);
                PageH1.teamMaster.team3.setTeamName(team3Name);
                PageH1.teamMaster.team4.setTeamName(team4Name);
*/
                Intent intent = new Intent(PageH2.this, PageH3a.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
