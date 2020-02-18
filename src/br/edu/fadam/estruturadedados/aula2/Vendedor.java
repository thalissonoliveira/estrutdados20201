package br.edu.fadam.estruturadedados.aula2;

public class Vendedor extends Funcionario {
private double comissao; 
public double calculaSalario() {
	return comissao * getSalarioBase();
}
}
