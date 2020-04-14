package exHeranca1;



public class TesteHeranca {

	public static void main(String[] args) {

		Funcionario coordenador = new Coordenador("Carlos", "059.209.155-70", 10, 85449, 2500);
		Funcionario programador = new Programador("Carlos", "059.209.155-70", 10, 85449, 2500, null, "Java", null);
		Projeto projeto = new Projeto("Desenvolvimento IA ", "Professor Tassio", "Avalia��o dos algoritmos");

		coordenador.adicionaProjeto(projeto);

		System.out.println("Nome Funcion�rio: " + coordenador.getNome());
		System.out.println("CPF Funcion�rio: " + coordenador.getCpf());
		System.out.println("Tempo Servei�o: " + coordenador.tempoServico + " Anos");
		System.out.println("Matricula: " + coordenador.matricula);
		System.out.println("Sal�rio Base: " + coordenador.salarioBase);

	}

}
