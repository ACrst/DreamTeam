package com.example.dreamteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PageH3c extends AppCompatActivity {
    //page: Host enters question3
    private Button q3Button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        q3Button = (Button) findViewById(R.id.q3Button);
        q3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PageH3c.this,"Save button clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(PageH3c.this, PageH4.class));

            }
        });
    }


}
