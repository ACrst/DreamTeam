package com.example.dreamteam;

/*
* The option class object houses a given multiple choice option to a question.
* It houses the text, id (a,b,c,d), and mapping of a given option.
* Each option maps to a given team, that is each option renders a user likely to be selected into a specfied team.
* Eg: In a game of city based trivia, The option "a) I love the Chicago Bulls" maps to a "Team 1:The Chicago Team"
 */

import android.widget.Toast;

public class Option {
    private String optionText; //content of the option
    private int optionID; //Can only be 1,2,3,4 that respectively map to a), b), c), d)
    private int mappingID; //maps the answer specified by the user to the option

    //Getters
    public String getOption(){
        return optionText;
    }

    public int getOptionID(){
        return optionID;
    }

    public int getMappingID(){
        return mappingID;
    }

    //Setters
    public void setOptionText(String option){
        if (option == null){
            //Toast.makeText(Option.this, "You must enter a valid string", Toast.LENGTH_SHORT).show();
        }
        else{
            this.optionText = option;
        }
    }

    public void setOptionID(int optID){
        this.optionID = optID;
    }

    public void setMappindID(int mapID){
        this.mappingID = mapID;
    }


}



