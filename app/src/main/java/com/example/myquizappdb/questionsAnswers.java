package com.example.myquizappdb;
import java.util.ArrayList;
import java.util.Random;

public class questionsAnswers {
    static ArrayList<String> questions=new ArrayList<String>();
    ArrayList<String> answers=new ArrayList<String>();
    String choices[][]={{"Hazrat Abubakar R.A.","Hazrat Umar R.A","Hazrat Ali R.A.","Hazrat Usman R.A."},{"Gazwa Ahzab","Gazwa Khyber"
    ,"Gazwa Badr","Gazwa Tabook"},{"Surah Namal","Surah Ahzab","Surah Anfal","Sura Nisa"},
            {"Surah Lahab","Surah Baqarah","Surah Namal", "Surah Nahl"},{"Lying","Jealousy","Shirk","Zina"}};
    public static int score=0;


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

    public void checkAnswer(int questionNum, String Answer)
    {
        if(answers.get(questionNum)==Answer)
        {
            score++;
        }
        else
            score--;
    }

    public String getQuestion(int num)
    {
        return questions.get(num);
    }

    public ArrayList<String> getQuestions()
    {
        return questions;
    }
    public static int getNumberOfQuestions()
    {
        System.out.print(0);
        return questions.size();
    }
    public ArrayList<String> getAnswers()
    {
        return answers;
    }
    public String[][] getChoices()
    {
        return choices;
    }
    public  String[] getRandomChoices(int questionNum)
    {
        Random rand = new Random();
        String choiceSequence[]={"","","",""};
        for(int i=0;i<4;i++)
        {
            int rand_int = rand.nextInt(4);
            if(choiceSequence[rand_int]!="")
                choiceSequence[rand_int]=choices[questionNum][i];
        }
        return choiceSequence;
    }
}
