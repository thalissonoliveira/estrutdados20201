package br.edu.fadam.estruturadedados.ead.aula3;

import br.edu.fadam.estruturadedados.ead.aula2.Arvore;
import br.edu.fadam.estruturadedados.ead.aula2.Item;

public class Test {

	
	public static void main(String[] args) {
		
		/* Instanciando uma árvore, e executando o seu construtor. */
		Arvore arvore = new Arvore();
		
		/*	Adicionando novos Itens, 
		 * 	e colocando valores em seu atributo
		 *  exclusivo.	 */
		Item item1 = new Item();
		item1.numeroItem = 7;
		/*	Adicionando novos Itens, 
		 * 	e colocando valores em seu atributo
		 *  exclusivo.	 */
		
		Item item2 = new Item();
		item2.numeroItem = 3;
		/*	Adicionando novos Itens, 
		 * 	e colocando valores em seu atributo
		 *  exclusivo.	 */
		
		Item item3 = new Item();
		item3.numeroItem = 4;
		/*	Adicionando novos Itens, 
		 * 	e colocando valores em seu atributo
		 *  exclusivo.	 */
		
		Item item4 = new Item();
		item4.numeroItem = 8;
		
		/*	Adicionando os Itens em nossa árvore. com o metodo 
		 * adicionar(Item item).		 */
		arvore.adicionar(item1);
		arvore.adicionar(item2);
		arvore.adicionar(item3);
		arvore.adicionar(item4);
		/*	Executando o metodo	mostrar, que mostrar 
		 * os itens de nossa árvore.	 */
		arvore.mostrar();
		System.out.println("######");
		arvore.mostrarDetalhado();
		
		
	}
}
