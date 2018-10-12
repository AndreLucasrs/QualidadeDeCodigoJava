
public class Finalizado implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento finalizado nao recebe desconto extra");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Ja estado no estado finalizado não pode passar pelo estado aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Ja estado no estado finalizado não pode passar pelo estado reprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Ja esta finalizado");
		
	}

}
