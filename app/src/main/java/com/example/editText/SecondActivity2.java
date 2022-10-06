package com.example.editText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity2 extends AppCompatActivity {

    private TextView tv;
    private StringBuilder numeros;
    private int num1, num2;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = this.findViewById(R.id.textView);
        numeros = new StringBuilder("");

    }

    //metodos botones
    public void boton1(View view) {
        numeros.append("1");
        tv.setText(numeros);
    }

    public void boton2(View view) {
        numeros.append("2");
        tv.setText(numeros);
    }

    public void boton3(View view) {
        numeros.append("3");
        tv.setText(numeros);
    }

    public void boton4(View view) {
        numeros.append("4");
        tv.setText(numeros);
    }

    public void boton5(View view) {
        numeros.append("5");
        tv.setText(numeros);
    }

    public void boton6(View view) {
        numeros.append("6");
        tv.setText(numeros);
    }

    public void boton7(View view) {
        numeros.append("7");
        tv.setText(numeros);
    }

    public void boton8(View view) {
        numeros.append("8");
        tv.setText(numeros);
    }

    public void boton9(View view) {
        numeros.append("9");
        tv.setText(numeros);
    }

    public void boton0(View view) {
        numeros.append("0");
        tv.setText(numeros);
    }

    public void botonSuma(View view) {
        tv.setText("+");
        operacion = "+";
        num1 = Integer.parseInt(numeros.toString());
        numeros = new StringBuilder("");
    }

    public void botonResta(View view) {
        tv.setText("-");
        operacion = "-";
        num1 = Integer.parseInt(numeros.toString());
        numeros = new StringBuilder("");
    }

    public void botonMultiplicacion(View view) {
        tv.setText("*");
        operacion = "*";
        num1 = Integer.parseInt(numeros.toString());
        numeros = new StringBuilder("");
    }

    public void botonDivision(View view) {
        tv.setText("/");
        operacion = "/";
        num1 = Integer.parseInt(numeros.toString());
        numeros = new StringBuilder("");
    }

    public void botonResetear(View view) {
        num1 = 0;
        num2 = 0;
        numeros = new StringBuilder();
        operacion = "";
        tv.setText("0");
    }

    public void botonIgual(View view) {
        num2 = Integer.parseInt(numeros.toString());
        int resultado;
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                String suma = String.valueOf(resultado);
                numeros = new StringBuilder(suma);
                tv.setText(numeros);
                break;
            case "-":
                resultado = num1 - num2;
                String resta = String.valueOf(resultado);
                numeros = new StringBuilder(resta);
                tv.setText(numeros);
                break;
            case "*":
                resultado = num1 * num2;
                String multi = String.valueOf(resultado);
                numeros = new StringBuilder(multi);
                tv.setText(numeros);
                break;
            case "/":
                if (num2 != 0) {
                    double division = (double) num1 / (double) num2;
                    String div = String.valueOf(division);
                    numeros = new StringBuilder(div);
                    tv.setText(numeros);
                } else {
                    Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operacion);
        }
    }

    public void volver(View view) {

        Intent vlver = new Intent(this, MainActivity.class);
        startActivity(vlver);

    }
}