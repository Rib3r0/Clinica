package br.senai.sp.jandira.model;

public class Paciente extends Pessoa {
    // atributos

    private String tipoSanguineo;
    private PlanoDeSaude planoDeSaude;

    // métodos de acesso
    // ***pegar tipo sanguineo do cliente
    public void setTipoSanguineo(String tipoSanguineo) {

        this.tipoSanguineo = tipoSanguineo;

    }

    // ***reotrnar tipo sanguineo do cliente
    public String getTipoSanguineo() {

        return tipoSanguineo;

    }

    // ***Pegar Plano de Saúde do Paciente***
    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {

        this.planoDeSaude = planoDeSaude;

    }

    // ***Retornar Plano de Saúde do Paciente***
    public PlanoDeSaude getPlanoDeSaude() {

        return this.planoDeSaude;

    }

}
