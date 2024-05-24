package com.example.baitaplon;

import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBarRec, progressBarCircle, progressCircular1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        progressBarRec = findViewById(R.id.home_pressRectange);
        progressBarCircle = findViewById(R.id.home_progress_circular2);
        progressCircular1 = findViewById(R.id.home_progress_circular1);
        progressBarRec.setMax(10);
        progressBarRec.setProgress(6);

        progressBarCircle.setProgress(7);
        progressBarCircle.setMax(10);

        progressCircular1.setProgress(75);
        progressCircular1.setMax(100);
    }
}