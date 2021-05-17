package com.example.dreamteam;

public class SubTeamMaster {
    private int teamID; //Can only be 1,2,3,4
    private String teamName; // Eg, Team Basketball
    private User[] listOfSubUsers; //the list of users in this subteam.

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamid) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
