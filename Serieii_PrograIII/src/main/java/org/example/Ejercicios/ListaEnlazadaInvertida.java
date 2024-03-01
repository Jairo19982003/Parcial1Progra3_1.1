package org.example.Ejercicios;

public class ListaEnlazadaInvertida {

    /*public static Nodo Ordenar(Nodo head) {
        if (head == null || head.siguiente == null) {
            return head;
        }

        Nodo actual = head;
        while (actual.siguiente != null){
            Nodo siguiente = actual.siguiente;
            if (actual.valor > siguiente.valor){
                IntercambiarValores(actual, siguiente);
            }
            actual = actual.siguiente;
        }
        return head;
    }*/

    public static Nodo Ordenar(Nodo head){
        if(head ==null || head.siguiente == null){
            return head;
        }
        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = head;
            while (actual.siguiente != null){
                Nodo siguiente = actual.siguiente;
                if (actual.valor > siguiente.valor){
                    IntercambiarValores(actual, siguiente);
                    intercambio = true;
                }
                actual = actual.siguiente;
            }
        }while (intercambio);
        return head;
    }

    public static void IntercambiarValores(Nodo nodo1, Nodo nodo2){
        int temp = nodo1.valor;
        nodo1.valor = nodo2.valor;
        nodo2.valor = temp;
    }

    public static class Nodo {
        public int valor;
        public Nodo siguiente;
        public Nodo (int valor){
            this.valor = valor;
            this.siguiente = null;
        }
    }
}
