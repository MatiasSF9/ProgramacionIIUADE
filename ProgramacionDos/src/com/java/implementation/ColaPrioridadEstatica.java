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
	
	public boolean colaVacia(){
		return indice == 0;
	}
	
	public void desacolar(){
		for(int i = 0; i<indice-1;i++) {
			e[i] = e[i+1];
		}
		indice--;
	}

	public void acolarPrioridad(int valor, int prioridad) {
		
		int i = indice -1;
		while(prioridad > e[i].p && i>=0) {
			e[i+1] = e[i];
			i--;
		}
		e[i+1] = new Elem();
		e[i+1].v = valor;
		e[i+1].p = prioridad;
		indice++;
	}

	public int primero() {
		return  e[0].v;
	}

	public int prioridad() {
		return e[0].p;
	}
	
}
