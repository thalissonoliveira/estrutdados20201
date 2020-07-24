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
	//som(5) = 5 + som(4)
	//som(4) = 4 + som(3)
	//som(3) = 3 + som(2)

	public static void main(String[] args) {
		System.out.println(new Somatorio().somatorio(5));
	}
	
//	
//	public static void main(String[] args) {
//		System.out.println(new Fatorial().fatorial(4));
//	}
	
}
