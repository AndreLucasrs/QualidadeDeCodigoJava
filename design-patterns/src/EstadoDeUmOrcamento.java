
//State - deixa os estados em diferentes classes que geralmente são menores e mais facil te ser entendidas
//objeto pricipal contem um estado e apenas repassa a ação para ele, e ele define o comportamento e as possiveis transição
public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
