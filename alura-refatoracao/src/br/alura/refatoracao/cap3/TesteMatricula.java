package br.alura.refatoracao.cap3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteMatricula {

	public static void main(String[] args) {
		
		Matricula matricula = new Matricula(false, new GregorianCalendar(2020,Calendar.APRIL,2));
		
		//Encapsula ifs em metodos semanticos
		//evite condições complexas
		//mas caso a necessidade de ter cria um metodo para isso
		//e chame no if que nem o exemplo abaixo
		if(matricula.estaValida()) {
			
			System.out.println("legal,vc eh um usuario com acesso ilimitado!");
		}
		
	}

}
