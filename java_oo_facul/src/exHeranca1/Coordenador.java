package exHeranca1;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {
	
	private List<Projeto> projetos = new ArrayList<Projeto>();
	
	public Coordenador(String nome, String cpf, int tempoServico, int matricula, double salarioBase
			) {
		super(nome, cpf, tempoServico, matricula, salarioBase);
		
	}
	public boolean adicionaProjeto(Projeto projeto) {
		try {
			projetos.add(projeto);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
		
	}
	public boolean removeProjeto(Projeto projeto) {
		try {
			projetos.remove(projeto);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
		
	
		
	}
    public int getNumProjeto() {
    	return projetos.size();
		
    	
    }
    
    
	@Override
	public void computarSalario() {
		double adicionalCoordenador = 550.0;
		double adicionalProgramador = 550.0;
		setSalarioBase(salarioBase + adicionalCoordenador + adicionalProgramador);
	}
	

	@Override
	public String toString() {
		 
		return super.toString();
	}
	
}
    

