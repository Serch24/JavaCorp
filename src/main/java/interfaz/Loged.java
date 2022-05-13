package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import poo.javacorp.CategoriaProductos;
import poo.javacorp.Productos;
import poo.javacorp.Usuarios;


public class Loged extends javax.swing.JFrame {
	Usuarios usuario;
	String imagenes = "src/main/java/imagenes/";
	ArrayList<Productos> todosLosProductos = new ArrayList<>();
	
	public Loged(Usuarios usuarioLoged) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.usuario = usuarioLoged;
		this.rellenarCategoria();
	}
	
	public void rellenarCategoria(){
		buscarCategorias.removeAllItems();
		
		for (CategoriaProductos categoria : CategoriaProductos.values()) {
			buscarCategorias.addItem(categoria + "");
		}
	}
	
	//Este metodo solo se usó para crear los productos
	public void crearProductos(){ 
		
		String path = "src/main/java/ficheros/productoss.dat";
		
		Productos primero = new Productos("Asus", "Es un pc muy rapido.", 1000, 4, LocalDate.now(), CategoriaProductos.ORDENADORES, imagenes + "azul.png");
		Productos segundo = new Productos("xbox", "Nueva consola, super moderna.", 400, 5, LocalDate.now(), CategoriaProductos.COSOLASVIDEOJUEGOS, imagenes + "xbox.png");
		
		File archivo = new File(path);
		if(!archivo.exists() && !archivo.isFile()){
			
			try {
				archivo.createNewFile();
				
			} catch (IOException ex) {
				System.out.println(ex);
			}
		}else{
			
			// se recogen todos los productos y se almacenan en la variable "todosLosProductos"
			try {
				FileInputStream tmp = new FileInputStream(path);
				ObjectInputStream aa = new ObjectInputStream(tmp);
				todosLosProductos = (ArrayList<Productos>) aa.readObject();
				tmp.close();
				aa.close();	
			} catch (IOException | ClassNotFoundException e) {
				System.out.println(e);
			}
		}
		
		try {
			//Se agregan los diferentes Productos al ArrayList.
			todosLosProductos.add(primero);
			todosLosProductos.add(segundo);
			
			//se guarda el objeto en un fichero y se cierran los sreams.
			FileOutputStream tmp = new FileOutputStream(path,false);
			ObjectOutputStream aa = new ObjectOutputStream(tmp);
			aa.writeObject(todosLosProductos);
			tmp.close();
			tmp.flush();
			aa.close();
			
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		System.out.println(todosLosProductos);
		
		
	}
	
	public void listarProductos(){
		String path = "src/main/java/ficheros/productos.dat";
		FileInputStream op;
		try {
			op = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(op);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Loged.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(Loged.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                bienv = new javax.swing.JLabel();
                buscarCategorias = new javax.swing.JComboBox<>();
                barraBusqueda = new javax.swing.JTextField();
                BotonBusqueda = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                bienv.setText("Buscar por:");

                buscarCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                buscarCategorias.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buscarCategoriasActionPerformed(evt);
                        }
                });

                BotonBusqueda.setText("Buscar");
                BotonBusqueda.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BotonBusquedaActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(bienv)
                                .addGap(38, 38, 38)
                                .addComponent(buscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(BotonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bienv)
                                        .addComponent(buscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BotonBusqueda))
                                .addContainerGap(399, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void buscarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCategoriasActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_buscarCategoriasActionPerformed

        private void BotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_BotonBusquedaActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BotonBusqueda;
        private javax.swing.JTextField barraBusqueda;
        private javax.swing.JLabel bienv;
        private javax.swing.JComboBox<String> buscarCategorias;
        // End of variables declaration//GEN-END:variables
}
