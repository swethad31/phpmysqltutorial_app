package com.example.phpandmysqltutorial.basicexamples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.phpandmysqltutorial.MainActivity2;
import com.example.phpandmysqltutorial.R;
import com.example.phpandmysqltutorial.interview.interview;
import com.example.phpandmysqltutorial.mysqltutorial.mysqltutorial;

public class basic extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        ImageButton imageButton=findViewById(R.id.imageButton3);
        btn1=findViewById(R.id.button31);
        btn2=findViewById(R.id.button32);
        btn3=findViewById(R.id.button33);
        btn4=findViewById(R.id.button34);
        btn5=findViewById(R.id.button35);
        btn6=findViewById(R.id.button36);
        btn7=findViewById(R.id.button37);
        btn8=findViewById(R.id.button38);



        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(basic.this, MainActivity2.class);
                home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(home);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(basic.this,login.class);
                startActivity(myIntent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(basic.this,array.class);
                startActivity(myIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(basic.this,table.class);
                startActivity(myIntent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(basic.this,radius.class);
                startActivity(myIntent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(basic.this,tablecreation.class);
                startActivity(myIntent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(basic.this,insertingrecords.class);
                startActivity(myIntent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(basic.this,sortdata.class);
                startActivity(myIntent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(basic.this,view.class);
                startActivity(myIntent);
            }
        });
    }
}