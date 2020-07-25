package br.edu.fadam.estruturadedados.ead.aula1;

public class FatorialRecursivo {
	
	
	int fatorialR(int numero) {//3
		System.out.println("");
		int fat;
		/* condição de parada */
		if (numero == 1 || numero == 0) {
			return 1;
		}

		fat = numero * fatorialR(numero - 1); /* regra geral = chamada da função */
		return fat;
	}
	
	//fat(3) = 3 * fat(2) = ? = 3 * 2 = 6 
	//fat(2) = 2 * fat(1) = ? = 2 * 1 = 2  
	//fat(1) = 1
	
	//fat(3) = 3 * fat(2) = 6
	//fat(2) = 2 * fat(1) = 2 
	//fat(1) = 1
	//fat(0) = 1
	
	
	public static void main(String[] args) {
		System.out.println(new FatorialNaoRecursivo().fatorial(3));
	}
	
}
