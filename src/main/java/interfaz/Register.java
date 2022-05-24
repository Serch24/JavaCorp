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
                nombreUs = new javax.swing.JLabel();
                NombreUsuario = new javax.swing.JTextField();
                correoUs = new javax.swing.JLabel();
                passwordUs = new javax.swing.JLabel();
                calleUs = new javax.swing.JLabel();
                numCalleUs = new javax.swing.JLabel();
                cpUs = new javax.swing.JLabel();
                ciudadUs = new javax.swing.JLabel();
                tlfUsu = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                titularTrjUs = new javax.swing.JLabel();
                numTrjUs = new javax.swing.JLabel();
                caducidadTrjUs = new javax.swing.JLabel();
                mesTrjUs = new javax.swing.JLabel();
                añoTrjUs = new javax.swing.JLabel();
                correoUsuario = new javax.swing.JTextField();
                calleUsuario = new javax.swing.JTextField();
                numCalleUsuario = new javax.swing.JTextField();
                cpUsuario = new javax.swing.JTextField();
                ciudadUsuario = new javax.swing.JTextField();
                telUsuario = new javax.swing.JTextField();
                titularTrjUsuario = new javax.swing.JTextField();
                numeroTrjUsuario = new javax.swing.JTextField();
                mesTrjUsuario = new javax.swing.JTextField();
                añoTrjUsuario = new javax.swing.JTextField();
                passUsuario = new javax.swing.JPasswordField();
                dniCifUsuario = new javax.swing.JLabel();
                panelTest = new javax.swing.JPanel();
                dniCif = new javax.swing.JLabel();
                dniCifBox = new javax.swing.JTextField();
                checkEmpresa = new javax.swing.JCheckBox();
                registrarBoton = new javax.swing.JButton();
                confirmarRegistro = new javax.swing.JLabel();
                webTodo = new javax.swing.JPanel();
                webUs = new javax.swing.JLabel();
                webBox = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                nombreUs.setText("Nombre:");

                NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                NombreUsuarioActionPerformed(evt);
                        }
                });

                correoUs.setText("Correo electronico:");

                passwordUs.setText("Contraseña:");

                calleUs.setText("Calle:");

                numCalleUs.setText("Numero de calle:");

                cpUs.setText("Códugo postal:");

                ciudadUs.setText("Ciudad:");

                tlfUsu.setText("Telefono:");

                jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
                jLabel10.setText("Tarjeta Crédito");

                titularTrjUs.setText("Titular:");

                numTrjUs.setText("Número:");

                caducidadTrjUs.setText("Caducidad");

                mesTrjUs.setText("Mes:");

                añoTrjUs.setText("Año:");

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

                cpUsuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cpUsuarioActionPerformed(evt);
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

                mesTrjUsuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mesTrjUsuarioActionPerformed(evt);
                        }
                });
                mesTrjUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                mesTrjUsuarioKeyTyped(evt);
                        }
                });

                añoTrjUsuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                añoTrjUsuarioActionPerformed(evt);
                        }
                });
                añoTrjUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                añoTrjUsuarioKeyTyped(evt);
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

                webUs.setText("Web:");

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
                                .addComponent(webUs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(webBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
                );
                webTodoLayout.setVerticalGroup(
                        webTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(webTodoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(webTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(webUs)
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
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(correoUs)
                                                                        .addComponent(passwordUs)
                                                                        .addComponent(calleUs)
                                                                        .addComponent(numCalleUs)
                                                                        .addComponent(cpUs)
                                                                        .addComponent(ciudadUs)
                                                                        .addComponent(nombreUs)
                                                                        .addComponent(tlfUsu))
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
                                                                                                                .addComponent(jLabel10)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE))
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(titularTrjUs)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(titularTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(caducidadTrjUs)
                                                                                                                                .addGap(19, 19, 19)
                                                                                                                                .addComponent(mesTrjUs)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(mesTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(numTrjUs)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(numeroTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(añoTrjUs)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(añoTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(telUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(ciudadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(53, 53, 53)
                                                                                .addComponent(webTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addComponent(dniCifUsuario))
                                                .addGap(0, 5, Short.MAX_VALUE))))
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
                                        .addComponent(nombreUs, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(correoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(correoUs))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passwordUs))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(calleUs)
                                                        .addComponent(calleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(numCalleUs)
                                                        .addComponent(numCalleUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(mesTrjUs)
                                                        .addComponent(mesTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(añoTrjUs)
                                                        .addComponent(añoTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cpUs)
                                                        .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(titularTrjUs)
                                                        .addComponent(numTrjUs)
                                                        .addComponent(titularTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(numeroTrjUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(caducidadTrjUs)
                                                .addGap(66, 66, 66)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(webTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ciudadUs)
                                                .addComponent(ciudadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(telUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tlfUsu))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(checkEmpresa)
                                                .addGap(13, 13, 13)
                                                .addComponent(registrarBoton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(confirmarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(dniCifUsuario)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        && !this.titularTrjUsuario.getText().equals("") && !this.numeroTrjUsuario.getText().equals("")
                        && !this.mesTrjUsuario.getText().equals("") && !this.añoTrjUsuario.getText().equals("") 
                        && !this.dniCifBox.getText().equals("")) {
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
                                        Integer.parseInt(this.cpUsuario.getText()), this.ciudadUsuario.getText(), Integer.parseInt(this.telUsuario.getText()), this.titularTrjUsuario.getText(), this.numeroTrjUsuario.getText(), Integer.parseInt(this.mesTrjUsuario.getText()), Integer.parseInt(this.añoTrjUsuario.getText()), this.dniCifBox.getText(), this.webBox.getText());
			}else{
				clienteEmpresaCreada = new Clientes(this.NombreUsuario.getText(), this.correoUsuario.getText(), this.passUsuario.getText(), this.calleUsuario.getText(), Integer.parseInt(this.numCalleUsuario.getText()),
                                        Integer.parseInt(this.cpUsuario.getText()), this.ciudadUsuario.getText(), Integer.parseInt(this.telUsuario.getText()), this.titularTrjUsuario.getText(), this.numeroTrjUsuario.getText(), Integer.parseInt(this.mesTrjUsuario.getText()), Integer.parseInt(this.añoTrjUsuario.getText()), this.dniCifBox.getText());
			}
			
			if(guardarObjeto(clienteEmpresaCreada)){
				login = new Login();
				this.dispose();
				login.setVisible(true);
			}else{
				confirmarRegistro.setText("Algo ha pasado");
				confirmarRegistro.setForeground(new java.awt.Color(255,0,0));
			}
		}else{
			confirmarRegistro.setText("!Faltan campos por llenar!");
			confirmarRegistro.setForeground(new java.awt.Color(255,0,0));

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

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    private void añoTrjUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoTrjUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoTrjUsuarioActionPerformed

    private void mesTrjUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesTrjUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesTrjUsuarioActionPerformed

    private void mesTrjUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesTrjUsuarioKeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
            if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_mesTrjUsuarioKeyTyped

    private void añoTrjUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoTrjUsuarioKeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
            if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_añoTrjUsuarioKeyTyped

        private void cpUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpUsuarioActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_cpUsuarioActionPerformed
	
	
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
        private javax.swing.JLabel añoTrjUs;
        private javax.swing.JTextField añoTrjUsuario;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.ButtonGroup buttonGroup2;
        private javax.swing.JLabel caducidadTrjUs;
        private javax.swing.JLabel calleUs;
        private javax.swing.JTextField calleUsuario;
        private javax.swing.JCheckBox checkEmpresa;
        private javax.swing.JLabel ciudadUs;
        private javax.swing.JTextField ciudadUsuario;
        private javax.swing.JLabel confirmarRegistro;
        private javax.swing.JLabel correoUs;
        private javax.swing.JTextField correoUsuario;
        private javax.swing.JLabel cpUs;
        private javax.swing.JTextField cpUsuario;
        private javax.swing.JLabel dniCif;
        private javax.swing.JTextField dniCifBox;
        private javax.swing.JLabel dniCifUsuario;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JPopupMenu jPopupMenu1;
        private javax.swing.JPopupMenu jPopupMenu2;
        private javax.swing.JPopupMenu jPopupMenu3;
        private javax.swing.JLabel mesTrjUs;
        private javax.swing.JTextField mesTrjUsuario;
        private javax.swing.JLabel nombreUs;
        private javax.swing.JLabel numCalleUs;
        private javax.swing.JTextField numCalleUsuario;
        private javax.swing.JLabel numTrjUs;
        private javax.swing.JTextField numeroTrjUsuario;
        private javax.swing.JPanel panelTest;
        private javax.swing.JPasswordField passUsuario;
        private javax.swing.JLabel passwordUs;
        private javax.swing.JButton registrarBoton;
        private javax.swing.JTextField telUsuario;
        private javax.swing.JLabel titularTrjUs;
        private javax.swing.JTextField titularTrjUsuario;
        private javax.swing.JLabel tlfUsu;
        private javax.swing.JTextField webBox;
        private javax.swing.JPanel webTodo;
        private javax.swing.JLabel webUs;
        // End of variables declaration//GEN-END:variables
}
