
package bo.edu.practica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
