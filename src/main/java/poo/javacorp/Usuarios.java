package poo.javacorp;

import java.io.Serializable;

public abstract class Usuarios implements Serializable{
	private static final long serialVersionUID=1L;  
//    private String nombre;
//    private String correoElectronico;
//    private String clave;
//    private String calleDireccion;
//    private int numeroDireccion;
//    private int cpDireccion;
//    private String ciudadDireccion;
//    private int telefono;

    public Usuarios(String nombre, String correoElectronico, String clave, String calleDireccion, int numeroDireccion, int cpDireccion, String ciudadDireccion, int telefono) {
//        this.nombre = nombre;
//        this.correoElectronico = correoElectronico;
//        this.clave = clave;
//        this.calleDireccion = calleDireccion;
//        this.numeroDireccion = numeroDireccion;
//        this.cpDireccion = cpDireccion;
//        this.ciudadDireccion = ciudadDireccion;
//        this.telefono = telefono;
    }


	public abstract String getNombre();

	public abstract void setNombre(String nombre);

	public abstract String getCorreoElectronico();

	public abstract void setCorreoElectronico(String correoElectronico);

	public abstract String getClave();

	public abstract void setClave(String clave);

	public abstract String getCalleDireccion();

	public abstract void setCalleDireccion(String calleDireccion);

	public abstract int getNumeroDireccion();

	public abstract void setNumeroDireccion(int numeroDireccion);

	public abstract int getCpDireccion();

	public abstract void setCpDireccion(int cpDireccion);

	public abstract String getCiudadDireccion();

	public abstract void setCiudadDireccion(String ciudadDireccion);

	public abstract int getTelefono();

	public abstract void setTelefono(int telefono);
	
	@Override
	public abstract String toString();

}
