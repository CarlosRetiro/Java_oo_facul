package exeHeranca3;

import java.util.Locale;
import java.util.Scanner;


public class TesteProduto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Qual Produto Deseja?  C - cd  D - dvd L - livro");
		String pro = input.nextLine();
		if (pro.equalsIgnoreCase("c")) {
			CD cd = new CD("Todos os cantos", 22.00, "Marilia Mendonça", 18);
			cd.imprimircd();
		}
		else if (pro.equalsIgnoreCase("d")) {
			DVD dvd = new DVD("É Diferente", 50.00, "Sorriso Maroto", 90 );
			dvd.imprimirdvd();}
			
		else if (pro.equalsIgnoreCase("l")) {
			Livro livro = new Livro("A Morte de Quincas Berro D'agua",22.73, "Jorge Amador", 120 );
			livro.imprimirlivro();
			livro.ehCaro();
			livro.ehGrande();
			
		}
		}}