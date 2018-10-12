
public class Reprovado implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Somente orcamento em aprovacao ou aprovado recebem desconto");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Ja reprovado não pode ser aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Ja reprovado não pode ser novamento");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado(); 
		
	}

}
