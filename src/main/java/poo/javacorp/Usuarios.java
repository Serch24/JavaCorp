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
//    private String titularTrj;
//    private String numeroTrj;
//    private String caducidadTrj;

    public Usuarios(String nombre, String correoElectronico, String clave, String calleDireccion,
            int numeroDireccion, int cpDireccion, String ciudadDireccion, int telefono, String titularTrj, String numeroTrj, String caducidadTrj) {
//        this.nombre = nombre;
//        this.correoElectronico = correoElectronico;
//        this.clave = clave;
//        this.calleDireccion = calleDireccion;
//        this.numeroDireccion = numeroDireccion;
//        this.cpDireccion = cpDireccion;
//        this.ciudadDireccion = ciudadDireccion;
//        this.telefono = telefono;
//        this.titularTrj = titularTrj;
//        this.numeroTrj = numeroTrj;
//        this.caducidadTrj = caducidadTrj;
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
        
        public abstract String getTitularTrj();
        
        public abstract void setTitularTrj(String titularTrj);
        
        public abstract String getNumeroTrj();
        
        public abstract void setNumeroTrj(String numeroTrj);
        
        public abstract String getCaducidadTrj();
        
        public abstract void setCaducidadTrj(String caducidadTrj);
	
	@Override
	public abstract String toString();

}
