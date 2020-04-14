package exHeranca1;



public class TesteHeranca {

	public static void main(String[] args) {

		Funcionario coordenador = new Coordenador("Carlos", "059.209.155-70", 10, 85449, 2500);
		Funcionario programador = new Programador("Carlos", "059.209.155-70", 10, 85449, 2500, null, "Java", null);
		Projeto projeto = new Projeto("Desenvolvimento IA ", "Professor Tassio", "Avaliação dos algoritmos");

		coordenador.adicionaProjeto(projeto);

		System.out.println("Nome Funcionário: " + coordenador.getNome());
		System.out.println("CPF Funcionário: " + coordenador.getCpf());
		System.out.println("Tempo Serveiço: " + coordenador.tempoServico + " Anos");
		System.out.println("Matricula: " + coordenador.matricula);
		System.out.println("Salário Base: " + coordenador.salarioBase);

	}

}
