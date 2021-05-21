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

public class PageU2c extends AppCompatActivity {
    private TextView question3;
    private Button submitQ3;
    private RadioButton rb1,rb2,rb3,rb4;
    private RadioGroup grp;
    Option selectedOption;
    public static final String User_Name="com.example.dreamteam.User_Name";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u2c);

        Intent intent=getIntent();
        String usern=intent.getStringExtra("USERN");
//        User u=new User(usern);
//        TeamMaster t=new TeamMaster();
//        question3.setText(t.question3.getQuestion());
//        rb1=(RadioButton)findViewById(R.id.rb31);
//        rb2=(RadioButton)findViewById(R.id.rb32);
//        rb3=(RadioButton)findViewById(R.id.rb33);
//        rb4=(RadioButton)findViewById(R.id.rb34);
//        rb1.setText(t.question3.option1.getOption());
//        rb2.setText(t.question3.option2.getOption());
//        rb3.setText(t.question3.option3.getOption());
//        rb4.setText(t.question3.option4.getOption());
        submitQ3 = (Button) findViewById(R.id.submitQ3);
//        grp=(RadioGroup)findViewById(R.id.radiogroup3);
        submitQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(PageU2c.this, "Submit Button clicked", Toast.LENGTH_SHORT).show();
//                String selectedOptionText;
//                if(rb1.isChecked())
//                {
//                    selectedOptionText=rb1.getText().toString();
//                    selectedOption=t.question3.option1;
//                }
//                else if(rb2.isChecked())
//                {
//                    selectedOptionText=rb2.getText().toString();
//                    selectedOption=t.question3.option2;
//                }
//                else if(rb3.isChecked())
//                {
//                    selectedOptionText=rb3.getText().toString();
//                    selectedOption=t.question3.option3;
//                }
//                else if(rb4.isChecked())
//                {
//                    selectedOptionText=rb4.getText().toString();
//                    selectedOption=t.question3.option4;
//                }
//
//
//                if(grp.getCheckedRadioButtonId()==-1)
//                {
//                    //no radio buttons are checked
//                    Toast.makeText(PageU2c.this,"Please select one of the options",Toast.LENGTH_SHORT).show();
//                }
//                else {
//                u.setAnswer3(selectedOption); //save selected option into User-Answer3

                    //approximate User's likelihood Score.
                    //u.approximateUserTeam();


                    Intent intentu3 = new Intent(PageU2c.this, PageU3.class);
                    intentu3.putExtra("USERN", usern.toString());
                    Toast.makeText(PageU2c.this,"submit3 button clicked",Toast.LENGTH_SHORT).show();
                    startActivity(intentu3);
                    finish();
//                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }





}
