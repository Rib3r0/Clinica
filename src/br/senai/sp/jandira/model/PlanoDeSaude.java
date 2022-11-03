package br.senai.sp.jandira.model;

public class PlanoDeSaude {
	//atributos
	private static Integer contador = 100;
	private Integer codigo;
	private String operadora;
	private String tipoDoPlano;
	
	//construtor da classe
	public PlanoDeSaude(String operadora) {
		this.operadora = operadora;
                contador++;
		this.codigo = contador;
		
	}
	
	public PlanoDeSaude(String operadora, String tipoDoPlano) {
		this.operadora = operadora;
		this.tipoDoPlano = tipoDoPlano;
                contador++;
		this.codigo = contador;
		
	}
        public PlanoDeSaude(Integer codigo, String operadora, String tipoDoPlano) {
		this.operadora = operadora;
		this.tipoDoPlano = tipoDoPlano;
		this.codigo = codigo;
		this.contador = codigo++;
	}
	
	public PlanoDeSaude() {
                contador++;
		this.codigo = contador;
		
	}
	
	//Métodos de acesso
	//  ***Pegar Operadora***
							//parametro
	public void setOperadora(String operadora) {
		
		this.operadora = operadora;
		
	}
	// ***Retornar Operadora***
	public String getOperadora() {
		
		return this.operadora;
		
	}
	// ***Pegar Tipo do Plano***
								//parametro
	public void setTipoDoPlano(String tipoDoPlano) {
		
		this.tipoDoPlano = tipoDoPlano;
		
	}
	// ***Retornar Tipo do Plano***
	public String getTipoDoPlano() {
		
		return this.tipoDoPlano;
		
	}
	// ***Retorna Dados do Plano***
	public String getDadosDoPlano () {
		
		return this.operadora + ", " + this.tipoDoPlano + ".";
		
	}

        public Integer getCodigo() {
            return codigo;
        }
        
            
    public String getPlanoDeSaudeComPontoVirgula(){
        return this.getCodigo() + ";" + this.getOperadora()+ ";" + this.getTipoDoPlano();
    }
	
        

}
