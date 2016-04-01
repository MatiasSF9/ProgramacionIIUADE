package com.java.implementation;

import com.java.tda.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {
	
	class Elem {
		int v;
		int p;
	}
	
	int indice;
	Elem []e;
	
	public void inicializarColaPrioridad(){
		indice = 0;
		e = new Elem[100];
	}
	
	public boolean estaVacia(){
		return indice == 0;
	}
	
	public void desacolar(){
		for(int i = 0; i<indice-1;i++) {
			e[i] = e[i+1];
		}
		indice--;
	}

	public void acolarPrioridad(int valor, int prioridad) {
		// TODO Auto-generated method stub
		
	}

	public int primero() {
		return  e[0].v;
	}

	public boolean colaVacia() {
		// TODO Auto-generated method stub
		return false;
	}

	public int prioridad() {
		return e[0].p;
	}
	
}
