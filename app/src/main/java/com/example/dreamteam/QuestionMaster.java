package com.example.dreamteam;
/*This class contains the question object, it has the questionId and the its multiple choice options stored in it.
* the Options are objects -see Option class- that hold the option information.
 */

public class QuestionMaster {
    //This is the number of the question- that is 1,2,3
    private int questionID;
    private String questionText;
    public Option option1;
    public Option option2;
    public Option option3;
    public Option option4;

    public QuestionMaster(){
        this.questionID = 0;
        this.questionText = " ";
        this.option1 = new Option();
        this.option2 = new Option();
        this.option3 = new Option();
        this.option4 = new Option();
        option1.setOptionID(1);
        option2.setOptionID(2);
        option3.setOptionID(3);
        option4.setOptionID(4);
    }

    //SETTERS
    public void setQuestionID(int questionId) {
        this.questionID = questionId;
    }

    public void setQuestion(String question) {
        this.questionText = question;
    }

    // GETTERS
    public int getQuestionID() {
        return questionID;
    }

    public String getQuestion() {
        return questionText;
    }

}
