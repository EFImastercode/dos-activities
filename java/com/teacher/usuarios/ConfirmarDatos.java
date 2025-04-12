package com.teacher.usuarios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmarDatos extends AppCompatActivity {
    TextView candidato, nace, telef, ecorreo, describe;
    Button botonEditar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
        candidato = findViewById(R.id.tvNombre);
        nace = findViewById(R.id.tvNacimiento);
        telef = findViewById(R.id.tvTel);
        ecorreo = findViewById(R.id.tvCorreo);
        describe = findViewById(R.id.tvDescr);
        botonEditar = findViewById(R.id.btnEdatos);

        Intent i=getIntent();

        String nombrar=i.getStringExtra("NOMBRADO");
        String nacimiento=i.getStringExtra("NACIMIENTO");
        String telefono=i.getStringExtra("TELEFONO");
        String email=i.getStringExtra("EMAIL");
        String descripcion=i.getStringExtra("DESCRIPCION");
        candidato.setText(nombrar);
        nace.setText(nacimiento);
        telef.setText(telefono);
        ecorreo.setText(email);
        describe.setText(descripcion);

        botonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}