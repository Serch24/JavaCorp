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
   private String categoria;
   private String[] categorias = {"Componentes","Ordenadores","Móviles y telefonía","TV, audio y fotos", "Consolas y videojuegos"};

    public Productos(String titulo, String caracteristicas, double precio, int stockCantidad, LocalDate entradaTienda) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
        this.stockCantidad = stockCantidad;
        this.entradaTienda = entradaTienda;
        this.categoria = "";
    }

    public void mostrar(){
        for (String cate : categorias) {
            System.out.println(cate);
        }
    }

}