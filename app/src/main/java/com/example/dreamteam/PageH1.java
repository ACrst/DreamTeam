package com.example.dreamteam;
/*
 * User arrives to page2 from the first User page. The user arriving at this page is trying to join an existing room and thus arrives at a page where
 * they must enter in a valid code.
 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Random;

public class PageH1 extends AppCompatActivity {
    //Host Page1 to generate RoomPin
    private EditText hostname;
    private Button generate_roompin_button;
    private TextView roompin_text_generated;
    private FirebaseDatabase db=FirebaseDatabase.getInstance();
    private DatabaseReference root=db.getReference().child("users");
    public static TeamMaster teamMaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_h1);

        hostname=(EditText)findViewById(R.id.usernameTxt);
        generate_roompin_button=(Button)findViewById(R.id.buttonGeneratePin);
        roompin_text_generated=(TextView)findViewById(R.id.textView_currentroompin);

        generate_roompin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //generate a random alphanumeric character as the room pin
                Random random=new Random();
                int targetStringlength=6;
                String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
                StringBuilder sb=new StringBuilder();

                for(int i=0;i<targetStringlength;i++)
                {
                    int index=random.nextInt(alphabet.length());
                    char randomChar=alphabet.charAt(index);
                    sb.append(randomChar);
                }
                String roompin=sb.toString();
                Toast.makeText(PageH1.this,roompin,Toast.LENGTH_SHORT).show();
                roompin_text_generated.setText(roompin);

                //Add Hostname to the Team Master Object
                String hostUsername=hostname.getText().toString();
                teamMaster.setHostName(hostUsername);

                //Add roompin to Team Master Object
                teamMaster.setRoomPin(roompin);

                //Gson gson=new Gson();
                /*
                root.setValue(hostUsername);
                HashMap<String,String> usermap=new HashMap<>();
                usermap.put("hostUsername",hostUsername);
                usermap.put("roompin",roompin);

                root.push().setValue(usermap); //creates a unique key along with the host object*/

                //alternate json

            }
        });
    }
}