
public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		//Padr�o de Projeto Decorator
		//� uma otima maneira de juntar comportamentos que est�o quebrados em classes diferentes
		Imposto iss = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);

	}

}
