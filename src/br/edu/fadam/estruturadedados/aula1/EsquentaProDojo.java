package br.edu.fadam.estruturadedados.aula1;

public class EsquentaProDojo {
	
	private String textoQualquer;
	private int numeroQualquer;
	
	public String juntaTextoQualquerComNumeroQualquer() {
		return textoQualquer + " " + numeroQualquer;
	}
	
	public static void main(String[] args) {
		EsquentaProDojo dojo = new EsquentaProDojo();
		dojo.textoQualquer = "Um texto";
		dojo.numeroQualquer = 2000;
		String resultado = dojo.juntaTextoQualquerComNumeroQualquer();
		System.out.println(resultado);
	}

}
