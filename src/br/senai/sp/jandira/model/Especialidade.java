package br.senai.sp.jandira.model;

public class Especialidade {
    //atributos

    private String nome;
    private String descricao;
    private static Integer contador = 100;
    private Integer codigo;

    // Métodos de acesso / getters and setters
    public Especialidade() {
        contador++;
        this.codigo = contador;
       
    }

    public Especialidade(String nome) {
        this.nome = nome;
        contador++;
        this.codigo = contador;
        
    }
    public Especialidade(String nome,String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        contador++;
        this.codigo = contador;
        
    }
    public Especialidade(Integer codigo, String nome,String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = codigo++;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }
    // ***Retornar nome da Especilidade***

    public String getNome() {

        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    public String getEspecialidadeComPontoVirgula(){
        return this.getCodigo() + ";" + this.getNome() + ";" + this.getDescricao();
    }

}
