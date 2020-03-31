package java_oo_facul;

import java.util.Scanner;


public class TesteConstructor {
	public static void main(String[] args) {
		Conta conta = new Conta(0.0,  "125115", "CARLOS");
		conta.imprimirDados();
		System.out.println("\n--------------------");
		
		//entrada de dados para depositos
		Scanner input = new Scanner(System.in);
		System.out.println("\nDeseja Fazer alguma operação? 1 - Sim / 0 - Não : ");
		int op = input.nextInt();
		while (op == (1)) {
			System.out.println("\nQual operação deseja fazer? D - Depósito / S - Saque : ");
		    String operacao = input.next();
		    System.out.println();
	        if (operacao.equalsIgnoreCase("d")) {
	        	System.out.println("\nPor favor entre com o deposito: ");
	    		double valorDeposito = input.nextDouble();
	    		conta.deposito(valorDeposito);
	    		conta.imprimirDados();
	    		System.out.println("\n--------------------");
	        }
	        else if (operacao.equalsIgnoreCase("s")) {
	        	System.out.println("\nPor favor entre com o saque: ");
	        	double valorSaque = input.nextDouble();
	        	conta.saque(valorSaque);
	        	conta.imprimirDados();
	        	System.out.println("\n--------------------");
	        	
	        }
	        
	        else {
	        	System.out.println("\nNão conseguimos indentificar o que deseja - OPERAÇÃO FINALIZADA");
	        	break;
	        }
	        System.out.println("\nDeseja Fazer outra operação? 1 - Sim / 0 - Não : ");
	        int oper = input.nextInt();
	        if (oper != 1) {
	        break;
	        }
		}
		
		input.close();
	}
}

