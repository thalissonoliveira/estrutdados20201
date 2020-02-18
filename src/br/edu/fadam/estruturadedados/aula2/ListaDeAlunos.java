package br.edu.fadam.estruturadedados.aula2;

public class ListaDeAlunos {
	
	private Aluno[] alunos;
	private int quantidade = 0;
	
	public void inicializaLista() {
		alunos = new Aluno[100];
	}
	
	/**
	 * Adiciona aluno no final do vetor.
	 * 
	 * @param aluno
	 */
	public void adiciona(Aluno aluno) {
		alunos[quantidade] = aluno;
		quantidade = quantidade + 1;
	}
	
	public Aluno getAluno(int indice) {
		return alunos[indice];
	}
	
	public static void main(String[] args) {
		ListaDeAlunos lista = new ListaDeAlunos();
		lista.inicializaLista();
		
		System.out.println("Quantidade antes: " + lista.quantidade);
		
		lista.adiciona(new Aluno("Aluno 1", "TX", 9.0));
		
		System.out.println("Quantidade agora: " + lista.quantidade);
		
		System.out.println(lista.getAluno(0));
		System.out.println(lista.getAluno(1));
		
		
	}
	
}
