package exeHeranca3;

public class Livro extends Produto{
	
	private String autor;
	private int paginas;
	
	public Livro(String nome, double preco, String autor, int paginas) {
		this.nome = nome;
		this.preco = preco;
		this.autor = autor;
		this.paginas = paginas;
		}
	
	public void imprimirlivro() {
		System.out.println(" Produto: Livro / " + "Nome: " + nome + " / Preço: " 
	+ preco + " / Autor: " + autor + " / Páginas: " + paginas  );
	}
	public void ehGrande() {
		if (paginas > 100) {
			System.out.println("Livro Grande");
		
		}
		else {
			System.out.println("Livro Pequeno");
		}
		
	}

}
