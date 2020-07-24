package br.edu.fadam.estruturadedados.ead.aula1;

public class NoArvoreBinaria {

	private Integer valor;
	
	private NoArvoreBinaria noPai;
	
	private NoArvoreBinaria saEsquerda;
	
	private NoArvoreBinaria saDireita;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public NoArvoreBinaria getNoPai() {
		return noPai;
	}

	public void setNoPai(NoArvoreBinaria noPai) {
		this.noPai = noPai;
	}

	public NoArvoreBinaria getSaEsquerda() {
		return saEsquerda;
	}

	public void setSaEsquerda(NoArvoreBinaria saEsquerda) {
		this.saEsquerda = saEsquerda;
	}

	public NoArvoreBinaria getSaDireita() {
		return saDireita;
	}

	public void setSaDireita(NoArvoreBinaria saDireita) {
		this.saDireita = saDireita;
	}
	
	
}
