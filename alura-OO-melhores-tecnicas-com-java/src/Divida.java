import java.util.ArrayList;
import java.util.List;

public class Divida {

	private static final int TAXA_DIVIDA = 8;
	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	private List<Pagamento> pagamentos = new ArrayList<>();

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return valorPago;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}

	private void paga(double valor) {
		verificaValorMenorQueZero(valor);
		valor = verificaValorMaiorQueCem(valor);
		this.valorPago += valor;
	}

	private double verificaValorMaiorQueCem(double valor) {
		if (valor > 100) {
			valor -= TAXA_DIVIDA;
		}
		return valor;
	}

	private void verificaValorMenorQueZero(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para o pagamento");
		}
	}
}
