package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class Calculador_Imposto {


	private static double totalImposto;
	
	
	public static void calcular(Tributavel t) {
		//Imaginar uma cálculo qualquer
		totalImposto = 0;
	}
	
	public static double getTotalImposto() {
		return totalImposto;
	}
}
