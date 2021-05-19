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
import android.widget.Toast;

public class PageU1 extends AppCompatActivity {
    //User Page1
    private EditText roomPin,username;
    private Button joinButton;
    public static final String User_Name="com.example.dreamteam.User_Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u1);

        Intent receiveIntent=getIntent();
        username=(EditText) findViewById(R.id.usernameTxt);
        roomPin = (EditText) findViewById(R.id.roomPinTxt);
        joinButton = (Button) findViewById(R.id.buttonJoin);

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //When the user clicks on the Join button
                //1) validate the room key and make sure it is valid, if not set error message
                //2) take them to page 4, a confirmation page showing that they are admitted to a room.
                Toast.makeText(PageU1.this,"Join button clicked",Toast.LENGTH_SHORT).show();

                Intent intentu2a=new Intent(PageU1.this, PageU2a.class);
                intentu2a.putExtra(User_Name,username.getText().toString());
                startActivity(intentu2a);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}