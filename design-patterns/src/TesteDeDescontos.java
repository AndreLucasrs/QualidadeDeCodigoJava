
public class TesteDeDescontos {

	public static void main(String[] args) {
		
		CalculadorDeDesconto desconto = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Lapis", 250.0));
		
		double descontoFinal = desconto.calcula(orcamento);
		
		System.out.println(descontoFinal);

	}

}
