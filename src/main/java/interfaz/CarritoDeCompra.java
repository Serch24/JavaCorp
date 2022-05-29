/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import poo.javacorp.Productos;
import poo.javacorp.Usuarios;
import java.time.*;


public class CarritoDeCompra extends javax.swing.JFrame {

	private HashMap<Usuarios, ArrayList<Productos>> productEnCarrito;
	private String PATH = "src/main/java/ficheros/carritoss.dat";
	private Usuarios usuario;
	private ArrayList<Productos> todosLosProductos;
	private double totalSaldo;
	
	
	public CarritoDeCompra(Usuarios usuario) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.usuario = usuario;
		if(!traerProductos()){
			mostrarProducto();
		}else{
			System.out.println("No hay nada en tu carrito dude");
		}
	}
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                tituloGrande = new javax.swing.JLabel();
                botonVolver = new javax.swing.JButton();
                elScroll = new javax.swing.JScrollPane();
                panel = new javax.swing.JPanel();
                botonComprar = new javax.swing.JButton();
                totalProductos = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                tituloGrande.setFont(new java.awt.Font("Source Han Sans KR Heavy", 2, 18)); // NOI18N
                tituloGrande.setText("Carrito de compra");

                botonVolver.setText("Volver");
                botonVolver.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botonVolverActionPerformed(evt);
                        }
                });

                panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));
                elScroll.setViewportView(panel);

                botonComprar.setText("Comprar");
                botonComprar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botonComprarActionPerformed(evt);
                        }
                });

                totalProductos.setFont(new java.awt.Font("Source Han Sans KR Heavy", 2, 12)); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(302, 302, 302)
                                                .addComponent(tituloGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(totalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(89, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(botonVolver)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(botonComprar))
                                                        .addComponent(elScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(103, 103, 103))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(tituloGrande)
                                .addGap(39, 39, 39)
                                .addComponent(elScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
                // TODO add your handling code here:
		Loged log = new Loged(usuario);
		this.dispose();
		log.setVisible(true);
		
        }//GEN-LAST:event_botonVolverActionPerformed

        private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed
		FileInputStream in = null;
		String pathProductos = "src/main/java/ficheros/productoss.dat";
		ArrayList<Productos> auxProd = new ArrayList<>();
		
		try {
			in = new FileInputStream(pathProductos);
			ObjectInputStream aa = new ObjectInputStream(in);
			todosLosProductos = (ArrayList<Productos>)aa.readObject();
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
		recibo(productEnCarrito);
		// se resta el stock a los productos que se han comprado
		for (Productos tProductos : todosLosProductos) {
			for (Map.Entry<Usuarios, ArrayList<Productos>> entry : productEnCarrito.entrySet()) {
				if(entry.getKey().equals(usuario)){
					ArrayList<Productos> tmpP = entry.getValue();
					for (Productos product : tmpP) {
						if(tProductos.equals(product)){
							int stockArestar = product.getStockCantidad();
							int stockViejo = tProductos.getStockCantidad();
							tProductos.setStockCantidad(stockViejo-stockArestar);
						}
					}
				}
			}
		}
		
		// elimina los productos que tengan stock 0
		ArrayList<Productos> tmpArr = new ArrayList<>(todosLosProductos.stream().filter(p -> p.getStockCantidad() > 0).collect(Collectors.<Productos>toList()));
		todosLosProductos = tmpArr;
		
		// elimina el carrito
		productEnCarrito.remove(usuario);
		
		// se guarda la información de todos los productos actualizada.
		try{
			FileOutputStream tmp = new FileOutputStream(pathProductos,false);
			ObjectOutputStream aa = new ObjectOutputStream(tmp);
			aa.writeObject(todosLosProductos);
			tmp.close();
			tmp.flush();
			aa.close();
			aa.flush();
			
			FileOutputStream dos = new FileOutputStream(PATH, false);
			ObjectOutputStream doss = new ObjectOutputStream(dos);
			doss.writeObject(productEnCarrito);
			dos.close();
			doss.close();
			dos.flush();
			doss.flush();
		}catch(FileNotFoundException ex){
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		JOptionPane.showMessageDialog(this, "Has comprado todos los productos, felicidades!\n El recibo de la compa se ha generado", "Compra hecha", JOptionPane.INFORMATION_MESSAGE);
		
		Loged log = new Loged(usuario);
		this.dispose();
		log.setVisible(true);
		
        }//GEN-LAST:event_botonComprarActionPerformed
	
	public void addPrecioTotaltolabel(){
		int gastoEnvio = 5;
		totalSaldo = productEnCarrito.entrySet().stream().filter(c -> c.getKey().equals(usuario)).map(p -> p.getValue().stream().map(a -> a)).findFirst().get().mapToDouble(sum -> (sum.getPrecio() * sum.getStockCantidad())).sum();
		totalProductos.setText("Saldo total de " + (totalSaldo + gastoEnvio) + "€. Incluido gastos de envío.");
	}
	
	public void recibo(HashMap<Usuarios, ArrayList<Productos>> losProductos){
		String ruta = "src/main/java/ficheros/recibo_" + usuario.getNombre() + "_"+ Math.random() + ".txt";
		File recibo = new File(ruta);
		try {	
			if(recibo.createNewFile()){
				PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(ruta)));
				salida.println("Fecha de venta: " + LocalDate.now());
				salida.println("Productos:\n");
				for (Map.Entry<Usuarios, ArrayList<Productos>> entry : losProductos.entrySet()) {
					if(entry.getKey().equals(usuario)){ 
						for (Productos product : entry.getValue()) {
							Object key = entry.getKey();
							Object val = entry.getValue();
							salida.println("Nombres: " + product.getTitulo());
							salida.println("Cantidad: " + product.getStockCantidad());
							salida.println("precio €/ud: " + product.getPrecio());
							salida.println("\n");
						}
					}
				}
				salida.println("Valor total de la compra: " + (totalSaldo + 5) + "€\n");
				
				salida.println("Datos del comprador: \n");
				salida.println("Nombre: " + usuario.getNombre());
				salida.println("Telefono: " + usuario.getTelefono());
				salida.println("Ciudad: " + usuario.getCiudadDireccion());
				salida.println("Dirreción: " + usuario.getCalleDireccion());
				salida.close();
			}
			
		} catch (IOException ex) {
			System.out.println(ex);
		}
		guardarVenta(LocalDateTime.now(), losProductos);
		
	}
	
	public void guardarVenta(LocalDateTime fech, HashMap<Usuarios, ArrayList<Productos>> losProductos){
		HashMap<LocalDateTime, HashMap<Usuarios, ArrayList<Productos>>> a = new HashMap<>();
		HashMap<Usuarios, ArrayList<Productos>> productosDelUsuario = new HashMap<>();	
		productosDelUsuario.put(usuario, losProductos.get(usuario));
		a.put(fech, productosDelUsuario);
		
		try {
			//se guarda el objeto en un fichero y se cierran los streams.
			FileOutputStream tmp = new FileOutputStream("src/main/java/ficheros/ventass.dat", false);
			ObjectOutputStream aa = new ObjectOutputStream(tmp);
			aa.writeObject(a);
			tmp.close();
			aa.close();
			tmp.flush();
			aa.flush();
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
	
	private void mostrarProducto(){
		for (Map.Entry<Usuarios, ArrayList<Productos>> entry : productEnCarrito.entrySet()) {
			Usuarios tmp = entry.getKey();
			if(tmp.equals(usuario)){
				for (Productos product : entry.getValue()) {
					ImageIcon i = new ImageIcon(product.getFotografia());
					Image aux = i.getImage().getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
					i = new ImageIcon(aux);
					JLabel test = new JLabel(product.getCaracteristicas(),i, SwingConstants.RIGHT);
					JLabel cant = new JLabel("Cantidad: "+product.getStockCantidad());
					JLabel precio = new JLabel("Precio: "+product.getPrecio() + "€");
					panel.add(test);
					panel.add(cant);
					panel.add(precio);
					panel.add(Box.createRigidArea(new Dimension(0, 10)));
					pack();
				}
			}
		}
		addPrecioTotaltolabel();
			
		
	}
	
	private boolean traerProductos(){
		File archivo = new File(PATH);
		boolean vacio = true;
		if (!archivo.exists() && !archivo.isFile()) {
			try {
				archivo.createNewFile();
				vacio = true;
			} catch (IOException ex) {
				System.out.println(ex);
			}
		}else{
			try {
				FileInputStream tmp = new FileInputStream(PATH);
				ObjectInputStream aa = new ObjectInputStream(tmp);
				productEnCarrito = (HashMap<Usuarios, ArrayList<Productos>>) aa.readObject();
				tmp.close();
				aa.close();
				vacio = productEnCarrito.isEmpty();
			} catch (IOException | ClassNotFoundException e) {
					vacio = true;
			}
		}
		
		return vacio;
	}
	
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton botonComprar;
        private javax.swing.JButton botonVolver;
        private javax.swing.JScrollPane elScroll;
        private javax.swing.JPanel panel;
        private javax.swing.JLabel tituloGrande;
        private javax.swing.JLabel totalProductos;
        // End of variables declaration//GEN-END:variables
}
