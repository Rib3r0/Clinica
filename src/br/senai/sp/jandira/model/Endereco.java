package br.senai.sp.jandira.model;

public class Endereco {
	private String cep;
	private String cidade;
	private String logradouro;
	private String bairro;
	private String pontoDeReferencia;
	private String numero;
	private String tipo;
	private Estados estados;
	private String complemento;

	// cep
	public String getCep() {

		return cep;

	}

	public void setCep(String cep) {

		this.cep = cep;

	}

	// cidade
	public String getCidade() {

		return cidade;

	}

	public void setCidade(String cidade) {

		this.cidade = cidade;

	}

	// logradouro
	public String getLogradouro() {

		return logradouro;

	}

	public void setLogradouro(String logradouro) {

		this.logradouro = logradouro;

	}

	// bairro
	public String getBairro() {

		return bairro;

	}

	public void setBairro(String bairro) {

		this.bairro = bairro;

	}

	// ponto de referencia
	public String getPontoDeReferencia() {

		return pontoDeReferencia;

	}

	public void setPontoDeReferencia(String pontoDeReferencia) {

		this.pontoDeReferencia = pontoDeReferencia;

	}

	// numero
	public String getNumero() {

		return numero;

	}

	public void setNumero(String numero) {

		this.numero = numero;

	}

	// tipo
	public String getTipo() {

		return tipo;

	}

	public void setTipo(String tipo) {

		this.tipo = tipo;

	}

	// estado
	
	public void setEstados(Estados estados) {
		
		this.estados = estados;
		
	}
	
	public Estados getEstados() {
		
		return estados;
		
	}

	// complementos
	public String getComplemento() {

		return complemento;
	}

	public void setComplemento(String complemento) {

		this.complemento = complemento;

	}

}
