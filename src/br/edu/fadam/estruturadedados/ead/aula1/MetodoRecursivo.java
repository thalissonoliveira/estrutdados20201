package br.edu.fadam.estruturadedados.ead.aula1;

public class MetodoRecursivo {
	
	int i = 0;
	public int recursivo(int a) {
		int j = 0;
		System.out.println(i++);
		j = recursivo(i);
		return j;
	}
	
	public static void main(String[] args) {
		new MetodoRecursivo().recursivo(50);
	}

}
