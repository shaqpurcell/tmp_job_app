package com.example.workplanner;

//FILE:             JobWorkerActivity.java
//PROJECT:          Mobile Assignment #1
//PROGRAMMER:       Shaq Purcell
//FIRST VERSION:    Feb 5, 2020
//DESCRIPTION:      Describes the function and layout of the alertDialog for creating or editing a job

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JobWorkerActivity extends AppCompatActivity {

    Button buttonCreateJob;
    Button buttonCreateWorker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_worker);

        buttonCreateJob = (Button) findViewById(R.id.buttonCreateJob);
        buttonCreateWorker = (Button) findViewById(R.id.buttonCreateWorker);
        buttonCreateJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJobDialog();
            }
        });

        buttonCreateWorker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorkerDialog();
            }
        });
    }

    /*
    *FUNCTION:      openWorkerDialog
    * DESCRIPTION:  Create WorkerDialog object, display said object
    * PARAMETERS:   NONE
    * RETURN:       NONE
    */

    public void openWorkerDialog() {
        WorkerDialog workerDialog = new WorkerDialog(this);

        workerDialog.showAlert();
    }

    /*
     *FUNCTION:      openJobDialog
     * DESCRIPTION:  Create JobDialog object, display said object
     * PARAMETERS:   NONE
     * RETURN:       NONE
     */

    public void openJobDialog() {
        JobDialog jobDialog = new JobDialog(this);

        jobDialog.showAlert();
    }


}
