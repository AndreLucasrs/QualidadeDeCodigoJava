
public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}
}
/*
 * Precisamos que nosso código fique flexível o bastante para utilizarmos
 * diferentes impostos na realização do cálculo. Uma possibilidade para
 * resolvermos esse problema é, ao invés de instanciarmos o imposto que
 * desejamos dentro do método, recebermos uma instância do Imposto que queremos
 * utilizar
 * 
 * 
 * Repare que a criação de uma nova estratégia de cálculo de imposto não implica
 * em mudanças no código escrito acima! Basta criarmos uma nova classe que
 * implementa a interface Imposto, que nosso CalculadorDeImpostos conseguirá
 * calculá-lo sem precisar de nenhuma alteração!
 */
