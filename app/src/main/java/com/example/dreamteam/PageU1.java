/*
 * User arrives to page2 from the first User page. The user arriving at this page is trying to join an existing room and thus arrives at a page where
 * they must enter in a valid code.
 */
package com.example.dreamteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class PageU1 extends AppCompatActivity implements View.OnClickListener {
    //User Page1
    private EditText roomPin,username;
    private Button joinButton;


//    public final static String USERN="com.example.dreamteam.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u1);

        username=(EditText) findViewById(R.id.usernameTxt);
        roomPin = (EditText) findViewById(R.id.roomPintxt);
        joinButton = (Button) findViewById(R.id.buttonJoin);

        joinButton.setOnClickListener(PageU1.this);



    }


    @Override
    public void onClick(View v) {
        //When the user clicks on the Join button
        //1) validate the room key and make sure it is valid, if not set error message
        //2) take them to page 4, a confirmation page showing that they are admitted to a room.

        switch(v.getId())
        {
            case R.id.buttonJoin:
                if(username==null && roomPin!=null)
                {
                    Toast.makeText(PageU1.this,"Enter your correct username",Toast.LENGTH_SHORT).show();

                }
                else if(roomPin==null && username!=null)
                {
                    Toast.makeText(PageU1.this,"Enter a  valid roompin",Toast.LENGTH_SHORT).show();
                }
                else if (username==null && roomPin==null )
                {
                    Toast.makeText(PageU1.this,"Enter a  valid username and roompin",Toast.LENGTH_SHORT).show();
                }
                else
                if(username!=null && roomPin!=null)
                {
                    String username="AIO";
                    Intent intentu2a = new Intent(PageU1.this, PageU2a.class);
                    intentu2a.putExtra("USERN", username.toString());
                    Toast.makeText(PageU1.this,"Join button clicked",Toast.LENGTH_SHORT).show();
                    startActivity(intentu2a);
                    finish();
                }
                break;
        }
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
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



}
