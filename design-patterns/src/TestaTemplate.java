
public class TestaTemplate {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(3000);
		orcamento.adicionaItem(new Item("TV", 2000));
		
		IKCP ikcp = new IKCP();
		double calcula = ikcp.calcula(orcamento);
		double maximaTaxacao = ikcp.maximaTaxacao(orcamento);
		double minimaTaxacao = ikcp.minimaTaxacao(orcamento);
		
		System.out.println("Maxima "+maximaTaxacao);
		System.out.println("Minima "+minimaTaxacao);
	}

}
