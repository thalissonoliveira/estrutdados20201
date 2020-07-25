package br.edu.fadam.estruturadedados.ead.aula1;

public class Somatorio {
	
	//1 + 2 + 3 + 4
	public int somatorio(int numero) {
		int j = 0;
		for (int i = 1; i <= numero; i++) {
			//1
			//2...
			//4
			j = j + i;
		}
		return j;
	}
	public int somatorioR(int numero) {
		if (numero == 1) {
			return 1;
		}
		return numero + somatorio(numero - 1);
	}
	
	//som(5) = 5 + som(4) = ? = 5 + 10 = 15
	//som(4) = 4 + som(3) = ? = 4 + 6 = 10 
	//som(3) = 3 + som(2) = ? = 3 + 3 = 6
	//som(2) = 2 + som(1) = ? = 2 + 1 = 3
	//som(1) = 1

	public static void main(String[] args) {
		System.out.println(new Somatorio().somatorio(5));
	}
	
//	
//	public static void main(String[] args) {
//		System.out.println(new Fatorial().fatorial(4));
//	}
	
}
