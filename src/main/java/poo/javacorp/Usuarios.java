package poo.javacorp;

import java.io.Serializable;

public abstract class Usuarios implements Serializable{
	private static final long serialVersionUID=1L;  


    public Usuarios(String nombre, String correoElectronico, String clave, String calleDireccion,
            int numeroDireccion, int cpDireccion, String ciudadDireccion, int telefono, String titularTrj, String numeroTrj, int mesTrj, int añoTrj) {
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
        
        public abstract int getMesTrj();
        
        public abstract void setMesTrj(int mesTrj);
        
        public abstract int getAñoTrj();
        
        public abstract void setAñoTrj(int añoTrj);  
        	
	@Override
	public abstract String toString();

	@Override
	public abstract boolean equals(Object obj);

	@Override
	public abstract int hashCode();

}
