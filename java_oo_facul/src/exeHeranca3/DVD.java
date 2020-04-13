package exeHeranca3;

public class DVD extends Produto{
	
	private String artista;
	private int duracao;
	
	public  DVD(String nome, double preco, String artista, int duracao) {
		this.nome = nome;
		this.preco = preco;
		this.artista = artista;
		this.duracao = duracao;
	}
	public void imprimirdvd() {
		System.out.println(" Produto: DVD / " + "Nome: " + nome + " / Preço: " 
	+ preco + " / Artista: " + artista + " / Duração: " + duracao + " Minutos" );
	}

}
