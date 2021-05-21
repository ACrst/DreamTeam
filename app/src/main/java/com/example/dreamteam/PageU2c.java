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


        DatabaseReference ref= FirebaseDatabase.getInstance().getReference().child(PageU1.theUser.getRoompin().toString().toUpperCase()).child("question3");//child("ASHQNE");


        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String q1text=snapshot.child("question").getValue().toString();
                String op1=snapshot.child("option1").child("option").getValue().toString();
                String op2=snapshot.child("option2").child("option").getValue().toString();
                String op3=snapshot.child("option3").child("option").getValue().toString();
                String op4=snapshot.child("option4").child("option").getValue().toString();
                Log.d("Question1",op1.toUpperCase());
                question3.setText(q1text);
                rb1.setText(op1);
                rb2.setText(op2);
                rb3.setText(op3);
                rb4.setText(op4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

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

                //Add the User to the database.


                //Jump Activities
                Intent intentu2c = new Intent(PageU2c.this, PageU3.class);
                startActivity(intentu2c);
                finish();

            }
        });
    }
}
