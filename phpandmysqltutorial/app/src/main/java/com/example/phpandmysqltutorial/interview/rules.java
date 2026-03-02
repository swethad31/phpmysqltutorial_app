package com.example.phpandmysqltutorial.interview;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
public class rules extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("What are the rules for naming a PHP variable?");
        builder.setMessage("The following rules are needed to be followed while  naming a PHP variable:\n" +
                "•\tVariable names must begin with a letter or underscore character.\n" +
                "•\tA variable name can consist of numbers, letters, underscores but you cannot use characters like + , – , % , ( , ) . & , etc.\n");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Intent myIntent = new Intent(getActivity(),interview.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(myIntent);

            }
        });

        AlertDialog alertDialog = builder.create();
        return alertDialog;
    }
}

