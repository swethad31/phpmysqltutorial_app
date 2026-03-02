package com.example.phpandmysqltutorial.mysqltutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.phpandmysqltutorial.MainActivity2;
import com.example.phpandmysqltutorial.R;


public class mysqltutorial extends AppCompatActivity {

    private Button mbtn,mbtn1,mbtn2,mbtn3,mbtn4,mbtn5,mbtn6,mbtn7,mbtn8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysqltutorial);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageButton imageButton=findViewById(R.id.imageButton6);
        Button mbtn=findViewById(R.id.button20);
        Button mbtn1=findViewById(R.id.button21);
        Button mbtn2=findViewById(R.id.button22);
        Button mbtn3=findViewById(R.id.button23);
        Button mbtn4=findViewById(R.id.button24);
        Button mbtn5=findViewById(R.id.button25);
        Button mbtn6=findViewById(R.id.button26);





        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(mysqltutorial.this, MainActivity2.class);
                home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(home);
            }
        });

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my=new Intent(mysqltutorial.this,mysqlintro.class);
                startActivity(my);
            }
        });

        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my=new Intent(mysqltutorial.this,creation.class);
                startActivity(my);
            }
        });

        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my=new Intent(mysqltutorial.this,insertion.class);
                startActivity(my);
            }
        });

        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my=new Intent(mysqltutorial.this,updation.class);
                startActivity(my);
            }
        });

        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my=new Intent(mysqltutorial.this,deletion.class);
                startActivity(my);
            }
        });

        mbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my=new Intent(mysqltutorial.this,selection.class);
                startActivity(my);
            }
        });

        mbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my=new Intent(mysqltutorial.this,limitdata.class);
                startActivity(my);
            }
        });





    }

}




