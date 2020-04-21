package polimorfismo_aula;

public class ContaJuridica extends Conta{

	private String titular;

	public ContaJuridica(String numConta, double saldo, String titular) {
		super(numConta, saldo);
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	@Override
	public void saque(double valor) {
	    saldo -= (valor + (valor * 0.3));
	}
	
	//sobrecarga
	public void saque(double valor, double tarifa) {
	     saldo -= (valor + (valor*tarifa));
	}
	@Override
	public String toString() {
		return "ContaJuridica [titular=" + titular + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
	
}
