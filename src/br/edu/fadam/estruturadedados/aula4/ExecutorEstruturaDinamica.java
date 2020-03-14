package br.edu.fadam.estruturadedados.aula4;

public class ExecutorEstruturaDinamica {
	
	public static void main(String[] args) {
		EstruturaDeDadosDinamica estrutura = new EstruturaDeDadosDinamica();
		
		No no1 = new No("Ontem");
		estrutura.inserirNo(no1);
		estrutura.printPrimeiroNo();
		estrutura.printUltimoNo();
		No no2 = new No("Hoje");
		estrutura.inserirNo(no2);
		System.out.println("#######");
		estrutura.printPrimeiroNo();
		estrutura.printUltimoNo();
		System.out.println("#########");
		estrutura.printChain();
		System.out.println("###########");
		estrutura.removerPrimeiroNo();
		estrutura.printChain();
		estrutura.removerPrimeiroNo();
		System.out.println("*******");
		estrutura.printChain();
		System.out.println("$$$$$$$$$");
		estrutura.removerPrimeiroNo();
	}

}
