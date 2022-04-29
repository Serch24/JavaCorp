package poo.javacorp;

public class Usuarios {
    private String nombre;
    private String correoElectronico;
    private String clave;
    private String calleDireccion;
    private int numeroDireccion;
    private int cpDireccion;
    private String ciudadDireccion;
    private int telefono;

    public Usuarios(String nombre, String correoElectronico, String clave, String calleDireccion, int numeroDireccion, int cpDireccion, String ciudadDireccion, int telefono) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.clave = clave;
        this.calleDireccion = calleDireccion;
        this.numeroDireccion = numeroDireccion;
        this.cpDireccion = cpDireccion;
        this.ciudadDireccion = ciudadDireccion;
        this.telefono = telefono;
    }

}
