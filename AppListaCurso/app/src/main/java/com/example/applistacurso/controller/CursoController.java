package com.example.applistacurso.controller;

import com.example.applistacurso.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoController {

    private List listCursos;
    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();
        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("Java EE"));
        listCursos.add(new Curso("Flutter"));
        listCursos.add(new Curso("Dart"));


        return listCursos;
    }



}


