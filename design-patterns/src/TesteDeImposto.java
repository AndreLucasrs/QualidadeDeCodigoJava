
public class TesteDeImposto {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500);

		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		calculadorDeImposto.realizaCalculo(orcamento, iss);
		calculadorDeImposto.realizaCalculo(orcamento, icms);
		
		Imposto novoImposto = new ICCC();
        System.out.println(novoImposto.calcula(orcamento));
	}

}
/*
 * Ao inv�s de mantermos as regras espalhadas pela nossa aplica��o, podemos
 * encapsul�-las em classes cujas responsabilidades sejam realizar os c�lculos.
 * Para isso, podemos criar as classes ICMS e ISS cada um com seu respectivo
 * m�todo para calcular o valor do imposto de acordo com o or�amento.
 * 
 * 
 * 
 * 
 * Quando utilizamos uma hierarquia, como fizemos com a interface Imposto e as
 * implementa��es ICMS e ISS, e recebemos o tipo mais gen�rico como par�metro,
 * para ganharmos o polimorfismo na regra que ser� executada, simplificando o
 * c�digo e sua evolu��o, estamos usando o Design Pattern chamado Strategy.
 */
