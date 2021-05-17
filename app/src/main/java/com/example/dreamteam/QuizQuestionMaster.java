package com.example.dreamteam;
//We will have 3 questions - 4 options-4 teams
public class QuizQuestionMaster {
    public int questionid; //maps to the 4 teams that the user specifies
    public String question;
    public String option1;
    public String option2;
    public String option3;
    public String option4;

    public QuizQuestionMaster(int qid,String quest, String opt1, String opt2, String opt3,String opt4)
    {
        questionid=qid;
        question=quest;
        option1=opt1;
        option2=opt2;
        option3=opt3;
        option4=opt4;
    }

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() { return option4;}

}
