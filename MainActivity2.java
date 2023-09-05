package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button hdfc, idbi, icici, sbi, canara;
    double LoanAmount;
    //double InterestRate;
    double LoanTerm;
    double lamt, lterm;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hdfc=(Button) findViewById(R.id.button);
        idbi=(Button) findViewById(R.id.button3);
        icici=(Button) findViewById(R.id.button2);
        sbi=(Button) findViewById(R.id.button4);
        canara=(Button)findViewById(R.id.button5);
        Bundle b=getIntent().getBundleExtra("data");
        LoanAmount=b.getDouble("LoanAmount");
        LoanTerm=b.getDouble("LoanTerm");
        hdfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, HDFC.class);
                i.putExtra("data", b);
                startActivity(i);
            }
        });
        idbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, IDBI.class);
                i.putExtra("data", b);
                startActivity(i);
            }
        });
        icici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, ICICI.class);
                i.putExtra("data", b);
                startActivity(i);
            }
        });
        sbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, SBI.class);
                i.putExtra("data", b);
                startActivity(i);
            }
        });
        canara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this, canara.class);
                i.putExtra("data", b);
                startActivity(i);
            }
        });


    }



}