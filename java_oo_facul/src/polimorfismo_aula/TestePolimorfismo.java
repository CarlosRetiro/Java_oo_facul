package polimorfismo_aula;

import java.util.Scanner;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		ContaFisica contaFisica = new ContaFisica("154556-6", 100.0,"Carlos" );
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite Depoósito: ");
		double valor = input.nextDouble();
		contaFisica.deposito(valor);
		System.out.println(contaFisica.toString());
		System.out.println();
		
		System.out.println("Digite saque: ");
		double valor1 = input.nextDouble();
		contaFisica.saque(valor1, 0.2);
		
		System.out.println(contaFisica.toString());
		
		input.close();

	}

}
