package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PageU2b extends AppCompatActivity {
    //page for logged in User Screen
    //Congratulations you have successfully logged in
    private Button submitQ2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        submitQ2 = (Button) findViewById(R.id.submitQ2);
        submitQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageU2b.this, "Submit Button clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PageU2b.this, PageU2c.class));

            }
        });
    }



}
