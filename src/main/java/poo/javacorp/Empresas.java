package poo.javacorp;

import java.util.Objects;

public class Empresas extends Usuarios {
	private String cfi;
	private String web;
	private String nombre;
	private String correoElectronico;
	private String clave;
	private String calleDireccion;
	private int numeroDireccion;
	private int cpDireccion;
	private String ciudadDireccion;
	private int telefono;
        private String titularTrj;
        private String numeroTrj;
        private int mesTrj;
        private int añoTrj;


	public Empresas(String nombre, String correoElectronico, String clave, String calleDireccion, int numeroDireccion,
		int cpDireccion, String ciudadDireccion, int telefono, String titularTrj, String numeroTrj, int mesTrj, int añoTrj, String cfi, String web) {
		super(nombre, correoElectronico, clave, calleDireccion, numeroDireccion, cpDireccion, ciudadDireccion, telefono, titularTrj, numeroTrj, mesTrj, añoTrj);
		this.cfi = cfi;
		this.web = web;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.clave = clave;
		this.calleDireccion = calleDireccion;
		this.numeroDireccion = numeroDireccion;
		this.cpDireccion = cpDireccion;
		this.ciudadDireccion = ciudadDireccion;
		this.telefono = telefono;
                this.titularTrj = titularTrj;
                this.numeroTrj = numeroTrj;
                this.mesTrj = mesTrj;
                this.añoTrj = añoTrj;
	}

	public String getCfi() {
		return cfi;
	}

	public void setCfi(String cfi) {
		this.cfi = cfi;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	@Override
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String getClave() {
		return clave;
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String getCalleDireccion() {
		return calleDireccion;
	}

	@Override
	public void setCalleDireccion(String calleDireccion) {
		this.calleDireccion = calleDireccion;
	}

	@Override
	public int getNumeroDireccion() {
		return numeroDireccion;
	}

	@Override
	public void setNumeroDireccion(int numeroDireccion) {
		this.numeroDireccion = numeroDireccion;
	}

	@Override
	public int getCpDireccion() {
		return cpDireccion;
	}

	@Override
	public void setCpDireccion(int cpDireccion) {
		this.cpDireccion = cpDireccion;
	}

	@Override
	public String getCiudadDireccion() {
		return ciudadDireccion;
	}

	@Override
	public void setCiudadDireccion(String ciudadDireccion) {
		this.ciudadDireccion = ciudadDireccion;
	}

	@Override
	public int getTelefono() {
		return telefono;
	}

	@Override
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
        
        @Override
        public String getTitularTrj(){
            return titularTrj;
        }
        
        @Override
        public void setTitularTrj(String titularTrj){
            this.titularTrj = titularTrj;
        }
        
        @Override
        public String getNumeroTrj(){
            return numeroTrj;
        }
        
        @Override
        public void setNumeroTrj(String numeroTrj){
            this.numeroTrj = numeroTrj;
        }
        
        @Override
        public int getMesTrj(){
            return mesTrj;
        }
        
        @Override
        public void setMesTrj(int mesTrj){
            this.mesTrj = mesTrj;
        }
        
        @Override
        public int getAñoTrj(){
            return añoTrj;
        }
        
        @Override
        public void setAñoTrj(int añoTrj){
            this.añoTrj = añoTrj;
        }

	@Override
	public String toString() {
		return "Empresas{" + "cfi=" + cfi + ", web=" + web + ", nombre=" + nombre + ", correoElectronico=" 
                        + correoElectronico + ", clave=" + clave + ", calleDireccion=" + calleDireccion + ", numeroDireccion=" 
                        + numeroDireccion + ", cpDireccion=" + cpDireccion + ", ciudadDireccion=" + ciudadDireccion + ", telefono=" 
                        + telefono + ", titularTrj=" + titularTrj + ", numeroTrj=" + numeroTrj + ", caducidadTrj=" + mesTrj + "/" + añoTrj +'}';
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 97 * hash + Objects.hashCode(this.cfi);
		hash = 97 * hash + Objects.hashCode(this.web);
		hash = 97 * hash + Objects.hashCode(this.nombre);
		hash = 97 * hash + Objects.hashCode(this.correoElectronico);
		hash = 97 * hash + Objects.hashCode(this.clave);
		hash = 97 * hash + Objects.hashCode(this.calleDireccion);
		hash = 97 * hash + this.numeroDireccion;
		hash = 97 * hash + this.cpDireccion;
		hash = 97 * hash + Objects.hashCode(this.ciudadDireccion);
		hash = 97 * hash + this.telefono;
		hash = 97 * hash + Objects.hashCode(this.titularTrj);
		hash = 97 * hash + Objects.hashCode(this.numeroTrj);
		hash = 97 * hash + this.mesTrj;
		hash = 97 * hash + this.añoTrj;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Empresas other = (Empresas) obj;
		if (this.numeroDireccion != other.numeroDireccion) {
			return false;
		}
		if (this.cpDireccion != other.cpDireccion) {
			return false;
		}
		if (this.telefono != other.telefono) {
			return false;
		}
		if (this.mesTrj != other.mesTrj) {
			return false;
		}
		if (this.añoTrj != other.añoTrj) {
			return false;
		}
		if (!Objects.equals(this.cfi, other.cfi)) {
			return false;
		}
		if (!Objects.equals(this.web, other.web)) {
			return false;
		}
		if (!Objects.equals(this.nombre, other.nombre)) {
			return false;
		}
		if (!Objects.equals(this.correoElectronico, other.correoElectronico)) {
			return false;
		}
		if (!Objects.equals(this.clave, other.clave)) {
			return false;
		}
		if (!Objects.equals(this.calleDireccion, other.calleDireccion)) {
			return false;
		}
		if (!Objects.equals(this.ciudadDireccion, other.ciudadDireccion)) {
			return false;
		}
		if (!Objects.equals(this.titularTrj, other.titularTrj)) {
			return false;
		}
		return Objects.equals(this.numeroTrj, other.numeroTrj);
	}



}
