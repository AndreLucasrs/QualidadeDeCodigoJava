
public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);

}

/*
 * rçamento atende a regra de um desconto, o mesmo já calcula o desconto. Caso
 * contrário, ele passa para o "próximo" desconto, qualquer que seja esse
 * próximo desconto.
 * 
 * Esses descontos formam como se fosse uma "corrente", ou seja, um ligado ao
 * outro. Daí o nome do padrão de projeto: Chain of Responsibility. A ideia do
 * padrão é resolver problemas como esses: de acordo com o cenário, devemos
 * realizar alguma ação. Ao invés de escrevermos código procedural, e deixarmos
 * um único método descobrir o que deve ser feito, quebramos essas
 * responsabilidades em várias diferentes classes, e as unimos como uma
 * corrente.
 */
