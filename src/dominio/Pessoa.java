package dominio;

import exceptions.NomeIncompletoException;

public abstract class Pessoa {

	private int id;
	private String nome;
	private String categoria;
	private String nomeMeio;
	private String ultimoNome;
	
	public Pessoa ( ) {
		this.nome = "Sem Nome";
	}

	public Pessoa(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}
	
	@Override
	public abstract String toString();
	
	public void imprimir() throws NomeIncompletoException {
		System.out.println(this.getNome());
	}
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public StringBuilder getNome() throws NomeIncompletoException{
		
		if (ultimoNome == null || nomeMeio == null || nome == null) {
			throw new NomeIncompletoException("Preenchimento inválido! O nome está incompleto!");
		}
		
		StringBuilder nomeFormatado = new StringBuilder();
		
		nomeFormatado.append(ultimoNome.toUpperCase());
		nomeFormatado.append(", ");
		nomeFormatado.append(nome);
		nomeFormatado.append(" ");
		nomeFormatado.append(nomeMeio);	
		nomeFormatado.append(" | ");
		nomeFormatado.append(this.toString());	
		
		return nomeFormatado;
	}

	public void setNome(String nome) {
		int primeiroEspaco = nome.indexOf(" ");
		int ultimoEspaco = nome.lastIndexOf(" ");		
		
		
		this.nome = nome.substring(0, primeiroEspaco);
		this.nomeMeio = nome.substring(primeiroEspaco,ultimoEspaco).trim();
		this.ultimoNome = nome.substring(ultimoEspaco).trim();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNomeMeio() {
		return nomeMeio;
	}

	public void setNomeMeio(String nomeMeio) {
		this.nomeMeio = nomeMeio;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

}
