package com.example.dreamteam;
//class to record User responses
public class User {
    private String userName;
    private float likelihoodScore;
    private String roompin;
    private int subTeamID; //The subTeam that they belong to, that is the teamId of the team of the team they belong to. Can only be 1,2,3,4
    public int question1Map; //This will hold the mapping id for each option they choose.
    public int question2Map;
    public int question3Map;

    public User(String uname){
        this.userName = uname;
        this.roompin = " ";
        this.subTeamID = 0;
        this.likelihoodScore = 0;
        this.question1Map = 0;
        this.question2Map = 0;
        this.question3Map = 0;
    }

    public void setLikelihoodScore(float likelihoodScore) {
        this.likelihoodScore = likelihoodScore;
    }

    public int getQuestion1Map() {
        return question1Map;
    }

    public void setQuestion1Map(int question1Map) {
        this.question1Map = question1Map;
    }

    public int getQuestion2Map() {
        return question2Map;
    }

    public void setQuestion2Map(int question2Map) {
        this.question2Map = question2Map;
    }

    public int getQuestion3Map() {
        return question3Map;
    }

    public void setQuestion3Map(int question3Map) {
        this.question3Map = question3Map;
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

    public int getSubTeamID() {return subTeamID;}

    //Setters
    public void setUserName(String uname){
        //check that is unique
        //check that is max 20 characters
        this.userName = uname;
    }

    public void setLikelihoodScore(int score) {this.likelihoodScore = score; }
    public void setSubTeamID(int id){ this.subTeamID = id; }

    //Getter
    public  float getLikelihoodScore(){return this.likelihoodScore; }
    public void calculateLikelihoodScore(){
        float avg = 0;
        avg += question1Map;
        avg += question1Map;
        avg += question1Map;
        likelihoodScore = avg/4;
    }

}
