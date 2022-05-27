/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import poo.javacorp.Productos;
import poo.javacorp.Usuarios;

public class CarritoDeCompra extends javax.swing.JFrame {

	private HashMap<Usuarios, ArrayList<Productos>> productEnCarrito;
	private String PATH = "src/main/java/ficheros/carritoss.dat";
	private Usuarios usuario;
	public CarritoDeCompra(Usuarios usuario) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.usuario = usuario;
		traerProductos();
		
	}
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Source Han Sans KR Heavy", 2, 18)); // NOI18N
                jLabel1.setText("Carrito de compra");

                jButton1.setText("Volver");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(202, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(63, 63, 63))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
		Loged log = new Loged(usuario);
		this.dispose();
		log.setVisible(true);
		
        }//GEN-LAST:event_jButton1ActionPerformed
	
	private void traerProductos(){
		File archivo = new File(PATH);
		if (!archivo.exists() && !archivo.isFile()) {
			try {
				archivo.createNewFile();
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
			} catch (IOException | ClassNotFoundException e) {
					//
			}
			productEnCarrito.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);
			System.out.println(productEnCarrito.get(usuario).size());
		}
	}
	
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        // End of variables declaration//GEN-END:variables
}
