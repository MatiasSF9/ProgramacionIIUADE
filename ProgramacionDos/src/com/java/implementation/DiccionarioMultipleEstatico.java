package com.java.implementation;

import com.java.tda.ConjuntoTDA;
import com.java.tda.DiccionarioMultipleTDA;

public class DiccionarioMultipleEstatico implements DiccionarioMultipleTDA {
	
	class Elem {
		int c;
		int v[];
		int cantV;
	}
	
	int cantC;
	Elem e[];
	
	public void inicializaDS() {
		cantC = 0;
		e = new Elem[100];
	}

	public void agregar(int clave, int valor) {
		//Clave existe?
		int i = buscarClave(clave);
		if(i<0) {
			e[cantC] = new Elem();
			e[cantC].c = clave;
			e[cantC].v = new int[100];
			e[cantC].cantV = 0;
			e[cantC].v[e[cantC].cantV] = valor;
			e[cantC].cantV++;
			cantC++;
		} else {
			Elem aux = e[i];
			int j = buscarValor(aux, valor);
			if(j<0) {
				aux.v[aux.cantV] = valor;
				aux.cantV++;
			}
		}
	}

	public ConjuntoTDA claves() {
		ConjuntoTDA c = new ConjuntoEstatico();
		c.inicializar();
		
		for(int i = 0; i< cantC ; i++) {
			c.agregar(e[i].c);
		}
		return c;
	}

	public ConjuntoTDA recuperar(int clave) {
		ConjuntoTDA conj = new ConjuntoEstatico();
		conj.inicializar();
		
		int i = buscarClave(clave);
		if(i>=0) {
			Elem aux = e[i];
			for(int j =0; j<aux.cantV; j++) {
				conj.agregar(aux.v[j]);
			}
		}
		return conj;
	}

	public void eliminarClave(int clave) {
		int i = buscarClave(clave);
		
		if(i>=0) {
			e[i] = e[cantC];
			cantC--;
		}
	}

	public void eliminarValor(int clave, int valor) {
		int i = buscarClave(clave);
		if(i>=0) {
			Elem aux = e[i];
			int j = buscarValor(aux, valor);
			if(i>=0) {
				aux.v[j] = aux.v[aux.cantV-1];
				aux.cantV--;
				if(aux.cantV == 0) {
					eliminarClave(clave);
				}
			}

		}
	}
	
	private int buscarClave(int clave) {
		int i = cantC-1;
		
		while(i>=0 && e[i].c != clave)
			i--;
		
		return i;
	}
	
	private int buscarValor(Elem aux, int valor) {
		int i = aux.cantV-1;
		
		while(i>=0 && aux.v[i] != valor)
			i--;
		
		return i;
	}
}
