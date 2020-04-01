package java_oo_facul;

public class Conta {
	private double saldo;
	private String numConta;
	private String titular;

	public Conta(double saldo, String numConta, String titular) {
		this.saldo = saldo;
		this.numConta = numConta;
		this.titular = titular;
	}

	public void imprimirDados() {
		System.out.printf(
				"Numero da conta: " + numConta + "\nTitular: " + titular + "\nSaldo: " + String.format("%.2f", saldo));
	}

	public void deposito(double deposito) {
		this.saldo += deposito;

	}

	public void saque(double saque) {
		this.saldo -= saque;
	}

}
