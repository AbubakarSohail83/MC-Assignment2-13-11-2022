package com.example.myquizappdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;


public class MainActivity2 extends AppCompatActivity {
    public static int questionCount=0;
    public static questionsAnswers qna=new questionsAnswers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nextQuestion();
    }

    public void onClick(View btn)
    {

        switch (btn.getId()) {
            case R.id.optA:
                Button btn1=findViewById(R.id.optA);
                String ans= (String)btn1.getText();
                qna.checkAnswer(questionCount,ans);
                ++questionCount;
                nextQuestion();
            case R.id.optB:
                Button btn2=findViewById(R.id.optB);
                String ans2= (String)btn2.getText();
                qna.checkAnswer(questionCount,ans2);
                ++questionCount;
                nextQuestion();
            case R.id.optC:
                Button btn3=findViewById(R.id.optC);
                String ans3= (String)btn3.getText();
                qna.checkAnswer(questionCount,ans3);
                ++questionCount;
                nextQuestion();
            case R.id.optD:
                Button btn4=findViewById(R.id.optD);
                String ans4= (String)btn4.getText();
                qna.checkAnswer(questionCount,ans4);
                ++questionCount;
                nextQuestion();
                break;
        }

    }

    public void setQuestion()
    {
        TextView qn= findViewById(R.id.QuestionNumber);
        TextView question=findViewById(R.id.question);
        Button ch1= findViewById(R.id.optA);
        Button ch2= findViewById(R.id.optB);
        Button ch3= findViewById(R.id.optC);
        Button ch4= findViewById(R.id.optD);
        qn.setText("Question # "+ (questionCount+1));
        question.setText(qna.getQuestion(questionCount));
        String choices[]=qna.getRandomChoices(questionCount);
        System.out.print(choices);
        ch1.setText(choices[0]);
        ch2.setText(choices[1]);
        ch3.setText(choices[2]);
        ch4.setText(choices[3]);
        ch1.setOnClickListener(this::onClick);
        ch2.setOnClickListener(this::onClick);
        ch3.setOnClickListener(this::onClick);
        ch4.setOnClickListener(this::onClick);

    }

    public void nextQuestion()
    {
        if(questionCount>=(questionsAnswers.getNumberOfQuestions()))
        {
            Intent intent=new Intent(this, MainActivity3.class);
            intent.putExtra("Score", questionsAnswers.score);
            startActivity(intent);
        }
        setQuestion();

    }


}