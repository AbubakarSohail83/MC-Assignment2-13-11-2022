package com.example.myquizapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainView extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout);
        TextView noOfQuestions;
        TextView Question;
        Button opt1,opt2,opt3,opt4;
        Button submit;
        noOfQuestions=findViewById(R.id.noQues);
        Question=findViewById(R.id.questionTextView);
        opt1=findViewById(R.id.optA);
        opt2=findViewById(R.id.optB);
        opt3=findViewById(R.id.optC);
        opt4=findViewById(R.id.optD);
    }





public static String question[]={
"Who was the first caliph of Islam?","Which Sahabi was given the title of Sword Of Allah","In which Gazwa did Prophet Muhammad's(Peace be upon him) tooth break?","In which sura of Quran did Allah mention the rulings about Hijaab?"
};
    public static String choices[][]={{"Hazrat Abu Bakr Sidduiq(R.A.)","Hazrat Omar R.A.","Hazrat Ali R.A.","Hazrat Usman R.A."},{"Hazrat Khalid Bin Waleed R.A.","Hazrat Abu Obaida R.A.","Hazrat Ali R.A.","Hazrat Omar R.A."},{"Gazwa Khandaq","Gazwa Badar","Gazwa Khaibar","Gazwa Ohad"},{"Sura Baqarah","Sura Nisa","Sura Anfaal","Sura Ahzaab"}};

    public static String correctAnswers[]={"Hazrat Abu Bakr Sidduiq(R.A.)","Hazrat Khalid Bin Waleed R.A.","Gazawa Ohad","Sura Ahzaab"};
}





/*1

package com.example.mc_assignment2;
 2

 3

import androidx.appcompat.app.AppCompatActivity;
 4

 5

import android.os.Bundle;
 6

import android.view.View;
 7

import android.widget.Button;
 8

import android.widget.CheckBox;
 9

import android.widget.RadioButton;
 10

import android.widget.TextView;
 11

 12

import java.util.ArrayList;
 13

import java.util.Collections;
 14

import java.util.Random;
 15

 16

public class MainActivity extends AppCompatActivity {
 17

 18

    @Override
 19

    protected void onCreate(Bundle savedInstanceState) {
 20

        super.onCreate(savedInstanceState);
 21

        setContentView(R.layout.activity_main);
 22

    }
 23

    String data="";
 24

    String data2="";
 25

    public void btn1Clicked(View view)
 26

    {
 27

        CheckBox b1= findViewById(R.id.rd1);
 28

        data=(String)b1.getText();
 29

 30

    }
 31

    public void btn2Clicked(View view)
 32

    {
 33

        CheckBox b2= findViewById(R.id.rd2);
 34

        data=(String)b2.getText();
 35

 36

    }
 37

    public void btn3Clicked(View view)
 38

    {
 39

        CheckBox b3= findViewById(R.id.rd3);
 40

        data=(String)b3.getText();
 41

 42

    }
 43

    public void btn4Clicked(View view)
 44

    {
 45

        CheckBox b4= findViewById(R.id.rd4);
 46

        data2=(String)b4.getText();
 47

 48

    }public void btn5Clicked(View view)
 49

    {
 50

        CheckBox b5= findViewById(R.id.rd5);
 51

        data2=(String)b5.getText();
 52

 53

    }public void btn6Clicked(View view)
 54

    {
 55

        CheckBox b6= findViewById(R.id.rd6);
 56

        data2=(String)b6.getText();
 57

 58

    }
 59

 60

 61

 62

 63

 64

    String answer1="64";
 65

    String answer2="18";
 66

    String result="";
 67

    String result2="";
 68

    public void startQuiz(View view)
 69

    {
 70

        // this one is for text box
 71

        ArrayList<String> list = new ArrayList<>();
 72

        list.add("64");
 73

        list.add("128");
 74

        list.add("216");
 75

 76

        ArrayList<String> list1 = new ArrayList<>();
 77

        list1.add("16");
 78

        list1.add("17");
 79

        list1.add("18");
 80

 81

        Collections.shuffle(list, new Random());
 82

        Collections.shuffle(list1, new Random());
 83

 84

 85

        TextView mcq1= findViewById(R.id.mcq1);
 86

        CheckBox rdbtn1= findViewById(R.id.rd1);
 87

        CheckBox rdbtn2= findViewById(R.id.rd2);
 88

        CheckBox rdbtn3= findViewById(R.id.rd3);
 89

 90

        TextView mcq2= findViewById(R.id.mcq2);
 91

        CheckBox rdbtn4=findViewById(R.id.rd4);
 92

        CheckBox rdbtn5=findViewById(R.id.rd5);
 93

        CheckBox rdbtn6=findViewById(R.id.rd6);
 94

 95

        Button submitbtn=findViewById(R.id.submit);
 96

 97

        mcq1.setVisibility(View.VISIBLE);
 98

        mcq2.setVisibility(View.VISIBLE);
 99

        rdbtn1.setVisibility(View.VISIBLE);
 100

        rdbtn2.setVisibility(View.VISIBLE);
 101

        rdbtn3.setVisibility(View.VISIBLE);
 102

        rdbtn4.setVisibility(View.VISIBLE);
 103

        rdbtn5.setVisibility(View.VISIBLE);
 104

        rdbtn6.setVisibility(View.VISIBLE);
 105

        submitbtn.setVisibility(View.VISIBLE);
 106

        rdbtn1.setText(list.get(0));
 107

        rdbtn2.setText(list.get(1));
 108

        rdbtn3.setText(list.get(2));
 109

 110

        rdbtn4.setText(list1.get(0));
 111

        rdbtn5.setText(list1.get(1));
 112

        rdbtn6.setText(list1.get(2));
 113

 114

 115

 116

 117

 118

    }
 119

 120

    public void resultBtn(View view)
 121

    {
 122

        CheckBox rdbtn1= findViewById(R.id.rd1);
 123

        CheckBox rdbtn2= findViewById(R.id.rd2);
 124

        CheckBox rdbtn3= findViewById(R.id.rd3);
 125

 126

 127

        CheckBox rdbtn4=findViewById(R.id.rd4);
 128

        CheckBox rdbtn5=findViewById(R.id.rd5);
 129

        CheckBox rdbtn6=findViewById(R.id.rd6);
 130

 131

        int marks=0;
 132

        if(rdbtn4.isChecked() && !rdbtn5.isChecked() && !rdbtn6.isChecked() )
 133

        {
 134

 135

            if(data2==answer2)
 136

            {
 137

                marks+=1;
 138

            }
 139

        }
 140

        if(rdbtn5.isChecked() && !rdbtn4.isChecked() && !rdbtn6.isChecked() )
 141

        {
 142

 143

            if(data2==answer2)
 144

            {
 145

                marks+=1;
 146

            }
 147

        }
 148

        if(rdbtn6.isChecked() && !rdbtn5.isChecked() && !rdbtn4.isChecked() )
 149

        {
 150

            String q2= (String) rdbtn6.getText();
 151

            if(data2==answer2)
 152

            {
 153

                marks+=1;
 154

            }
 155

        }
 156

 157

        int marks2=0;
 158

 159

        if(rdbtn1.isChecked() && !rdbtn2.isChecked() && !rdbtn3.isChecked() )
 160

        {
 161

            String q2= (String) rdbtn1.getText();
 162

            if(data==answer1)
 163

            {
 164

                marks2+=1;
 165

            }
 166

        }
 167

        else if(rdbtn2.isChecked() && !rdbtn1.isChecked() && !rdbtn3.isChecked() )
 168

        {
 169

            String q2= (String) rdbtn5.getText();
 170

            if(data==answer1)
 171

            {
 172

                marks2+=1;
 173

            }
 174

        }
 175

        else if(rdbtn3.isChecked() && !rdbtn2.isChecked() && !rdbtn1.isChecked() )
 176

        {
 177

            String q2= (String) rdbtn6.getText();
 178

            if(data==answer1)
 179

            {
 180

                marks2+=1;
 181

            }
 182

        }
 183

 184

        result=Integer.toString(marks);
 185

        result2=Integer.toString(marks2);
 186

 187

 188

        TextView mcq1=(TextView) findViewById(R.id.mcq1);
 189

        TextView mcq2=(TextView) findViewById(R.id.mcq2);
 190

        TextView resultLabel=(TextView) findViewById(R.id.lblresult);
 191

 192

        mcq1.setVisibility(View.VISIBLE);
 193

        if(result=="1")
 194

        {
 195

            mcq1.setBackgroundColor(255);
 196

        }
 197

        if(result=="0")
 198

        {
 199

            mcq1.setBackgroundColor(255);
 200

        }
 201

 202

        if(result2=="1")
 203

        {
 204

            mcq2.setBackgroundColor(255);
 205

        }
 206

        if(result2=="0")
 207

        {
 208

            mcq2.setBackgroundColor(255);
 209

        }
 210

        int score1=Integer.parseInt(result)+Integer.parseInt(result2);
 211

        String score33=Integer.toString(score1);
 212

        resultLabel.setText("your sCore is "+score33);
 213

        resultLabel.setVisibility(view.VISIBLE);
 214

 215

    }
 216

 217

 218

 219

}*/