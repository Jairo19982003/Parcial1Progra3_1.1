package UnitTests;

import org.example.Ejercicios.MatrizAdyacente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MatrizAdyacenteTest {

    @Test
    public void testFindAdjacentsPositions() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrizAdyacente.Posicion posicion = new MatrizAdyacente.Posicion(1, 1);

        List<MatrizAdyacente.Posicion> adjacents = new MatrizAdyacente().FindAdjacentsPositions(matriz, posicion);

        assertEquals(4, adjacents.size()); // Verificamos que hay 4 posiciones adyacentes
        // Podemos hacer más aserciones para verificar posiciones específicas adyacentes
    }
}
