package com.example.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.applistacurso.model.Pessoa;
import com.example.applistacurso.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFEREMCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity){
        preferences = mainActivity.getSharedPreferences(NOME_PREFEREMCES,0);
        listaVip = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada...");

        return super.toString();
    }


    public void salvar(Pessoa pessoa) {
        Log.i("MVC_Controller", "Salvo: "+pessoa.toString());

        listaVip.putString("primeiroNome",pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome",pessoa.getSegundoNome());
        listaVip.putString("curso",pessoa.getCursoDesejado());
        listaVip.putString("telefone",pessoa.getTelefoneContato());
        listaVip.apply();


    }

    public Pessoa buscar(Pessoa pessoa){

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome",""));
        pessoa.setSegundoNome(preferences.getString("sobreNome",""));
        pessoa.setCursoDesejado(preferences.getString("curso",""));
        pessoa.setTelefoneContato(preferences.getString("telefone",""));

        return pessoa;
    }
    public void limpar(){

                listaVip.clear();
                listaVip.apply();
    }

}
