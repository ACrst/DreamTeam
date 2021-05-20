package com.example.dreamteam;



//class to record User responses
public class User  {
    private String userName;
    private String roompin;
    private int subTeamID; //The subTeam that they belong to, that is the teamId of the team of the team they belong to. Can only be 1,2,3,4
    private int question1Answer; //This will hold the id of the option they chose for each q.(It is the optionID of the option they choose)
    private int question2Answer;
    private int question3Answer;

    public User(String uname,String rpin){
        this.userName = uname;
        this.roompin=rpin;
    }

    public String getRoompin() {
        return roompin;
    }

    public void setRoompin(String roompin) {
        this.roompin = roompin;
    }

    //Getters
    public String getUserName(){
        return userName;
    }
    public int getAnswer1(){
        return question1Answer;
    }

    public int getAnswer2(){
        return question2Answer;
    }

    public int getAnswer3(){
        return question3Answer;
    }

    public int getSubTeamID() {return subTeamID;}

    //Setters
    public void setUserName(String uname){
        //check that is unique
        //check that is max 20 characters
        this.userName = uname;
    }

    public void setAnswer1(int ans){
        this.question1Answer = ans;
    }
    public void setAnswer2(int ans){
        this.question2Answer = ans;
    }
    public void setAnswer3(int ans){
        this.question3Answer = ans;
    }
    public void setSubTeamID(int id){ this.subTeamID = id; }

}
