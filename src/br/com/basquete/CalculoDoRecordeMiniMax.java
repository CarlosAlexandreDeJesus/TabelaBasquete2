package br.com.basquete;

import java.util.ArrayList;

public class CalculoDoRecordeMiniMax {
	
	private int recordeMini, recordeMax,opcao,mediaRecordes;
	ArrayList<CalculoDoRecordeMiniMax> listaRecorde;
	
	public CalculoDoRecordeMiniMax(int recordeMini, int recordeMax) {
		setRecordeMini(recordeMini);
		setRecordeMax(recordeMax);
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
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
		
		if(getRecordeMini() == 12 && getRecordeMax() == 12) {
		    mediaRecordes = 0;
		}else if (getRecordeMini()== 12 && getRecordeMax() >= 24) {
			mediaRecordes = 1;
		}else if (getRecordeMini() > 0 || getRecordeMini() <= 10 && getRecordeMax() >= 24  ) {
			mediaRecordes = 2;
	}
		return mediaRecordes;
		
	}
	public  CalculoDoRecordeMiniMax() {
		this.listaRecorde = new ArrayList<CalculoDoRecordeMiniMax>();
		}

		public void adicionarRecorde(CalculoDoRecordeMiniMax e) {
			this.listaRecorde.add(e);
		}
		public ArrayList<CalculoDoRecordeMiniMax> getListaRecorde() {
			return this.listaRecorde;
		}
	
}
