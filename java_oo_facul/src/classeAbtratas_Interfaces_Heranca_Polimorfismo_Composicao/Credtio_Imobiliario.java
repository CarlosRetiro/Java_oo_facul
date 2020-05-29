package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class Credtio_Imobiliario extends Credito implements Emprestimos{

	public Credtio_Imobiliario(Conta conta, double valorCredito, double jurosMes, int numMeses) {
		super(conta, valorCredito, jurosMes, numMeses);
	}

	@Override
	public void calculoJuros() {
		
	}

	@Override
	public String toString() {
		return "CredtioImobiliario [valorCredito=" + valorCredito + ", jurosMes=" + jurosMes + ", numMeses=" + numMeses
				+ "]\n";
	}	
	
}