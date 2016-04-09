package com.java.implementation;

import com.java.tda.ConjuntoTDA;
import com.java.tda.DiccionarioSimpleTDA;

public class DiccionarioSimpleEstatico implements DiccionarioSimpleTDA {

	class Elem {
		int c;
		int v;
	}
	
	Elem e[];
	int cantidad;
	
	public void inicializaDS() {
		cantidad = 0;
		e = new Elem[100];
	}
	
	public void agregar(int clave, int valor) {
//		int i = cantidad -1;
//		
//		while(i>=0 && e[i].c!= clave)
//			i--;
		int i = buscarClave(clave);
		if(i<0) {
			Elem elem = new Elem();
			elem.c = clave;
			elem.v = valor;
			e[cantidad] = elem;
			cantidad++;
		} else {
			e[i].v = valor;
		}
	}

	public ConjuntoTDA claves() {
		ConjuntoTDA c = new ConjuntoEstatico();
		c.inicializar();
		
		for(int i=0; i < cantidad ; i++) {
			c.agregar(e[i].c);
		}
		return c;
	}

	public int recuperar(int clave) {
//		int i = cantidad-1;
//		
//		while(i>=0 && e[i].c != clave)
//			i--;
		int i = buscarClave(clave);
		return e[i].v;
	}
	
	public void eliminar(int clave) {
		int i = cantidad-1;
		
		while(i>=0 && e[i].c != clave)
			i--;
		if(i>=0) {
			e[i] = e[cantidad-1];
			cantidad--;
		}

	}
	
	private int buscarClave(int clave) {
		int i = cantidad-1;
		
		while(i>=0 && e[i].c != clave)
			i--;
		
		return i;
	}
	
}
