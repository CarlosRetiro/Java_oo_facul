package exeHeranca4;

public class Bicicleta extends Veiculo {
	
	public Bicicleta(String marca, String modelo) {
		this.marca =  marca;
		this.modelo = modelo;
	}

	public void acelerar() {
		System.out.println("Acelerar bicicleta");

	}
	public void imprimirBike() {
		System.out.println("Marca: " + marca 
				+ "  Modelo: " 
				+ modelo);
		System.out.println();
	}

}
