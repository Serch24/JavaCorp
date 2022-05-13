package poo.javacorp;

import java.time.LocalDate;

public class Productos {
   private String titulo;
   private String caracteristicas;
   private double precio;
   private int stockCantidad;
   private LocalDate entradaTienda;
   private String[] opiniones1_5;
   private String[] opinionesComentario;
   private String[] opinionesFecha;
   private CategoriaProductos categoria;
   private String fotografia;
   
    public Productos(String titulo, String caracteristicas, double precio, int stockCantidad, LocalDate entradaTienda, CategoriaProductos categoria, String fotografia) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
        this.stockCantidad = stockCantidad;
        this.entradaTienda = entradaTienda;
        this.categoria = categoria;
	this.fotografia = fotografia;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStockCantidad() {
		return stockCantidad;
	}


	public LocalDate getEntradaTienda() {
		return entradaTienda;
	}


	public String[] getOpiniones1_5() {
		return opiniones1_5;
	}

	public void setOpiniones1_5(String[] opiniones1_5) {
		this.opiniones1_5 = opiniones1_5;
	}

	public String[] getOpinionesComentario() {
		return opinionesComentario;
	}

	public void setOpinionesComentario(String[] opinionesComentario) {
		this.opinionesComentario = opinionesComentario;
	}

	public String[] getOpinionesFecha() {
		return opinionesFecha;
	}

	public void setOpinionesFecha(String[] opinionesFecha) {
		this.opinionesFecha = opinionesFecha;
	}

	public CategoriaProductos getCategoria() {
		return categoria;
	}


	public String getFotografia() {
		return fotografia;
	}

	@Override
	public String toString() {
		return "Productos{" + "titulo=" + titulo + ", caracteristicas=" + caracteristicas + ", precio=" + precio + ", stockCantidad=" + stockCantidad + ", entradaTienda=" + entradaTienda + ", opiniones1_5=" + opiniones1_5 + ", opinionesComentario=" + opinionesComentario + ", opinionesFecha=" + opinionesFecha + ", categoria=" + categoria + ", fotografia=" + fotografia + '}';
	}
    
	
}