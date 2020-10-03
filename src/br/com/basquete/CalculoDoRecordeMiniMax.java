package br.com.basquete;

public class CalculoDoRecordeMiniMax {
	
	private int recordeMini, recordeMax,mediaRecordes;
	
	public CalculoDoRecordeMiniMax(int recordeMini, int recordeMax) {
		setRecordeMini(recordeMini);
		setRecordeMax(recordeMax);
	}

	public int getRecordeMini() {
		return recordeMini;
	}

	public void setRecordeMini(int recordeMini) {
		this.recordeMini = recordeMini;
	}

	public int getRecordeMax() {
		return recordeMax;
	}

	public void setRecordeMax(int recordeMax) {
		this.recordeMax = recordeMax;
	}

	public int quatidadeRecorde() {
		//Fazer a logica para dar 0 ou 1
		if(getRecordeMini() == 12 && getRecordeMax() == 12) {
		    mediaRecordes = 0;
		}else if (getRecordeMini()== 12 && getRecordeMax() >= 24) {
			mediaRecordes = 1;
		}else if (getRecordeMini() > 0 || getRecordeMini() <= 10 && getRecordeMax() >= 24  ) {
			mediaRecordes = 2;
	}
		return mediaRecordes;
		
	}
}
