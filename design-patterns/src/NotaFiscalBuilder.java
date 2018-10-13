import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//Builder - visa resolver o problema de criar objetos complexos
public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private double valorBruto;
	private double imposto;
	private Calendar data;
	private String observacoes;
	private List<AcaoAposGerarNota> todasAcoesAseremExecutadas;
	
	public NotaFiscalBuilder() {
		this.todasAcoesAseremExecutadas = new ArrayList<>();
	}
	
	public void adiciona(AcaoAposGerarNota acao) {
		this.todasAcoesAseremExecutadas.add(acao);
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder	comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		imposto += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder dataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscal constroi() {
		
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, imposto, todosItens, observacoes);
		
		for(AcaoAposGerarNota acao : todasAcoesAseremExecutadas) {
			acao.executa(nf);
		}
		
		return nf;
	}
}
