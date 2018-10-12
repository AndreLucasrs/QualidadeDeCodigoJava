import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteNotaFiscal {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum")
		.comCnpj("12.324.668/0001-12")
		.comItem(new ItemDaNota("item 1", 200.0))
		.comItem(new ItemDaNota("item 2", 300.0))
		.comItem(new ItemDaNota("item 3", 400.0))
		.comObservacoes("observacoes")
		.dataAtual();
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
		
	}

}
