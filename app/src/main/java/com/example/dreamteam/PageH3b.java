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

public class PageH3b extends AppCompatActivity {
    private Button q2Button;
    private EditText opA,opB,opC,opD, q2;
    private String optionA, optionB, optionC, optionD, q2String, optAMapID, optBMapID, optCMapID, optDMapID;
    private Spinner optASpin,optBSpin, optCSpin, optDSpin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_h3b);

        //Validate Views
        q2Button = (Button) findViewById(R.id.q2button);
        /*
        q2 = (EditText) findViewById(R.id.question2);
        opA = (EditText) findViewById(R.id.optA2);
        opB = (EditText) findViewById(R.id.optB2);
        opC = (EditText) findViewById(R.id.optC2);
        opD = (EditText) findViewById(R.id.optD2);
        optASpin =(Spinner)findViewById(R.id.spinnerOptA2);
        optBSpin =(Spinner)findViewById(R.id.spinnerOptB2);
        optCSpin =(Spinner)findViewById(R.id.spinnerOptC2);
        optDSpin =(Spinner)findViewById(R.id.spinnerOptD2);


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
        q2String = q2.getText().toString();
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
        PageH1.teamMaster.findMappedIDOption(optAMapID,PageH1.teamMaster.question2, 1);
        PageH1.teamMaster.findMappedIDOption(optBMapID,PageH1.teamMaster.question2, 2);
        PageH1.teamMaster.findMappedIDOption(optCMapID,PageH1.teamMaster.question2, 3);
        PageH1.teamMaster.findMappedIDOption(optDMapID,PageH1.teamMaster.question2, 4);

        //Add the question and options, and mappingIDs into the Question Master Object
        PageH1.teamMaster.question2.setQuestion(q2String);
        PageH1.teamMaster.question2.option1.setOptionText(optionA);
        PageH1.teamMaster.question2.option2.setOptionText(optionB);
        PageH1.teamMaster.question2.option3.setOptionText(optionC);
        PageH1.teamMaster.question2.option4.setOptionText(optionD);
*/
        //Jump to next acitivity
        q2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageH3b.this, PageH3c.class);
                Toast.makeText(PageH3b.this,"generate roompin clicked",Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();

            }
        });
    }



}
