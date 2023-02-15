package com.example.myquizappdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.ConsoleMessage;

import java.io.Console;


public class MainActivity2 extends AppCompatActivity {
    public static int questionCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void answerGiven(View view) {
    }
}