package UnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.example.Ejercicios.ListaEnlazadaInvertida;
import org.junit.jupiter.api.Test;


public class ListaEnlazadaInvertidaTest {

    @Test
    public void testOrdenar() {
        // Creamos una lista enlazada para ordenar
        ListaEnlazadaInvertida.Nodo head = new ListaEnlazadaInvertida.Nodo(4);
        head.siguiente = new ListaEnlazadaInvertida.Nodo(2);
        head.siguiente.siguiente = new ListaEnlazadaInvertida.Nodo(1);
        head.siguiente.siguiente.siguiente = new ListaEnlazadaInvertida.Nodo(3);

        // Llamamos al método de ordenación
        ListaEnlazadaInvertida.Nodo ordenado = ListaEnlazadaInvertida.Ordenar(head);

        // Verificamos que la lista esté ordenada
        int[] valoresEsperados = {1, 2, 3, 4};
        int i = 0;
        while (ordenado != null) {
            assertEquals(valoresEsperados[i], ordenado.valor);
            ordenado = ordenado.siguiente;
            i++;
        }
    }
}

