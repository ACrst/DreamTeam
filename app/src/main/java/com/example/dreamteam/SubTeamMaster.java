package com.example.dreamteam;

import java.util.ArrayList;
import java.util.List;

public class SubTeamMaster {
    private int teamID; //Can only be 1,2,3,4
    private String teamName; // Eg, Team Basketball
    //private User[] listOfSubUsers; //the list of users in this subteam.
    List<User> listOfSubUsers =  new ArrayList<User>();

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

    public void addTeamMember(User aUser){
        listOfSubUsers.add(aUser);
    }
}
