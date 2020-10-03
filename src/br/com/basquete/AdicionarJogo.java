package br.com.basquete;

public class AdicionarJogo extends Basquete{

	private int nivelJogo;
	

	public AdicionarJogo(int jogo, int placar, int miniTemporada,int maxTemporada, int quebraMini, int quebraMax) {
		super(jogo, placar, miniTemporada,maxTemporada, quebraMini, quebraMax);
		setNivelJogo(jogo);
	}
	
	public int getNivelJogo() {// deve ver qual o nivel do jogo se quer mostrar
		return nivelJogo;
	}
	public void setNivelJogo(int nivelJogo) {
		this.nivelJogo = nivelJogo;
	}

	@Override
	public String imprimirTabela() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//im
/*@Override
	public String toString() {
		return String.format(super.toString(), args);
	}*/
}
