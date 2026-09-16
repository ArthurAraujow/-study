package com.example.exemploenviodedados;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.Pessoa;

public class SegundaActivity extends AppCompatActivity {
    TextView tvNome, tvTelefone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        tvNome = (TextView) findViewById(R.id.lblNome);
        tvTelefone = (TextView) findViewById(R.id.lblTelefone);

        Bundle dados = getIntent().getExtras();
        Pessoa pessoa = (Pessoa)dados.getSerializable("objeto");
        tvNome.setText(pessoa.getNome());
        tvTelefone.setText(pessoa.getTelefone());
        //String nome, telefone;
        //nome=dados.getString("nome");
        //telefone=dados.getString("telefone");
        //tvNome.setText(nome);
        //tvTelefone.setText(telefone);

    }
}