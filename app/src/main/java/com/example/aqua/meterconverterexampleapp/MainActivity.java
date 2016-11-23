package com.example.aqua.meterconverterexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputET;
    TextView resultTV;
    RadioGroup radioGroup;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputET=(EditText)findViewById(R.id.inputET);
        resultTV=(TextView)findViewById(R.id.resultTV);
         radioGroup=(RadioGroup)findViewById(R.id.radiogroupRG);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch(checkedId) {
                   case R.id.meterRB:result=Converter.toMeter(null);
                                        break;
                   case R.id.kilometerRB:result=Converter.toKilometer(null);
                                    break;
                   case R.id.inchRB:result=Converter.toInch(null);
                                    break;
                   case R.id.feetRB:result=Converter.toFeet(null);
                                     break;
               }
                resultTV.setText(result);

            }
        });
    }

}
