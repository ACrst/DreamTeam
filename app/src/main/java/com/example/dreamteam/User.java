package com.example.dreamteam;
//class to record User responses
public class User {
    private String userName;
    private float likelihoodScore;
    private String roompin;
    private int subTeamID; //The subTeam that they belong to, that is the teamId of the team of the team they belong to. Can only be 1,2,3,4
    private Option question1Answer; //This will hold the id of the option they chose for each q.(It is the optionID of the option they choose)
    private Option question2Answer;
    private Option question3Answer;

    public User(String uname){
        this.userName = uname;
        this.roompin = " ";
        this.subTeamID = 0;
        this.likelihoodScore = 0;
        this.question1Answer = new Option();
        this.question2Answer = new Option();
        this.question3Answer = new Option();
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
    public Option getAnswer1(){
        return question1Answer;
    }

    public Option getAnswer2(){
        return question2Answer;
    }

    public Option getAnswer3(){
        return question3Answer;
    }

    public int getSubTeamID() {return subTeamID;}

    //Setters
    public void setUserName(String uname){
        //check that is unique
        //check that is max 20 characters
        this.userName = uname;
    }
    public void setAnswer1(Option ans){
        this.question1Answer = ans;
    }
    public void setAnswer2(Option ans){
        this.question2Answer = ans;
    }
    public void setAnswer3(Option ans){
        this.question3Answer = ans;
    }
    public void setLikelihoodScore(int score) {this.likelihoodScore = score; }
    public void setSubTeamID(int id){ this.subTeamID = id; }

    //Getter
    public  float getLikelihoodScore(){return this.likelihoodScore; }
    public void approximateUserTeam(){
        float avg = 0;
        avg += question1Answer.getMappingID();
        avg += question2Answer.getMappingID();
        avg += question3Answer.getMappingID();
        likelihoodScore = avg/4;
    }

}
