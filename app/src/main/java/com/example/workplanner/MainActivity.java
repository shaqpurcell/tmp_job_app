package com.example.workplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonCreateNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCreateNew = (Button) findViewById(R.id.buttonCreateNew);
        buttonCreateNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateActivity();
            }
        });
    }

    public void openCreateActivity() {
        Intent intent = new Intent(this, JobWorkerActivity.class);
        startActivity(intent);
    }
}
