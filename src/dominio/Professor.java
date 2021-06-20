package dominio;

import auxiliar.Constante;
import exceptions.QuantidadeTurmasException;

public class Professor extends Pessoa {

	private String materia;
	private int quantTurmas;
	private String disponibilidade;

	public Professor() {

		this.setCategoria("Professor");

	}

	public Professor(String nome, String categoria) {
		super(nome, categoria);
	}

	public Professor(String materia, int quantTurmas, String disponibilidade) {
		this.materia = materia;
		this.quantTurmas = quantTurmas;
	}

	@Override
	public String toString() {
		return String.format("Matéria: %s | Número de turmas: %d | Disponibilidade: %s (%s)", materia, quantTurmas,
				disponibilidade, getCategoria());
	}

	public String verificarDisponibilidade() throws QuantidadeTurmasException {

		if (this.quantTurmas > Constante.MAXIMOTURMAS) {
			throw new QuantidadeTurmasException("Quantidade de turmas maior do que o permitido!");
		} else if (this.quantTurmas < 0) {
			throw new QuantidadeTurmasException("Quantidade de turmas menor que zero!");
		}

		return this.quantTurmas < Constante.MAXIMOTURMAS ? "Disponível" : "Agenda Lotada";
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getQuantTurmas() {
		return quantTurmas;
	}

	public void setQuantTurmas(int quantTurmas) throws QuantidadeTurmasException {

		if (this.quantTurmas > Constante.MAXIMOTURMAS) {
			throw new QuantidadeTurmasException("Quantidade de turmas maior do que o permitido!");
		} else if (this.quantTurmas < 0) {
			throw new QuantidadeTurmasException("Quantidade de turmas menor que zero!");
		}
		
		this.quantTurmas = quantTurmas;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade() throws QuantidadeTurmasException {

		if (this.quantTurmas > Constante.MAXIMOTURMAS) {
			throw new QuantidadeTurmasException("Quantidade de turmas maior do que o permitido!");
		} else if (this.quantTurmas < 0) {
			throw new QuantidadeTurmasException("Quantidade de turmas menor que zero!");
		}

		this.disponibilidade = verificarDisponibilidade();
	}

}
