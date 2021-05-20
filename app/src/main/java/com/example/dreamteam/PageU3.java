package com.example.dreamteam;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PageU3 extends AppCompatActivity {

    //Team View Page

    private TextView finalwaitmessage;
    boolean isteamformed=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_u3);

        //check to synchronously wait for team to be formed
        isteamformed=true;
        if(isteamformed==true) {
            finalwaitmessage.setText(""); //set to empty message
        }else{
            finalwaitmessage=(TextView)findViewById(R.id.textView_final_message);
        }

        //Write code to display the list of users in the team-group by roompin and samelikelihoodscore
    }

}
