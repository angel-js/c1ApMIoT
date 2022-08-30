package com.example.clase01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResultado;
    private TextView tvVal1, tvVal2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvMostrar);
        tvVal1 = findViewById(R.id.etValor1);
        tvVal2 = findViewById(R.id.etValor2);


        tvResultado.setText("Hola Mundo v2.0");

        // Tipos de Variables
        // Variable primitiva -> No depende de una clase
        // enteros
        short val0 = 1;
        int val1 = 5;
        long val2 = 100;

        float f1 = 5.5f;
        double d1 = 5.5;

        int v1 = 5;
        int v2 = 2;
        double res = v1/v2;

        char ch1 = 'a';

        String p1 = "Hola Mundo";

        boolean vof = true;


    }

    // Metodos
    public void calcular(View HelloWorld){
        int x = Integer.parseInt(tvVal1.getText().toString());
        int y = Integer.parseInt(tvVal2.getText().toString());

        tvResultado.setText(String.valueOf(x+y));
    }
}
