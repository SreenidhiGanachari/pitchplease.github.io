package com.example.pitchplease;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Entrepreneur_Rating extends AppCompatActivity {
    Button button;
    RatingBar ratingbar;
    float myrating=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrepreneur_rting);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1EB79B")));

        Window window =Entrepreneur_Rating.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        ((Window) window).setStatusBarColor(ContextCompat.getColor(Entrepreneur_Rating.this, R.color.teal_700));

        button=findViewById(R.id.button);
        ratingbar=findViewById(R.id.ratingBar);

        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                int rating=(int)v;
                String message = null;

                myrating=ratingBar.getRating();
                switch(rating) {
                    case 1:
                        message = "Sorry for the experience";
                        break;
                    case 2:
                        message = "We will consider your suggestions";
                        break;
                    case 3:
                        message = "Good !";
                        break;
                    case 4:
                        message = "Great experience !";
                        break;

                    case 5:
                        message = "Awesome experience !";
                        break;
                }
                Toast.makeText(Entrepreneur_Rating.this,message,Toast.LENGTH_SHORT).show();






            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Entrepreneur_Rating.this,"Your rating is: "+String.valueOf(myrating),Toast.LENGTH_SHORT).show();
            }
        });
    }
}