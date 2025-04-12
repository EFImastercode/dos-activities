package com.teacher.usuarios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

/** @noinspection Convert2Lambda*/
public class MainActivity extends AppCompatActivity {

    private EditText nombre, birth, telephone, emailuser, describe;
    private Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.edtNombre);
        birth = findViewById(R.id.edtDate);
        telephone = findViewById(R.id.edtPhone);
        emailuser = findViewById(R.id.edtEmail);
        describe = findViewById(R.id.edtDescr);
        siguiente = findViewById(R.id.btnSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomuser = nombre.getText().toString();
                String birthuser = birth.getText().toString();
                String telephoneuser = telephone.getText().toString();
                String useremail = emailuser.getText().toString();
                String describeuser = describe.getText().toString();

                Intent i = new Intent(getApplicationContext(), ConfirmarDatos.class);

                i.putExtra("NOMBRADO", nomuser);
                i.putExtra("NACIMIENTO", birthuser);
                i.putExtra("TELEFONO", telephoneuser);
                i.putExtra("EMAIL", useremail);
                i.putExtra("DESCRIPCION", describeuser);

                startActivity(i);
            }
        });
    }
}