package com.example.phpandmysqltutorial.ui.slideshow;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.phpandmysqltutorial.R;
import com.example.phpandmysqltutorial.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    Activity context;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        return root;
    }

    public void onStart() {
        super.onStart();

        Button btn = (Button) context.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                String UriText = "mailto:" + Uri.encode("catlina.fc@gmail.com") + "?subject=" +
                        Uri.encode("Feedback") + "$body=" + Uri.encode("");
                Uri uri = Uri.parse(UriText);
                intent.setData(uri);
                startActivity(Intent.createChooser(intent, "send email"));
            }
        });
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}