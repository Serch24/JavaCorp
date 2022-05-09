package interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import poo.javacorp.CategoriaProductos;
import poo.javacorp.Usuarios;


public class Loged extends javax.swing.JFrame {
	Usuarios usuario;
	
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


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BotonBusqueda;
        private javax.swing.JTextField barraBusqueda;
        private javax.swing.JLabel bienv;
        private javax.swing.JComboBox<String> buscarCategorias;
        // End of variables declaration//GEN-END:variables
}
