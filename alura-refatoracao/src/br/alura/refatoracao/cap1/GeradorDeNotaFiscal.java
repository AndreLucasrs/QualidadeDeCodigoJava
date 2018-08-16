package br.alura.refatoracao.cap1;

public class GeradorDeNotaFiscal {

	// Sempre tente ter metodos pequenos e faceis de serem lidos
	// tente sempre fazer um metodo no maximo do tamanho da tela
	// deixar nomes dos metodos mais claros sobre o que ele faz
	public NotaFiscal gera(Fatura fatura) {

		NotaFiscal nf = geraNF(fatura);
		new EnviadorDeEmail().enviaEmail(nf);
		new NFDao().salvaNoBanco(nf);

		return nf;
	}

	private NotaFiscal geraNF(Fatura fatura) {

		double valor = fatura.getValorMensal();
		double imposto = 0;
		if (valor < 200) {
			imposto = valor * 0.03;
		} else if (valor > 200 && valor <= 1000) {
			imposto = valor * 0.06;
		} else {
			imposto = valor * 0.07;
		}

		NotaFiscal nf = new NotaFiscal(valor, imposto);
		return nf;
	}
}

/*
 * Quando devemos extrair para um método privado e quando devemos extrair para
 * uma outra classe? Geralmente levamos para uma outra classe todo trecho de
 * código que "pertence a outra responsabilidade". No nosso exemplo, o código de
 * acesso a banco de dados não tem relação com o código de geração da NF; são
 * coisas diferentes, e portanto cada um merece a sua classe. Métodos privados
 * são bem úteis para dividir um mesmo algoritmo, grande, em trechos menores.
 */
