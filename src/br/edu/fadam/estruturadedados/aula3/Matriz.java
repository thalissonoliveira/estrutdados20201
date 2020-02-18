package br.edu.fadam.estruturadedados.aula3;

public class Matriz {
	
	private String[][] matriz = new String[10][10];
	
	public void exemplo() {
		matriz[1][1] = "Calendar"; 
	}
	
	public static void main(String[] args) {
		Matriz matriz2 = new Matriz();
		matriz2.exemplo();
		System.out.println("matriz " + matriz2.matriz[1][1]);
	}

}
