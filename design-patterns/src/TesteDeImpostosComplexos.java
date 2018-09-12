
public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		//Padrão de Projeto Decorator
		//é uma otima maneira de juntar comportamentos que estão quebrados em classes diferentes
		Imposto iss = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);

	}

}
