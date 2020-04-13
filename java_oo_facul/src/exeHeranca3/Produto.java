package exeHeranca3;

public class Produto {

	
	protected String nome;
	protected double preco;
	
	public void ehCaro() {
		if (preco > 50) {
			System.out.println("Livro caro");
	
		}
		else {
			System.out.println("Livro Barato");
		}
		
	}
}
