package br.edu.fadam.estruturadedados.aula1;

public class Node {
	Node noPai;
	Node noFilho;
	String id;
	
	public Node() {
	}
	
	public Node(Node noPai, Node noFilho, String id) {
		super();
		this.noPai = noPai;
		this.noFilho = noFilho;
		this.id = id;
	}
	
	public boolean adicionarPai(Node pai) {
		noPai = pai; 
		return true;
	
	}
	public boolean adicionarFilho(Node filho) {
		noFilho= filho;
		return false;
		
	}
	
	@Override
	public String toString() {
		return "Nó = " + id +  " No pai: " + (noPai != null ? noPai.id : "sem pai")
				+ " \n No fi - No filho = " 
	    + (noFilho != null ? noFilho.id : "sem filho");
		
	}
	
	public static void main(String[] args) {
		Node noA = new Node();
		noA.id = "no a";
		Node noB = new Node();
		noB.id = "no b";
		System.out.println(noA);
		System.out.println(noB);
		noA.adicionarFilho(noB);
		noB.adicionarPai(noA);
		System.out.println(noA);
		System.out.println(noB);
		
		
		
	}
}
