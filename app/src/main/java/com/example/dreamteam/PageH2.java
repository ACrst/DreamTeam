package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//Host creates 4 team names and saves it after clicking SAVE button
//Host Page 2
public class PageH2 extends AppCompatActivity {
    private Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_h2);

        saveButton = (Button) findViewById(R.id.button_save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageH2.this,"Save button clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PageH2.this, PageH3a.class));

            }
        });
    }

}
