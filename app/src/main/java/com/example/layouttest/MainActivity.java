package com.example.layouttest;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.constrainlayout_test2);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.linearlayout_test1);
//        setContentView(R.layout.tablelayout_test1);
//        setContentView(R.layout.constrainlayout_test1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.
//        main
//        linearLayout
//        tableLayout
//        constrainLayout1
            constrainLayout2
        ), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}