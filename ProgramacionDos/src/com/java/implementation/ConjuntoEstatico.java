package com.java.implementation;

import com.java.tda.ConjuntoTDA;

public class ConjuntoEstatico implements ConjuntoTDA {
	
	int indice;
	int c[];
	
	public void inicializar() {
		indice = 0;
		c = new int[100];
	}

	public void agregar(int elemento) {
		if(existeElemento(elemento)){
			c[indice] = elemento;
			indice++;
		}
	}

	public void sacar(int valor) {
		int i = 0;
		while(c[i] != valor && i<indice)
			i++;
		if (i<indice) {
			c[i] = c[indice-1];
			indice--;
		}
	}

	public int elegir() {
		return c[indice];
	}

	public boolean conjuntoVacio() {
		return indice == 0;
	}

	public boolean existeElemento(int valor) {
		int i;
		for(i=0; i<indice && c[i]!=valor;i++)
			;
		return i<indice;
	}

}
