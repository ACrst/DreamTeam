package com.example.dreamteam;
/*This class contains the question object, it has the questionId and the its multiple choice options stored in it.
* the Options are objects -see Option class- that hold the option information.
 */

public class QuizQuestionMaster {
    //This is the number of the question- that is 1,2,3,4
    private int questionID;
    private String questionText;
    private Option option1;
    private Option option2;
    private Option option3;
    private Option option4;

    public QuizQuestionMaster(int qid, String quest, Option opt1, Option opt2, Option opt3,Option opt4)
    {
        questionID = qid;
        questionText =quest;
        option1=opt1;
        option2=opt2;
        option3=opt3;
        option4=opt4;
    }

    //SETTERS
    public void setQuestioID(int questionId) {
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

    public Option getOption1() {
        return option1;
    }

    public Option  getOption2() {
        return option2;
    }

    public Option  getOption3() {
        return option3;
    }

    public Option  getOption4() {
        return option4;
    }

}
