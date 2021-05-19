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
        team1Text = (EditText) findViewById(R.id.editText_team1);
        team2Text = (EditText) findViewById(R.id.editText_team2);
        team3Text = (EditText) findViewById(R.id.editText_team3);
        team4Text = (EditText) findViewById(R.id.editText_team4);

        //Extract strings from Views
        team1Name = team1Text.getText().toString();
        team2Name = team2Text.getText().toString();
        team3Name = team3Text.getText().toString();
        team4Name = team4Text.getText().toString();

        //Populate Team Master Object on button click
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Add the new team names to the subTeam objects within Team Master
                PageH1.teamMaster.team1.setTeamName(team1Name);
                PageH1.teamMaster.team2.setTeamName(team2Name);
                PageH1.teamMaster.team3.setTeamName(team3Name);
                PageH1.teamMaster.team4.setTeamName(team4Name);

                Toast.makeText(PageH2.this,"Save button clicked",Toast.LENGTH_SHORT).show();

                //Make sure no fields are left null
                while (team1Name == null && team1Name == null && team1Name == null && team1Name == null){
                    Toast.makeText(PageH2.this,"Please enter all 4 team names",Toast.LENGTH_SHORT).show();
                }
                SubTeamMaster t1=new SubTeamMaster(1,team1Name);
                SubTeamMaster t2=new SubTeamMaster(2,team2Name);
                SubTeamMaster t3=new SubTeamMaster(3,team3Name);
                SubTeamMaster t4=new SubTeamMaster(4,team4Name);
                ArrayList<String> teamnamevalues=new ArrayList<>();
                for(int i=1;i<=4;i++)
                {
                    teamnamevalues.add(team1Name);
                    teamnamevalues.add(team2Name);
                    teamnamevalues.add(team3Name);
                    teamnamevalues.add(team4Name);
                }
                Intent h3aintent=new Intent(PageH2.this, PageH3a.class);
                h3aintent.putExtra("teamnames",teamnamevalues);
                // Jump to next page
                startActivity(h3aintent);
            }
        });
    }

}
