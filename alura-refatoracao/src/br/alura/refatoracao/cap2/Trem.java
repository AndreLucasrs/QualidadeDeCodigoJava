package br.alura.refatoracao.cap2;

import java.util.List;

//Nomes adequados facilitam a leitura e manuntenção dos códigos
public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	//variavel so pode ter um conceito do ponto de vista semantico
	//exemplo, se ela é feito pra somar ela so pode somar
	//ela so vai representar uma unica coisa no codigo
	//ela não pode ficar mudando ao longo do tempo
	public boolean podeReservar(int lugaresAReservar) {
		
		int lugaresDisponiveis = capacidade - lugaresJaReservados();
		return lugaresDisponiveis > lugaresAReservar; 
	}

	private int lugaresJaReservados() {
		
		int lugaresJaReservados = 0;
		for(Vagao vagao : vagoes) {
			lugaresJaReservados += vagao.reservados();
		}
		return lugaresJaReservados;
	}
	
}