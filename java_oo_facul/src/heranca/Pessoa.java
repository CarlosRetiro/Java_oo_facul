
	package heranca;


	public class Pessoa {

		public String nome;
		protected int idade;
		
		
		

		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}




		public void seApresentar() {
			System.out.println("Olá, eu sou o " + nome + " e tenho " + idade + " anos.");
		}

	}

