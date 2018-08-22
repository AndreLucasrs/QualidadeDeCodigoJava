
public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}
}
/*
 * Precisamos que nosso c�digo fique flex�vel o bastante para utilizarmos
 * diferentes impostos na realiza��o do c�lculo. Uma possibilidade para
 * resolvermos esse problema �, ao inv�s de instanciarmos o imposto que
 * desejamos dentro do m�todo, recebermos uma inst�ncia do Imposto que queremos
 * utilizar
 * 
 * 
 * Repare que a cria��o de uma nova estrat�gia de c�lculo de imposto n�o implica
 * em mudan�as no c�digo escrito acima! Basta criarmos uma nova classe que
 * implementa a interface Imposto, que nosso CalculadorDeImpostos conseguir�
 * calcul�-lo sem precisar de nenhuma altera��o!
 */
