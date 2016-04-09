package com.java.tda;

public interface DiccionarioMultipleTDA {
	//Inicializa la estructura
    //Pre:  -
    //Pos: inicializada
    void inicializaDS();

    //Agrega un par de clave valor
    //Si la clave no existe, la crea, si existe, agrega el valor
    //Pre: inicializada
    //Pos: estructura modificada con un par c, v mas o no si ya existía (solo modifica el valor)
    void agregar(int clave, int valor);

    //Devuelve las claves agregadas a la estructura
    //Pre: inicializada
    //Pos: -
    ConjuntoTDA claves();

    //Deuvelve el conjunto con todos los valores asociados a la clave
    //Pre: Inicializada y que exista la clave
    //Pos: -
    ConjuntoTDA recuperar(int clave);

    //Elimina la clave y su valor asociado
    //Pre: inicializada
    //Pos: modificada con un par k v menos
    void eliminarClave(int clave);


    //Elimina el valor asociado a la clave. Si es el único valor, elimina la clave también
    //Pre: inicializada
    //Pos: estructura con un ejem menos o clave con un valor menos
    void eliminarValor(int clave, int valor);
}
