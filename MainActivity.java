package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText loanAmountEditText;
    //private EditText interestRateEditText;
    private EditText loanTermEditText;
    private Button calculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loanAmountEditText = (EditText) findViewById(R.id.loan_amount_edittext);
        //interestRateEditText =(EditText) findViewById(R.id.interest_rate_edittext);
        loanTermEditText = (EditText) findViewById(R.id.loan_term_edittext);
        calculateButton = (Button) findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double lamt = Double.parseDouble(loanAmountEditText.getText().toString());
        //double roi = Double.parseDouble(interestRateEditText.getText().toString());
        double lterm = Double.parseDouble(loanTermEditText.getText().toString());
        Bundle b=new Bundle();
        b.putDouble("LoanAmount", lamt);
        //b.putDouble("InterestRate", roi);
        b.putDouble("LoanTerm", lterm);
        Intent it=new Intent(this, MainActivity2.class);
        it.putExtra("data", b);
        startActivity(it);
    }
}