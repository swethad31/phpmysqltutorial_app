package com.example.phpandmysqltutorial.interview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.phpandmysqltutorial.MainActivity2;
import com.example.phpandmysqltutorial.R;

public class interview extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton imageButton=findViewById(R.id.imageButton3);
        Button button = findViewById(R.id.button31);
        Button button1 = findViewById(R.id.button32);
        Button button2 = findViewById(R.id.button33);
        Button button3 = findViewById(R.id.button34);
        Button button4 = findViewById(R.id.button35);
        Button button5 = findViewById(R.id.button36);
        Button button6 = findViewById(R.id.button37);
        Button button7 = findViewById(R.id.button38);
        Button button8 = findViewById(R.id.button39);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(interview.this, MainActivity2.class);
                home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(home);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyDialogFragment().show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new mydialog().show(getSupportFragmentManager(),"mydialog");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new dialog().show(getSupportFragmentManager(),"dialog");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new dialogfragment().show(getSupportFragmentManager(),"dialogfragment");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new fragment().show(getSupportFragmentManager(),"fragment");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new dialogs().show(getSupportFragmentManager(),"dialogs");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new different().show(getSupportFragmentManager(),"different");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new rules().show(getSupportFragmentManager(),"rules");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new nullify().show(getSupportFragmentManager(),"nullify");
            }
        });
    }
}