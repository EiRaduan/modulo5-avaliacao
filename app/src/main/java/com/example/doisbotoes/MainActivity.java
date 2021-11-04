package com.example.doisbotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt_botao1, bt_botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_botao1 = findViewById(R.id.bt_botao1);
        bt_botao2 = findViewById(R.id.bt_botao2);

        bt_botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Este é o botão 1", Toast.LENGTH_SHORT).show();
            }
        });

        bt_botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mudarActivity = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(mudarActivity);
            }
        });
    }
}