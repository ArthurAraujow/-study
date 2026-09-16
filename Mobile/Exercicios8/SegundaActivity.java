package com.example.exemploenviodadoscadastro;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.Pessoa;

public class SegundaActivity extends AppCompatActivity {
    TextView tvNome, tvEmail, tvTelefone, tvIdade, tvIniciaisNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        tvNome = (TextView) findViewById(R.id.lblNomeValor);
        tvEmail = (TextView) findViewById(R.id.lblEmailValor);
        tvTelefone = (TextView) findViewById(R.id.lblTelefoneValor);
        tvIdade = (TextView) findViewById(R.id.lblIdadeValor);
        tvIniciaisNome = (TextView) findViewById(R.id.lblIniciais);

        Bundle dados = getIntent().getExtras();
        Pessoa pessoa = (Pessoa) getIntent().getSerializableExtra("objetoPessoa");

        tvNome.setText(pessoa.getNome());
        tvEmail.setText(pessoa.getEmail());
        tvTelefone.setText(pessoa.getTelefone());
        tvIdade.setText(String.valueOf(pessoa.getIdade()));
        tvIniciaisNome.setText(gerarIniciais(pessoa.getNome()));
    }
    private String gerarIniciais(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "?";
        }
        String[] partes = nome.trim().split("\\s+");
        String iniciais = String.valueOf(partes[0].charAt(0));
        if (partes.length > 1) {
            iniciais += partes[partes.length - 1].charAt(0);
        }
        return iniciais.toUpperCase();
    }
}