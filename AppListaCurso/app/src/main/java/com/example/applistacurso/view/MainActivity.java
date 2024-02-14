package com.example.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.applistacurso.R;
import com.example.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outrapessoa;

    String dadosPessoa;
    String dadosOutrapessoa;

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

      /*  dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSegundoNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa +=pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa +=pessoa.getTelefoneContato();

        dadosOutrapessoa = "Primeiro nome: ";
        dadosOutrapessoa += outrapessoa.getPrimeiroNome();
        dadosOutrapessoa += " Sobrenome: ";
        dadosOutrapessoa += outrapessoa.getSegundoNome();
        dadosOutrapessoa += " Curso Desejado: ";
        dadosOutrapessoa +=outrapessoa.getCursoDesejado();
        dadosOutrapessoa += " Telefone de Contato: ";
        dadosOutrapessoa +=outrapessoa.getTelefoneContato();*/

    }
}