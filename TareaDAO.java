import java.util.ArrayList;
import java.util.List;

public class TareaDAO {
    private List<Tarea> tareas = new ArrayList<>();
    private static int idCounter = 1;

    // Método para agregar una nueva tarea
    public void agregarTarea(String nombre, String descripcion, String prioridad) {
        Tarea nuevaTarea = new Tarea(idCounter++, nombre, descripcion, prioridad, false);
        tareas.add(nuevaTarea);
    }

    // Método para marcar una tarea como completada
    public void marcarTareaComoCompletada(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.setCompletada(true);
                break;
            }
        }
    }

    // Método para eliminar una tarea
    public void eliminarTarea(int id) {
        tareas.removeIf(t -> t.getId() == id);
    }

    // Método para obtener una lista de tareas pendientes
    public List<Tarea> obtenerTareasPendientes() {
        List<Tarea> pendientes = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                pendientes.add(tarea);
            }
        }
        return pendientes;
    }
}
