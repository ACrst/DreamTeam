package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PageH4 extends AppCompatActivity {
    //Host View Page
    private Button dreamifyButton;
    public int avgNumMembers;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_h4);

        //Button Listener
        dreamifyButton = (Button) findViewById(R.id.buttonDreamTeamify);

        //Now poll database and continually update the Host with the users being added in.
        /*PageH1.root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                snapshot.child(PageH1.roompin).child("listOfUsers").getValue();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/

        //Button click listener
        dreamifyButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
       /*         if (PageH1.teamMaster.listOfUsers.size() != 0) {
                    *//* This algorithm splits the users into subteams based on each individual user's likelihood Score.
                     * THe likelihood Score is calculated in the User Class and is a number between 1-4. a perfect whole number like 1,2,3 or 4 means they
                     * are perfectly suited for the teams 1,2,3,4 respectively. A floating point score means they are put in the team they most closely match.
                     * For ex, a score of 1.25 assigns them to team 1.
                     *//*
                    List<User> overFlowUsers = new ArrayList<User>();

                    //Ensuring that avgNumMembers is never 0
                    avgNumMembers = (PageH1.teamMaster.listOfUsers.size())/4;
                    if (avgNumMembers == 0) {avgNumMembers = 1;}

                    for (User user : PageH1.teamMaster.listOfUsers) {
                        if (user.getLikelihoodScore() <= 1.5) {
                            //If the team is already at capacity, add them to a overflow list.
                            if (PageH1.teamMaster.team1.isFull(avgNumMembers)) {
                                overFlowUsers.add(user);
                            } else {
                                PageH1.teamMaster.team1.addTeamMember(user);
                            }
                        } else if (user.getLikelihoodScore() > 1.5 && user.getLikelihoodScore() <= 2.25) {
                            //If the team is already at capacity, add them to a overflow list.
                            if (PageH1.teamMaster.team2.isFull(avgNumMembers)) {
                                overFlowUsers.add(user);
                            } else {
                                PageH1.teamMaster.team2.addTeamMember(user);
                            }
                        } else if (user.getLikelihoodScore() > 2.25 && user.getLikelihoodScore() <= 3.25) {
                            //If the team is already at capacity, add them to a overflow list.
                            if (PageH1.teamMaster.team3.isFull(avgNumMembers)) {
                                overFlowUsers.add(user);
                            } else {
                                PageH1.teamMaster.team3.addTeamMember(user);
                            }
                        } else if (user.getLikelihoodScore() > 3.25 && user.getLikelihoodScore() <= 4) {
                            //If the team is already at capacity, add them to a overflow list.
                            if (PageH1.teamMaster.team4.isFull(avgNumMembers)) {
                                overFlowUsers.add(user);
                            } else {
                                PageH1.teamMaster.team4.addTeamMember(user);
                            }
                        }
                    }

                    //Now lets deal with the Overflow list.
                    //Additional members are added to teams with empty spots. any left over members are then added randomly to a team.
                    for (User user : overFlowUsers) {
                        if (!(PageH1.teamMaster.team1.isFull(avgNumMembers))) {
                            PageH1.teamMaster.team1.addTeamMember(user);
                            overFlowUsers.remove(user);
                        } else if (!(PageH1.teamMaster.team2.isFull(avgNumMembers))) {
                            PageH1.teamMaster.team2.addTeamMember(user);
                            overFlowUsers.remove(user);
                        } else if (!(PageH1.teamMaster.team3.isFull(avgNumMembers))) {
                            PageH1.teamMaster.team3.addTeamMember(user);
                            overFlowUsers.remove(user);
                        } else if (!(PageH1.teamMaster.team4.isFull(avgNumMembers))) {
                            PageH1.teamMaster.team4.addTeamMember(user);
                            overFlowUsers.remove(user);
                        }
                    }

                    //Randomly assign any left over users
                    int randGroup = 0;
                    int low = 1;
                    int high = 4;
                    while (overFlowUsers.size() != 0) {
                        Random rand = new Random();
                        Random r = new Random();
                        randGroup = r.nextInt(high - low) + low;
                        User user = overFlowUsers.remove(0);
                        if (randGroup == 1) {
                            PageH1.teamMaster.team1.addTeamMember(user);
                        } else if (randGroup == 2) {
                            PageH1.teamMaster.team2.addTeamMember(user);
                        } else if (randGroup == 3) {
                            PageH1.teamMaster.team3.addTeamMember(user);
                        } else if (randGroup == 4) {
                            PageH1.teamMaster.team4.addTeamMember(user);
                        }
                    }
                }

                else{
                    Toast.makeText(PageH4.this,"No users to split up.",Toast.LENGTH_SHORT).show();
                }
*/
                //Jump to new Activity
                Intent intent = new Intent(PageH4.this, PageH5.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
