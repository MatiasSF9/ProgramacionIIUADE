package com.java.tda;

public interface PilaTDA {
	//Inicializa la estructura….
    //PRE:
    //POST:
    public void inicializar();
    public void apilar(int valor);
    public void desapilar();
    public int tope();
    public boolean estaVacia();
}
