package com.example.exemplocomponentes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import model.Funcionario;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    CheckBox checkBackEnd, checkFrontEnd;
    RadioButton radioMasculino, radioFeminino;
    RadioGroup radioGroupSexo;
    Switch switchNotificacao;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.txtNome);
        checkFrontEnd =(CheckBox) findViewById(R.id.chkFrontEnd);
        checkBackEnd = (CheckBox) findViewById(R.id.chkBackEnd);
        radioMasculino =(RadioButton) findViewById(R.id.rdMasculino);
        radioFeminino =(RadioButton) findViewById(R.id.rdFeminino);
        radioGroupSexo =(RadioGroup) findViewById(R.id.rdGrupoSexo);
        switchNotificacao =(Switch) findViewById(R.id.swNotificacao);
        btnEnviar =(Button) findViewById(R.id.cmdEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, DadosCadastroActivity.class);
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(edtNome.getText().toString());
                String areaAtuacao = "";
                if (checkFrontEnd.isChecked()){
                    areaAtuacao = areaAtuacao + "Front-End|";
                }if (checkBackEnd.isChecked()){
                    areaAtuacao = areaAtuacao + "Back-End|";
                }
                funcionario.setAreaAtuacao(areaAtuacao);
                if (radioGroupSexo.getCheckedRadioButtonId()==R.id.rdMasculino) {
                    funcionario.setSexo("Masculino");
                } else {
                    funcionario.setSexo("Feminino");
                }
                if(switchNotificacao.isChecked()){
                    funcionario.setNotificacao("Sim, receber!");
                } else {
                    funcionario.setNotificacao("Não receber");
                }
                intencao.putExtra("objetofuncionario", funcionario);
                startActivity(intencao);
            }
        });

    }
}