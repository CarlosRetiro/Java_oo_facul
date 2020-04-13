package exeHeranca4;

import java.util.Scanner;



public class TesteVeiculo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual Veiculo? B - bicicleta  C - carro");
		String vei = input.nextLine();
		if (vei.equalsIgnoreCase("b")) {
			Bicicleta bicicleta = new Bicicleta("KSW", "XLT");
			bicicleta.imprimirBike();
			bicicleta.acelerar();
		}
		else if(vei.equalsIgnoreCase("c")) {
			Carro carro = new Carro("JGQ7542","BMW", "X6");
			carro.imprimircarro();
			carro.ligar();
			carro.acelerar();
			carro.desligar();
		   
			
		}
			
		}

	}

