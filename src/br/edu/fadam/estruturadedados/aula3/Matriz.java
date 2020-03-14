package br.edu.fadam.estruturadedados.aula3;

import br.edu.fadam.estruturadedados.aula2.Aluno;

public class Matriz {
	
	private Aluno[][] matriz = new Aluno[10][10];
	
	public void exemplo() {
		matriz[1][1] = new Aluno("A1", "T4", 10); 
	}
	
	public void adicionar(Aluno aluno, int linha, int coluna) {
		matriz[linha][coluna] = aluno;
		
	}
	public void imprimir(int linha, int coluna ) {
		System.out.println("matriz "+matriz[linha] [coluna]);
	}
	public static void main(String[] args) {
		Matriz matriz2 = new Matriz();
		matriz2.adicionar(new Aluno("A1", "T4", 10), 2, 3);
		
		System.out.println("matriz " + matriz2.matriz[2][3]);
		System.out.println("matriz " + matriz2.matriz[1][2]);
		
	}

}
