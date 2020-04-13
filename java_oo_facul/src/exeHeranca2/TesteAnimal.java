package exeHeranca2;

import java.util.Locale;
import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Qual Classe de animal  A - ave  M - mamífero");
		String ani = input.nextLine();
	    if (ani.equalsIgnoreCase("a")) {
	    	System.out.println("Qual  animal  B - Bem-te-vi P -Papagaio");
	    	String ave = input.nextLine();
	    	if (ave.equalsIgnoreCase("b")) {
	    		Animal animal = new Animal();
	    		animal.nome = "Bem-te-vi";
	    		animal.classe = "Ave";
	    		animal.imprimir();
	    		BemTeVi bemtivi = new BemTeVi();
	    		bemtivi.falar();
	    		}
	    	else if (ave.equalsIgnoreCase("p")) {
	    		Animal animal = new Animal();
	    		animal.nome = "Papagaio";
	    		animal.classe = "Ave";
	    		animal.imprimir();
	    		Papagaio papagaio = new Papagaio();
	    		papagaio.falar();
	    		papagaio.setVocabulario();
	    		
	    	}}
	    else if (ani.equalsIgnoreCase("m")) {
	    	System.out.println("Qual  animal  C - Cachorro V - Vaca");
	    	String mam = input.nextLine();
	    	if (mam.equalsIgnoreCase("c")){
	    		Animal animal = new Animal();
	    		animal.nome = "Cachorro";
	    		animal.classe = "Mamífero";
	    		animal.imprimir();
	    		Cachorro cachorro = new Cachorro();
	    		cachorro.setLateAlto();
	    		cachorro.setLateBaixo();
	    		cachorro.falar();
	    		
	    		}
	    	else if (mam.equalsIgnoreCase("v")) {
	    		Animal animal = new Animal();
	    		animal.nome = "Vaca";
	    		animal.classe = "Mamífero";
	    		animal.imprimir();
	    		Vaca vaca = new Vaca();
	    		vaca.ordenhar();
	    	}
	    }
		}

	}


