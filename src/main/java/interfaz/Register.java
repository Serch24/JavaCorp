package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import poo.javacorp.Empresas;
import poo.javacorp.Usuarios;


public class Register extends javax.swing.JFrame {
	private Login login;
	private HashMap<String, Usuarios> todosLosUsuarios = new HashMap<>();
			
	public Register() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.webTodo.setVisible(false);
		
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                buttonGroup1 = new javax.swing.ButtonGroup();
                buttonGroup2 = new javax.swing.ButtonGroup();
                jPopupMenu1 = new javax.swing.JPopupMenu();
                jPopupMenu2 = new javax.swing.JPopupMenu();
                jPopupMenu3 = new javax.swing.JPopupMenu();
                jLabel1 = new javax.swing.JLabel();
                NombreUsuario = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                correoUsuario = new javax.swing.JTextField();
                calleUsuario = new javax.swing.JTextField();
                numCalleUsuario = new javax.swing.JTextField();
                cpUsuario = new javax.swing.JTextField();
                ciudadUsuario = new javax.swing.JTextField();
                telUsuario = new javax.swing.JTextField();
                passUsuario = new javax.swing.JPasswordField();
                dniCifUsuario = new javax.swing.JLabel();
                panelTest = new javax.swing.JPanel();
                dniCif = new javax.swing.JLabel();
                dniCifBox = new javax.swing.JTextField();
                checkEmpresa = new javax.swing.JCheckBox();
                registrarBoton = new javax.swing.JButton();
                webTodo = new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                webBox = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Nombre");

                jLabel2.setText("Correo electronico");

                jLabel3.setText("Contraseña");

                jLabel4.setText("Calle");

                jLabel5.setText("Numero de calle");

                jLabel6.setText("Códugo postal");

                jLabel7.setText("Ciudad");

                jLabel8.setText("Telefono");

                correoUsuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                correoUsuarioActionPerformed(evt);
                        }
                });

                panelTest.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentHidden(java.awt.event.ComponentEvent evt) {
                                panelTestComponentHidden(evt);
                        }
                });

                dniCif.setText("Dni");
                dniCif.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentHidden(java.awt.event.ComponentEvent evt) {
                                dniCifComponentHidden(evt);
                        }
                });

                javax.swing.GroupLayout panelTestLayout = new javax.swing.GroupLayout(panelTest);
                panelTest.setLayout(panelTestLayout);
                panelTestLayout.setHorizontalGroup(
                        panelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTestLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(dniCif, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(dniCifBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(100, Short.MAX_VALUE))
                );
                panelTestLayout.setVerticalGroup(
                        panelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTestLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dniCif)
                                        .addComponent(dniCifBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                checkEmpresa.setText("¿Eres una empresa?");
                checkEmpresa.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                checkEmpresaActionPerformed(evt);
                        }
                });

                registrarBoton.setText("Registrarse");
                registrarBoton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                registrarBotonActionPerformed(evt);
                        }
                });

                jLabel9.setText("Web");

                webBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                webBoxActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout webTodoLayout = new javax.swing.GroupLayout(webTodo);
                webTodo.setLayout(webTodoLayout);
                webTodoLayout.setHorizontalGroup(
                        webTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(webTodoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(webBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                );
                webTodoLayout.setVerticalGroup(
                        webTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(webTodoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(webTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(webBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(28, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(checkEmpresa)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addGap(223, 223, 223)
                                                                .addComponent(telUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel7))
                                                                .addGap(171, 171, 171)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ciudadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(calleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(correoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(numCalleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(panelTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(41, 41, 41)
                                                                                                .addComponent(webTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dniCifUsuario)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(registrarBoton)
                                                .addGap(709, 709, 709))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(correoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(panelTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(calleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(numCalleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(ciudadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(telUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(20, 20, 20)
                                                .addComponent(checkEmpresa)
                                                .addGap(18, 18, 18)
                                                .addComponent(registrarBoton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dniCifUsuario))
                                        .addComponent(webTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void correoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoUsuarioActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_correoUsuarioActionPerformed

	public boolean todosLosCamposLlenos() {
		boolean flag = false;

		if (!this.NombreUsuario.getText().equals("") && !this.correoUsuario.getText().equals("") && !this.passUsuario.getText().equals("") && !this.calleUsuario.getText().equals("") && !this.numCalleUsuario.getText().equals("") && !this.cpUsuario.getText().equals("") && !this.ciudadUsuario.getText().equals("") && !this.telUsuario.getText().equals("") && !this.dniCifBox.getText().equals("")) {
			if(this.checkEmpresa.isSelected()){
				if(!this.webBox.getText().equals("")){
					flag = true;
				}
			}else{
				flag = true;
			}
		}

		return flag;
	}


	public boolean guardarObjeto(Usuarios usuario){
		String path = "src/main/java/ficheros/usuarioss.dat";
		boolean flag = false;
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
				tmp.close();
				aa.close();	
			} catch (IOException | ClassNotFoundException e) {
				System.out.println(e);
			}
		}
		
		try {
			//Se agregan los diferentes usuarios al Hashmap.
			this.todosLosUsuarios.put(usuario.getCorreoElectronico(), usuario);
			
			//se guarda el objeto en un fichero y se cierran los sreams.
			FileOutputStream tmp = new FileOutputStream(path,false);
			ObjectOutputStream aa = new ObjectOutputStream(tmp);
			aa.writeObject(this.todosLosUsuarios);
			tmp.close();
			tmp.flush();
			aa.close();
			flag = true;
			
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		return flag;
	}
	
	//Se comprueba que no hayan campos vacios
	private void registrarBotonActionPerformed(java.awt.event.ActionEvent evt) {                                               
		if (todosLosCamposLlenos()) {
			if(this.checkEmpresa.isSelected()){
				Empresas empresaCreada = new Empresas(this.NombreUsuario.getText(), this.correoUsuario.getText(), this.passUsuario.getText(), this.calleUsuario.getText(), Integer.parseInt(this.numCalleUsuario.getText()), Integer.parseInt(this.cpUsuario.getText()), this.ciudadUsuario.getText(), Integer.parseInt(this.telUsuario.getText()), this.dniCifBox.getText(),this.webBox.getText());
				
				if(guardarObjeto(empresaCreada)){
					login = new Login();
					this.dispose();
					login.setVisible(true);
				}else{
					System.out.println("Algo ha pasado");
				}
			}
		}else{
			System.out.println("faltan campos por llenar");
		}
        }  
/*
        private void registrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBotonActionPerformed
        }//GEN-LAST:event_registrarBotonActionPerformed
**/
        private void dniCifComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dniCifComponentHidden
                // TODO add your handling code here:
        }//GEN-LAST:event_dniCifComponentHidden

        private void panelTestComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelTestComponentHidden
                // TODO add your handling code here:
        }//GEN-LAST:event_panelTestComponentHidden

        private void checkEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEmpresaActionPerformed
                if(this.checkEmpresa.isSelected()){
			this.dniCif.setText("CIF");
			this.webTodo.setVisible(true);
		}else{
			this.dniCif.setText("DNI");
			this.webTodo.setVisible(false);
			
		}
        }//GEN-LAST:event_checkEmpresaActionPerformed

        private void webBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webBoxActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_webBoxActionPerformed

	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Register().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField NombreUsuario;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.ButtonGroup buttonGroup2;
        private javax.swing.JTextField calleUsuario;
        private javax.swing.JCheckBox checkEmpresa;
        private javax.swing.JTextField ciudadUsuario;
        private javax.swing.JTextField correoUsuario;
        private javax.swing.JTextField cpUsuario;
        private javax.swing.JLabel dniCif;
        private javax.swing.JTextField dniCifBox;
        private javax.swing.JLabel dniCifUsuario;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPopupMenu jPopupMenu1;
        private javax.swing.JPopupMenu jPopupMenu2;
        private javax.swing.JPopupMenu jPopupMenu3;
        private javax.swing.JTextField numCalleUsuario;
        private javax.swing.JPanel panelTest;
        private javax.swing.JPasswordField passUsuario;
        private javax.swing.JButton registrarBoton;
        private javax.swing.JTextField telUsuario;
        private javax.swing.JTextField webBox;
        private javax.swing.JPanel webTodo;
        // End of variables declaration//GEN-END:variables
}
