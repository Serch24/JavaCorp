package interfaz;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import poo.javacorp.CategoriaProductos;
import poo.javacorp.Productos;
import poo.javacorp.Usuarios;


public class Loged extends javax.swing.JFrame{
	Usuarios usuario;
	String imagenes = "src/main/java/imagenes/";
	ArrayList<Productos> todosLosProductos = new ArrayList<>();
	JScrollPane scrollpane1;
	
	public Loged(Usuarios usuarioLoged) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.usuario = usuarioLoged;
		this.rellenarCategoria();
		filtros.add(filtroRelevancia);
		filtros.add(filtroMayorP);
		filtros.add(filtroMenorP);
		//scrollpane1 = new JScrollPane(panelDeImagenes);
		//panelDeImagenes.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelDeImagenes.setLayout(new BoxLayout(panelDeImagenes,BoxLayout.Y_AXIS));
		ImageIcon i = new ImageIcon(imagenes + "carrito.png");
		Image aux = i.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		i = new ImageIcon(aux);
		carrito.setIcon(i);
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
		
		
		//se añaden comentarios, calificación y fecha de calificación para hacer pruebas
		cuarto.addCalificacion(LocalDate.now());
		cuarto.addCalificacion("este teclado es una maravilla jajaja");
		cuarto.addCalificacion(5);
		cuarto.addCalificacion(LocalDate.now());
		cuarto.addCalificacion("otro tecladoooooooo");
		cuarto.addCalificacion(3);
		
		quinto.addCalificacion(LocalDate.now());
		quinto.addCalificacion("el peor teclado que he probado, gas.");
		quinto.addCalificacion(1);
		
		sexto.addCalificacion(LocalDate.now());
		sexto.addCalificacion("Mouse decente pero me se siente comodo al cogerlo.");
		sexto.addCalificacion(3);
		
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
	
	public ArrayList<Productos> filtraProductos(){
		traerProductos();
		ArrayList<Productos> tmp = todosLosProductos;
		if(!filtroRelevancia.isSelected()){
			if(!filtroMayorP.isSelected()){
				tmp = (ArrayList<Productos>) todosLosProductos.stream()
					.sorted(Comparator.comparing(Productos::getPrecio))
					.filter(pro -> pro.getCategoria().toString().equals((String)buscarCategorias.getSelectedItem()))
					.collect(Collectors.toCollection(ArrayList::new));
			}else{
				tmp = (ArrayList<Productos>) todosLosProductos.stream()
					.filter(pro -> pro.getCategoria().toString().equals((String)buscarCategorias.getSelectedItem()))
					.sorted(Comparator.comparing(Productos::getPrecio).reversed())
					.collect(Collectors.toCollection(ArrayList::new));
			}
		}else{
			//filtro relevancia
			tmp = (ArrayList<Productos>) todosLosProductos.stream()
				.filter(pro -> pro.getCategoria().toString().equals((String)buscarCategorias.getSelectedItem()))
				.sorted(Comparator.comparingInt(Productos::mediaDeOpiniones).reversed())
				.collect(Collectors.toCollection(ArrayList::new));

		}
		
		
		return tmp;
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                filtros = new javax.swing.ButtonGroup();
                bienv = new javax.swing.JLabel();
                buscarCategorias = new javax.swing.JComboBox<>();
                barraBusqueda = new javax.swing.JTextField();
                BotonBusqueda = new javax.swing.JButton();
                panelDeImagenes = new javax.swing.JPanel();
                filtroRelevancia = new javax.swing.JRadioButton();
                filtroMayorP = new javax.swing.JRadioButton();
                filtroMenorP = new javax.swing.JRadioButton();
                carrito = new javax.swing.JButton();

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

                filtroRelevancia.setText("Por relevancia");

                filtroMayorP.setText("Mayor precio");

                filtroMenorP.setText("Menor precio");

                carrito.setBorder(null);
                carrito.setBorderPainted(false);
                carrito.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                carritoActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(bienv)
                                                .addGap(47, 47, 47)
                                                .addComponent(buscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                                                .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(BotonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(filtroRelevancia)
                                                .addGap(28, 28, 28)
                                                .addComponent(filtroMayorP)
                                                .addGap(30, 30, 30)
                                                .addComponent(filtroMenorP)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(panelDeImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(buscarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BotonBusqueda)
                                                .addComponent(bienv)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(filtroRelevancia)
                                        .addComponent(filtroMayorP)
                                        .addComponent(filtroMenorP))
                                .addGap(18, 18, 18)
                                .addComponent(panelDeImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void buscarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCategoriasActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_buscarCategoriasActionPerformed

        private void BotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaActionPerformed
                String opcionSeleccionada = (String)buscarCategorias.getSelectedItem();
		
                //actualiza el Jframe borrando los components que existan
                //traerProductos();
		//System.out.println("\n");
                todosLosProductos =  filtraProductos();
		//System.out.println("\n");
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
               
	       // los productos filtrados...
               for (Productos producto : todosLosProductos) {
                    if (opcionSeleccionada.equals(producto.getCategoria().toString())) {
                        ImageIcon i = new ImageIcon(producto.getFotografia());
                        Image aux = i.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
                        i = new ImageIcon(aux);
                        JLabel test = new JLabel(producto.getCaracteristicas(),i, SwingConstants.RIGHT);
                        JButton testButton = new JButton("ver producto");
			testButton.addActionListener((ActionEvent e) -> {
				VerProducto t = new VerProducto(producto, usuario);
				this.dispose();
				t.setVisible(true);
			});
			JLabel a = new JLabel("           " + producto.getPrecio() + "€");
			panelDeImagenes.add(test);
			panelDeImagenes.add(a);
			panelDeImagenes.add(testButton);
			//scrollpane1.add(test);
		    }else{
                        //System.out.println(producto);
                    }
                }
               pack();
               //limpia el texto de las palabras claves
               barraBusqueda.setText("");
		//crearProductos();
		
        }//GEN-LAST:event_BotonBusquedaActionPerformed

        private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
                // TODO add your handling code here:
		CarritoDeCompra carro = new CarritoDeCompra();
		this.dispose();
		carro.setVisible(true);
		
        }//GEN-LAST:event_carritoActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BotonBusqueda;
        private javax.swing.JTextField barraBusqueda;
        private javax.swing.JLabel bienv;
        private javax.swing.JComboBox<String> buscarCategorias;
        private javax.swing.JButton carrito;
        private javax.swing.JRadioButton filtroMayorP;
        private javax.swing.JRadioButton filtroMenorP;
        private javax.swing.JRadioButton filtroRelevancia;
        private javax.swing.ButtonGroup filtros;
        private javax.swing.JPanel panelDeImagenes;
        // End of variables declaration//GEN-END:variables
}
