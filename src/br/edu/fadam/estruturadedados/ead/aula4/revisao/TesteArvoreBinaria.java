package br.edu.fadam.estruturadedados.ead.aula4.revisao;

public class TesteArvoreBinaria {
	
	public static void main(String[] args) {
		ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
		System.out.println("A árvore está vazia? " + (arvoreBinaria.isArvoreVazia() ? "Siiim!" : "Nao"));
		
		//7 3 2 10 11 4
		NoBinario no1 = new NoBinario();
		no1.valor = 7;
		NoBinario no2 = new NoBinario();
		no2.valor = 3;
		NoBinario no3 = new NoBinario();
		no3.valor = 2;
		NoBinario no4 = new NoBinario();
		no4.valor = 10;
		NoBinario no5 = new NoBinario();
		no5.valor = 11;
		NoBinario no6 = new NoBinario();
		no6.valor = 4;
		
		arvoreBinaria.adicionar(no1);
		arvoreBinaria.adicionar(no2);
		arvoreBinaria.adicionar(no3);
		arvoreBinaria.adicionar(no4);
		arvoreBinaria.adicionar(no5);
		arvoreBinaria.adicionar(no6);
		
		arvoreBinaria.percorrerPreOrdem();
		arvoreBinaria.percorrerEmOrdem();
		arvoreBinaria.percorrerPosOrdem();
		
	}

}
