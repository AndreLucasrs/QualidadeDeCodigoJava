
//Template Method
//Escreve o algoritmo principal na classe pai
//Os filhos filhos so vão escrever o que precisa
public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		return minimaTaxacao(orcamento);
	}

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
