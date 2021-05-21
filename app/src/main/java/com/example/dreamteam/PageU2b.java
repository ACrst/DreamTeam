package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PageU2b extends AppCompatActivity {
    private TextView question2;
    private Button submitQ2;
    private RadioButton rb1,rb2,rb3,rb4;
    private RadioGroup grp;
    Option selectedOption;

    @Override
    protected void onCreate( @Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u2b);

        //Validate Views
        rb1=(RadioButton)findViewById(R.id.rb21);
        rb2=(RadioButton)findViewById(R.id.rb22);
        rb3=(RadioButton)findViewById(R.id.rb23);
        rb4=(RadioButton)findViewById(R.id.rb24);
        grp=(RadioGroup)findViewById(R.id.radiogroup2);
        submitQ2 = (Button) findViewById(R.id.submitQ2);


        //1) fetch questionText from the data base
        //2) populate question text view
        //3) fetch the option objects from the database.
        //4) populate the option textviews.


        DatabaseReference ref= FirebaseDatabase.getInstance().getReference().child(PageU1.theUser.getRoompin().toString().toUpperCase()).child("question2");//child("ASHQNE");


        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String q1text=snapshot.child("question").getValue().toString();
                String op1=snapshot.child("option1").child("option").getValue().toString();
                String op2=snapshot.child("option2").child("option").getValue().toString();
                String op3=snapshot.child("option3").child("option").getValue().toString();
                String op4=snapshot.child("option4").child("option").getValue().toString();
                Log.d("Question1",op1.toUpperCase());
                question2.setText(q1text);
                rb1.setText(op1);
                rb2.setText(op2);
                rb3.setText(op3);
                rb4.setText(op4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        submitQ2.setOnClickListener(new View.OnClickListener() {
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
                    Toast.makeText(PageU2b.this,"Please select one of the options",Toast.LENGTH_SHORT).show();
                }

                //Now populate User's option objects

                //Jump Activities
                Intent intentu2b = new Intent(PageU2b.this, PageU2c.class);
                startActivity(intentu2b);
                finish();
            }
        });
    }
}
