package com.java.implementation;

import com.java.tda.ColaTDA;

public class ColaDin implements ColaTDA {

	class Nodo {
		int valor;
		Nodo sig;
	}
	Nodo primero;
	Nodo ultimo;
	
	public void inicializar() {
		primero = ultimo = null;
	}

	public void acolar(int valor) {
		Nodo aux = new Nodo();
		aux.valor = valor;
		if(primero == null)
			primero = aux;
		if (ultimo!=null) {
			ultimo.sig = aux;
		}
		ultimo = aux;			
	}

	public void desacolar() {
		primero = primero.sig;
		if(primero == null)
			ultimo = null;
	}

	public int primero() {
		return primero.valor;
	}

	public boolean colaVacia() {
		return primero == null;
	}

}
