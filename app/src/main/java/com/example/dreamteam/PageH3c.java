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

public class PageH3c extends AppCompatActivity {
    //page: Host enters question3
    private Button q3Button;
    private EditText opA,opB,opC,opD, q3;
    private String optionA, optionB, optionC, optionD, q3String, optAMapID, optBMapID, optCMapID, optDMapID;
    private Spinner optASpin,optBSpin, optCSpin, optDSpin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Validate Views
        q3 = (EditText) findViewById(R.id.question2);
        opA = (EditText) findViewById(R.id.optA3);
        opB = (EditText) findViewById(R.id.optB3);
        opC = (EditText) findViewById(R.id.optC3);
        opD = (EditText) findViewById(R.id.optD3);
        optASpin =(Spinner)findViewById(R.id.spinnerOptA3);
        optBSpin =(Spinner)findViewById(R.id.spinnerOptB3);
        optCSpin =(Spinner)findViewById(R.id.spinnerOptC3);
        optDSpin =(Spinner)findViewById(R.id.spinnerOptD3);
        q3Button = (Button) findViewById(R.id.q3Button);

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
        q3String = q3.getText().toString();
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
        PageH1.teamMaster.findMappedIDOption(optAMapID,PageH1.teamMaster.question3, 1);
        PageH1.teamMaster.findMappedIDOption(optBMapID,PageH1.teamMaster.question3, 2);
        PageH1.teamMaster.findMappedIDOption(optCMapID,PageH1.teamMaster.question3, 3);
        PageH1.teamMaster.findMappedIDOption(optDMapID,PageH1.teamMaster.question3, 4);

        //Add the question and options, and mappingIDs into the Question Master Object
        PageH1.teamMaster.question3.setQuestion(q3String);
        PageH1.teamMaster.question3.option1.setOptionText(optionA);
        PageH1.teamMaster.question3.option2.setOptionText(optionB);
        PageH1.teamMaster.question3.option3.setOptionText(optionC);
        PageH1.teamMaster.question3.option4.setOptionText(optionD);

        q3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageH3c.this,"Save button clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PageH3c.this, PageH4.class));

            }
        });
    }


}
