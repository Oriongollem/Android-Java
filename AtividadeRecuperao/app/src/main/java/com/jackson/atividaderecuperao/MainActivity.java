package com.jackson.atividaderecuperao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText n = (EditText) findViewById(R.id.edtNome);
        final EditText t = (EditText) findViewById(R.id.edtPhone);
        final EditText e = (EditText) findViewById(R.id.edtEmail);
        // criando macara para formato telefone

        SimpleMaskFormatter smf = new SimpleMaskFormatter("(NN)NNNNN-NNNN");
        MaskTextWatcher mtw = new MaskTextWatcher(t, smf);
        t.addTextChangedListener(mtw);





        Button ok = (Button)findViewById(R.id.btnVoltar);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("NomeParametro", n.getText().toString());
                intent.putExtra("PhoneParametro", t.getText().toString());
                intent.putExtra("EmailParametro", e.getText().toString());
                startActivity(intent);
            }
        });

    }
}