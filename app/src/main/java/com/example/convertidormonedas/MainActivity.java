package com.example.convertidormonedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText tIngresoVal;
    private Button bcalcularDA;
    private Button bcalcularDC;
    private Button bcalcularL;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tIngresoVal = findViewById(R.id.ingresoValores);
        bcalcularDA = findViewById(R.id.PesoADolarAmer);
        bcalcularDC = findViewById(R.id.PesoADolarCana);
        bcalcularL = findViewById(R.id.PesoALibra);

        //Calcular Peso a dolar
        bcalcularDA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n = 0.0;
                String num = "";
                String p = "";
                String d = "";
                num = tIngresoVal.getText().toString();
                n = Double.parseDouble(num);

                Dinero dinero = new Dinero();
                dinero.setNumero(n);
                dinero.setSimbolo("$");

                PesoMexicano pesoMexicano = new PesoMexicano(dinero.getSimbolo(), dinero.getNumero());
                DolarAmericano dolarAmericano = new DolarAmericano(dinero.getSimbolo(), dinero.getNumero());

                dolarAmericano = DolarAmericano.valueOf(pesoMexicano);
                p = String.valueOf(dolarAmericano.getNumero() + dolarAmericano.getSimbolo());

                tIngresoVal.setText(p);
            }
        });

        //Calcular Dolar Canadiense
        bcalcularDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n = 0.0;
                String num = "";
                String c = "";
                String d = "";
                num = tIngresoVal.getText().toString();
                n = Double.parseDouble(num);

                Dinero dinero = new Dinero();
                dinero.setNumero(n);
                dinero.setSimbolo("$");

                PesoMexicano pesoMexicano = new PesoMexicano(dinero.getSimbolo(), dinero.getNumero());
                DolarCanadiense dolarCanadiense = new DolarCanadiense(dinero.getSimbolo(), dinero.getNumero());

                dolarCanadiense = DolarCanadiense.valueOf(pesoMexicano);
                c = String.valueOf(dolarCanadiense.getNumero() + dolarCanadiense.getSimbolo());

                tIngresoVal.setText(c);
            }
        });

        //Calcular Libra
        bcalcularL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n = 0.0;
                String num = "";
                String l = "";
                String d = "";
                num = tIngresoVal.getText().toString();
                n = Double.parseDouble(num);

                Dinero dinero = new Dinero();
                dinero.setNumero(n);
                dinero.setSimbolo("$");

                PesoMexicano pesoMexicano = new PesoMexicano(dinero.getSimbolo(), dinero.getNumero());
                Libra libra = new Libra(dinero.getSimbolo(), dinero.getNumero());

                libra = Libra.valueOf(pesoMexicano);
                l = String.valueOf(libra.getNumero() + libra.getSimbolo());

                tIngresoVal.setText(l);
            }
        });
    }
}