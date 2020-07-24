package br.edu.fadam.estruturadedados.ead.aula2;

public class Arvore {
	/* Atributo raiz, ele é o topo de nossa árvore, ele é  o
	 * meio pelo qual nós acessamos os outros itens da árvore.*/
	Item raiz;

	/* inicialização do atributo raiz atraves do construtor. */
	public Arvore() {
		raiz = null;
	}

	/*Metodo adicionar(Item item), responsavel por adicionar itens, em nossa árvore*/
	public void adicionar(Item item){
		/*Verifica se a raiz e nula, se essa setenca for verdadeira, 
		 * inserimos o item na raiz */
		if(raiz == null){
			raiz = item;
			/* Senão a raiz tem ramos, e necessario verificar 
			 * até acha um ponto nulo*/
		}else{
			adicionar(item, raiz);
		}
	}
	
	public boolean isVazia() {
		if (raiz == null) {
			return true;
		}
		else {
			return false;
		}
	}

	/*Metodo adicionar(Item item,Item subarvore), responsavel por acha um ponto nulo
	 * e colocar o item nesse ponto.	 */
	public void adicionar(Item item,Item subarvore){
		/*Verifica o lado em que o item irá ficar, caso o item.numeroItem que o usuario colocou
		 * for menor que a subarvore o item irá para o lado esquerdo  */
		if (item.numeroItem < subarvore.numeroItem){
			/*	Verificar se o lado esquerdo esta nulo, caso esteja 
			 * o item sera colocado no lado esquerdo da arvore.		 */
			if (subarvore.filhoEsquerda == null){
				subarvore.filhoEsquerda = item;
				/* Caso contrario, com a recursividade, verificamos de novo, com parametros
				 * o lado esquerdo da subarvore, e o item que o usuario colocou.	*/
			}else{
				adicionar(item, subarvore.filhoEsquerda);
			}
		}else{
			/*Verifica o lado em que o item irá ficar, caso o item.numeroItem que o usuario colocou
			 * for maior que a subarvore o item irá para o lado direito  */
			if(item.numeroItem > subarvore.numeroItem){
				/*	Verificar se o lado direito esta nulo, caso seja 
				 * o item sera colocado no lado direito da subarvore.		 */
				if(subarvore.filhoDireita == null){
					subarvore.filhoDireita = item;
				}else{
					/* Caso contrario, com a recursividade, verificamos de novo, com parametros
					 * o lado direito da subarvore, e o item que o usuario colocou.	*/
					adicionar(item, subarvore.filhoDireita);
				}
			}
		}
	}

	public void mostrar(){
	/* 	Intanciamos um novo item, que usara a raiz, isso 
	 * é usado para não mexe na estrutura da arvore, mas mesmos assim 
	 * ter acesso a seus valores.	 */
		Item item = raiz;
		/* verificar se o item não esta vazio, caso não esteja ira executar 
		 * o metodo mostrar.  	*/
		if (!(item == null)){
			/* Executar o metodo mostrar que tem como parametro o item esquerdo no caso 
			 * a raiz.	 */
			mostrar(item.filhoEsquerda);
			/* Mostrar o dado do item, no caso um número inteiro.				 */
			System.out.println(item.numeroItem);
			/* Executar o metodo mostrar que tem como parametro o item direito.	 */
			mostrar(item.filhoDireita);
		}
	}

	public void mostrar(Item item){	
		if(item != null){
			/* Executar o metodo mostrar que tem como parametro o item esquerdo no caso 
			 * a raiz.	 */
			mostrar(item.filhoEsquerda);
			/* Mostrar o dado do item, no caso um número inteiro.				 */
			System.out.println(item.numeroItem);
			/* Executar o metodo mostrar que tem como parametro o item direito.	 */
			mostrar(item.filhoDireita);
		}
	}
	
	public void mostrarDetalhado(){
		/* 	Intanciamos um novo item, que usara a raiz, isso 
		 * é usado para não mexe na estrutura da arvore, mas mesmos assim 
		 * ter acesso a seus valores.	 */
			Item item = raiz;
			/* verificar se o item não esta vazio, caso não esteja ira executar 
			 * o metodo mostrar.  	*/
			if (!(item == null)){
				/* Executar o metodo mostrar que tem como parametro o item esquerdo no caso 
				 * a raiz.	 */
				/* Mostrar o dado do item, no caso um número inteiro.				 */
				item.mostraNoDetalhado();
				mostrarDetalhado(item.filhoEsquerda);
				/* Executar o metodo mostrar que tem como parametro o item direito.	 */
				mostrarDetalhado(item.filhoDireita);
			}
		}

		public void mostrarDetalhado(Item item){	
			if(item != null){
				item.mostraNoDetalhado();
				/* Executar o metodo mostrar que tem como parametro o item esquerdo no caso 
				 * a raiz.	 */
				mostrarDetalhado(item.filhoEsquerda);
				/* Executar o metodo mostrar que tem como parametro o item direito.	 */
				mostrarDetalhado(item.filhoDireita);
			}
		}
	
}
