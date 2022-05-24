/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import poo.javacorp.Productos;
import poo.javacorp.Usuarios;


public class VerProducto extends javax.swing.JFrame {
	private Productos producto;
	private Usuarios usuario;
	private HashMap<Usuarios, ArrayList<Productos>> productEnCarrito;
	
	public VerProducto(Productos producto, Usuarios usuario) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.producto = producto;
		this.usuario = usuario;
		this.productEnCarrito = new HashMap<>();
		mostrarProducto();
	}
	
	public boolean guardarProductoAcarrito(int cantidad){
		
		// falta comprobar cuanta cantidad sobra del producto para actualizar el carrito
		return true;
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                imagenProducto = new javax.swing.JLabel();
                caracteristicaProducto = new javax.swing.JLabel();
                addCarrito = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                cantidadText = new javax.swing.JTextField();
                errorLabel = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                caracteristicaProducto.setBackground(new java.awt.Color(204, 204, 255));

                addCarrito.setText("Añadir al carrito");
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
                                                .addGap(240, 240, 240)
                                                .addComponent(addCarrito))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(229, 229, 229)
                                                .addComponent(jLabel1)
                                                .addGap(30, 30, 30)
                                                .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(104, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(caracteristicaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(104, 104, 104))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(83, 83, 83))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(imagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(caracteristicaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(errorLabel)
                                .addGap(22, 22, 22)
                                .addComponent(addCarrito)
                                .addGap(36, 36, 36))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void addCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarritoActionPerformed
		// TODO add your handling code here:
		int cantidadProducto = Integer.parseInt(cantidadText.getText());
		if( cantidadProducto > producto.getStockCantidad()){
			errorLabel.setText("No hay stock suficiente, por favor reduzca la cantidad.");
			errorLabel.setForeground(new java.awt.Color(255,0,0));
		}else{	
			if(guardarProductoAcarrito(cantidadProducto)){
				Loged volver = new Loged(usuario);
				this.dispose();
				volver.setVisible(true);
			}else{
				System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			}
			
		}
		
        }//GEN-LAST:event_addCarritoActionPerformed

        private void cantidadTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadTextKeyTyped

		// TODO add your handling code here:
		char c = evt.getKeyChar();
		if(c<'0' || c>'9') evt.consume();
		
        }//GEN-LAST:event_cantidadTextKeyTyped

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
        private javax.swing.JTextField cantidadText;
        private javax.swing.JLabel caracteristicaProducto;
        private javax.swing.JLabel errorLabel;
        private javax.swing.JLabel imagenProducto;
        private javax.swing.JLabel jLabel1;
        // End of variables declaration//GEN-END:variables

}
