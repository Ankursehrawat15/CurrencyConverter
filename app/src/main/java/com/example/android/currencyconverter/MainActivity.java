package com.example.android.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void covertCurrency(View view) {
        Log.i("Button" , "Pressed");
        EditText amountEntered = (EditText) findViewById(R.id.amountEnterd);
        double amountInDollars = Double.parseDouble(amountEntered.getText().toString());

        double  amountInRupees = (amountInDollars*73.40);

        String output = String.format("%.2f" , amountInRupees);

        Toast.makeText(this, "$"+amountInDollars+" is "+output+"rupees", Toast.LENGTH_LONG).show();

    }
}