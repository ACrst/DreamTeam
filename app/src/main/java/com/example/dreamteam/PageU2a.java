package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class PageU2a<RadioButtonGroup> extends AppCompatActivity {
    //page for logged in User Screen

    private TextView question1;
    private Button submitQ1;
    private RadioButton rb1,rb2,rb3,rb4;
    private RadioGroup grp;
    Option selectedOption;
    int opA,opB,opC,opD;

    @Override
    protected void onCreate( @Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u2a);

        //Validate Views
        question1=(TextView)findViewById(R.id.QuestionU1);
        rb1=(RadioButton)findViewById(R.id.rb11);
        rb2=(RadioButton)findViewById(R.id.rb12);
        rb3=(RadioButton)findViewById(R.id.rb13);
        rb4=(RadioButton)findViewById(R.id.rb14);
        grp=(RadioGroup)findViewById(R.id.rg1);
        submitQ1 = (Button) findViewById(R.id.submitQ1);

        Log.d("CHECKING", "b4 the click");
        //1) fetch questionText from the data base
        //2) populate question text view
        //3) fetch the option objects from the database.
        //4) populate the option textviews.

        DatabaseReference ref= FirebaseDatabase.getInstance().getReference().child(PageU1.theUser.getRoompin().toString().toUpperCase()).child("question1");//child("ASHQNE");


        ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String q1text=snapshot.child("question").getValue().toString();
                        String op1=snapshot.child("option1").child("option").getValue().toString();
                        String op2=snapshot.child("option2").child("option").getValue().toString();
                        String op3=snapshot.child("option3").child("option").getValue().toString();
                        String op4=snapshot.child("option4").child("option").getValue().toString();
                        Log.d("Question1",op1.toUpperCase());
                        question1.setText(q1text);
                        rb1.setText(op1);
                        rb2.setText(op2);
                        rb3.setText(op3);
                        rb4.setText(op4);
//                        opA=(Integer) snapshot.child("option1").child("mappingID").getValue();
//                        opB=(Integer) snapshot.child("option2").child("mappingID").getValue();
//                        opC=(Integer) snapshot.child("option3").child("mappingID").getValue();
//                        opD=(Integer) snapshot.child("option4").child("mappingID").getValue();



                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        opA=opB=opC=opD=1;
        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CHECKING", "b4 the retrieval");
                    //Retrieve the option checked by User.
                if(rb1.isChecked()) {
                    selectedOption.setMappindID(opA);
                }
                else if(rb2.isChecked()) {

                    selectedOption.setMappindID(opB);
                }
                else if(rb3.isChecked()) {

                    selectedOption.setMappindID(opC);
                }
                else if(rb4.isChecked()) {

                    selectedOption.setMappindID(opD);
                }
                Log.d("Question1", String.valueOf(selectedOption.getMappingID()));
                if(grp.getCheckedRadioButtonId()==-1)
                {
                    //no radio buttons are checked
                    Toast.makeText(PageU2a.this,"Please select one of the options",Toast.LENGTH_SHORT).show();
                }



                    //Now populate User's option objects


                    PageU1.theUser.setQuestion1Map(selectedOption.getMappingID());
                    Log.d("CHECKING", "b4 the intent");
                    //Jump Activities
                    Intent intentu2a = new Intent(PageU2a.this, PageU2b.class);
                    startActivity(intentu2a);
                    finish();

            }
        });
    }
}
