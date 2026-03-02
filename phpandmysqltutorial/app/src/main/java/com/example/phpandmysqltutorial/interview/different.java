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
public class different extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("What are the different types of PHP variables?");
        builder.setMessage("There are 8 data types in PHP which are used to construct the variables:\n" +
                "1.\tIntegers − are whole numbers, without a decimal point, like 4195.\n" +
                "2.\tDoubles − are floating-point numbers, like 3.14159 or 49.1.\n" +
                "3.\tBooleans − have only two possible values either true or false.\n" +
                "4.\tNULL − is a special type that only has one value: NULL.\n" +
                "5.\tStrings − are sequences of characters, like ‘PHP supports string operations.’\n" +
                "6.\tArrays − are named and indexed collections of other values.\n" +
                "7.\tObjects − are instances of programmer-defined classes, which can package up both other kinds of values and functions that are specific to the class.\n" +
                "8.\tResources − are special variables that hold references to resources external to PHP.\n");
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

