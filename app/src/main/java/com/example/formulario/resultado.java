package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

        public TextView nomeCampo;
        public TextView emailCampo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


    Bundle bundle = getIntent().getExtras();
    if(bundle !=null){
        String nome=bundle.getString( "nome");
    String email=bundle.getString("email");

     nomeCampo=findViewById(R.id.nome);
     nomeCampo.setText(nome);

     emailCampo=findViewById(R.id.email);
     emailCampo.setText(email);


        }
}

    }

