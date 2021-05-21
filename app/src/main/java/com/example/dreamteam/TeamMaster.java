package com.example.dreamteam;


import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TeamMaster {
    //Randomly generated alphanumeric, defines this team.
    public String roomPin;
    //userName of the Host
    public String host;
    //List of Users joining this Team
    public List<User> listOfUsers =  new ArrayList<User>();
    //These are the four sub teams.
    public SubTeamMaster team1;
    public  SubTeamMaster team2;
    public  SubTeamMaster team3;
    public  SubTeamMaster team4;
    //This list holds the subteam names
    public SubTeamMaster[] listOfSubTeams;
    public List<String> spinnerArray =  new ArrayList<String>();
    //These are the 3 questions associated with this room pin
    public QuestionMaster question1;
    public QuestionMaster question2;
    public QuestionMaster question3;

    public TeamMaster(){
        //Initializing subteams
        team1.setTeamID(1);
        team2.setTeamID(2);
        team3.setTeamID(3);
        team4.setTeamID(4);
        //Adding them to the array.
        listOfSubTeams[0] = team1;
        listOfSubTeams[1] = team2;
        listOfSubTeams[2] = team3;
        listOfSubTeams[3] = team4;
        //Initializing Questions
        question1.setQuestionID(1);
        question2.setQuestionID(2);
        question3.setQuestionID(3);
    }

    //This function adds the names of all the teams into an array to be displayed in the spinner
    public void populateSpinnerArray(){
        spinnerArray.add(team1.getTeamName());
        spinnerArray.add(team2.getTeamName());
        spinnerArray.add(team3.getTeamName());
        spinnerArray.add(team4.getTeamName());
    }

    public void findMappedIDOption(String aTeamName, QuestionMaster theQuestion, int optID){
        if (optID == 1) {
            if (aTeamName.equals(team1.getTeamName())) {
                theQuestion.option1.setMappindID(1);
            } else if (aTeamName.equals(team2.getTeamName())) {
                theQuestion.option1.setMappindID(2);
            } else if (aTeamName.equals(team3.getTeamName())) {
                theQuestion.option1.setMappindID(3);
            } else if (aTeamName.equals(team4.getTeamName())) {
                theQuestion.option1.setMappindID(4);
            }
        }

        else if(optID == 2){
            if (aTeamName.equals(team1.getTeamName())) {
                theQuestion.option2.setMappindID(1);
            } else if (aTeamName.equals(team2.getTeamName())) {
                theQuestion.option2.setMappindID(2);
            } else if (aTeamName.equals(team3.getTeamName())) {
                theQuestion.option2.setMappindID(3);
            } else if (aTeamName.equals(team4.getTeamName())) {
                theQuestion.option2.setMappindID(4);
            }
        }

        else if(optID == 3){
            if (aTeamName.equals(team1.getTeamName())) {
                theQuestion.option3.setMappindID(1);
            } else if (aTeamName.equals(team2.getTeamName())) {
                theQuestion.option3.setMappindID(2);
            } else if (aTeamName.equals(team3.getTeamName())) {
                theQuestion.option3.setMappindID(3);
            } else if (aTeamName.equals(team4.getTeamName())) {
                theQuestion.option3.setMappindID(4);
            }
        }

        else if(optID == 4){
            if (aTeamName.equals(team1.getTeamName())) {
                theQuestion.option4.setMappindID(1);
            } else if (aTeamName.equals(team2.getTeamName())) {
                theQuestion.option4.setMappindID(2);
            } else if (aTeamName.equals(team3.getTeamName())) {
                theQuestion.option4.setMappindID(3);
            } else if (aTeamName.equals(team4.getTeamName())) {
                theQuestion.option4.setMappindID(4);
            }
        }
    }


    public void setHostName(String uname){
        if (uname.length() > 15 || uname.length() < 3 ){
           //Toast.makeText(TeamMaster.this, "User Name must be between 3 and 15 characters", Toast.LENGTH_SHORT).show();
        }
        else{
            host = uname;
        }
    }

    public void setRoomPin(String pin){
        roomPin = pin;
    }

    public QuestionMaster getQuestion1() {
        return question1;
    }

    public void setQuestion1(QuestionMaster question1) {
        this.question1 = question1;
    }

    public QuestionMaster getQuestion2() {
        return question2;
    }

    public void setQuestion2(QuestionMaster question2) {
        this.question2 = question2;
    }

    public QuestionMaster getQuestion3() {
        return question3;
    }

    public void setQuestion3(QuestionMaster question3) {
        this.question3 = question3;
    }
}
