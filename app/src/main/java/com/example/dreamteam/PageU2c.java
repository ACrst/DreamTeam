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

    @Override
    protected void onCreate( @Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u2c);

        //Validate Views
        rb1=(RadioButton)findViewById(R.id.rb31);
        rb2=(RadioButton)findViewById(R.id.rb32);
        rb3=(RadioButton)findViewById(R.id.rb33);
        rb4=(RadioButton)findViewById(R.id.rb34);
        grp=(RadioGroup)findViewById(R.id.radiogroup3);
        submitQ3 = (Button) findViewById(R.id.submitQ3);


        //1) fetch questionText from the data base
        //2) populate question text view
        //3) fetch the option objects from the database.
        //4) populate the option textviews.

        submitQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Retrieve the option checked by User.
                String selectedOptionText;
                if(rb1.isChecked()) { selectedOptionText=rb1.getText().toString(); }
                else if(rb2.isChecked()) { selectedOptionText=rb2.getText().toString(); }
                else if(rb3.isChecked()) {selectedOptionText=rb3.getText().toString(); }
                else if(rb4.isChecked()) {selectedOptionText=rb4.getText().toString(); }
                if(grp.getCheckedRadioButtonId()==-1)
                {
                    //no radio buttons are checked
                    Toast.makeText(PageU2c.this,"Please select one of the options",Toast.LENGTH_SHORT).show();
                }

                //Now populate User's option objects

                //Jump Activities
                Intent intentu2c = new Intent(PageU2c.this, PageU3.class);
                startActivity(intentu2c);
                finish();

            }
        });
    }
}
