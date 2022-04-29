package poo.javacorp;


public class Empresas extends Usuarios{
    private String cfi;
    private String web;

    public Empresas(String nombre, String correoElectronico, String clave, String calleDireccion, int numeroDireccion,
            int cpDireccion, String ciudadDireccion, int telefono, String cfi, String web) {
        super(nombre, correoElectronico, clave, calleDireccion, numeroDireccion, cpDireccion, ciudadDireccion, telefono);
        this.cfi = cfi;
        this.web = web;
    }

    public String getCfi() {
        return this.cfi;
    }

    public void setCfi(String cfi) {
        this.cfi = cfi;
    }

    public String getWeb() {
        return this.web;
    }

    public void setWeb(String web) {
        this.web = web;
    }


    @Override
    public String toString() {
        return "{" +
            " cfi='" + getCfi() + "'" +
            ", web='" + getWeb() + "'" +
            "}";
    }

}
