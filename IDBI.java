package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IDBI extends AppCompatActivity {
    TextView lamt, roi, lterm, emii;
    Double LoanAmount, LoanTerm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idbi);
        lamt=findViewById(R.id.textView20);
        roi=findViewById(R.id.hdfc_roi);
        lterm=findViewById(R.id.textView18);
        emii=findViewById(R.id.textView16);
        Bundle b = getIntent().getBundleExtra("data");
        if (b != null) {
            LoanAmount = b.getDouble("LoanAmount");
            LoanTerm = b.getDouble("LoanTerm");
            calculateEMI(10.5);
        }
    }
    private void calculateEMI(double iRate) {
        double monthlyInterest = iRate / (12 * 100);
        double emicalc = (LoanAmount * monthlyInterest * Math.pow(1 + monthlyInterest, LoanTerm))
                / (Math.pow(1 + monthlyInterest, LoanTerm) - 1);
        roi.setText(String.valueOf(iRate));
        emii.setText(String.format("Rs.%.2f",emicalc));
        lamt.setText(String.valueOf(LoanAmount));
        lterm.setText(String.valueOf(LoanTerm));
    }
}