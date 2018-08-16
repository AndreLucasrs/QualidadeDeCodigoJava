package br.alura.refatoracao.cap5;

public class TesteFatura {

	public static void main(String[] args) {

		Fatura fatura = new Fatura();
		double valor1 = fatura.emReal();
		double valor2 = fatura.emDolar();
	}
}

/*
 * Parâmetros booleanos são uma péssima maneira para você mudar o comportamento
 * do seu código.
 * 
 * Evite ao máximo parâmetros booleanos. Favoreça o uso de métodos separados,
 * sobrecarga de métodos ou até mesmo o uso de Factories (do padrão de projeto).
 */
