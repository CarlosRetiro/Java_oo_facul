package polimorfismo_aula;

public class Conta {

	protected String numConta;
	protected double saldo;
	
	
	public Conta() {
		
	}
	
	public Conta(String numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public void saque(double valor) {
		this.saldo -= valor;
	}
	public void deposito(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta [numConta= " + numConta + ", saldo= " + saldo + "]";
	}
	
	
}
