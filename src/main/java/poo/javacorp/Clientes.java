package poo.javacorp;

public class Clientes extends Usuarios{
    private String dni;

    public Clientes(String nombre, String correoElectronico, String clave, String calleDireccion, int numeroDireccion,
            int cpDireccion, String ciudadDireccion, int telefono, String dni) {
        super(nombre, correoElectronico, clave, calleDireccion, numeroDireccion, cpDireccion, ciudadDireccion, telefono);
        this.dni = dni;
    }


    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "{" +
            " dni='" + getDni() + "'" +
            "}";
    }
}

   
