package com.example.exemplointentysegunda;

import android.content.Intent;import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrir2Activity, btnAbrir3Activity, btnAbrir4Activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnAbrir2Activity=(Button) findViewById(R.id.cmdAbrir2Activity);
        btnAbrir3Activity=(Button) findViewById(R.id.cmdAbrir3Activity);
        btnAbrir4Activity=(Button) findViewById(R.id.cmdAbrir4Activity);

        btnAbrir2Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent( MainActivity.this, SegundaActivity.class);
                startActivity(intencao);
            }
        });

        btnAbrir3Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, TerceiraActivity.class);
                startActivity(intencao);
            }
        });

        btnAbrir4Activity.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                Intent intencao = new Intent(MainActivity.this, QuartaActivity.class);
                startActivity(intencao);
            }
        });
    }
}