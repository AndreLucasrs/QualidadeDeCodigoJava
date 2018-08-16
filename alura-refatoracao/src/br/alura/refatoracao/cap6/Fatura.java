package br.alura.refatoracao.cap6;

import static br.alura.refatoracao.cap6.Moeda.*;

public class Fatura {

	private double valorMensal;
	private String cliente;

	public Fatura() {
	}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	// Evite numeros magicos
	// Sempre torne eles em constantes
	// Pode ser uma constante tipo private static final double VALOR_DOLAR
	// ou que nem fizemos nesse caso, crie uma enum
	public double emDolar() {
		return valorMensal * DOLAR.getTaxa();
	}

}
/*
 * Qual é o problema com numero magico ? O problema deles é que são difíceis de
 * serem entendidos pelos desenvolvedores. Quando você vê um 2.7 jogado no
 * código, você precisa ler mais sobre o código para entender o que é aquele
 * número.
 */

/*
 * Observações sobre esse curso
 * 
 * Quando tiver classe grande, quebre em classes pequenas, isso quer dizer
 * então, evite classes grandes
 * 
 * Quando tiver metodos grandes quebre em metodos privados ou quebre eles em
 * outras classes, isso quer dizer então, evite metodos grandes
 * 
 * evite IFs complexos, se ele tiver complexo leve para um metodo que esconda a
 * complexidade, se o IF for muito grande crie um metodo que explique o que essa
 * condição esta fazendo
 * 
 * evite Booleanos como parametros
 * 
 * use constantes ao inves de valores magicos direto no codigo
 * 
 * sempre pense em refatorar
 */
