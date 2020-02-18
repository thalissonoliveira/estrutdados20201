package br.edu.fadam.estruturadedados.aula2;

public class Secretaria extends Funcionario{

	private double desconto;
	private double comissao;
	
@Override
public double calculaSalario() {
	
	return 1000 + (getSalarioBase() * comissao) - desconto;
	
}
	
}
