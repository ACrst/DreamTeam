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

    public void setHostName(String uname){
        /*if (uname.length() > 15 || uname.length() < 3 ){
            //Toast.makeText(TeamMaster.this, "User Name must be between 3 and 15 characters", Toast.LENGTH_SHORT).show();
        }*/
        this.host = uname;

    }

    public void setRoomPin(String pin){
        this.roomPin = pin;
    }


    //List of Users joining this Team
    public List<User> listOfUsers;
    //These are the four sub teams.
    public SubTeamMaster team1;
    public  SubTeamMaster team2;
    public  SubTeamMaster team3;
    public  SubTeamMaster team4;
    //This list holds the subteam names
    public List<SubTeamMaster> listOfSubTeams;
    public List<String> spinnerArray;
    //These are the 3 questions associated with this room pin
    public QuestionMaster question1;
    public QuestionMaster question2;
    public QuestionMaster question3;

    public TeamMaster(){
        //Initializing the list of Users
        this.listOfUsers =  new ArrayList<User>();
        this.spinnerArray =  new ArrayList<String>();
        this.listOfSubTeams = new ArrayList<SubTeamMaster>();

        //Initializing subteams
        this.team1 = new SubTeamMaster();
        this.team2 = new SubTeamMaster();
        this.team3 = new SubTeamMaster();
        this.team4 = new SubTeamMaster();
        team1.setTeamID(1);
        team2.setTeamID(2);
        team3.setTeamID(3);
        team4.setTeamID(4);
        //Adding them to the array.
        listOfSubTeams.add(team1);
        listOfSubTeams.add(team2);
        listOfSubTeams.add(team3);
        listOfSubTeams.add(team4);

        //Initializing Questions
        this.question1 = new QuestionMaster();
        this.question2 = new QuestionMaster();
        this.question3 = new QuestionMaster();

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
