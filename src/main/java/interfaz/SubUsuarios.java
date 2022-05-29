/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaz;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import poo.javacorp.Clientes;
import poo.javacorp.Empresas;
import poo.javacorp.Usuarios;

/**
 *
 * @author s3rzh
 */
public class SubUsuarios extends javax.swing.JInternalFrame {
	public boolean activo;
	private HashMap<String, Usuarios> todosLosUsuarios = new HashMap<>();
	private Usuarios usuario;
	
	public SubUsuarios(Usuarios usuario) {
		initComponents();
		this.usuario = usuario;
		activo = true;
		traerUsuarios();
		pintarUsuarios();
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                panelUsuarios = new javax.swing.JPanel();

                setClosable(true);
                setTitle("Usuarios");
                addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
                        public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                        }
                        public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                        }
                        public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                                formInternalFrameClosing(evt);
                        }
                        public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
                        }
                        public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
                        }
                        public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
                        }
                        public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                        }
                });

                jScrollPane1.setBorder(null);

                panelUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
                panelUsuarios.setLayout(new javax.swing.BoxLayout(panelUsuarios, javax.swing.BoxLayout.Y_AXIS));
                jScrollPane1.setViewportView(panelUsuarios);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(44, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
		
		activo = false;
		this.dispose();
		
        }//GEN-LAST:event_formInternalFrameClosing

	private void traerUsuarios(){
		String path = "src/main/java/ficheros/usuarioss.dat";
		File archivo = new File(path);
		if(!archivo.exists() && !archivo.isFile()){
			try {
				archivo.createNewFile();
			} catch (IOException ex) {
				System.out.println(ex);
			}
		}else{
			// se recogen los usuarios y se almacenan en la variable "todos LosUsarios"
			try {
				FileInputStream tmp = new FileInputStream(path);
				ObjectInputStream aa = new ObjectInputStream(tmp);
				this.todosLosUsuarios = (HashMap<String, Usuarios>) aa.readObject();
				// se elimina el mismo usuario administrador para no interferir en los "for" que se hagan a futuro.
				this.todosLosUsuarios.remove(usuario.getCorreoElectronico());
				tmp.close();
				aa.close();	
			} catch (IOException | ClassNotFoundException e) {
				System.out.println(e);
			}
		}
	}
	
	private void pintarUsuarios(){
		int i = 1;
		for (Map.Entry<String, Usuarios> usuarios : todosLosUsuarios.entrySet()) {
			Usuarios unUsuario = usuarios.getValue();
			JLabel iL = new JLabel("Nº: "+ i);
			JLabel nombre = new JLabel("Nombre: "+unUsuario.getNombre());
			JLabel correo = new JLabel("Correo: "+unUsuario.getCorreoElectronico());
			JLabel tel = new JLabel("Telefono: "+unUsuario.getTelefono());
			JLabel ciudad = new JLabel("Ciudad: "+unUsuario.getCiudadDireccion());
			JLabel cp = new JLabel("Código postal: "+ unUsuario.getCpDireccion());
			JLabel calle = new JLabel("Dirreción: "+unUsuario.getCalleDireccion() + " "+unUsuario.getNumeroDireccion());
			
			panelUsuarios.add(iL);
			panelUsuarios.add(Box.createRigidArea(new Dimension(0, 5)));
			panelUsuarios.add(nombre);
			if(unUsuario instanceof Clientes){
				JLabel dni = new JLabel("Dni: "+((Clientes) unUsuario).getDni());
				panelUsuarios.add(dni);
			}
			if(unUsuario instanceof Empresas){
				JLabel cif = new JLabel("Cif: "+((Empresas) unUsuario).getCfi());
				JLabel web = new JLabel("Web: "+((Empresas) unUsuario).getWeb());
				panelUsuarios.add(cif);
				panelUsuarios.add(web);
			}
			panelUsuarios.add(correo);
			panelUsuarios.add(tel);
			panelUsuarios.add(ciudad);
			panelUsuarios.add(cp);
			panelUsuarios.add(calle);
			panelUsuarios.add(Box.createRigidArea(new Dimension(0, 10)));
			i++;
		}
		//pack();
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JPanel panelUsuarios;
        // End of variables declaration//GEN-END:variables
}
