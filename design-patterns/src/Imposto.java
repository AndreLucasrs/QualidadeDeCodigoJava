
public interface Imposto {

	double calcula(Orcamento orcamento);

}
/*
 * podemos criar uma interface chamada Imposto e fazermos as classes ISS e ICMS
 * a implementar
 * 
 * E agora o nosso CalculadorDeImpostos est� pronto para ser utilizado e
 * flex�vel o bastante para receber diferentes tipos (ou "estrat�gias") de
 * impostos
 */
