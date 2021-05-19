package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PageU2c extends AppCompatActivity {
    //page for logged in User Screen
    //Congratulations you have successfully logged in
    private Button submitQ3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        submitQ3 = (Button) findViewById(R.id.submitQ1);
        submitQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageU2c.this, "Submit Button clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PageU2c.this, PageU3.class));

            }
        });
    }



}
