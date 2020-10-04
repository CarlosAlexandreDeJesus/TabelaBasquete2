package br.com.basquete;

import java.util.ArrayList;

public class CalculoMediaMiniMaxTemporada {
	
	
	    ArrayList<CalculoMediaMiniMaxTemporada> listaCalculoMiniTemporada;

	    private int minimo,maximo;
		
		public CalculoMediaMiniMaxTemporada(int minimo, int maximo) {
		setMinimo(minimo);
		setMaximo(maximo);
		
		}

		public int getMinimo() {
			return minimo;
		}

		public void setMinimo(int minimo) {
			this.minimo = minimo;
		}

		public int getMaximo() {
			return maximo;
		}

		public void setMaximo(int maximo) {
			this.maximo = maximo;
		}
		
		public int mediaTemporada() {
			
			return (getMinimo() + getMaximo())/2;
			
		}
		
		public  CalculoMediaMiniMaxTemporada() {
		this.listaCalculoMiniTemporada = new ArrayList<CalculoMediaMiniMaxTemporada>();
		}

		public void adicionarCalculoMiniTemporada(CalculoMediaMiniMaxTemporada e) {
			this.listaCalculoMiniTemporada.add(e);
		}
		public ArrayList<CalculoMediaMiniMaxTemporada> getListaCalculoMiniTemporada() {
			return this.listaCalculoMiniTemporada;
		}			

}
