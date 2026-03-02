package com.example.phpandmysqltutorial.phptutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.phpandmysqltutorial.MainActivity2;
import com.example.phpandmysqltutorial.R;


public class phptutorial extends AppCompatActivity {

    private Button mbtn,mbtn1,mbtn2,mbtn3,mbtn4,mbtn5,mbtn6,mbtn7,mbtn8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phptutorial);
        ImageButton imageButton=findViewById(R.id.imageButton3);
        Button mbtn=findViewById(R.id.button31);
        Button mbtn1=findViewById(R.id.button32);
        Button mbtn2=findViewById(R.id.button33);
        Button mbtn3=findViewById(R.id.button34);
        Button mbtn4=findViewById(R.id.button35);
        Button mbtn5=findViewById(R.id.button36);
        Button mbtn6=findViewById(R.id.button37);
        Button mbtn7=findViewById(R.id.button38);
        Button mbtn8=findViewById(R.id.button39);




        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(phptutorial.this, MainActivity2.class);
                home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(home);
            }
        });

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent=new Intent(phptutorial.this, phpintroduction.class);
                startActivity(homeIntent);
            }
        });

        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(phptutorial.this, syntaxandcomments.class);
                startActivity(i);
            }
        });

        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(phptutorial.this, variablesstringsanddatatypes.class);
                startActivity(i);
            }
        });

        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(phptutorial.this, strings.class);
                startActivity(i);
            }
        });

        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(phptutorial.this, consonants.class);
                startActivity(m);
            }
        });

        mbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(phptutorial.this, condtionalandloops.class);
                startActivity(m);
            }
        });

        mbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(phptutorial.this, formhandling.class);
                startActivity(m);
            }
        });

        mbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(phptutorial.this, file.class);
                startActivity(m);
            }
        });

        mbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(phptutorial.this, sessionsandcookies.class);
                startActivity(m);
            }
        });




    }

    }




