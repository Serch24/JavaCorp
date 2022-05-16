package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import poo.javacorp.Clientes;
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        correoUsuario = new javax.swing.JTextField();
        calleUsuario = new javax.swing.JTextField();
        numCalleUsuario = new javax.swing.JTextField();
        cpUsuario = new javax.swing.JTextField();
        ciudadUsuario = new javax.swing.JTextField();
        telUsuario = new javax.swing.JTextField();
        titularTrjUsuario = new javax.swing.JTextField();
        numeroTrjUsuario = new javax.swing.JTextField();
        caducidadTrjUsuario = new javax.swing.JFormattedTextField();
        passUsuario = new javax.swing.JPasswordField();
        dniCifUsuario = new javax.swing.JLabel();
        panelTest = new javax.swing.JPanel();
        dniCif = new javax.swing.JLabel();
        dniCifBox = new javax.swing.JTextField();
        checkEmpresa = new javax.swing.JCheckBox();
        registrarBoton = new javax.swing.JButton();
        confirmarRegistro = new javax.swing.JLabel();
        webTodo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        webBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Correo electronico:");

        jLabel3.setText("Contraseña:");

        jLabel4.setText("Calle:");

        jLabel5.setText("Numero de calle:");

        jLabel6.setText("Códugo postal:");

        jLabel7.setText("Ciudad:");

        jLabel8.setText("Telefono:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Tarjeta Crédito");

        jLabel11.setText("Titular:");

        jLabel12.setText("Número:");

        jLabel13.setText("Caducidad:");

        correoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoUsuarioActionPerformed(evt);
            }
        });

        numCalleUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numCalleUsuarioKeyTyped(evt);
            }
        });

        cpUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpUsuarioKeyTyped(evt);
            }
        });

        telUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telUsuarioKeyTyped(evt);
            }
        });

        numeroTrjUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTrjUsuarioActionPerformed(evt);
            }
        });
        numeroTrjUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTrjUsuarioKeyTyped(evt);
            }
        });

        caducidadTrjUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/YY"))));
        caducidadTrjUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caducidadTrjUsuarioActionPerformed(evt);
            }
        });
        caducidadTrjUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caducidadTrjUsuarioKeyTyped(evt);
            }
        });

        panelTest.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                panelTestComponentHidden(evt);
            }
        });

        dniCif.setText("Dni:");
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

        confirmarRegistro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Web:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(webBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        webTodoLayout.setVerticalGroup(
            webTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(webTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(webBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkEmpresa)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(registrarBoton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniCifUsuario)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(calleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(correoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numCalleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(panelTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel10)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(caducidadTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(titularTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(numeroTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(telUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ciudadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53)
                                        .addComponent(webTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(titularTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(caducidadTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(webTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(ciudadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(telUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkEmpresa)
                        .addGap(13, 13, 13)
                        .addComponent(registrarBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(confirmarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(dniCifUsuario)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void correoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoUsuarioActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_correoUsuarioActionPerformed

	public boolean todosLosCamposLlenos() {
		boolean flag = false;

		if (!this.NombreUsuario.getText().equals("") && !this.correoUsuario.getText().equals("") 
                        && !this.passUsuario.getText().equals("") && !this.calleUsuario.getText().equals("") 
                        && !this.numCalleUsuario.getText().equals("") && !this.cpUsuario.getText().equals("") 
                        && !this.ciudadUsuario.getText().equals("") && !this.telUsuario.getText().equals("") 
                        && !this.titularTrjUsuario.getText().equals("") &&!this.numeroTrjUsuario.getText().equals("")
                        &&!this.caducidadTrjUsuario.getText().equals("") && !this.dniCifBox.getText().equals("")) {
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
		Usuarios clienteEmpresaCreada;
		if (todosLosCamposLlenos()) {
			if(this.checkEmpresa.isSelected()){
				clienteEmpresaCreada = new Empresas(this.NombreUsuario.getText(), this.correoUsuario.getText(), this.passUsuario.getText(), this.calleUsuario.getText(), Integer.parseInt(this.numCalleUsuario.getText()),
                                        Integer.parseInt(this.cpUsuario.getText()), this.ciudadUsuario.getText(), Integer.parseInt(this.telUsuario.getText()), this.titularTrjUsuario.getText(), this.numeroTrjUsuario.getText(), this.caducidadTrjUsuario.getText(), this.dniCifBox.getText(), this.webBox.getText());
			}else{
				clienteEmpresaCreada = new Clientes(this.NombreUsuario.getText(), this.correoUsuario.getText(), this.passUsuario.getText(), this.calleUsuario.getText(), Integer.parseInt(this.numCalleUsuario.getText()),
                                        Integer.parseInt(this.cpUsuario.getText()), this.ciudadUsuario.getText(), Integer.parseInt(this.telUsuario.getText()), this.titularTrjUsuario.getText(), this.numeroTrjUsuario.getText(), this.caducidadTrjUsuario.getText(), this.dniCifBox.getText());
			}
			
			if(guardarObjeto(clienteEmpresaCreada)){
				login = new Login();
				this.dispose();
				login.setVisible(true);
			}else{
				confirmarRegistro.setText("Algo ha pasado");
			}
		}else{
			confirmarRegistro.setText("!Faltan campos por llenar!");
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

    private void telUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telUsuarioKeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
            if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_telUsuarioKeyTyped

    private void cpUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpUsuarioKeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
            if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_cpUsuarioKeyTyped

    private void numCalleUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numCalleUsuarioKeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
            if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_numCalleUsuarioKeyTyped

    private void numeroTrjUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTrjUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_numeroTrjUsuarioActionPerformed

    private void numeroTrjUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTrjUsuarioKeyTyped
        // TODO add your handling code here:
        if(numeroTrjUsuario.getText().length()==16){
            evt.consume();}
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();}

    }//GEN-LAST:event_numeroTrjUsuarioKeyTyped

    private void caducidadTrjUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caducidadTrjUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_caducidadTrjUsuarioActionPerformed

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    private void caducidadTrjUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caducidadTrjUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_caducidadTrjUsuarioKeyTyped

	
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
    private javax.swing.JFormattedTextField caducidadTrjUsuario;
    private javax.swing.JTextField calleUsuario;
    private javax.swing.JCheckBox checkEmpresa;
    private javax.swing.JTextField ciudadUsuario;
    private javax.swing.JLabel confirmarRegistro;
    private javax.swing.JTextField correoUsuario;
    private javax.swing.JTextField cpUsuario;
    private javax.swing.JLabel dniCif;
    private javax.swing.JTextField dniCifBox;
    private javax.swing.JLabel dniCifUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField numeroTrjUsuario;
    private javax.swing.JPanel panelTest;
    private javax.swing.JPasswordField passUsuario;
    private javax.swing.JButton registrarBoton;
    private javax.swing.JTextField telUsuario;
    private javax.swing.JTextField titularTrjUsuario;
    private javax.swing.JTextField webBox;
    private javax.swing.JPanel webTodo;
    // End of variables declaration//GEN-END:variables
}
