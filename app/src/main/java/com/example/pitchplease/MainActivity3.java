package com.example.pitchplease;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity3 extends AppCompatActivity {
    Button btnReg ;
    private Button button3;
    EditText edtFirst, edtUser, edtPass, edtConfPass, edtEmail;
    ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        actionbar=getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1EB79B")));

        Window window = MainActivity3.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        ((Window) window).setStatusBarColor(ContextCompat.getColor(MainActivity3.this, R.color.teal_700));

        edtFirst=(EditText)findViewById(R.id.edtfirstname);
        edtUser=(EditText)findViewById(R.id.edtUsername);
        edtPass=(EditText)findViewById(R.id.edtPass);
        edtConfPass=(EditText)findViewById(R.id.edtConfirmPass);
        edtEmail=(EditText)findViewById(R.id.edtEmail);
        button3= (Button) findViewById(R.id.button3);
        btnReg=(Button)findViewById(R.id.button1);


        btnReg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if(edtFirst.getText().toString().length()==0){
                    edtFirst.setError("First name not entered");
                    edtFirst.requestFocus();
                }


                if(edtUser.getText().toString().length()==0){
                    edtUser.setError("Username is Required");
                    edtUser.requestFocus();
                }
                if(edtPass.getText().toString().length()==0){
                    edtPass.setError("Password not entered");
                    edtPass.requestFocus();
                }
                if(edtConfPass.getText().toString().length()==0){
                    edtConfPass.setError("Please confirm password");
                }
                if(!edtPass.getText().toString().equals(edtConfPass.getText().toString())){
                    edtConfPass.setError("Password Not matched");
                    edtConfPass.requestFocus();
                }
                if(edtPass.getText().toString().length()<8 ){
                    edtPass.setError("Password should be atleast of 8 characters");
                    edtPass.requestFocus();


                }

                else {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                }

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });}

        public void openActivity3(){
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
    }
