/*
 * User arrives to page2 from the first User page. The user arriving at this page is trying to join an existing room and thus arrives at a page where
 * they must enter in a valid code.
 */
package com.example.dreamteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PageU1 extends AppCompatActivity {
    //User Page1
    private EditText roomPin;
    private Button joinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u1);

        Intent receiveIntent=getIntent();
        roomPin = (EditText) findViewById(R.id.roomPinTxt);
        joinButton = (Button) findViewById(R.id.buttonJoin);

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //When the user clicks on the Join button
                //1) validate the room key and make sure it is valid, if not set error message
                //2) take them to page 4, a confirmation page showing that they are admitted to a room.
                startActivity(new Intent(PageU1.this, PageU2a.class));
            }
        });
    }
}