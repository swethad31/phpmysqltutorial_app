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
public class dialogs extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("What are the characteristics of PHP variables?");
        builder.setMessage("Some of the important characteristics of PHP variables include:\n" +
                "•\tAll variables in PHP are denoted with a leading dollar sign ($).\n" +
                "•\tThe value of a variable is the value of its most recent assignment.\n" +
                "•\tVariables are assigned with the = operator, with the variable on the left-hand side and the expression to be evaluated on the right.\n" +
                "•\tVariables can, but do not need, to be declared before assignment.\n" +
                "•\tVariables in PHP do not have intrinsic types – a variable does not know in advance whether it will be used to store a number or a string of characters.\n" +
                "•\tVariables used before they are assigned have default values.\n");
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