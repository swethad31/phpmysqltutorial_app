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
public class dialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("How to execute a PHP script from the command line?");
        builder.setMessage("To execute a PHP script, use the PHP Command Line Interface (CLI) and specify the file name of the script in the following way:\n" +
                "\n" +
                "php script.php\n");
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
