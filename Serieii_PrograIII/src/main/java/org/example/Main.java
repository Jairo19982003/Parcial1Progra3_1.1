package org.example;
import org.example.Ejercicios.StairsSnakes;
import org.example.Ejercicios.MatrizAdyacente;
import org.example.Ejercicios.ListaEnlazadaInvertida;

import java.lang.module.FindException;
import java.util.List;

import static org.example.Ejercicios.ListaEnlazadaInvertida.Ordenar;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        StairsSnakes juego = new StairsSnakes();
        juego.Jugar();


        //Ejercicio 2

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrizAdyacente.Posicion posicion = new MatrizAdyacente.Posicion(1, 1);

        List<MatrizAdyacente.Posicion> FindAdjacentsPositions = new MatrizAdyacente().FindAdjacentsPositions(matriz, posicion);
        for (MatrizAdyacente.Posicion Adjacente : FindAdjacentsPositions){
            System.out.println(Adjacente);
        }


        //Ejercicio 3
        //Primera prueba
        ListaEnlazadaInvertida.Nodo head1 = new ListaEnlazadaInvertida.Nodo(4);
        head1.siguiente = new ListaEnlazadaInvertida.Nodo(2);
        head1.siguiente.siguiente = new ListaEnlazadaInvertida.Nodo(1);
        head1.siguiente.siguiente.siguiente = new ListaEnlazadaInvertida.Nodo(3);

        ListaEnlazadaInvertida.Nodo ordenado1 = Ordenar(head1);
        while (ordenado1 != null){
            System.out.print(ordenado1.valor + " ");
            ordenado1 = ordenado1.siguiente;
        }

        System.out.println();

        //Segunda prueba
        ListaEnlazadaInvertida.Nodo head2 = new ListaEnlazadaInvertida.Nodo(-1);
        head2.siguiente = new ListaEnlazadaInvertida.Nodo(5);
        head2.siguiente.siguiente = new ListaEnlazadaInvertida.Nodo(3);
        head2.siguiente.siguiente.siguiente = new ListaEnlazadaInvertida.Nodo(4);
        head2.siguiente.siguiente.siguiente.siguiente = new ListaEnlazadaInvertida.Nodo(0);

        ListaEnlazadaInvertida.Nodo ordenado2 = Ordenar(head2);
        while (ordenado2 != null){
            System.out.print(ordenado2.valor + " ");
            ordenado2 = ordenado2.siguiente;
        }

        System.out.println();

        //Tercera prueba
        ListaEnlazadaInvertida.Nodo head3 = null;

        ListaEnlazadaInvertida.Nodo ordenado3 = Ordenar(head3);
        while (ordenado3 != null){
            System.out.print(ordenado3.valor + " ");
            ordenado3 = ordenado3.siguiente;
        }

    }
}