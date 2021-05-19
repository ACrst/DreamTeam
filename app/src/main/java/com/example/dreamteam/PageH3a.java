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

//page : Host enters Question1
public class PageH3a extends AppCompatActivity {
    private Button q1Button;
    private EditText opA,opB,opC,opD;
    private Spinner ansA,ansB,ansC,ansD;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent=getIntent();
        q1Button = (Button) findViewById(R.id.q1Button);
        q1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageH3a.this,"Save button clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PageH3a.this, PageH3b.class));

            }
        });

        ansA=(Spinner)findViewById(R.id.spinnerOptA);
        ansB=(Spinner)findViewById(R.id.spinnerOptB);
        ansC=(Spinner)findViewById(R.id.spinnerOptC);
        ansD=(Spinner)findViewById(R.id.spinnerOptD);

    }
}
