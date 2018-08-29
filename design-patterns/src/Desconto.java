
public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);

}

/*
 * r�amento atende a regra de um desconto, o mesmo j� calcula o desconto. Caso
 * contr�rio, ele passa para o "pr�ximo" desconto, qualquer que seja esse
 * pr�ximo desconto.
 * 
 * Esses descontos formam como se fosse uma "corrente", ou seja, um ligado ao
 * outro. Da� o nome do padr�o de projeto: Chain of Responsibility. A ideia do
 * padr�o � resolver problemas como esses: de acordo com o cen�rio, devemos
 * realizar alguma a��o. Ao inv�s de escrevermos c�digo procedural, e deixarmos
 * um �nico m�todo descobrir o que deve ser feito, quebramos essas
 * responsabilidades em v�rias diferentes classes, e as unimos como uma
 * corrente.
 */
