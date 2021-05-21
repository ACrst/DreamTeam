/*
 * User arrives to page2 from the first User page. The user arriving at this page is trying to join an existing room and thus arrives at a page where
 * they must enter in a valid code.
 */
package com.example.dreamteam;

import androidx.annotation.NonNull;
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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class PageU1 extends AppCompatActivity implements View.OnClickListener {
    //User Page1
    private EditText roomPin,username;
    private Button joinButton;
    /*public static FirebaseDatabase u_db =FirebaseDatabase.getInstance();
    public static DatabaseReference userCopyDB = u_db.getReference("https://dreamteam-39893-default-rtdb.firebaseio.com/");*/
    public static TeamMaster teamMasterClone;
    public static String u_Name, u_roomPin;
    public static User theUser;

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
        switch(v.getId())
        {
            case R.id.buttonJoin:
                //Extracting the username and roompin
                u_Name = username.getText().toString();
                u_roomPin = roomPin.getText().toString();

                if (username==null && roomPin==null )
                {
                    Toast.makeText(PageU1.this,"Enter a  valid username and roompin",Toast.LENGTH_SHORT).show();
                }
                else if(username==null)
                {
                    Toast.makeText(PageU1.this,"Enter your correct username",Toast.LENGTH_SHORT).show();
                }
                else if(roomPin==null)
                {
                    Toast.makeText(PageU1.this,"Enter a  valid roompin",Toast.LENGTH_SHORT).show();
                }
                else {

                    if (username != null && roomPin != null) {
                        //Populating the User Object
                        theUser = new User(u_Name);
                        theUser.setRoompin(u_roomPin);

                        //Jump to next activity
                        Intent intentu1 = new Intent(PageU1.this, PageU2a.class);
                        startActivity(intentu1);
                        finish();
                    }
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
