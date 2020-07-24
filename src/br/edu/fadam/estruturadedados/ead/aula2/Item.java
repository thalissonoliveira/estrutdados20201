package br.edu.fadam.estruturadedados.ead.aula2;

public class Item {
	
	/* Atributos da classe Item	 */
	/* Numero do item, esse atributo eh
	 *  exclusivo, quando cada item for 
	 *  instanciado, somente ele vai ser 
	 *  a diferença de um item para o outro.*/
	public int numeroItem;
	/* e a ligação, para o lado esquerdo de 
	 * nossa árvore	 */
	public Item filhoEsquerda;
	/* e a ligação, para o lado direito de 
	 * nossa árvore	 */
	public Item filhoDireita;
	
	public void mostraNo() {
		System.out.print("{");   
		System.out.print(numeroItem);   
		System.out.print("} ");
    }
	
	public void mostraNoDetalhado() {
		System.out.println("{");   
		System.out.println(numeroItem);
		System.out.println("ESQ " + (filhoEsquerda == null ? "[sem filho esq]" : filhoEsquerda.numeroItem));
		System.out.println("DIR " + (filhoDireita == null ? "[sem filho dir]" : filhoDireita.numeroItem));
		System.out.println("} ");
	}
	
}
