package interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import poo.javacorp.Usuarios;
import poo.javacorp.Administrador;

public class Login extends javax.swing.JFrame {
	
	private HashMap<String, Usuarios> todosLosUsuarios = new HashMap<>();

	public Login() {
		initComponents();
	}
	
	// COMPRUEBA CREDENCIALES
	public Usuarios comprobarCredenciales(String usuarioo, String password){
		Usuarios usuario = null;
		boolean existeUsuario;
		String path = "src/main/java/ficheros/usuarioss.dat";
		try {
			FileInputStream fs = new FileInputStream(path); //
			ObjectInputStream ois = new ObjectInputStream(fs);
			this.todosLosUsuarios = (HashMap<String, Usuarios>) ois.readObject(); // se guardan todos los usuarios en el Hashmap.			
			this.todosLosUsuarios.forEach((cadaUsuario, valor) -> System.out.println(cadaUsuario + " = " + valor));
			existeUsuario = this.todosLosUsuarios.entrySet().stream().filter( cadaUsuario -> usuarioo.equals(cadaUsuario.getValue().getCorreoElectronico()) && cadaUsuario.getValue().getClave().equals(password)).findFirst().isEmpty(); // recorre cada usuario que este en el hashmap y lo filtra por el correo y por la contraseña.
				
		} catch (FileNotFoundException ex) {
			existeUsuario = false;
		} catch (IOException | ClassNotFoundException ex) {
			existeUsuario = false;
		}
		if(!existeUsuario){
			try{
				usuario = this.todosLosUsuarios.entrySet().stream().filter( llave -> usuarioo.equals(llave.getValue().getCorreoElectronico())).findFirst().get().getValue();
			}catch(Exception e){
				usuario = null;
			}
		}
		
		return usuario;
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                username = new javax.swing.JTextField();
                botonLogin = new javax.swing.JButton();
                confirmarLogin = new javax.swing.JLabel();
                password = new javax.swing.JPasswordField();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                registrarseBoton = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Login");

                jLabel1.setText("Usuario:");

                jLabel2.setText("Contraseña:");

                username.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                usernameActionPerformed(evt);
                        }
                });

                botonLogin.setText("Entrar");
                botonLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botonLoginActionPerformed(evt);
                        }
                });

                password.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                passwordActionPerformed(evt);
                        }
                });

                registrarseBoton.setText("Registrarse");
                registrarseBoton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
                registrarseBoton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                registrarseBotonActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Source Han Sans KR Heavy", 2, 18)); // NOI18N
                jLabel3.setText("LOGIN");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(67, 67, 67)
                                                                .addComponent(jLabel2))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(70, 70, 70)
                                                                .addComponent(jLabel1)))
                                                .addGap(84, 84, 84)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(username)
                                                        .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                                                .addGap(0, 140, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator1)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(291, 291, 291))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrarseBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(registrarseBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
                
		if(!this.username.getText().equals("") && !password.getText().equals("")){
			Usuarios s = comprobarCredenciales(this.username.getText(), password.getText());
			if(s != null){
				if(s instanceof Administrador){
					VistaAdmin ad = new VistaAdmin(s);
					this.dispose();
					ad.setVisible(true);
				}else{
					Loged log = new Loged(s);
					this.dispose();
					log.setVisible(true);
				}
			}else{
				confirmarLogin.setText("Credenciales incorrectas, vuelve a intentarlo.");
			}
			
		}else{
			confirmarLogin.setText("Por favor, rellenar todos los compos solicitados.");
		}
        }//GEN-LAST:event_botonLoginActionPerformed

        private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_passwordActionPerformed

        private void registrarseBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseBotonActionPerformed
                Register reg = new Register();
		this.dispose();
		reg.setVisible(true);
        }//GEN-LAST:event_registrarseBotonActionPerformed

        private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_usernameActionPerformed

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
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton botonLogin;
        private javax.swing.JLabel confirmarLogin;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JPasswordField password;
        private javax.swing.JButton registrarseBoton;
        private javax.swing.JTextField username;
        // End of variables declaration//GEN-END:variables
}
