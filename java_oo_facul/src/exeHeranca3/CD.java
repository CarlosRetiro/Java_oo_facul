package exeHeranca3;

public class CD extends Produto {
	
	private String artista;
	private int faixas;

	public  CD(String nome, double preco, String artista, int faixas) {
		this.nome = nome;
		this.preco = preco;
		this.artista = artista;
		this.faixas = faixas;
	}
	public void imprimircd() {
		System.out.println(" Produto: CD  /" + " Nome: " + nome + "  /  Preço: " + preco 
				+ " /  Artista: " + artista + " /  Faixas: " + faixas );
	}
}
