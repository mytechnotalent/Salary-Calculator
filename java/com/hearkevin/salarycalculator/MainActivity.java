package com.hearkevin.salarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void monthlySalary(View view) {
        EditText annualSalaryEditText = (EditText)findViewById(R.id.annualSalaryEditText);
        TextView resultTextView = (TextView)findViewById(R.id.resultTextView);

        if (annualSalaryEditText.getText().toString().isEmpty()) {
            resultTextView.setText("Please enter a number!");
        } else if ((Double.parseDouble(annualSalaryEditText.getText().toString()) > 1000000)) {
            resultTextView.setText("Please enter a value under a million dollars please!");
        } else {
            double annualSalary = Double.parseDouble(annualSalaryEditText.getText().toString());

            double monthlySalary = (annualSalary / 12);

            monthlySalary = Math.ceil(monthlySalary * 100.0) / 100.0;

            resultTextView.setText(String.format("$" + "%0.2f" + " Monthly Salary", monthlySalary));
        }
    }

    public void biWeeklySalary(View view) {
        EditText annualSalaryEditText = (EditText) findViewById(R.id.annualSalaryEditText);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        if (annualSalaryEditText.getText().toString().isEmpty()) {
            resultTextView.setText("Please enter a number!");
        } else if ((Double.parseDouble(annualSalaryEditText.getText().toString()) > 1000000)) {
            resultTextView.setText("Please enter a value under a million dollars please!");
        } else {
            double annualSalary = Double.parseDouble(annualSalaryEditText.getText().toString());

            double biWeeklySalary = (annualSalary / 26);

            biWeeklySalary = Math.ceil(biWeeklySalary * 100.0) / 100.0;

            resultTextView.setText(String.format("$" + "%.2f" + " Bi-Weekly Salary", biWeeklySalary));
        }
    }

    public void weeklySalary(View view) {
        EditText annualSalaryEditText = (EditText) findViewById(R.id.annualSalaryEditText);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        if (annualSalaryEditText.getText().toString().isEmpty()) {
            resultTextView.setText("Please enter a number!");
        } else if ((Double.parseDouble(annualSalaryEditText.getText().toString()) > 1000000)) {
            resultTextView.setText("Please enter a value under a million dollars please!");
        } else {
            double annualSalary = Double.parseDouble(annualSalaryEditText.getText().toString());

            double weeklySalary = (annualSalary / 52);

            weeklySalary = Math.ceil(weeklySalary * 100.0) / 100.0;

            resultTextView.setText(String.format("$" + "%.2f" + " Weekly Salary", weeklySalary));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
