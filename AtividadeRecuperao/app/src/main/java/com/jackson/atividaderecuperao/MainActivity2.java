package com.jackson.atividaderecuperao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nomeRecebe;
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("NomeParametro");
        String email = (String) intent.getSerializableExtra("EmailParametro");
        String phone = (String) intent.getSerializableExtra("PhoneParametro");


        TextView textoNome = (TextView)findViewById(R.id.txtnome);
        TextView textoEmail = (TextView)findViewById(R.id.txtEmail);
        TextView textoPhone = (TextView)findViewById(R.id.txtPhone);


        textoNome.setText("Oi "+nome+"!");
        textoEmail.setText("Seu email é: "+email+"!");
        textoPhone.setText("Seu telefone é: "+phone+"!");

        Button btnVoltar = (Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}