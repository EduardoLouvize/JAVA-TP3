package testes;

import dominio.Aluno;
import dominio.Professor;
import exceptions.NomeIncompletoException;
import exceptions.NotaInvalidaException;

public class TesteString {
	
	public static void main(String[] args) {
		
		
		
		try {
			Aluno al1 = new Aluno();
			
			al1.setNome("Carlos Eduardo da Silva Louvize");
			al1.setNotaAvaliacao1(7);
			al1.setNotaAvaliacao2(11);
			al1.setMediaFinal();
			al1.setSituacao();
			
//			System.out.println(al1.getNome());
//			System.out.println(al1.getNomeMeio());
//			System.out.println(al1.getUltimoNome());
			
			al1.imprimir();
			
		} catch (NomeIncompletoException | NotaInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
		
		
		
		try {
			Professor prof1 = new Professor();
			
			prof1.setNome("Martha Silva");
			prof1.setMateria("PORT");
			prof1.setQuantTurmas(6);
			prof1.setDisponibilidade();
			
			prof1.imprimir();
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}
		
		
	
	
	
	
	try {
		Aluno al2 = new Aluno();
//		al2.setNome("Bilbo");		
		al2.setNotaAvaliacao1(5);
		al2.setNotaAvaliacao2(3);
		al2.setMediaFinal();
		al2.setSituacao();
		al2.imprimir();
	} catch (NomeIncompletoException | NotaInvalidaException  e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
		
		
	}

}
