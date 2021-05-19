package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PageU2b extends AppCompatActivity {
    //question 2 page for user
    private TextView question2;
    private Button submitQ2;
    private RadioButton rb1,rb2,rb3,rb4;
    int selectedOption;
    public static final String User_Name="com.example.dreamteam.User_Name";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent=getIntent();
        String usern=intent.getStringExtra(PageU1.User_Name);
        User u=new User(usern);
        TeamMaster t=new TeamMaster();
        question2.setText(t.question2.getQuestion());
        rb1=(RadioButton)findViewById(R.id.rb21);
        rb2=(RadioButton)findViewById(R.id.rb22);
        rb3=(RadioButton)findViewById(R.id.rb23);
        rb4=(RadioButton)findViewById(R.id.rb24);
        rb1.setText(t.question2.option1.getOption());
        rb2.setText(t.question2.option2.getOption());
        rb3.setText(t.question2.option3.getOption());
        rb4.setText(t.question2.option4.getOption());
        submitQ2 = (Button) findViewById(R.id.submitQ1);

        submitQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageU2b.this, "Submit Button clicked", Toast.LENGTH_SHORT).show();
                String selectedOptionText;
                if(rb1.isChecked())
                {
                    selectedOptionText=rb1.getText().toString();
                    selectedOption=t.question2.option1.getOptionID();
                }
                else if(rb2.isChecked())
                {
                    selectedOptionText=rb2.getText().toString();
                    selectedOption=t.question2.option2.getOptionID();
                }
                else if(rb3.isChecked())
                {
                    selectedOptionText=rb3.getText().toString();
                    selectedOption=t.question2.option3.getOptionID();
                }
                else if(rb4.isChecked())
                {
                    selectedOptionText=rb4.getText().toString();
                    selectedOption=t.question2.option4.getOptionID();
                }
                u.setAnswer1(selectedOption);
                Intent intentu2c=new Intent(PageU2b.this, PageU2c.class);
                intentu2c.putExtra(User_Name,usern);
                startActivity(intentu2c);

            }
        });
    }



}
