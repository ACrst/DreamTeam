package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PageU2a<RadioButtonGroup> extends AppCompatActivity {
    //page for logged in User Screen
    //Congratulations you have successfully logged in
    private TextView question1;
    private Button submitQ1;
    private RadioButton rb1,rb2,rb3,rb4;
    private RadioGroup grp;
    Option selectedOption;
    @Override
    protected void onCreate( @Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u2a);

        Intent intent=getIntent();
        String usern=intent.getStringExtra("USERN");
        Toast.makeText(PageU2a.this, usern, Toast.LENGTH_SHORT).show();

//     //   User u=new User(usern);
//   //     TeamMaster t=new TeamMaster(); //fetch from host object
//        QuestionMaster q=new QuestionMaster(1,"Q1text");
        //write dao query to fetch question object based on questionid
        // this is for testing a question object
//        q.option1.setOptionText("opt1");
//        q.option2.setOptionText("opt2");
//        q.option3.setOptionText("opt3");
//        q.option4.setOptionText("opt4");

        //upto here for testing the page using manual setting
//        question1.setText(q.getQuestion());
//        rb1=(RadioButton)findViewById(R.id.rb11);
//        rb2=(RadioButton)findViewById(R.id.rb12);
//        rb3=(RadioButton)findViewById(R.id.rb13);
//        rb4=(RadioButton)findViewById(R.id.rb14);
//        rb1.setText(q.option1.getOption());
//        rb2.setText(q.option2.getOption());
//        rb3.setText(q.option3.getOption());
//        rb4.setText(q.option4.getOption());
//        grp=(RadioGroup)findViewById(R.id.rg1);
        submitQ1 = (Button) findViewById(R.id.submitQ1);

        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedOptionText;
//                if(rb1.isChecked())
//                {
//                    selectedOptionText=rb1.getText().toString();
////             //       selectedOption=t.question1.option1;
//                }
//                else if(rb2.isChecked())
//                {
//                    selectedOptionText=rb2.getText().toString();
////             //       selectedOption=t.question1.option2;
//                }
//                else if(rb3.isChecked())
//                {
//                    selectedOptionText=rb3.getText().toString();
////              //      selectedOption=t.question1.option3;
//                }
//                else if(rb4.isChecked())
//                {
//                    selectedOptionText=rb4.getText().toString();
////            //        selectedOption=t.question1.option4;
//                }
//
//                if(grp.getCheckedRadioButtonId()==-1)
//                {
//                    //no radio buttons are checked
//                    Toast.makeText(PageU2a.this,"Please select one of the options",Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
//                //    u.setAnswer1(selectedOption);//selected option's text
                    Intent intentu2b = new Intent(PageU2a.this, PageU2b.class);
                    intentu2b.putExtra("USERN", usern.toString());
                    Toast.makeText(PageU2a.this,"submit1 button clicked",Toast.LENGTH_SHORT).show();
                    startActivity(intentu2b);
                    finish();
//                }

            }
        });
    }
}
