package negocio;

public class Usuario {
    private int id;
    private String username;
    private String correo;
    private boolean activo;

    private static int contadorUsuarios = 0;

    //Constructor
    public Usuario (String username, String correo){
        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true;

    }

    public static int getTotalCreados(){
        return contadorUsuarios;
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getCorreo(){
        return correo;
    }

    public boolean isActivo(){
        return activo;
    }

    public void mostrarInformacion(){
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Correo: " + correo);
        System.out.println(activo ? "Estado: Activo" : "Estado: No Activo");
        System.out.println("-----------------------------------");
    }


}