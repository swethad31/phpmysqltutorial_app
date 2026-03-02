package com.example.phpandmysqltutorial.ui.gallery;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.phpandmysqltutorial.R;
import com.example.phpandmysqltutorial.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
    Activity context;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        return root;

    }

    public void onStart() {
        super.onStart();

        RatingBar simpleRatingBar = (RatingBar) context.findViewById(R.id.simpleRatingBar);
        Button submitButton = (Button) context.findViewById(R.id.submitButton);
        // perform click event on button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
                String totalStars = "Total Stars: " + simpleRatingBar.getNumStars();
                String rating = "Rating : " + simpleRatingBar.getRating();
                Toast.makeText(getActivity(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
                Toast.makeText(getActivity(), "Thanks for rating us....", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}