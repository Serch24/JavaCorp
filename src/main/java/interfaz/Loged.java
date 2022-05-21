package interfaz;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
	public void crearProductos(){ 
		
		String path = "src/main/java/ficheros/productoss.dat";
		
		Productos primero = new Productos("portatil,ordenador,sobremesa,torre", "Mac de última generación.", 1000, 4, LocalDate.now(), CategoriaProductos.ORDENADORES, imagenes + "mac.jpg");
		Productos segundo = new Productos("movil,celular,huawei,samsung,android,iphone", "Nuevo redmi note 11 pro.", 500, 5, LocalDate.now(), CategoriaProductos.MOVILESYTELEFONIA, imagenes + "movil.jpg");
		Productos tercero = new Productos("consola,juegos,juego,xbox,play", "Nueva consola, super moderna xbox 360 pro.", 600, 10, LocalDate.now(), CategoriaProductos.CONSOLASYVIDEOJUEGOS, imagenes + "xbox.jpg");
		Productos cuarto = new Productos("teclado,tecla,keyboard", "Teclado último modelo, especial para gaming, con teclas silenciosas.", 100, 20, LocalDate.now(), CategoriaProductos.COMPONENTES, imagenes + "teclado.jpg");
		Productos quinto = new Productos("teclado,tecla,keyboard", "segundo Teclado último modelo, especial para gaming, con teclas silenciosas.", 100, 20, LocalDate.now(), CategoriaProductos.COMPONENTES, imagenes + "teclado2.jpg");
		Productos sexto = new Productos("mouse,raton", "Numevo ratón especial para gamers.", 50, 5, LocalDate.now(), CategoriaProductos.COMPONENTES, imagenes + "mouse.jpg");
		Productos septimo = new Productos("tv,televisor,curvo,4k,3d", "Televisor 4k samsung.", 1000, 8, LocalDate.now(), CategoriaProductos.TVAUDIOYFOTOS, imagenes + "televisor.jpg");
		Productos octavo = new Productos("tv,televisor,curvo,4k,3d", "Nuevo televisor traido de china.", 600, 10, LocalDate.now(), CategoriaProductos.TVAUDIOYFOTOS, imagenes + "tvSamsung.jpg");
		
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
			todosLosProductos.add(tercero);
			todosLosProductos.add(cuarto);
			todosLosProductos.add(quinto);
			todosLosProductos.add(sexto);
			todosLosProductos.add(septimo);
			todosLosProductos.add(octavo);
			
			//se guarda el objeto en un fichero y se cierran los streams.
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
	
	public void traerProductos(){
            String path = "src/main/java/ficheros/productoss.dat";
            // se recogen todos los productos y se almacenan en la variable "todosLosProductos"
            	try {
                    todosLosProductos.clear();
                    FileInputStream tmp = new FileInputStream(path);
                    ObjectInputStream aa = new ObjectInputStream(tmp);
                    todosLosProductos = (ArrayList<Productos>) aa.readObject();
                    tmp.close();
                    aa.close();	
		} catch (IOException | ClassNotFoundException e) {
                    System.out.println(e);
		}
		
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienv = new javax.swing.JLabel();
        buscarCategorias = new javax.swing.JComboBox<>();
        barraBusqueda = new javax.swing.JTextField();
        BotonBusqueda = new javax.swing.JButton();
        panelDeImagenes = new javax.swing.JPanel();

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

        panelDeImagenes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bienv)
                .addGap(68, 68, 68)
                .addComponent(buscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BotonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(panelDeImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(42, 42, 42)
                .addComponent(panelDeImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void buscarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCategoriasActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_buscarCategoriasActionPerformed

        private void BotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaActionPerformed
                String opcionSeleccionada = (String)buscarCategorias.getSelectedItem();
                System.out.println("Hay " + todosLosProductos.size() + " productos\n");

                //actualiza el Jframe borrando los components que existan
                traerProductos();
                panelDeImagenes.removeAll();
                panelDeImagenes.repaint();
               
                // se filtra por palabra clave
               if(!barraBusqueda.getText().equals("")){
                   ArrayList<Productos> productosTemporales = new ArrayList<>();
                   for (Productos producto : todosLosProductos) {
                       String tmpTitulo = producto.getTitulo();
                       String tmpCategoria = producto.getCategoria().toString();
                       String arrpalabrasClaves[] = tmpTitulo.split(",");
                       
                       for (int i = 0; i < arrpalabrasClaves.length; i++) {
                           if (tmpCategoria.equals(opcionSeleccionada) && barraBusqueda.getText().equals(arrpalabrasClaves[i])) {
                               productosTemporales.add(producto);
                           }
                       }
                   }
                   if(!productosTemporales.isEmpty()){
                       //actualiza los productos dependiendo de las palabras claves
                       todosLosProductos = productosTemporales;
                   }
                }
               
               for (Productos producto : todosLosProductos) {
                    if (opcionSeleccionada.equals(producto.getCategoria().toString())) {
                        //System.out.println(producto);
                        ImageIcon i = new ImageIcon(producto.getFotografia());
                        Image aux = i.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
                        i = new ImageIcon(aux);
                        JLabel test = new JLabel(i);
                        panelDeImagenes.add(test);
                    }else{
                        //System.out.println(producto);
                    }
                }
               pack();
               //limpia el texto de las palabras claves
               barraBusqueda.setText("");
		//crearProductos();
		
        }//GEN-LAST:event_BotonBusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBusqueda;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JLabel bienv;
    private javax.swing.JComboBox<String> buscarCategorias;
    private javax.swing.JPanel panelDeImagenes;
    // End of variables declaration//GEN-END:variables
}
