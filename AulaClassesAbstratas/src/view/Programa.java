package view;

import models.Estudante;
import models.Pessoa;

public class Programa {
	
	public static void main (String[]) {
		Pessoa pessoa = new Pessoa;
		pessoa.setNome("Richard");
		pessoa.setDataNascimento("1980-07-20");
		
		System.out.println( pessoa.toString());
		
		Estudante estudante = new Estudante();
		estudante.setNome("Enzo");
		estudante.setDataNascimento("2006");
		estudante.setCurso("Técnico em Agropecuária");
		
		System.out.println(estudante.toString());
	}
}
