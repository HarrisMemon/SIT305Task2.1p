package com.example.task21p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView tv1,tv2,tv3;
    TextView usernumber;


    public void weightCalc(View view){

        if (spinner.getSelectedItem().toString().contains("Kilogram") ){
            double num =  Double.parseDouble(usernumber.getText().toString());
            double gram = num *1000;
            tv1.setText(String.format("%.2f",gram) + " Grams");

            double oz = num*35.274;
            tv2.setText(String.format("%.2f",oz) + " Ounce");

            double pound = num * 2.205;
            tv3.setText(String.format("%.2f",pound) + " Pounds");

        } else  {
            tv1.setText("Please select the correct conversion icon - Kilogram");
            tv2.setText("");
            tv3.setText("");


        }
    }

    public void tempCalc(View view){
        if (spinner.getSelectedItem().toString().contains("Celsius") ){
            double num =  Double.parseDouble(usernumber.getText().toString());
            double fahren = (num * 9/5) + 32 ;
            tv1.setText(String.format("%.2f",fahren) + " Fahrenheit");

            double oz = num*35.274;
            tv2.setText(String.format("%.2f",oz) + " Ounce");

            double kelv = num + 273.15;
            tv3.setText(String.format("%.2f",kelv) + " Kelvin");

        } else  {
            tv1.setText("Please select the correct conversion icon - Celsius");
            tv2.setText("");
            tv3.setText("");


        }
    }

    public void measureCalc(View view){
        if (spinner.getSelectedItem().toString().contains("Metre") ){
            double num =  Double.parseDouble(usernumber.getText().toString());
            double cm = num*100;
            tv1.setText(String.format("%.2f",cm) + " Centimeter");

            double foot = num*3.281;
            tv2.setText(String.format("%.2f",foot) + " Foot");

            double inch = num * 39.37;
            tv3.setText(String.format("%.2f",inch) + " Inch");

        } else  {
            tv1.setText("Please select the correct conversion icon - Metre");
            tv2.setText("");
            tv3.setText("");


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        usernumber = findViewById(R.id.userNumber);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerArray));
        spinner = findViewById(R.id.spinner);

        spinner.setAdapter(adapter);



    }
}