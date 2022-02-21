package com.example.workingbackwards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tomer.fadingtextview.FadingTextView;

public class WelcomeScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
    }

    public void onClick(View view) {
        if(view.getId() == R.id.begin_button) {
            startActivity(new Intent(this, TaskDashboard.class));
        }
    }
}