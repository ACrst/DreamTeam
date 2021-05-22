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
import android.util.Log;
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
import java.util.List;

public class PageU1 extends AppCompatActivity implements View.OnClickListener {
    //User Page1
    private EditText roomPin,username;
    private Button joinButton;
    public String u_Name, u_roomPin;
    public static User theUser;
    public static FirebaseDatabase db=FirebaseDatabase.getInstance();
    public static DatabaseReference root=db.getReference();

    public static User user;

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
                        //check if roompin exists in firebase db then only allow


//                        List<String> roompins=new ArrayList<>();
//                        DatabaseReference ref= FirebaseDatabase.getInstance().getReference().child(PageU1.theUser.getRoompin().toString().toUpperCase());
//                        ref.addValueEventListener(new ValueEventListener() {
//                            @Override
//                            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                                String roompintext = snapshot.child("roomPin").getValue().toString();
//                                Log.d("Question1",roompintext);
//                                roompins.add(roompintext);
//                            }
//
//                            @Override
//                            public void onCancelled(@NonNull  DatabaseError error) {
//
//                            }
//
//
//                        });
//                        Log.d("ListOfROOMPIN",roompins.toArray().toString());
//                        if(roompins.contains(u_roomPin))
//                        {
                            theUser = new User(u_Name);
                            PageU1.theUser.setUserName(u_Name);
                            PageU1.theUser.setRoompin(u_roomPin);
                            user=theUser;
                            //Jump to next activity
                            Intent intentu1 = new Intent(PageU1.this, PageU2a.class);
                            //intentu1.putExtra("USERN", username.toString());
//                            user.setUserName(u_Name);
//                            user.setRoompin(u_roomPin);
                            startActivity(intentu1);
                            finish();
//                        }
//                        else
//                        {
//                            Toast.makeText(PageU1.this,"RoomPin not created by Host. Enter a valid RoomPin",Toast.LENGTH_SHORT).show();
//                        }
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
