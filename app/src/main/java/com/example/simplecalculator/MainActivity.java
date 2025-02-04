package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    TextView result;
    int sayi1 , sayi2, sonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        number1 = findViewById(R.id.number1View);
        number2 = findViewById(R.id.number2View);
        result = findViewById(R.id.resultView);

    }

    public void toplama(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter Number");
        }
        else{
            sayi1 = Integer.parseInt(number1.getText().toString());
            sayi2 = Integer.parseInt(number2.getText().toString());
            sonuc = sayi1 + sayi2;
            result.setText(Integer.toString(sonuc));
        }
    }

    public void cıkarma(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter Number");
        }
        else{
            sayi1 = Integer.parseInt(number1.getText().toString());
            sayi2 = Integer.parseInt(number2.getText().toString());
            sonuc = sayi1-sayi2;
            result.setText(Integer.toString(sonuc));
        }
    }
    public void bolme(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter Number");
        }
        else{
            sayi1 = Integer.parseInt(number1.getText().toString());
            sayi2 = Integer.parseInt(number2.getText().toString());
            if (sayi2 == 0){
                result.setText("zero entering");
            }
            else{
                sonuc = sayi1/sayi2;
                result.setText(Integer.toString(sonuc));
            }
        }

    }
    public void carpma(View view ){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter Number");
        }
        else{
            sayi1 = Integer.parseInt(number1.getText().toString());
            sayi2 = Integer.parseInt(number2.getText().toString());
            sonuc = sayi1*sayi2;
            result.setText(Integer.toString(sonuc));
        }
    }
}