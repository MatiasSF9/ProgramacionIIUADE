package com.java;

import com.java.algoritmos.Algoritmos;
import com.java.implementation.PilaEstatica;
import com.java.tda.PilaTDA;

public class MainTDA {

	public static void main(String[] args) {
		PilaTDA p1 = new PilaEstatica();
		PilaTDA p2 = new PilaEstatica();
		
		p1.inicializar();
		p2.inicializar();
		
		for(int i = 0; i<99;i++)
			p1.apilar(i);
		
		Algoritmos.pasarPila(p1, p2);
		
		while(!p2.estaVacia()) {
			System.out.println("Valor Tope: " + p2.tope());
			p2.desapilar();
		}
	}

	
}
