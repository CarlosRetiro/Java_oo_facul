package heranca;

public class Jogador extends Pessoa {

	protected String aindaJoga = "N�o jogo mais.";	
	
	
	public Jogador(String nome, int idade) {
		super(nome, idade);
	}



	public void setAindaJoga(String aindaJoga) {
		this.aindaJoga = aindaJoga;
	}




	public void getAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
	
}