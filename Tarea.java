public class Tarea {
    private int id;
    private String nombre;
    private String descripcion;
    private String prioridad;
    private boolean completada;

    // Constructor de la clase Tarea
    public Tarea(int id, String nombre, String descripcion, String prioridad, boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    // Getters y Setters para cada atributo
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getPrioridad() { return prioridad; }
    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }
}
