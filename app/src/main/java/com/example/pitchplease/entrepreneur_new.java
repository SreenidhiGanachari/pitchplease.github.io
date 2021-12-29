package com.example.pitchplease;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.os.Bundle;

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
import android.os.Bundle;

public class entrepreneur_new extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] country = { "Mumbai","Delhi","Bangalore","Kolkata","Chennai","Ahmedabad","Hyderabad"
            ,"Pune","Surat","Kanpur","Jaipur","Navi Mumbai","Lucknow","Nagpur","Indore","Patna","Bhopal","Ludhiana","Agra","Vadodara","Mumbai","Delhi","Bangalore","Kolkata","Chennai","Ahmedabad","Hyderabad"
    };
    String[]scale= {"Micro Scale - <1 Crores","Small Scale - <10Crores","Medium Scale - <50Crores" , "Large Scale - <100Crores"};
    String[]type= {"Raw materials","Manufacturing","Services"," Information services","Human services","Agriculture","Computer and technology","Construction","Education","Energy"};
    EditText ed1,ed2 , ed3,ed4;
    Button btnReg ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrepreneur_new);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1EB79B")));

        Window window = entrepreneur_new.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        ((Window) window).setStatusBarColor(ContextCompat.getColor(entrepreneur_new.this, R.color.teal_700));

        ed1 = (EditText)findViewById(R.id.edtfirstname);
        ed2 = (EditText)findViewById(R.id.edtAbstract);
        btnReg=(Button)findViewById(R.id.button3);
        ed4=(EditText)findViewById(R.id.editTextPhone);

        String e1 =ed1.getText().toString();
        String e2 =ed2.getText().toString();


        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(new CountriesSpinnerClass());

        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        spin2.setOnItemSelectedListener(new CitiesSpinnerClass());

        Spinner spin3 = (Spinner) findViewById(R.id.spinner3);
        spin3.setOnItemSelectedListener(new TypeSpinnerClass());

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        ArrayAdapter aa1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,scale);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin2.setAdapter(aa1);

        ArrayAdapter aa2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,type);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin3.setAdapter(aa2);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    class CountriesSpinnerClass implements AdapterView.OnItemSelectedListener
    {
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
            Toast.makeText(v.getContext(), "Your choose :" + country[position],Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class TypeSpinnerClass implements AdapterView.OnItemSelectedListener
    {
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
            Toast.makeText(v.getContext(), "Your choose :" + type[position],Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class CitiesSpinnerClass implements AdapterView.OnItemSelectedListener
    {
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
            Toast.makeText(v.getContext(), "Your choose :" + scale[position],Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    public void submitbuttonandler(View view){
        Toast.makeText(getApplicationContext(), "Form has been submitted successfully", Toast.LENGTH_LONG).show();

    }
}