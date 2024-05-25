import java.util.Scanner;

public class Main {
    private static TareaDAO dao = new TareaDAO();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Listar tareas pendientes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea restante

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Prioridad (alta, media, baja): ");
                    String prioridad = scanner.nextLine();
                    dao.agregarTarea(nombre, descripcion, prioridad);
                    break;
                case 2:
                    System.out.print("ID de la tarea a completar: ");
                    int idCompletar = scanner.nextInt();
                    dao.marcarTareaComoCompletada(idCompletar);
                    break;
                case 3:
                    System.out.print("ID de la tarea a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    dao.eliminarTarea(idEliminar);
                    break;
                case 4:
                    System.out.println("Tareas pendientes:");
                    for (Tarea tarea : dao.obtenerTareasPendientes()) {
                        System.out.println("ID: " + tarea.getId() + "\nNombre: " + tarea.getNombre() +
                                           "\nDescripción: " + tarea.getDescripcion() +
                                           "\nPrioridad: " + tarea.getPrioridad() +
                                           "\nEstado: " + (tarea.isCompletada() ? "Completada" : "Pendiente") + "\n");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
