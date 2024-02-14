package com.example.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.applistacurso.R;
import com.example.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outrapessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Ricardo");
        pessoa.setSegundoNome("Amaral");
        pessoa.setCursoDesejado("JAVA");
        pessoa.setTelefoneContato("999999999");

        outrapessoa = new Pessoa();
        outrapessoa.setPrimeiroNome("Augusto");
        outrapessoa.setSegundoNome("Paredes");
        outrapessoa.setCursoDesejado("PYTHON");
        outrapessoa.setTelefoneContato("99988899");
    }
}