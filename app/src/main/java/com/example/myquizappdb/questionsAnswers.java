package com.example.myquizappdb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class questionsAnswers {
    ArrayList<String> questions=new ArrayList<String>();
    ArrayList<String> answers=new ArrayList<String>();
    String choices[][]={{"Hazrat Abubakar R.A.","Hazrat Umar R.A","Hazrat Ali R.A.","Hazrat Usman R.A."},{"Gazwa Ahzab","Gazwa Khyber"
    ,"Gazwa Badr","Gazwa Tabook"},{"Surah Namal","Surah Ahzab","Surah Anfal","Sura Nisa"},
            {"Surah Lahab","Surah Baqarah","Surah "}};


    public questionsAnswers()
    {
        questions.add("Who was the first caliph of Islam?");
        questions.add("Gazwa Khandaq is also primarily known as?");
        questions.add("In which surah of Quran-e-Pak, the rule of Parda for women is stated?");
        questions.add("Which surah's name translates to 'The bees' in English?");
        questions.add("What is considered as the biggest sin?");
        answers.add("Hazrat Abubakar R.A.");
        answers.add("Gazwa Ahzab");
        answers.add("Surah Ahzab");
        answers.add("Surah Nahl");
        answers.add("Shirk");
    }
}
