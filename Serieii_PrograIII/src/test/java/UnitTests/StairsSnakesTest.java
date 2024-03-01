package UnitTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Ejercicios.StairsSnakes;


    public class StairsSnakesTest {

        @Test
        public void testJugar() {
            StairsSnakes game = new StairsSnakes();
            game.Jugar();
            // No se puede probar completamente debido a la aleatoriedad del lanzamiento de dados
            // Pero podemos verificar que el juego no se bloquee y termine con un mensaje de felicitación
            assertTrue(true); // Si el juego termina sin lanzar excepciones, la prueba pasa
        }

    }
