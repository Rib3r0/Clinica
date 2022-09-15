package br.senai.sp.jandira.model;

public class PlanoDeSaude {
	//atributos
	private String operadora;
	private String tipoDoPlano;
	
	
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
		
		return "Plano: " + this.operadora + ", " + this.tipoDoPlano + ".";
		
	}
	

}
