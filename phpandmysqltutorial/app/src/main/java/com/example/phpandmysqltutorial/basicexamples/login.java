package com.example.phpandmysqltutorial.basicexamples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

import com.example.phpandmysqltutorial.MainActivity2;
import com.example.phpandmysqltutorial.R;
import com.example.phpandmysqltutorial.mysqltutorial.mysqltutorial;

public class login extends AppCompatActivity {

    Button mbtn;
    ImageView img1,img2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mbtn=findViewById(R.id.text7);
        img1 = (ImageView) findViewById(R.id.img2);
        img2 = (ImageView) findViewById(R.id.img8);
        ImageButton imageButton=findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(login.this, basic.class);
                home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(home);
            }
        });


        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.feedout);
                img2.setImageResource(R.drawable.feedoutput);
            }
        });


    }

}