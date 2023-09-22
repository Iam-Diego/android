package com.example.myapp4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void calcularMayor(View view) {
        try {
            double num1 = Double.parseDouble(editTextNumber1.getText().toString());
            double num2 = Double.parseDouble(editTextNumber2.getText().toString());
            double num3 = Double.parseDouble(editTextNumber3.getText().toString());

            double mayor = Math.max(Math.max(num1, num2), num3);

            resultTextView.setText("El número mayor es: " + mayor);
        } catch (NumberFormatException e) {
            resultTextView.setText("Ingresa números válidos en todos los campos.");
        }
    }
}
