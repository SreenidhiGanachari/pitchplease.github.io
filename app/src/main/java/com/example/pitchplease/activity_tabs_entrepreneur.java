package com.example.pitchplease;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class activity_tabs_entrepreneur extends AppCompatActivity {
    private Button button10;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button7;
    private Button button6;
    ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_entrepreneur);

        actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1EB79B")));

        Window window = activity_tabs_entrepreneur.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        ((Window) window).setStatusBarColor(ContextCompat.getColor(activity_tabs_entrepreneur.this, R.color.teal_700));
        button10 = (Button) findViewById(R.id.button10);
        button3 = (Button) findViewById(R.id.button3);
      button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);
        button7 =(Button) findViewById(R.id.button7);
        button6 =(Button) findViewById(R.id.button6);


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity25();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity23();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity24();
            }
        });



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity11();
            }
        });





 button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openActivity8();
        }
    });
}

    public void openActivity8() {
        Intent intent = new Intent(this, entrepreneur_new.class);
        startActivity(intent);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
    }

    public void openActivity11() {
        Intent intent = new Intent(this, Information_Entrepreneur.class);
        startActivity(intent);


    }

    public void openActivity23() {
        Intent intent = new Intent(this, Entrepreneur_Rating.class);
        startActivity(intent);


    }

    public void openActivity25() {
        Intent intent = new Intent(this,Callchatbuttons.class);
        startActivity(intent);


    }

    public void openActivity24() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);


    }

    public void openActivity5() {
        Intent intent = new Intent(this, Guidelines.class);
        startActivity(intent);
    }
}