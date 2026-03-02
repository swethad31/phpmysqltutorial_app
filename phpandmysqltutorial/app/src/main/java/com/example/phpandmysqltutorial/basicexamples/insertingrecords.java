package com.example.phpandmysqltutorial.basicexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.phpandmysqltutorial.R;

public class insertingrecords extends AppCompatActivity {

    Button mbtn;
    ImageView img1,img2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertingrecords);
        mbtn=findViewById(R.id.text7);
        img1 = (ImageView) findViewById(R.id.img2);
        img2 = (ImageView) findViewById(R.id.img8);
        ImageButton imageButton=findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(insertingrecords.this, basic.class);
                home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(home);
            }
        });


        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.entries);
                img2.setImageResource(R.drawable.insert);
            }
        });


    }

}