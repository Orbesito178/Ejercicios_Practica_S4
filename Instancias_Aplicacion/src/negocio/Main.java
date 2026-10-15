package negocio;

public class Main {
    public static void main(){
        Aplicacion app1 = new Aplicacion("SistemaVentas","1.0");
        Aplicacion app2 = new Aplicacion("Inventario", "2.3");

        System.out.println("\n> Total de Aplicaciones: " + Aplicacion.getTotalAplicaciones());
        System.out.println("=== APLICACIONES ===");
        app1.mostrarInformacion();
        app2.mostrarInformacion();

        System.out.println("\n=== INICIAR Y CERRAR ===");
        app1.iniciar();
        app1.iniciar(); // ya estaba iniciada
        app1.mostrarInformacion();
        app1.cerrar();
        app1.cerrar(); // ya estaba cerrada
        app1.mostrarInformacion();
    }
}