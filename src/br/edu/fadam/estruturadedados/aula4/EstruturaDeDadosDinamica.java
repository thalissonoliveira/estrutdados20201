package br.edu.fadam.estruturadedados.aula4;

public class EstruturaDeDadosDinamica {
	private No primeiroNo;
	private No ultimoNo;
	public void inserirNo(No no) {
		//H� um primeiro n�?
		if (primeiroNo == null) {
			//N�AAAOOO
			//Se n�o houver, atribui o primeironO ao valor passado como par�metro
			//Atribui o ultimoNo como o valor  passado como param 
			primeiroNo = no;
			ultimoNo = no;
		} else {
			//SSIIMMMM
			//Se houver, atribui o elemento passado com par�metro como o 
			//proximo do �ltimo elemento da cadeia. 
			ultimoNo.setProximo(no);
			ultimoNo = no; 
		}
		
	}
	
	public void printChain() {
		No noAux = primeiroNo;
		while(noAux != null) {
			System.out.println(noAux);
			noAux = noAux.getProximo();
		}
	}
	
	public void removerPrimeiroNo() {
		if (primeiroNo == null) {
			return;
		}
		primeiroNo = primeiroNo.getProximo();
		if (primeiroNo == null) {
			ultimoNo = null;
		}
	}
	
	public void printPrimeiroNo() {
		System.out.println("Primeiro: " + this.primeiroNo);
	}
	
	public void printUltimoNo() {
		System.out.println("�ltimo: " + this.ultimoNo);
	}

}
