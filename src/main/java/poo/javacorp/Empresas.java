package poo.javacorp;

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
        private String caducidadTrj;


	public Empresas(String nombre, String correoElectronico, String clave, String calleDireccion, int numeroDireccion,
		int cpDireccion, String ciudadDireccion, int telefono, String titularTrj, String numeroTrj, String caducidadTrj, String cfi, String web) {
		super(nombre, correoElectronico, clave, calleDireccion, numeroDireccion, cpDireccion, ciudadDireccion, telefono, titularTrj, numeroTrj, caducidadTrj);
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
                this.caducidadTrj = caducidadTrj;
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
        public String getCaducidadTrj(){
            return caducidadTrj;
        }
        
        @Override
        public void setCaducidadTrj(String caducidadTrj){
            this.caducidadTrj = caducidadTrj;
        }

	@Override
	public String toString() {
		return "Empresas{" + "cfi=" + cfi + ", web=" + web + ", nombre=" + nombre + ", correoElectronico=" 
                        + correoElectronico + ", clave=" + clave + ", calleDireccion=" + calleDireccion + ", numeroDireccion=" 
                        + numeroDireccion + ", cpDireccion=" + cpDireccion + ", ciudadDireccion=" + ciudadDireccion + ", telefono=" 
                        + telefono + ", titularTrj=" + titularTrj + ", numeroTrj=" + numeroTrj + ", caducidadTrj=" + caducidadTrj +'}';
	}

	
	

}
