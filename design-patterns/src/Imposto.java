
public interface Imposto {

	double calcula(Orcamento orcamento);

}
/*
 * podemos criar uma interface chamada Imposto e fazermos as classes ISS e ICMS
 * a implementar
 * 
 * E agora o nosso CalculadorDeImpostos está pronto para ser utilizado e
 * flexível o bastante para receber diferentes tipos (ou "estratégias") de
 * impostos
 */
