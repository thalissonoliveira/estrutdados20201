package br.edu.fadam.estruturadedados.ead.aula4.revisao;

public class RecursividadeIndireta {

	//Implementar um caso onde a recursividade indireta � usada
	public void metodaA() {
		//condi��o de parada
		metodoB();
	}

	private void metodoB() {
		metodaA();
	}
	
	//Recursividade Direta
	private void metodoC() {
		metodoC();
	}
	

}
