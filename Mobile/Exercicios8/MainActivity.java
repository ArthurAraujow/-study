package com.example.exemploenviodadoscadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import model.Pessoa;

public class MainActivity extends AppCompatActivity {
    TextInputEditText edtNome, edtEmail, edtTelefone, EdtIdade;
    MaterialButton cmdEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtNome = (TextInputEditText) findViewById(R.id.txtNome);
        edtEmail = (TextInputEditText)findViewById(R.id.txtEmail);
        edtTelefone = (TextInputEditText)findViewById(R.id.txtTelefone);
        EdtIdade = (TextInputEditText)findViewById(R.id.txtIdade);
        cmdEnviar = (MaterialButton) findViewById(R.id.cmdEnviar);

        cmdEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(edtNome.getText().toString());
                pessoa.setEmail(edtEmail.getText().toString());
                pessoa.setTelefone(edtTelefone.getText().toString());
                pessoa.setIdade(Integer.parseInt(EdtIdade.getText().toString()));

                Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
                intencao.putExtra("objetoPessoa", pessoa);
                startActivity(intencao);
            }
        });
    }
}