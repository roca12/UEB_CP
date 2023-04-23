package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * Panel principal de la ventana inicial del menú que nos permite ir a jugar, leer las instrucciones o ver partidas anteriores
 * @author Andrés Espitia
 * @author Camilo Uribe
 * @author Diego Forero
 *
 */
public class Principal extends JPanel{
	
	/**
	 * Tipo de fuente para los titulos
	 */
	private Font titlefont;
	/**
	 * Tipo de fuente para los botones
	 */
	private Font buttonfont;
	/**
	 * Color principal del panel
	 */
	private Color maincolor;
	/**
	 * Imagen de fondo dentro de una etiqueta
	 */
	private JLabel fondo;
	/**
	 * Etiqueta que tiene el texto con el nombre del juego: "The Portals"
	 */
	private JLabel titulo;
	/**
	 * Etiqueta con la imagen de la portada
	 */
	private JLabel img_portada;
	/**
	 * Etiqueta con la imagen del primer planeta
	 */
	private JLabel img_planeta1;
	/**
	 * Etiqueta con la imagen del segundo planeta
	 */
	private JLabel img_planeta2;
	/**
	 * Etiqueta con la imagen del tercer planeta
	 */
	private JLabel img_planeta3;
	/**
	 * Etiqueta con la imagen del cuarto planeta
	 */
	private JLabel img_planeta4;
	/**
	 * Etiqueta con la imagen de un cometa
	 */
	private JLabel img_cometa;
	/**
	 * Etiqueta con la imagen invertida del mismo cometa anterior
	 */
	private JLabel img_cometa_inv;
	/**
	 * Boton para ir a la pantalla de seleccion de variables de juego
	 */
	private JButton butt_jugar;
	/**
	 * Boton que redirige a las reglas de juego
	 */
	private JButton butt_reglas;
	/**
	 * Boton que nos muestra las partidas anteriores
	 */
	private JButton butt_partidas;
	
	/**
	 * Metodo constructor
	 */
	public Principal() {
		titlefont = new Font("Monaco", 0, 50);
		buttonfont = new Font("Monaco", 0, 30);
		maincolor = new Color(15, 40, 76);
		
		setBounds(0, 0, 900, 700);
		setLayout(null);
		setVisible(true);
		init();
	}
	
	/**
	 * Metodo para inicializar todas las variables y si no encuentra las imagenes pone un color de fondo
	 */
	public void init() {
		fondo = new JLabel();
		fondo.setBounds(0, 0, 900, 700);
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(new File("src/img/fondo.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			fondo.setBackground(maincolor);
		}
		Image redimensionado = bi.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
		fondo.setIcon(new ImageIcon(redimensionado));
		fondo.setVisible(true);
		
		titulo = new JLabel("The Portals");
		titulo.setBounds(285, 90, 330, 63);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(titlefont);
		
		img_portada = new JLabel();
		img_portada.setBounds(239, 81, 425, 425);
		BufferedImage bi2 = null;
		try {
			bi2 = ImageIO.read(new File("src/img/portada.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado2 = bi2.getScaledInstance(img_portada.getWidth(), img_portada.getHeight(), Image.SCALE_SMOOTH);
		img_portada.setIcon(new ImageIcon(redimensionado2));
		img_portada.setVisible(true);
		
		butt_jugar = new JButton("Jugar");
		butt_jugar.setFont(buttonfont);
		butt_jugar.setBounds(350, 430, 200, 60);
		butt_jugar.setVisible(true);
		
		butt_reglas = new JButton("Reglas");
		butt_reglas.setFont(buttonfont);
		butt_reglas.setBounds(350, 500, 200, 60);
		butt_reglas.setVisible(true);
		
		butt_partidas = new JButton("Partidas");
		butt_partidas.setFont(buttonfont);
		butt_partidas.setBounds(350, 570, 200, 60);
		butt_partidas.setVisible(true);
		
		img_planeta1 = new JLabel();
		img_planeta1.setBounds(-30, 58, 242, 126);
		BufferedImage bi3 = null;
		try {
			bi3 = ImageIO.read(new File("src/img/planeta1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado3 = bi3.getScaledInstance(img_planeta1.getWidth(), img_planeta1.getHeight(), Image.SCALE_SMOOTH);
		img_planeta1.setIcon(new ImageIcon(redimensionado3));
		img_planeta1.setVisible(true);
		
		img_planeta2 = new JLabel();
		img_planeta2.setBounds(734, 39, 217, 164);
		BufferedImage bi4 = null;
		try {
			bi4 = ImageIO.read(new File("src/img/planeta2.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado4 = bi4.getScaledInstance(img_planeta2.getWidth(), img_planeta2.getHeight(), Image.SCALE_SMOOTH);
		img_planeta2.setIcon(new ImageIcon(redimensionado4));
		img_planeta2.setVisible(true);
		
		img_planeta3 = new JLabel();
		img_planeta3.setBounds(-39, 552, 191, 191);
		BufferedImage bi5 = null;
		try {
			bi5 = ImageIO.read(new File("src/img/planeta3.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado5 = bi5.getScaledInstance(img_planeta3.getWidth(), img_planeta3.getHeight(), Image.SCALE_SMOOTH);
		img_planeta3.setIcon(new ImageIcon(redimensionado5));
		img_planeta3.setVisible(true);
		
		img_planeta4 = new JLabel();
		img_planeta4.setBounds(747, 557, 181, 181);
		BufferedImage bi6 = null;
		try {
			bi6 = ImageIO.read(new File("src/img/planeta4.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado6 = bi6.getScaledInstance(img_planeta4.getWidth(), img_planeta4.getHeight(), Image.SCALE_SMOOTH);
		img_planeta4.setIcon(new ImageIcon(redimensionado6));
		img_planeta4.setVisible(true);
		
		img_cometa = new JLabel();
		img_cometa.setBounds(0, 303, 205, 94);
		BufferedImage bi7 = null;
		try {
			bi7 = ImageIO.read(new File("src/img/cometa.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado7 = bi7.getScaledInstance(img_cometa.getWidth(), img_cometa.getHeight(), Image.SCALE_SMOOTH);
		img_cometa.setIcon(new ImageIcon(redimensionado7));
		img_cometa.setVisible(true);
		
		img_cometa_inv = new JLabel();
		img_cometa_inv.setBounds(694, 303, 205, 94);
		BufferedImage bi8 = null;
		try {
			bi8 = ImageIO.read(new File("src/img/cometa_inv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado8 = bi8.getScaledInstance(img_cometa_inv.getWidth(), img_cometa_inv.getHeight(), Image.SCALE_SMOOTH);
		img_cometa_inv.setIcon(new ImageIcon(redimensionado8));
		img_cometa_inv.setVisible(true);
		
		add(fondo);
		fondo.add(titulo);
		fondo.add(img_portada);
		fondo.add(butt_jugar);
		fondo.add(butt_reglas);
		fondo.add(butt_partidas);
		fondo.add(img_planeta1);
		fondo.add(img_planeta2);
		fondo.add(img_planeta3);
		fondo.add(img_planeta4);
		fondo.add(img_cometa);
		fondo.add(img_cometa_inv);
	}
	
	/**
	 * Metodo para devolver el boton para jugar
	 */
	public  JButton getButt_jugar() {
		return butt_jugar;
	}

	/**
	 * Metodo para cambiar el boton para jugar
	 */
	public  void setButt_jugar(JButton butt_jugar) {
		this.butt_jugar = butt_jugar;
	}

	/**
	 * Metodo para devolver el boton de las reglas
	 */
	public  JButton getButt_reglas() {
		return butt_reglas;
	}

	/**
	 * Metodo para cambiar el boton de las reglas
	 */
	public  void setButt_reglas(JButton butt_reglas) {
		this.butt_reglas = butt_reglas;
	}

	/**
	 * Metodo para devolver el boton de las partidas
	 */
	public  JButton getbutt_partidas() {
		return butt_partidas;
	}

	/**
	 * Metodo para cambiar el boton de las partidas
	 */
	public  void setbutt_partidas(JButton butt_partidas) {
		this.butt_partidas = butt_partidas;
	}
}
