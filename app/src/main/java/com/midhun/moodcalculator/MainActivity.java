package com.midhun.moodcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton angry_btn;
    private ImageButton stress_btn;
    private ImageButton happy_btn;
    private ImageButton sad_btn;

    private TextView suggestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angry_btn = findViewById(R.id.angry);
        stress_btn = findViewById(R.id.stress);
        happy_btn = findViewById(R.id.happy);
        sad_btn = findViewById(R.id.sad);
        suggestion = findViewById(R.id.mood_sugg);

        suggestion.setVisibility(View.INVISIBLE);

        angry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suggestion.setText("Use humor to release tension");
                suggestion.setVisibility(View.VISIBLE);
            }
        });

        stress_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suggestion.setVisibility(View.VISIBLE);
                suggestion.setText("Avoid unhealthy habits");

            }
        });

        happy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suggestion.setVisibility(View.VISIBLE);
                suggestion.setText("Share your happiness with others");
            }
        });

        sad_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suggestion.setVisibility(View.VISIBLE);
                suggestion.setText("Re-watch a funny or inspiring YouTube video");

            }
        });
    }
}