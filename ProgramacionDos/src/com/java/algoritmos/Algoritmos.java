package com.java.algoritmos;

import com.java.tda.PilaTDA;

public class Algoritmos {
	
	public static void pasarPila(PilaTDA origen, PilaTDA destino) {
		destino.inicializar();
		while(!origen.estaVacia()) {
			destino.apilar(origen.tope());
			origen.desapilar();
		}
	}
	
}
