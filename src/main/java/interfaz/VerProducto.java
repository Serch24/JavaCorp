/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import poo.javacorp.Productos;
import poo.javacorp.Usuarios;


public class VerProducto extends javax.swing.JFrame {
	private Productos producto;
	private Usuarios usuario;
	private HashMap<Usuarios, ArrayList<Productos>> productEnCarrito;
	private String PATH = "src/main/java/ficheros/carritoss.dat";
	
	public VerProducto(Productos producto, Usuarios usuario) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.producto = producto;
		this.usuario = usuario;
		this.productEnCarrito = new HashMap<>();
		mostrarProducto();
	}
	
	public boolean hayStock(int cantidad){
		boolean stock = false;
		File archivo = new File(PATH);
		
		if(!archivo.exists() && !archivo.isFile()){
			try {
				archivo.createNewFile();
				stock = producto.getStockCantidad() >= cantidad;
			} catch (IOException ex) {
				System.out.println(ex);
			}
		}else{
			// se recogen todos los productos y se almacenan en la variable "productEnCarrito"
			try {
			    FileInputStream tmp = new FileInputStream(PATH);
			    ObjectInputStream aa = new ObjectInputStream(tmp);
			    productEnCarrito = (HashMap<Usuarios, ArrayList<Productos>>) aa.readObject();
			    tmp.close();
			    aa.close();
			} catch (IOException | ClassNotFoundException e) {
				stock = producto.getStockCantidad() >= cantidad;
			}

			int totalStockDelProducto = productEnCarrito.entrySet().stream().filter(lista -> lista.getValue().contains(producto)).map(Map.Entry::getValue).toList()
				.stream()
				.map(a -> a.stream()
					.filter(p -> p.equals(producto))
					.findFirst())
				.mapToInt(t -> t.get().getStockCantidad())
				.sum();
			
			//System.out.println("Total cantidad : " + totalStockDelProducto + "\n" + "cantidad del producto: " + producto.getStockCantidad());
			if((producto.getStockCantidad() - totalStockDelProducto) >= cantidad){
				stock = true;
			}
		}
		
		return stock;
	}

	public boolean guardarProductoAcarrito(int cantidad){
		boolean guardado = false;
		
		Productos proTmp = new Productos(producto);
		ArrayList<Productos> listaProductos = new ArrayList<>();
		ArrayList<Productos> tmpProd;

		if(!productEnCarrito.isEmpty() && productEnCarrito.containsKey(usuario)){
			boolean hayProducto = productEnCarrito.entrySet()
						.stream()
						.filter(user -> user.getKey().equals(usuario))
						.filter(lista -> lista.getValue().contains(producto))
						.findFirst().isPresent();
			
			listaProductos = productEnCarrito.entrySet()
						.stream()
						.filter(user -> user.getKey().equals(usuario))
						.findFirst().get().getValue();
			
			if(!listaProductos.isEmpty()){
				if(!hayProducto){
					proTmp.setStockCantidad(cantidad);
				}else{
					int stockA = productEnCarrito.entrySet()
								.stream()
								.filter(user -> user.getKey().equals(usuario))
								.filter(lista -> lista.getValue().contains(producto))
								.findFirst().get().getValue().stream().filter(p -> p.equals(producto)).mapToInt(a -> a.getStockCantidad()).sum();
					proTmp.setStockCantidad(stockA + cantidad);
					
					listaProductos =  productEnCarrito.entrySet()
										.stream()	
										.filter(user -> user.getKey().equals(usuario))	
										.findFirst()
										.get()
										.getValue();
					
					// se nececita el doble filtro por separado porque junto no funcionaba, no se por qu?? xd
					tmpProd = new ArrayList<>(listaProductos.stream().filter(pr -> !pr.equals(producto)).collect(Collectors.<Productos>toList()));
					listaProductos = tmpProd;
				}
			}else{
				proTmp.setStockCantidad(cantidad);
			}
		}else{
			proTmp.setStockCantidad(cantidad);
		}
		
		listaProductos.add(proTmp);
		
		try {
			productEnCarrito.put(usuario, listaProductos);
			//se guarda el objeto en un fichero y se cierran los streams.
			FileOutputStream tmp = new FileOutputStream(PATH, false);
			ObjectOutputStream aa = new ObjectOutputStream(tmp);
			aa.writeObject(productEnCarrito);
			tmp.close();
			aa.close();
			tmp.flush();
			aa.flush();
			guardado = true;
			
		} catch (FileNotFoundException ex) {
			guardado = false;
		} catch (IOException ex) {
			guardado = false;
		}
		
		return guardado;
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                imagenProducto = new javax.swing.JLabel();
                addCarrito = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                cantidadText = new javax.swing.JTextField();
                errorLabel = new javax.swing.JLabel();
                botonVolver = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                opinionTexarea = new javax.swing.JTextArea();
                jLabel2 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                caracteristicaProducto = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                addCarrito.setText("A??adir al carrito");
                addCarrito.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addCarritoActionPerformed(evt);
                        }
                });

                jLabel1.setText("Cantidad: ");

                cantidadText.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                cantidadTextKeyTyped(evt);
                        }
                });

                botonVolver.setText("Volver");
                botonVolver.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botonVolverActionPerformed(evt);
                        }
                });

                opinionTexarea.setColumns(20);
                opinionTexarea.setRows(5);
                jScrollPane1.setViewportView(opinionTexarea);

                jLabel2.setFont(new java.awt.Font("Source Han Sans KR Heavy", 2, 12)); // NOI18N
                jLabel2.setText("Opini??n");

                caracteristicaProducto.setBackground(new java.awt.Color(204, 204, 255));
                jScrollPane2.setViewportView(caracteristicaProducto);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(214, 214, 214)
                                                .addComponent(imagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(239, 239, 239)
                                                .addComponent(jLabel1)
                                                .addGap(30, 30, 30)
                                                .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(108, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(181, 181, 181)
                                                                .addComponent(addCarrito))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(83, 83, 83))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(140, 140, 140))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(imagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(errorLabel)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addCarrito)
                                        .addComponent(botonVolver))
                                .addGap(30, 30, 30))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void addCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarritoActionPerformed
		// TODO add your handling code here:

		int cantidadProducto = Integer.parseInt(cantidadText.getText());
		//hayStock(cantidadProducto);
		//guardarProductoAcarrito(cantidadProducto);
		if(!hayStock(cantidadProducto)){
			errorLabel.setText("No hay stock suficiente, por favor reduzca la cantidad.");
			errorLabel.setForeground(new java.awt.Color(255,0,0)); // el texto se pone en rojo
		}else{
			if(guardarProductoAcarrito(cantidadProducto)){
				JOptionPane.showMessageDialog(this, "??Producto a??adido al carrito!", "carrito de compra", JOptionPane.INFORMATION_MESSAGE);
				Loged volver = new Loged(usuario);
				this.dispose();
				volver.setVisible(true);
			}else{
				System.out.println("algo ha pasado!");
			}
		}
        }//GEN-LAST:event_addCarritoActionPerformed

        private void cantidadTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadTextKeyTyped

		// TODO add your handling code here:
		char c = evt.getKeyChar();
		if(c<'0' || c>'9') evt.consume();
		
        }//GEN-LAST:event_cantidadTextKeyTyped

        private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
		Loged volver = new Loged(usuario);
		this.dispose();
		volver.setVisible(true);
		// TODO add your handling code here:
        }//GEN-LAST:event_botonVolverActionPerformed

	private void mostrarProducto(){
		System.out.println(producto);
		ImageIcon i = new ImageIcon(producto.getFotografia());
		Image aux = i.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
		i = new ImageIcon(aux);
		imagenProducto.setIcon(i);
		caracteristicaProducto.setText(producto.getCaracteristicas());
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addCarrito;
        private javax.swing.JButton botonVolver;
        private javax.swing.JTextField cantidadText;
        private javax.swing.JLabel caracteristicaProducto;
        private javax.swing.JLabel errorLabel;
        private javax.swing.JLabel imagenProducto;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTextArea opinionTexarea;
        // End of variables declaration//GEN-END:variables

}
