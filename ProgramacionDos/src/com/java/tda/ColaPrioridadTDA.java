package com.java.tda;

public interface ColaPrioridadTDA {
    /**Inicializa la Cola
      *Pre: ninguna
      *Post: estructura creada
      **/
    void inicializarColaPrioridad();

    /**Agrega un valor a la estructura de acuerdo a su prioridad
      *PRE: estructura inicializada
      *POST: estructura modificada en un valor mas
      **/
    void acolarPrioridad(int valor, int prioridad);

    //Remueve un elemento de la estructura con mayor prioridad
    //PRE: pila inicializada y no vacia
    //POST: estructura modificada en un valor menos
    void desacolar();

    //Devuelve el elemento de la estructura con mayor prioridad
    //PRE: inicializada y no vacia
    //POST: estructura no modificada
    int primero();

    //Informa si la cola tiene elementos
    //PRE: estructura inicializada
    //POST: estructura no mofificada
    boolean colaVacia();

    //Devuelve la prioridad del primer elemento
    //PRE: inicializada y no vacia
    //POST: estructura no modificada
    int prioridad();
}
