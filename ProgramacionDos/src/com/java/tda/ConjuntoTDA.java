package com.java.tda;

public interface ConjuntoTDA {
	//Inicializa la estructura
    //PRE: -
    //POST: estructura inicializada
    void inicializar();

    //Añade un elemento al conjunto
    //PRE: inicializada y el elemento no pertenece a la misma
    //POST: estructura modificada con un elemento mas
    void agregar(int elemento);

    //Remueve un elemento del conjunto
    //PRE: inicializada y no vacia
    //POST: estructura modificada con un elemento menos
    void sacar(int valor);

    //Devuelve un elemento del conjunto
    //PRE: estrutruca inicializada y no vacia
    //POST: -
    int elegir();

    //Determina si el conjunto tiene elementos
    //PRE: inicializada
    //POST: -
    boolean conjuntoVacio();

    //Determina si el elemento ya existe en el conjunto
    //PRE: inicializada
    //POST: -
    boolean existeElemento(int valor);
}
