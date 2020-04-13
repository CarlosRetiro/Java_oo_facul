package exeHeranca2;

import java.util.Scanner;

public class Animal {
	
	protected String nome;
	protected String classe;
	


	public void imprimir() {
		System.out.println("Clase: " + classe + " / Nome: " + nome);
		
		}
	

	public String getNome() {
		return nome;
	}

	public void falar() {
		
	}
	

}
