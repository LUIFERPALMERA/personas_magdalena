package com.example.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CrearPersonas extends AppCompatActivity {
    private EditText cedula, nombres, apellidos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);

        cedula = findViewById(R.id.txtCedula);
        nombres = findViewById(R.id.txtNombre);
        apellidos = findViewById(R.id.txtApellido);
    }

    public void guardar(View v){
        String nom, apell, ced;
        Persona p;
        ced = cedula.getText().toString();
        nom = nombres.getText().toString();
        apell = apellidos.getText().toString();
        p = new Persona(ced, nom, apell);
        p.guardar();
    }

    public void limpiar (View v){
        cedula.setText("");
        nombres.setText("");
        apellidos.setText("");
        cedula.requestFocus();
    }
}
