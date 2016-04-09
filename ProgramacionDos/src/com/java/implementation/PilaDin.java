package com.java.implementation;

import com.java.tda.PilaTDA;

public class PilaDin implements PilaTDA {

	class Nodo {
		int v;
		Nodo sig;
	}
	Nodo tope;
	
	public void inicializar() {
		tope = null;
	}

	public void apilar(int valor) {
		Nodo aux = new Nodo();
		aux.v = valor;
		aux.sig = tope;
		tope = aux;
	}

	public void desapilar() {
		tope = tope.sig;
	}

	public int tope() {
		return tope.v;
	}

	public boolean estaVacia() {
		return tope == null;
	}

}
