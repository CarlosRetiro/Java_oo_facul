package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class Seguro_De_Vida implements Seguros{
	private double valorSeguro; 
	
	public Seguro_De_Vida(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public double getValorSeguro() {
		return valorSeguro;
	}

	@Override
	public String toString() {
		return "SeguroDeVida [valorSeguro=" + valorSeguro + "]";
	}

}
