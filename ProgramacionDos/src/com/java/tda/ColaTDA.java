package com.java.tda;

public interface ColaTDA {
	//Inicializa la estructura
    //Pre:
    //Post: lista para ser utilizada
    public void inicializar();

    //Recibe un valor y lo agrega al final de la estructura
    //Pre: la estructura tiene que estar inicializada
    //Post: la estructura se ve modificada en un elemento mas
    void acolar(int valor);

    //Elimina el primer elemento de la cola
    //Pre: inicializada y tiene que tener al menos un elemento
    //Post: se ve modificada en un elemento menos
    void desacolar();

    //Devuelve el primer elemento
    //Pre: inicializada y al menos un elemento
    //Pos: no se ve afectada
    int primero();

    //Informa si la cola esta vacia
    //Pre: inicializada
    //Pos: no se ve afectada
    boolean colaVacia();
}
