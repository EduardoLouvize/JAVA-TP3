package dominio;

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
	
	public String verificarDisponibilidade() {
		return  this.quantTurmas > 5 ? "Agenda Lotada" : "Disponível";
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

	public void setQuantTurmas(int quantTurmas) {
		this.quantTurmas = quantTurmas;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade() {
		this.disponibilidade = verificarDisponibilidade();
	}

	

}
