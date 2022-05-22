package poo.javacorp;

import java.time.LocalDate;
import java.io.Serializable;
import java.util.ArrayList;

public class Productos implements Serializable {
	private static final long serialVersionUID=1L;  
	private String titulo;
	private String caracteristicas;
	private double precio;
	private int stockCantidad;
	private LocalDate entradaTienda;
	private ArrayList<Integer> opiniones1_5;
	private ArrayList<String> opinionesComentario;
	private ArrayList<LocalDate> opinionesFecha;
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
		this.opiniones1_5 = new ArrayList<>();
		this.opinionesComentario = new ArrayList<>();
		this.opinionesFecha = new ArrayList<>();
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


	public ArrayList<Integer> getOpiniones1_5() {
		return opiniones1_5;
	}
	
	public int mediaDeOpiniones(){
		int suma = opiniones1_5.stream().reduce(0, (a,b) -> a + b);
		
		return suma / opiniones1_5.size();
	}

	public void addCalificacion(int unoAlcinco) {
		this.opiniones1_5.add(unoAlcinco);
	}

	public ArrayList<String> getOpinionesComentario() {
		return opinionesComentario;
	}

	public void addCalificacion(String opinion) {
		this.opinionesComentario.add(opinion);
	}

	public ArrayList<LocalDate> getOpinionesFecha() {
		return opinionesFecha;
	}

	public void addCalificacion(LocalDate fecha) {
		this.opinionesFecha.add(fecha);
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