package com.example.exemploenviodedados;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Button btnEnviarDados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnEnviarDados = (Button)findViewById(R.id.cmdEnviarDados);
        btnEnviarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
                //intencao.putExtra("nome","ARTHUR ARAUJO MARINS");
                //intencao.putExtra("telefone", "61 9999 7070");
                //Evio via Bundle usando Orientação a Objetos
                Pessoa pessoa = new Pessoa();
                pessoa.setNome("ARTHUR ARAUJO MARINS");
                pessoa.setTelefone("61 9999 7070");
                intencao.putExtra("objeto",pessoa);
                startActivity(intencao);
            }
        });
    }
}