package br.edu.fadam.estruturadedados.ead.aula1;

public class FatorialNaoRecursivo {
	//5! 1 * 2 * 3 * 4 * 5
	public int fatorial (int numero) {//5
		int fat = 1;
		for (int i = 1; i <= numero; i++) {
			fat = fat * i;
		}
		return fat;
	}
	
	// fatorial(5) fatorial = n * fatorial(n-1)
	//fatorial(5) = 5 * fatorial(4)  
	//fatorial(4) = 4 * fatorial(3)
	//...
	//fatorial(2) = 2 * fatorial(1)
	
	public static void main(String[] args) {
		System.out.println(new FatorialNaoRecursivo().fatorial(5));
	}

}
