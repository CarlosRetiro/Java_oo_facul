package exHeranca1;



public abstract class Funcionario extends Pessoa {

	protected int tempoServico,  matricula;
	protected double salarioBase;
	

	public Funcionario(String nome, String cpf, int tempoServico, int matricula, double salarioBase) {
		super(nome, cpf);
		this.tempoServico = tempoServico;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}

	

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public abstract boolean adicionaProjeto(Projeto projeto);

	public abstract void computarSalario();

	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	

	

}
