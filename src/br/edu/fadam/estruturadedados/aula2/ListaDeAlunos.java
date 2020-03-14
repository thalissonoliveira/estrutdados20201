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
	
	public void deletar(int posicao) {
		if (posicao > quantidade) {
			throw new RuntimeException("Sem chance. Não existe elemente nessa posição!");
		} else {
			for (int i = posicao - 1; i < quantidade - 1; i++) {
				alunos[i] = alunos[i+1];
			}
			alunos[quantidade-1] = null;
			quantidade = quantidade - 1;
		}
	}
	
	public void adiciona(Aluno aluno, int posicao) {
		if (posicao > quantidade + 1) {
			throw new RuntimeException("Sem chance! Não é possível inserir um aluno na posição informada.");
		}
		for (int i = quantidade; i > posicao - 1; i--) {
			alunos[i] = alunos[i-1];
		}
		alunos[posicao-1] = aluno;
		quantidade = quantidade + 1;
	}
	
	
	
	public Aluno getAluno(int posicao) {
		return alunos[posicao-1];
	}
	
	public void imprimirTodosOsAlunos() {
		for (int i = 0; i < quantidade; i++) {
			System.out.println(alunos[i]);
		}
	}
	
	public static void main(String[] args) {
		ListaDeAlunos lista = new ListaDeAlunos();
		lista.inicializaLista();
		
		System.out.println("Quantidade antes: " + lista.quantidade);
		
		lista.adiciona(new Aluno("Aluno 1", "TX", 9.0));
		lista.adiciona(new Aluno("Aluno 2", "TX", 8.0));
		lista.adiciona(new Aluno("Aluno 3", "TX", 9.0));
		lista.adiciona(new Aluno("Aluno 4", "TX", 7.0));
		lista.imprimirTodosOsAlunos();
		
		lista.adiciona(new Aluno("Aluno 5", "TX", 7.0), 2);
		System.out.println("Quantidade agora: " + lista.quantidade);
		lista.imprimirTodosOsAlunos();
//		System.out.println("#############");
//		lista.deletar(1);
//		
//		System.out.println("Quantidade agora: " + lista.quantidade);
//		lista.imprimirTodosOsAlunos();
		
		
	}
	
}
