package com.example.android.signupscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Spinner spTines = (Spinner) findViewById(R.id.spn_time);
        Spinner spCidades = (Spinner) findViewById(R.id.spn_cidade);
        Spinner spEstado = (Spinner) findViewById(R.id.spn_estado);


        ArrayAdapter adapterCidades = ArrayAdapter.createFromResource(PerfilActivity.this,R.array.cidades, android.R.layout.simple_spinner_item);
        spCidades.setAdapter(adapterCidades);

        ArrayAdapter adapterEstado = ArrayAdapter.createFromResource(PerfilActivity.this,R.array.estado, android.R.layout.simple_spinner_item);
        spEstado.setAdapter(adapterEstado);

        ArrayAdapter adapterTimes = ArrayAdapter.createFromResource(PerfilActivity.this, R.array.times, android.R.layout.simple_spinner_item);
        spTines.setAdapter(adapterTimes);
    }



}
