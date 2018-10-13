
public class TesteAcoes {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adiciona(new EnviadorDeEmail());
		builder.adiciona(new NotaFiscalDao());
		builder.adiciona(new EnviadorDeSms());
		builder.adiciona(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123").comItem(new ItemDaNota("nome", 100.0))
				.comObservacoes("obs").dataAtual().constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
