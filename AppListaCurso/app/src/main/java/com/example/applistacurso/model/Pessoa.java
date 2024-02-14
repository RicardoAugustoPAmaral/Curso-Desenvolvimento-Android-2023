package com.example.applistacurso.model;

public class Pessoa {

    private String primeiroNome;
    private String segundoNome;
    private String cursoDesejado;
    private String telefoneContato;

    public Pessoa(String primeiroNome, String segundoNome, String cursoDesejado, String telefoneContato) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.cursoDesejado = cursoDesejado;
        this.telefoneContato = telefoneContato;
    }

    public Pessoa() {

    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
