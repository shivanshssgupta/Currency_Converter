package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double d,r;
    public void clickF(View view)
    {
        EditText dollar=(EditText)findViewById(R.id.dollar);
        d=Double.parseDouble(dollar.getText().toString());
        r=d*74;
        String rupee=String.format("%.2f",r);
        Toast.makeText(this, dollar.getText().toString()+"$ is "+rupee+"Rs", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
