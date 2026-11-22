
package bo.edu.practica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class GestorTareasTest {

    @Test
    void deberiaAgregarUnaTarea() {

        // Arrange: preparar
        GestorTareas gestor = new GestorTareas();

        // Act: ejecutar
        gestor.agregarTarea("Estudiar Maven");
        gestor.agregarTarea("Estudiar Java");

        // Assert: comprobar
        assertEquals(2, gestor.cantidadTareas());
    }

    @Test
    void deberiaIndicarQueLaListaEstaVacia() {
        GestorTareas gestor = new GestorTareas();

        assertTrue(gestor.estaVacia());
    }

    @Test
    void deberiaIndicarQueLaListaNoEstaVacia() {
        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea("Estudiar CI/CD");

        assertFalse(gestor.estaVacia());
    }
}
