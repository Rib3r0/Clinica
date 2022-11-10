package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {
    // atributos
    //codigo crm nome
    private ArrayList<Especialidade> especialidades;
    private String crm;

    // métodos de acesso
    // especialidades
    public void setEspecialidades(ArrayList<Especialidade> especialidades) {

        this.especialidades = especialidades;

    }

    public ArrayList<Especialidade> getEspecialidades() {

        return especialidades;

    }

    // CRM
    public void setCrm(String crm) {

        this.crm = crm;

    }

    public String getCrm() {

        return crm;

    }
}
