package br.com.basquete;

public class AdicionarJogo extends Basquete{

	
	public AdicionarJogo(int jogo, int placar, int miniTemporada,int maxTemporada, int quebraMini, int quebraMax) {
		super(jogo, placar, miniTemporada,maxTemporada, quebraMini, quebraMax);
		
	}


@Override
	public String toString() {
		return String.format(super.toString());
	}
}
