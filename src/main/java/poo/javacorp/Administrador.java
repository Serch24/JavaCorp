package poo.javacorp;

public class Administrador extends Usuarios{
    private String dni;
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
        
        public Administrador(String nombre, String correoElectronico, String clave, String calleDireccion, 
                int numeroDireccion, int cpDireccion, String ciudadDireccion, int telefono, String titularTrj, String numeroTrj, String caducidadTrj, String dni){
                super(nombre, correoElectronico, clave, calleDireccion, numeroDireccion, cpDireccion, ciudadDireccion, telefono, titularTrj, numeroTrj, caducidadTrj);
                this.dni = dni;
                this.nombre = nombre;
                this.correoElectronico = correoElectronico;
                this.clave = clave;
                this.calleDireccion = calleDireccion;
                this.numeroDireccion = numeroDireccion;
                this.cpDireccion = cpDireccion;
                this.ciudadDireccion = ciudadDireccion;
                this.telefono = telefono;
                    
        }
        
        public String getDni(){
            return this.dni;
        }
        
        public void setDni(String dni){
            this.dni = dni;
        }
        
    @Override
        public String getNombre(){
            return nombre;
        }
        
    @Override
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        
    @Override
        public String getCorreoElectronico(){
            return correoElectronico;
        }
        
    @Override
        public void setCorreoElectronico(String correoElectronico){
            this.correoElectronico = correoElectronico;
        }
        
    @Override
        public String getClave(){
            return clave;
        }
        
    @Override
        public void setClave(String clave){
            this.clave = clave;
        }
        
    @Override
        public String getCalleDireccion(){
            return calleDireccion;
        }
        
    @Override
        public void setCalleDireccion(String calleDireccion){
            this.calleDireccion = calleDireccion;
        }
        
    @Override
        public int getNumeroDireccion(){
            return numeroDireccion;
        }
        
    @Override
        public void setNumeroDireccion(int numeroDireccion){
            this.numeroDireccion = numeroDireccion;
        }
        
    @Override
        public int getCpDireccion(){
            return cpDireccion;
        }
        
    @Override
        public void setCpDireccion(int cpDireccion){
            this.cpDireccion = cpDireccion;
        }
        
    @Override
        public String getCiudadDireccion(){
            return ciudadDireccion;
        }
        
    @Override
        public void setCiudadDireccion(String ciudadDireccion){
            this.ciudadDireccion = ciudadDireccion;
        }
        
    @Override
        public int getTelefono(){
            return telefono;
        }
        
    @Override
        public void setTelefono(int telefono){
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
        return "Administrador{" + "dni=" + dni + ", nombre=" + nombre + ", correoElectronico=" 
                + correoElectronico + ", clave=" + clave + ", calleDireccion=" + calleDireccion + ", numeroDireccion=" 
                + numeroDireccion + ", cpDireccion=" + cpDireccion + ", ciudadDireccion=" + ciudadDireccion + ", telefono=" 
                + telefono + ", titularTrj=" + titularTrj + ", numeroTrj=" + numeroTrj + ", caducidadTrj=" + caducidadTrj + '}';
    }
 
    
}
