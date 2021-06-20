package dominio;

import exceptions.NotaInvalidaException;

public class Aluno extends Pessoa {

	private float notaAvaliacao1;
	private float notaAvaliacao2;
	private float mediaFinal;
	private String situacao;

	public Aluno() {
		
		this.setCategoria("Aluno");

	}

	public Aluno(String nome, String categoria) {
		super(nome, categoria);
	}

	public Aluno(String nome, String categoria, float notaAvaliacao1, float notaAvaliacao2) {
		this(nome, categoria);
		this.notaAvaliacao1 = notaAvaliacao1;
		this.notaAvaliacao2 = notaAvaliacao2;
	}

	@Override
	public String toString() {

		return String.format("Nota 1: %.2f | Nota 2: %.2f | Média Final: %.2f | %s (%s)", notaAvaliacao1,
				notaAvaliacao2, mediaFinal, situacao, getCategoria());
	}

	private float calcularMediaFinal() throws NotaInvalidaException {
		return (getNotaAvaliacao1() + getNotaAvaliacao2()) / 2;
	}

	private String verificarSituacao(float media) {

		if (media < 4) {
			return "Reprovado";
		} else if (media >= 4 && media < 7) {
			return "Prova Final";
		} else {
			return "Aprovado";
		}

	}

	public float getNotaAvaliacao1() {
		return notaAvaliacao1;
	}

	public void setNotaAvaliacao1(float notaAvaliacao1) throws NotaInvalidaException {

		if (this.notaAvaliacao1 < 0 || this.notaAvaliacao1 > 10) {
			throw new NotaInvalidaException("Nota inválida");
		}

		this.notaAvaliacao1 = notaAvaliacao1;
	}

	public float getNotaAvaliacao2(){

		return notaAvaliacao2;
	}

	public void setNotaAvaliacao2(float notaAvaliacao2) throws NotaInvalidaException{
		
		if (this.notaAvaliacao2 < 0 || this.notaAvaliacao2 > 10) {
			throw new NotaInvalidaException("Nota inválida");
		}
		
		this.notaAvaliacao2 = notaAvaliacao2;
	}

	public float getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal() throws NotaInvalidaException {
		this.mediaFinal = calcularMediaFinal();
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao() {
		this.situacao = verificarSituacao(mediaFinal);
	}

}
