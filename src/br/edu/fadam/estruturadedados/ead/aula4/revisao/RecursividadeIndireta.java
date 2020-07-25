package br.edu.fadam.estruturadedados.ead.aula4.revisao;

public class RecursividadeIndireta {

	//Implementar um caso onde a recursividade indireta é usada
	public void metodaA() {
		//condição de parada
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
