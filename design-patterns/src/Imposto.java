
//Padrão de Projeto Decorator
//Possibilita a gente usar mais de um dos filhos juntos para calcula aquilo que queiremos
public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
		
	}
	
	public Imposto() {}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0;
		return outroImposto.calcula(orcamento);
	}
}

//public interface Imposto {
//
//	double calcula(Orcamento orcamento);
//
//}
/*
 * podemos criar uma interface chamada Imposto e fazermos as classes ISS e ICMS
 * a implementar
 * 
 * E agora o nosso CalculadorDeImpostos está pronto para ser utilizado e
 * flexível o bastante para receber diferentes tipos (ou "estratégias") de
 * impostos
 */
