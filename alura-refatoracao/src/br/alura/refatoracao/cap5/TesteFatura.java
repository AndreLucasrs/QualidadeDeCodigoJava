package br.alura.refatoracao.cap5;

public class TesteFatura {

	public static void main(String[] args) {

		Fatura fatura = new Fatura();
		double valor1 = fatura.emReal();
		double valor2 = fatura.emDolar();
	}
}

/*
 * Par�metros booleanos s�o uma p�ssima maneira para voc� mudar o comportamento
 * do seu c�digo.
 * 
 * Evite ao m�ximo par�metros booleanos. Favore�a o uso de m�todos separados,
 * sobrecarga de m�todos ou at� mesmo o uso de Factories (do padr�o de projeto).
 */
