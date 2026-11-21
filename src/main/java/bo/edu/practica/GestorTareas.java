package bo.edu.practica;

import java.util.*;

public class GestorTareas {

    private final List<String> tareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public int cantidadTareas() {
        return tareas.size();
    }
}
