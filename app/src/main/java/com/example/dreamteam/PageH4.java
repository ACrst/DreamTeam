package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PageH4 extends AppCompatActivity {
    //Host View Page
    private Button dreamifyButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dreamifyButton = (Button) findViewById(R.id.buttonDreamTeamify);
        dreamifyButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageH4.this,"Dreeam Teamify Button",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PageH4.this, PageH5.class));

                //Assign each user into the subtem they are most likely to fall into.
                for (User user : PageH1.teamMaster.listOfUsers){
                        if (user.getLikelihoodScore() == 1){
                            PageH1.teamMaster.team1.addTeamMember(user);
                        }
                }


            }
        });
    }
}
