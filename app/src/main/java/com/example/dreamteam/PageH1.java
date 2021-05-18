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
import android.widget.Toast;

import java.util.Random;

public class PageH1 extends AppCompatActivity {
    //Host Page1 to generate RoomPin
    public EditText hostname;
    public Button generate_roompin_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_h1);

        hostname=(EditText)findViewById(R.id.usernameTxt);
        generate_roompin_button=(Button)findViewById(R.id.buttonGeneratePin);

        generate_roompin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //generate a random alphanumeric character
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
            }
        });
    }
}