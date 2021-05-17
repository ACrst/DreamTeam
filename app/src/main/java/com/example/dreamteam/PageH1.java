package com.example.dreamteam;
/*
 * User arrives to page2 from the first User page. The user arriving at this page is trying to join an existing room and thus arrives at a page where
 * they must enter in a valid code.
 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PageH1 extends AppCompatActivity {
    //Host Page1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_h1);
    }
}