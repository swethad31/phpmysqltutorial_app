package com.example.phpandmysqltutorial.ui.home;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.phpandmysqltutorial.basicexamples.basic;
import com.example.phpandmysqltutorial.interview.interview;
import com.example.phpandmysqltutorial.mysqltutorial.mysqltutorial;
import com.example.phpandmysqltutorial.phptutorial.phptutorial;
import com.example.phpandmysqltutorial.R;
import com.example.phpandmysqltutorial.quiz.MainActivity;
import com.example.phpandmysqltutorial.software.software;
import com.example.phpandmysqltutorial.tipsandtricks.tipsandtricks;


public class HomeFragment extends Fragment {
    Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context = getActivity();

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    public void onStart() {
        super.onStart();

        Button btn = (Button) context.findViewById(R.id.button3);
        Button btn1 = (Button) context.findViewById(R.id.button4);
        Button btn2 = (Button) context.findViewById(R.id.button5);
        Button btn3 = (Button) context.findViewById(R.id.button6);
        Button btn6 = (Button) context.findViewById(R.id.button7);
        Button btn7 = (Button) context.findViewById(R.id.button8);
        Button btn8 = (Button) context.findViewById(R.id.button9);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, phptutorial.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, mysqltutorial.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, basic.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, interview.class);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, software.class);
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, tipsandtricks.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}