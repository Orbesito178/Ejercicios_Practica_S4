package negocio;

public class Main {
    public static void main (){
        Usuario u1 = new Usuario("jperez", "jperez@correo.com");
        Usuario u2 = new Usuario("sorbe", "sorbe@correo.com");
        Usuario u3 = new Usuario("dyepez", "dyepez@correo.com");
        Usuario u4 = new Usuario("jrosas", "jrosas@correo.com");

        System.out.println("\n> Total de Usuarios: " + Usuario.getTotalCreados());
        System.out.println("==== USUARIOS ====");
        u1.mostrarInformacion();
        u2.mostrarInformacion();
        u3.mostrarInformacion();
        u4.mostrarInformacion();

        System.out.println("=== Consulta de IDs ====");
        System.out.println("> ID de Usuario 1: " + u1.getId());

    }
}