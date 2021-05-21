package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

//page : Host enters Question1
public class PageH3a extends AppCompatActivity {
    private Button q1Button;
    private EditText opA,opB,opC,opD, q1;
    private String optionA, optionB, optionC, optionD, q1String, optAMapID, optBMapID, optCMapID, optDMapID;
    private Spinner optASpin,optBSpin, optCSpin, optDSpin;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_h3a);

        //Validate Views
        q1Button = (Button) findViewById(R.id.q1Button);
        /*
        q1 = (EditText) findViewById(R.id.question1);
        opA = (EditText) findViewById(R.id.optA);
        opB = (EditText) findViewById(R.id.optB);
        opC = (EditText) findViewById(R.id.optC);
        opD = (EditText) findViewById(R.id.optD);
        optASpin =(Spinner)findViewById(R.id.spinnerOptA);
        optBSpin =(Spinner)findViewById(R.id.spinnerOptB);
        optCSpin =(Spinner)findViewById(R.id.spinnerOptC);
        optDSpin =(Spinner)findViewById(R.id.spinnerOptD);


        //Populate Spinners
        PageH1.teamMaster.populateSpinnerArray();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, PageH1.teamMaster.spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        optASpin.setAdapter(adapter);
        optBSpin.setAdapter(adapter);
        optCSpin.setAdapter(adapter);
        optDSpin.setAdapter(adapter);

        //Extract strings from Views
        q1String = q1.getText().toString();
        optionA = opA.getText().toString();
        optionB = opB.getText().toString();
        optionC = opC.getText().toString();
        optionD = opD.getText().toString();

        //Extract the choice form Spinners
        optAMapID = optASpin.getSelectedItem().toString();
        optBMapID = optBSpin.getSelectedItem().toString();
        optCMapID = optCSpin.getSelectedItem().toString();
        optDMapID = optDSpin.getSelectedItem().toString();

        //Add the spinner mapping IDs into the options.
        PageH1.teamMaster.findMappedIDOption(optAMapID,PageH1.teamMaster.question1, 1);
        PageH1.teamMaster.findMappedIDOption(optBMapID,PageH1.teamMaster.question1, 2);
        PageH1.teamMaster.findMappedIDOption(optCMapID,PageH1.teamMaster.question1, 3);
        PageH1.teamMaster.findMappedIDOption(optDMapID,PageH1.teamMaster.question1, 4);


        //Add the question and options, and mappingIDs into the Question Master Object
        PageH1.teamMaster.question1.setQuestion(q1String);
        PageH1.teamMaster.question1.option1.setOptionText(optionA);
        PageH1.teamMaster.question1.option2.setOptionText(optionB);
        PageH1.teamMaster.question1.option3.setOptionText(optionC);
        PageH1.teamMaster.question1.option4.setOptionText(optionD);
*/
        //Jump to next activity
        q1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageH3a.this,"Save button clicked",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(PageH3a.this, PageH3b.class);
                Toast.makeText(PageH3a.this,"...",Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();

            }
        });



    }
}
