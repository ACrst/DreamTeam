package com.example.dreamteam;

public class User {
    private String userName;
    private int subTeam; //The subTeam that they belong to
    private int question1Answer; //This will hold the id of the option they chose for each q.(It is the optionID of the option they choose)
    private int question2Answer;
    private int question3Answer;

    public User(String uname){
        this.userName = uname;
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

}
