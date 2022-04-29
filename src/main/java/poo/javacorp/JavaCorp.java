/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package poo.javacorp;

import java.time.LocalDate;

/**
 *
 * @author s3rzh
 */
public class JavaCorp {

	public static void main(String[] args) {
		Clientes uno = new Clientes("Sergio", "correoElectronico", "clave", "calleDireccion", 232, 23234, "ciudadDireccion", 2425, "AAA333");
		Empresas dos = new Empresas("Sergio", "correoElectronico", "clave", "calleDireccion", 2323, 233, "ciudadDireccion", 2323, "BBB222", "web@gmail.com");
		Productos tres = new Productos("titulo", "caracteristicas", 323, 24, LocalDate.now());
		tres.mostrar();
	}
}
