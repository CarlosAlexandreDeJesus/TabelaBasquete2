package br.com.basquete;
import java.util.Scanner;

public class Tela {
	
	Scanner teclado = new Scanner(System.in);
	
		public int mostrarMenuEPedirOpcao() {
			System.out.println();
			System.out.println("------------ Cadastramento e Consulta do Jogo -----------");
			System.out.println();
			System.out.println("* 1 - Cadastro de Novo Jogo                             *");
			System.out.println("* 2 - Cálculo  da Média das Temporadas                  *");
			System.out.println("* 3 - Cálculo  dos Recordes quebrados da Temporada      *");
			System.out.println("* 4 - Listar todas as Médias cadastradas                *");
			System.out.println("* 5 - Listar todos os Recordes cadastrados              *");
			System.out.println("* 9 - Imprimir Dados do Jogo                            *");
			System.out.println("* 0 - Sair                                              *");
			System.out.println("---------------------------------------------------------");
			System.out.println("Digite Opção: ");
			int opcao = teclado.nextInt();
			return opcao;
		}
		
		public AdicionarJogo  cadastrarJogo(){
			
			System.out.println("------------Adicionado dados do Jogo-----------------");
			System.out.println();
			System.out.println("Digite o jogo");
			int jogo = teclado.nextInt();
			System.out.println("Digite o placar");
			int placar = teclado.nextInt();
			System.out.println("Digite o mínimo da temporada");
			int miniTemporada = teclado.nextInt();
			System.out.println("Digite o máximo da temporada");
			int maxTemporada = teclado.nextInt();
			System.out.println("Digite a quebra de recorde mínima ");
			int quebraMini = teclado.nextInt();
			System.out.println("Digite a quebra de recorde máxima");
			int quebraMax = teclado.nextInt();
			AdicionarJogo dadosDoJogo = new AdicionarJogo(jogo, placar, miniTemporada,maxTemporada,quebraMini,quebraMax);
			return dadosDoJogo;
		
	   }
		public CalculoMediaMiniMaxTemporada calculoMiniTemporada() {
			
			System.out.println("------------Tirando a média das Temporadas----------------");
			System.out.println();
			System.out.println("*           Informe a pontuação mínima da temporada      *");
			int minimo = teclado.nextInt();
			System.out.println("*           Informe a pontuação máxima da temporada      *");
			int maximo = teclado.nextInt();
			CalculoMediaMiniMaxTemporada media = new CalculoMediaMiniMaxTemporada(minimo, maximo);
			return media;
			
			}
		public CalculoDoRecordeMiniMax calculaRecordeMiniMax() {
			
			System.out.println("------------Calculando Recordes---------------------------");
			System.out.println();
			System.out.println("*           Informe a pontuação mínima da temporada      *");
			int minimo = teclado.nextInt();
			System.out.println("*           Informe a pontuação máxima da temporada      *");
			int maximo = teclado.nextInt();
			CalculoDoRecordeMiniMax media = new CalculoDoRecordeMiniMax(minimo, maximo);
			return media;		
			
		}
		public void imprimirJogo(Basquete jogoCorrente,int flagParaImprimirStrings) {
			
			if(flagParaImprimirStrings == 0) {
				jogoCorrente.imprimirTabelaNomes();
				jogoCorrente.imprimirTabelaNumeros();
			}else {
				jogoCorrente.imprimirTabelaNumeros();
			}	
		}
		public void imprimirMediaTemporada(CalculoMediaMiniMaxTemporada mediaCorrente) {
			System.out.println("Média:"+mediaCorrente.mediaTemporada());
		}
		public void imprimirRecorde(CalculoDoRecordeMiniMax recordeCorrente) {
			
			System.out.println("Recorde:"+ recordeCorrente.quatidadeRecorde());
		
		}
}
