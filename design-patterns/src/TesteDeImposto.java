
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
 * Ao invés de mantermos as regras espalhadas pela nossa aplicação, podemos
 * encapsulá-las em classes cujas responsabilidades sejam realizar os cálculos.
 * Para isso, podemos criar as classes ICMS e ISS cada um com seu respectivo
 * método para calcular o valor do imposto de acordo com o orçamento.
 * 
 * 
 * 
 * 
 * Quando utilizamos uma hierarquia, como fizemos com a interface Imposto e as
 * implementações ICMS e ISS, e recebemos o tipo mais genérico como parâmetro,
 * para ganharmos o polimorfismo na regra que será executada, simplificando o
 * código e sua evolução, estamos usando o Design Pattern chamado Strategy.
 */
