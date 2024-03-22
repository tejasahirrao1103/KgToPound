package com.example.kgtopound;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtkg;
        Button btnconvert;
        TextView txtOp;

        edtkg=findViewById(R.id.edtKg);
        btnconvert=findViewById(R.id.btnConvert);
        txtOp=findViewById(R.id.txtOutput);

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String kg = edtkg.getText().toString();
                int kilo= Integer.parseInt(kg);
                double pound = kilo*2.205;
                txtOp.setText("CONVERSION is  "+kilo+" Kg = "+pound+" lbs");

            }
        });


    }
}