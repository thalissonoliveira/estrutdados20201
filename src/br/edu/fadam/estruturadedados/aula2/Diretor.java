package br.edu.fadam.estruturadedados.aula2;

public class Diretor extends Funcionario{
	
	private double comissao;
	private double gratificacao;
	
	public double calculaSalario() {
		
		
		return 100 * (comissao * getSalarioBase()) + gratificacao; 
		
	}

}
