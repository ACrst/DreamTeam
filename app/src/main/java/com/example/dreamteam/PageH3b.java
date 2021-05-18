package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PageH3b extends AppCompatActivity {
    //page: Host enters question2
    private Button q2Button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        q2Button = (Button) findViewById(R.id.q2button);
        q2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageH3b.this,"Save button clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PageH3b.this, PageH3c.class));

            }
        });
    }



}
