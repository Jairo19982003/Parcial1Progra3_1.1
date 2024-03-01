package org.example.Ejercicios;
import java.util.ArrayList;
import java.util.List;
public class MatrizAdyacente {


    public List<Posicion> FindAdjacentsPositions(int[][] matriz, Posicion posicion){
        List<Posicion> AdjacentsPositions = new ArrayList<>();
        int fila = posicion.GetFila();
        int columna = posicion.GetColumna();


        if (fila > 0){
            AdjacentsPositions.add(new Posicion(fila -1, columna));
        }

        if (fila < matriz.length - 1){
            AdjacentsPositions.add(new Posicion(fila + 1, columna));
        }

        if (columna > 0){
            AdjacentsPositions.add(new Posicion(fila, columna - 1));
        }

        if (columna < matriz[0].length - 1){
            AdjacentsPositions.add(new Posicion(fila, columna + 1));
        }

        return AdjacentsPositions;
    }

    public static class Posicion {
        private int Fila;
        private int Columna;
        public Posicion(int fila, int columna){
            this.Fila = fila;
            this.Columna = columna;
        }

        public int GetFila(){
            return Fila;
        }

        public int GetColumna(){
            return Columna;
        }

        @Override
        public String toString(){
            return "(" + Fila + ", " + Columna + ")";
        }
    }
}

