package br.edu.fadam.estruturadedados.aula2;

public class Aluno {
	
	private String nome;
	private String turma;
	private double media;
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nome, String turma, double media) {
		this.nome = nome;
		this.turma = turma;
		this.media = media;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTurma() {
		return turma;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	@Override
	public String toString() {
		return "Aluno " + nome;
	}
	
}
