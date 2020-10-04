package br.com.basquete;

import java.util.ArrayList;

public class Sistema {
	
	private ListarJogos jogo = new ListarJogos();
	private CalculoMediaMiniMaxTemporada mediaTemporada = new CalculoMediaMiniMaxTemporada();
	private CalculoDoRecordeMiniMax recorde = new CalculoDoRecordeMiniMax();
	
	private Tela tela = new Tela();


	public void menuIniciar() {
		
		int op = 0;
		
		do {
			op = tela.mostrarMenuEPedirOpcao();
			switch(op) {
			
			case 1 :
				
				AdicionarJogo jogada = tela.cadastrarJogo();
				jogo.adicionarJogo(jogada);
				break;
				
			case 2 :	
				//Cálculo  da media por Temporada tem que ver no qual jogo ela quer calcular
				
				CalculoMediaMiniMaxTemporada miniTemporada = tela.calculoMiniTemporada();
				mediaTemporada.adicionarCalculoMiniTemporada(miniTemporada);
				break;
				
				
			case 3 :
				//Cálculo  dos recordes
				CalculoDoRecordeMiniMax enviarRecorde = tela.calculaRecordeMiniMax();
				recorde.adicionarRecorde(enviarRecorde);
				break;
				
			case 4 :
				//Lista todas as médias cadastradas
				ArrayList <CalculoMediaMiniMaxTemporada> media = mediaTemporada.getListaCalculoMiniTemporada();
				for(CalculoMediaMiniMaxTemporada mediaCorrente : media) {
					tela.imprimirMediaTemporada(mediaCorrente);
				}
				break;
			case 5 :
				//Lista todos os recordes cadastrados
				ArrayList<CalculoDoRecordeMiniMax> recordeTemporada = recorde.getListaRecorde();
				for(CalculoDoRecordeMiniMax recordeCorrente : recordeTemporada) {
					tela.imprimirRecorde(recordeCorrente);
				}
				break;
			case 9 :
				// Imprimir Dados do Jogo 
				int flagParaImprimirStrings=0;
				ArrayList<Basquete> listaJogos = jogo.getListarJogos(); 
				for(Basquete jogoCorrente : listaJogos) {
					tela.imprimirJogo(jogoCorrente,flagParaImprimirStrings);
					flagParaImprimirStrings=1;
					System.out.println();
				}
				break;
				
			}
		}while(op != 0);
	
	}
}
