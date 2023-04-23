package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * Panel principal de la ventana de elección del jugador
 * @author Andrés Espitia
 * @author Camilo Uribe
 * @author Diego Forero
 *
 */
public class PanelPersonajes extends JPanel {
	
	/**
	 * Tipo de fuente para los titulos
	 */
	private Font titlefont;
	/**
	 * Tipo de fuente para los subtitulos
	 */
	private Font subtitlefont;
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
	 * Etiqueta que dice el numero del jugador al cual pertenecen los datos de entrada
	 */
	private JLabel num_jugador;
	/**
	 * Etiqueta con el texto "Nombre" indicando al usuario donde debe ingresar el nombre
	 */
	private JLabel nombre;
	/**
	 * Campo de texto donde va el nombre del jugador
	 */
	private JTextField nombre_jugador;
	/**
	 * Etiqueta con el texto "Personaje" que indica la selección del personaje
	 */
	private JLabel personaje;
	/**
	 * Selector de personajes
	 */
	private JComboBox selector_personaje;
	/**
	 * Personajes a elegir
	 */
	private String[] lista_personajes = {"Extraterreste", "Robot", "Astronauta", "Fantasma"};
	/**
	 * Etiqueta con la ilustracion del grupo de personajes
	 */
	private JLabel img_grupo_personajes;
	/**
	 * Boton para ir a la siguiente ventana
	 */
	private JButton next;
	/**
	 * Boton para ir a la anterior ventana
	 */
	private JButton back;
	
	/**
	 * Metodo constructor
	 */
	public PanelPersonajes() {
		titlefont = new Font("Monaco", Font.BOLD, 50);
		subtitlefont = new Font("Monaco", 0, 35);
		buttonfont = new Font("Monaco", 0, 30);
		maincolor = new Color(15, 40, 76);
		
		setBounds(0, 0, 500, 700);
		setLayout(null);
		setVisible(true);
		init();
	}
	
	/**
	 * Metodo para inicializar todas las variables y si no encuentra las imagenes toma colores para poner de fondo
	 */
	public void init() {
		fondo = new JLabel();
		fondo.setBounds(0, 0, 500, 700);
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
		
		num_jugador = new JLabel("Jugador #");
		num_jugador.setBounds(115, 30, 270, 60);
		num_jugador.setFont(titlefont);
		num_jugador.setForeground(Color.WHITE);
		num_jugador.setVisible(true);
		
		nombre = new JLabel("Nombre:");
		nombre.setBounds(175, 115, 168, 50);
		nombre.setFont(subtitlefont);
		nombre.setForeground(Color.WHITE);
		nombre.setVisible(true);
		
		nombre_jugador = new JTextField();
		nombre_jugador.setBounds(125, 175, 250, 50);
		nombre_jugador.setFont(buttonfont);
		nombre_jugador.setVisible(true);
		
		personaje = new JLabel("Personaje:");
		personaje.setBounds(145, 235, 240, 50);
		personaje.setFont(subtitlefont);
		personaje.setForeground(Color.WHITE);
		personaje.setVisible(true);
		
		selector_personaje = new JComboBox<>(lista_personajes);
		selector_personaje.setEditable(true);
		selector_personaje.setBounds(100, 295, 300, 50);
		selector_personaje.setPreferredSize(getSize());
		selector_personaje.setFont(buttonfont);
		selector_personaje.setVisible(true);
		
		img_grupo_personajes = new JLabel();
		img_grupo_personajes.setBounds(117, 359, 265, 217);
		BufferedImage bi1 = null;
		try {
			bi1 = ImageIO.read(new File("src/img/grupo_personajes.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado1 = bi1.getScaledInstance(img_grupo_personajes.getWidth(), img_grupo_personajes.getHeight(), Image.SCALE_SMOOTH);
		img_grupo_personajes.setIcon(new ImageIcon(redimensionado1));
		img_grupo_personajes.setVisible(true);
		
		next = new JButton();
		next.setBounds(355, 585, 85, 50);
		BufferedImage bi5 = null;
		try {
			bi5 = ImageIO.read(new File("src/img/img_next.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado5 = bi5.getScaledInstance(next.getWidth(), next.getHeight(), Image.SCALE_SMOOTH);
		next.setIcon(new ImageIcon(redimensionado5));
		next.setVisible(true);
		
		back = new JButton();
		back.setBounds(45, 585, 85, 50);
		BufferedImage bi6 = null;
		try {
			bi6 = ImageIO.read(new File("src/img/img_back.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado6 = bi6.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		back.setIcon(new ImageIcon(redimensionado6));
		back.setVisible(true);
		
		add(fondo);
		fondo.add(num_jugador);
		fondo.add(nombre);
		fondo.add(nombre_jugador);
		fondo.add(personaje);
		fondo.add(selector_personaje);
		fondo.add(img_grupo_personajes);
		fondo.add(back);
		fondo.add(next);
	}

	/**
	 * Metodo para devolver el nombre del jugador
	 */
	public JTextField getNombre_jugador() {
		return nombre_jugador;
	}

	/**
	 * Metodo para cambiar el nombre del jugador
	 */
	public void setNombre_jugador(JTextField nombre_jugador) {
		this.nombre_jugador = nombre_jugador;
	}

	/**
	 * Metodo para devolver el selector de los personajes
	 */
	public JComboBox getSelector_personaje() {
		return selector_personaje;
	}

	/**
	 * Metodo para cambiar el nombre del jugador
	 */
	public void setSelector_personaje(JComboBox selector_personaje) {
		this.selector_personaje = selector_personaje;
	}

	/**
	 * Metodo para devolver el boton Next
	 */
	public JButton getNext() {
		return next;
	}

	/**
	 * Metodo para cambiar el boton Next
	 */
	public void setNext(JButton next) {
		this.next = next;
	}
	
	/**
	 * Metodo para devolver el boton Back
	 */
	public JButton getBack() {
		return back;
	}

	/**
	 * Metodo para cambiar el boton Back
	 */
	public void setBack(JButton back) {
		this.back = back;
	}

	/**
	 * Metodo para devolver el numero de jugador
	 */
	public JLabel getNum_jugador() {
		return num_jugador;
	}

	/**
	 * Metodo para cambiar el numero de jugador
	 */
	public void setNum_jugador(JLabel num_jugador) {
		this.num_jugador = num_jugador;
	}
}
