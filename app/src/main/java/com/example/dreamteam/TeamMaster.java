package com.example.dreamteam;


public class TeamMaster {
    //Randomly generated alphanumeric, defines this team.
    private String roomPin;
    //userName of the Host
    private String host;
    //List of Users joining this Team
    private User[] listOfUsers;
    //These are the four sub teams.
    private SubTeamMaster team1;
    private SubTeamMaster team2;
    private SubTeamMaster team3;
    private SubTeamMaster team4;
    //These are the 3 questions associated with this room pin
    private QuestionMaster question1;
    private QuestionMaster question2;
    private QuestionMaster question3;

}
