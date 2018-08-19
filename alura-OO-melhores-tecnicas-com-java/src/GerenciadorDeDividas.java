
public class GerenciadorDeDividas {

	public void efetuaPagamento(Divida divida, String nomePagador, String cnpjPagador, double valor) {
		
		Pagamento pagamento = new Pagamento();
		pagamento.setPagador(nomePagador);
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setValor(valor);
		divida.registra(pagamento);
	}
}
