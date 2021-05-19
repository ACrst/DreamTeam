package com.example.dreamteam;


import android.widget.Toast;

public class TeamMaster {
    //Randomly generated alphanumeric, defines this team.
    private String roomPin;
    //userName of the Host
    private String host;
    //List of Users joining this Team
    private User[] listOfUsers;
    //These are the four sub teams.
    public SubTeamMaster team1;
    public  SubTeamMaster team2;
    public  SubTeamMaster team3;
    public  SubTeamMaster team4;
    //These are the 3 questions associated with this room pin
    private QuestionMaster question1;
    private QuestionMaster question2;
    private QuestionMaster question3;

    public TeamMaster(){
        //Initializing subteams
        team1.setTeamID(1);
        team2.setTeamID(2);
        team3.setTeamID(3);
        team4.setTeamID(4);
    }

    public void setHostName(String uname){
        if (uname.length() > 15 || uname.length() < 3 ){
           // Toast.makeText(TeamMaster.this, "User Name must be between 3 and 15 characters", Toast.LENGTH_SHORT).show();
        }
        else{
            host = uname;
        }
    }

    public void setRoomPin(String pin){
        roomPin = pin;
    }

}
