package br.com.basquete;

import java.util.ArrayList;


public class Sistema {
	
	private ListarJogos jogo = new ListarJogos();
	
	private Tela tela = new Tela();


	public void menuIniciar() {
		
		int op = 0;
		
		do {
			op = tela.mostrarMenuEPedirOpcao();
			switch(op) {
			
			case 1 :
				
				AdicionarJogo jogada = tela.cadastrarJogo();
				jogo.adicionarJogo(jogada);
				
			case 2 :	
				//Cálculo  do Mínimo por Temporada tem que ver no qual jogo ela quer calcular
				
				CalculoMediaMiniMaxTemporada miniTemporada = tela.calculoMiniTemporada();
				
			case 3 :
				//Cálculo  do Máximo por Temporada 
			case 4 :
				//Cálculo  da Quebra de Recorde Mínimo 
			case 5 :
				//Cálculo  da Quebra de Recorde Máximo
			case 9 :
				// Imprimir Dados do Jogo 
				ArrayList<Basquete> listaJogos = jogo.getListarJogos(); 
				for(Basquete jogoCorrente : listaJogos) {
					tela.imprimirJogo(jogoCorrente);
				}
				
			}
		}while(op != 0);
	
	}
}
