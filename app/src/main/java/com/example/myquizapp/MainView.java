package com.example.myquizapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainView extends AppCompatActivity implements View.OnClickListener{

    public static String question[]={
            "Who was the first caliph of Islam?","Which Sahabi was given the title of Sword Of Allah","In which Gazwa did Prophet Muhammad's(Peace be upon him) tooth break?","In which sura of Quran did Allah mention the rulings about Hijaab?"
    };
    public static String choices[][]={{"Hazrat Abu Bakr Sidduiq(R.A.)","Hazrat Omar R.A.","Hazrat Ali R.A.","Hazrat Usman R.A."},{"Hazrat Khalid Bin Waleed R.A.","Hazrat Abu Obaida R.A.","Hazrat Ali R.A.","Hazrat Omar R.A."},{"Gazwa Khandaq","Gazwa Badar","Gazwa Khaibar","Gazwa Ohad"},{"Sura Baqarah","Sura Nisa","Sura Anfaal","Sura Ahzaab"}};

    public static String correctAnswers[]={"Hazrat Abu Bakr Sidduiq(R.A.)","Hazrat Khalid Bin Waleed R.A.","Gazawa Ohad","Sura Ahzaab"};

    int score=0;

    TextView noOfQuestions;
    TextView Question;
    Button opt1,opt2,opt3,opt4;
    Button submit;


    @Override protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);


        noOfQuestions=findViewById(R.id.noQues);
        Question=findViewById(R.id.questionTextView);
        opt1=findViewById(R.id.optA);
        opt2=findViewById(R.id.optB);
        opt3=findViewById(R.id.optC);
        opt4=findViewById(R.id.optD);
        submit =findViewById(R.id.submit);

        opt1.setOnClickListener(this);
        opt2.setOnClickListener(this);
        opt3.setOnClickListener(this);
        opt4.setOnClickListener(this);
        submit.setOnClickListener(this);

        noOfQuestions.setText("Total Questions : "+question.length);

        int max = question.length-1;
        int min = 0;
        int range = max - min + 1;

        int ind = (int)(Math.random() * range) + min;
        showNewQuestion(ind);

    }

    public void showNewQuestion(int ind)
    {
        Question.setText(question[ind]);
        opt1.setText(choices[ind][0]);
        opt2.setText(choices[ind][1]);
        opt3.setText(choices[ind][2]);
        opt4.setText(choices[ind][3]);
    }
    @Override
    public void onClick(View view) {

    }
}



