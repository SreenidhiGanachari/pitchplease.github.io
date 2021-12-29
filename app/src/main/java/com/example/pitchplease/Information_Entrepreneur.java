package com.example.pitchplease;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Information_Entrepreneur extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Versions> versionsList;
    ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_entrepreneur);

        actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1EB79B")));

        Window window = Information_Entrepreneur.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        ((Window) window).setStatusBarColor(ContextCompat.getColor(Information_Entrepreneur.this, R.color.teal_700));


        recyclerView = findViewById(R.id.recylerview);

        initData();
        setRecyclerView();

    }

    private void setRecyclerView() {

        VersionsAdapter versionsAdapter = new VersionsAdapter(versionsList);
        recyclerView.setAdapter(versionsAdapter);
        recyclerView.setHasFixedSize(true);

    }

    private void initData() {

        versionsList = new ArrayList<>();
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));
        versionsList.add(new Versions("Agriculture Industry", "Scale of Industry : <10 Crores","City : Kolkata", " ","Contact : 1234567890", "Name : Sreenidhi Ganachari","Profit Return : 80%"));











    }
}