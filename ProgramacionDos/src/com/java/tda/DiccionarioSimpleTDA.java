package com.java.tda;

public interface DiccionarioSimpleTDA {
	 //Inicializa la estructura
    //Pre:  -
    //Pos: inicializada
    void inicializaDS();

    //Agrega un par de clave valor
    //Si la clave no existe, la crea, si existe, pisa el valor asociado.
    //Pre: inicializada
    //Pos: estructura modificada con un par c, v mas o no si ya existía (solo modifica el valor)
    void agregar(int clave, int valor);

    //Devuelve las claves agregadas a la estructura
    //Pre: inicializada
    //Pos: -
    ConjuntoTDA claves();

    //Deuvelve el valor asociado a la clave
    //Pre: Inicializada y que exista la clave
    //Pos: -
    int recuperar(int clave);

    //Elimina la clave y su valor asociado
    //Pre: inicializada
    //Pos: modificada con un par k v menos
    void eliminar(int clave);
}
