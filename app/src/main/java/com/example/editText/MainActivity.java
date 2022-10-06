package com.example.editText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activar_modoAvion(View view) {
        Toast.makeText(this,"Has activado el modo avión",Toast.LENGTH_LONG).show();
    }

    public void pasar_a_calculadora(View view) {
        Intent calc = new Intent (this, SecondActivity2.class);
        startActivity(calc);
    }
}