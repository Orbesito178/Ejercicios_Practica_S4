package negocio;

public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;

    private static int totalAplicaciones = 0;

    //Constructor
    public Aplicacion(String nombre, String version){
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;

    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    public void iniciar(){
        System.out.println("[!] Iniciando " + nombre + " v." + version + "...");
        if (ejecutando) {
            System.out.println(nombre + " ya estaba en ejecución.");
        } else {
            ejecutando = true;
            System.out.println(nombre + " v." + version + " iniciada.");
        }
    }

    public void cerrar(){
        System.out.println("[!] Cerrando " + nombre + " v." + version + "...");
        if (!ejecutando) {
            System.out.println(nombre + " ya estaba cerrada.");
        } else {
            ejecutando = false;
            System.out.println(nombre + " v." + version + " cerrada.");
        }
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }

    public void mostrarInformacion(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Version: v." + version);
        System.out.println(ejecutando ? "Ejecutando: Iniciado" : "Ejecutando: Cerrado");
        System.out.println("-----------------------------------");
    }


}