package br.com.basquete;

import java.util.ArrayList;


public class ListarJogos {
	
	ArrayList<Basquete> listaJogos;
	
	
	
	public ListarJogos() {
		this.listaJogos = new ArrayList<Basquete>();
	}
	
	public void adicionarJogo(Basquete e) {
		this.listaJogos.add(e);
	}

	public ArrayList<Basquete> getListarJogos() {
		return this.listaJogos;
	}
	
	
}
