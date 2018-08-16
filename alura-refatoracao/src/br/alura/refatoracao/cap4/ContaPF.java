package br.alura.refatoracao.cap4;

//Sempre procure achar uma maneira de deixar de repetir codigo
public class ContaPF extends ContaBancaria {

	public ContaPF(String titular, double saldoInicial) {
		super(titular, saldoInicial);
	}

	public void saca(double valor) {
		super.saca(valor + 0.1);
	}

	public void deposita(double valor) {
		super.deposita(valor - 0.1);
	}

}
/*
 * Existem muitas maneiras diferentes de refatorar esse tipo de c�digo,
 * dependendo do n�vel da duplica��o do c�digo. Extrair para m�todos privados,
 * para classes, fazer uso de heran�a, ou composi��o. Padr�es de projeto podem
 * ajudar novamente. O ponto-chave novamente � evitar c�digo duplicado.
 */