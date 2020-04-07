package heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		Jogador jogador = new Jogador("Tassio", 37);

		jogador.seApresentar();
		jogador.getAindaJoga();

		jogador.setAindaJoga("Claro que sim." + "E apesar de gordo ainda faço gol.");
		jogador.getAindaJoga();

		jogador.nome = "Ronaldinho";
		jogador.idade = 45;

		jogador.seApresentar();
		jogador.setAindaJoga("Claro que sim." + "Está preso.");
		jogador.getAindaJoga();

	}
}
