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
public class nullify extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("What is NULL?");
        builder.setMessage("NULL is a special data type which can have only one value. A variable of data type NULL is a variable that has no value assigned to it. It can be assigned as follows:\n" +
                "\n" +
                "$var = NULL;\n" +
                "\n" +
                "The special constant NULL is capitalized by convention but actually it is case insensitive. So,you can also write it as :\n" +
                "\n" +
                "$var = null;\n" +
                "\n" +
                "A variable that has been assigned the NULL value, consists of the following properties:\n" +
                "•\tIt evaluates to FALSE in a Boolean context.\n" +
                "•\tIt returns FALSE when tested with IsSet() function.\n");
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
