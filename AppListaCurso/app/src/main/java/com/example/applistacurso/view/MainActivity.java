package com.example.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.applistacurso.R;
import com.example.applistacurso.controller.PessoaController;
import com.example.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    public static final String NOME_PREFEREMCES = "pref_listavip";

    PessoaController controller;

    Pessoa pessoa;
    Pessoa outrapessoa;

    String dadosPessoa;
    String dadosOutrapessoa;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editCursDesejado;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(NOME_PREFEREMCES,0);
        SharedPreferences.Editor listaVip = preferences.edit();


        controller = new PessoaController();
        controller.toString();

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

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editCursDesejado = findViewById(R.id.editCursDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSegundoNome());
        editCursDesejado.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editCursDesejado.setText("");
                editTelefoneContato.setText("");

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Volte sempre!",Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSegundoNome(editSobrenome.getText().toString());
                pessoa.setCursoDesejado(editCursDesejado.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this,"Salvo "+pessoa.toString(),Toast.LENGTH_LONG).show();

                listaVip.putString("primeiroNome",pessoa.getPrimeiroNome());
                listaVip.putString("sobreNome",pessoa.getSegundoNome());
                listaVip.putString("curso",pessoa.getCursoDesejado());
                listaVip.putString("telefone",pessoa.getTelefoneContato());
                listaVip.apply();

                controller.salvar(pessoa);
            }
        });

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

        Log.i("POOAndrid",pessoa.toString());
        Log.i("POOAndrid",outrapessoa.toString());


    }
}