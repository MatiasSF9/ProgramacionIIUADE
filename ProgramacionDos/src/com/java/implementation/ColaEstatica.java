package com.java.implementation;

import com.java.tda.ColaTDA;

public class ColaEstatica implements ColaTDA {

	 int indice;
     int []v;

	public void inicializar() {
	     v = new int [100];
	     indice = 0;
	}
	
	public void acolar(int e) {
	     v[indice] = e;
	     indice ++;
	}
	
	public int primero(){
	     return v[0]; //return v[indice-1];
	}
	
	public boolean colavacia() {
	     return (indice == 0);
	}
	
	public void desacolar() {
	     for( int i = 0; i <indice; i++) {
	          v[i] = v[i+1];
	     }
	     indice--;
	}

	public boolean colaVacia() {
		return indice == 0;
	}

}
