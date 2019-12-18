package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText nome;
    public EditText email;
    public EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void proximaTela(View view) {
        nome = findViewById(R.id.nome);
        email = findViewById(R.id.email);

        String nomeTexto = nome.getText().toString();
        String emailTexto = email.getText().toString();
        Intent intent = new Intent(this, resultado.class);

        intent.putExtra("nome", nomeTexto);
        intent.putExtra("email", emailTexto);

        startActivity(intent);
    }

    }



    }

