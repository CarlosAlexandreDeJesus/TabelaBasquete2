package br.com.basquete;
import java.util.Scanner;

public  abstract class Basquete {
	
	private int jogo,placar,miniTemporada,maxTemporada,quebraMini,quebraMax;

	
	Scanner teclado = new Scanner(System.in);	

	public Basquete(int jogo, int placar, int miniTemporada,int maxTemporada, int quebraMini, int quebraMax) {		
		setJogo(jogo);
		setPlacar(placar);
		setMiniTemporada(miniTemporada);
		setMaxTemporada(maxTemporada);
		setQuebraMini(quebraMini);
		setQuebraMax(quebraMax);
	}

	public int getJogo() {
		return jogo;
	}

	public void setJogo(int jogo) {
		this.jogo = jogo;
	}

	public int  getPlacar() {
		return placar;
	}

	public void setPlacar(int placar) {
		this.placar = placar;
	}

	public int getMiniTemporada() {
		return miniTemporada;
	}

	public void setMiniTemporada(int miniTemporada) {
		this.miniTemporada = miniTemporada;
	}
	
	public int getMaxTemporada() {
		return maxTemporada;
	}

	public void setMaxTemporada(int maxTemporada) {
		this.maxTemporada = maxTemporada;
	}

	public int getQuebraMini() {
		return quebraMini;
	}

	public void setQuebraMini(int quebraMini) {
		this.quebraMini = quebraMini;
	}

	public int getQuebraMax() {
		return quebraMax;
	}

	public void setQuebraMax(int quebraMax) {
		this.quebraMax = quebraMax;
	}
	public  void imprimirTabelaNumeros() {
		System.out.printf("%8d%8d%15d%20d%20d%17d",jogo,placar, miniTemporada,maxTemporada,quebraMini,quebraMax);
	}
	
	public void imprimirTabelaNomes() {
		
		System.out.printf("%10s%10s%10s%10s%10s%10s","Jogo"," | Placar"," | Mínimo Temporada"," | Máximo Temporada"," | Recorde Mínimo"," | Recorde Máximo |");	
		System.out.println();
	}

}
