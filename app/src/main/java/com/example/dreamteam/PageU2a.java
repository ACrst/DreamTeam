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

public class PageU2a extends AppCompatActivity {
    //page for logged in User Screen
    //Congratulations you have successfully logged in
    private TextView question1;
    private Button submitQ1;
    private RadioButton rb1,rb2,rb3,rb4;
    int selectedOption;
    public static final String User_Name="com.example.dreamteam.User_Name";
    @Override
    protected void onCreate( @Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u2a);

        Intent intent=getIntent();
        String usern=intent.getStringExtra(PageU1.User_Name);
        User u=new User(usern);
        TeamMaster t=new TeamMaster();
        question1.setText(t.question1.getQuestion());
        rb1=(RadioButton)findViewById(R.id.rb11);
        rb2=(RadioButton)findViewById(R.id.rb12);
        rb3=(RadioButton)findViewById(R.id.rb13);
        rb4=(RadioButton)findViewById(R.id.rb14);
        rb1.setText(t.question1.option1.getOption());
        rb2.setText(t.question1.option2.getOption());
        rb3.setText(t.question1.option3.getOption());
        rb4.setText(t.question1.option4.getOption());
        submitQ1 = (Button) findViewById(R.id.submitQ1);

        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageU2a.this, "Submit Button clicked", Toast.LENGTH_SHORT).show();
                String selectedOptionText;
                if(rb1.isChecked())
                {
                    selectedOptionText=rb1.getText().toString();
                    selectedOption=t.question1.option1.getOptionID();
                }
                else if(rb2.isChecked())
                {
                    selectedOptionText=rb2.getText().toString();
                    selectedOption=t.question1.option2.getOptionID();
                }
                else if(rb3.isChecked())
                {
                    selectedOptionText=rb3.getText().toString();
                    selectedOption=t.question1.option3.getOptionID();
                }
                else if(rb4.isChecked())
                {
                    selectedOptionText=rb4.getText().toString();
                    selectedOption=t.question1.option4.getOptionID();
                }
                u.setAnswer1(selectedOption);
                Intent intentu2b=new Intent(PageU2a.this, PageU2b.class);
                intentu2b.putExtra(User_Name,usern);
                startActivity(intentu2b);

            }
        });
    }
}
