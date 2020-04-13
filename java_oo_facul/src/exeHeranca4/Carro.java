package exeHeranca4;

public class Carro extends Veiculo {

	public String placa;
	
	public Carro(String placa, String marca, String modelo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}

	public void ligar() {
		System.out.println("Ligar Carro");

	}

	public void desligar() {
		System.out.println("Desligar Carro");

	}

	public void acelerar() {
		System.out.println("Acelerar Carro");

	}
	public void imprimircarro() {
		System.out.println("Placa: " + placa + "  Marca: " + marca + "  Modelo: " + modelo);
		System.out.println();
		
	}

}
