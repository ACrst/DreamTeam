package com.example.dreamteam;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class SubTeamMaster {
    private int teamID; //Can only be 1,2,3,4
    public String teamName; // Eg, Team Basketball
    //the list of users in this subteam.
    List<User> listOfSubUsers;

    public SubTeamMaster(){
        this.teamID = 0;
        this.teamName = "";
        this.listOfSubUsers = new ArrayList<User>();
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamid) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getSubTeamSize(){return listOfSubUsers.size();}

    public boolean isFull(int avgNumPeople){
        if(listOfSubUsers.size() >= avgNumPeople){
            return true;
        }
        return false;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(User aUser){
        listOfSubUsers.add(aUser);
    }


}
