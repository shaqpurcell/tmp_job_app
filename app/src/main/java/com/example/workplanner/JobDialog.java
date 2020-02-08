package com.example.workplanner;
//FILE:             JobDialog.java
//PROJECT:          Mobile Assignment #1
//PROGRAMMER:       Shaq Purcell
//FIRST VERSION:    Feb 5, 2020
//DESCRIPTION:      Describes the function and layout of the alertDialog for creating or editing a job

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JobDialog {
    Button buttonCancel;
    Button buttonSave;


        Context context;
        public JobDialog(Context context) {
            this.context = context;
        }

        public void showAlert(){

            AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            View alertView = inflater.inflate(R.layout.popup_add_job, null);
            alertDialog.setView(alertView);

            final AlertDialog show = alertDialog.show();

            Button buttonCancel = (Button) alertView.findViewById(R.id.buttonCancelJob);
            Button buttonSave = (Button) alertView.findViewById(R.id.buttonSaveJob);

            //Cancel
            buttonCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    show.dismiss();
                }

            });

            //Saving
            buttonSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast toast = Toast.makeText(((Activity) context),"Saved" , Toast.LENGTH_SHORT);
                    toast.show();
                    show.dismiss();
                }
            });
        }
    }




