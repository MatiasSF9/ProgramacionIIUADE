package com.java.implementation;

import com.java.tda.PilaTDA;

public class PilaEstatica implements PilaTDA {

	int indice;
	int p[];
	
	public void inicializar() {
		indice = 0;
		p = new int[100];

	}

	public void apilar(int valor) {
		p[indice] = valor;
		indice++;
	}

	public void desapilar() {
		p[indice] = 0;
		indice--;
	}

	public int tope() {
		return p[indice-1];
	}

	public boolean estaVacia() {
		return indice == 0;
	}

}
