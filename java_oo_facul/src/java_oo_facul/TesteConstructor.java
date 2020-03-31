package java_oo_facul;

import java.util.Scanner;


public class TesteConstructor {
	public static void main(String[] args) {
		Conta conta = new Conta(0.0,  "125115", "CARLOS");
		conta.imprimirDados();
		System.out.println("\n--------------------");
		
		//entrada de dados para depositos
		Scanner input = new Scanner(System.in);
		System.out.println("\nDeseja Fazer alguma opera��o? S - Sim / N - N�o : ");
		String op = input.next();
		while (op.equals("s")) {
			System.out.println("\nQual opera��o deseja fazer? D - Dep�sito / S - Saque : ");
		    String operacao = input.next();
		    System.out.println();
	        if (operacao.equals("d")) {
	        	System.out.println("\nPor favor entre com o deposito: ");
	    		double valorDeposito = input.nextDouble();
	    		conta.deposito(valorDeposito);
	    		conta.imprimirDados();
	    		System.out.println("\n--------------------");
	        }
	        else if (operacao.equals("s")) {
	        	System.out.println("\nPor favor entre com o saque: ");
	        	double valorSaque = input.nextDouble();
	        	conta.saque(valorSaque);
	        	conta.imprimirDados();
	        	System.out.println("\n--------------------");
	        	
	        }
	        System.out.println("\nDeseja Fazer outra opera��o? S - Sim / N - N�o : ");
	        String oper = input.next();
	        if (oper.equals("n")) {
	        break;
	        }
		}
		
		input.close();
	}
}

