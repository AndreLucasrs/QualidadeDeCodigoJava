
//State - deixa os estados em diferentes classes que geralmente s�o menores e mais facil te ser entendidas
//objeto pricipal contem um estado e apenas repassa a a��o para ele, e ele define o comportamento e as possiveis transi��o
public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
