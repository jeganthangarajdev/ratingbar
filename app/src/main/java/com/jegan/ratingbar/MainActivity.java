package com.jegan.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating=ratingBar.getRating();
                Toast.makeText(MainActivity.this,"Rating is" +rating,Toast.LENGTH_LONG).show();
            }
        });
    }
}
