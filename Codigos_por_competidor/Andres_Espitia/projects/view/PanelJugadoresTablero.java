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
 * Panel principal de la ventana que nos permite elegir las diferentes variables de juego
 * @author Andrés Espitia
 * @author Camilo Uribe
 * @author Diego Forero
 *
 */
public class PanelJugadoresTablero extends JPanel {
	
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
	 * Etiqueta con el titulo de "Jugadores"
	 */
	private JLabel titulo_jugadores;
	/**
	 * Etiqueta con el titulo de "Planeta"
	 */
	private JLabel titulo_planeta;
	/**
	 * Etiqueta con una ilustración de planetas
	 */
	private JLabel img_grupo_planetas;
	/**
	 * Etiqueta con una ilustracion de los personajes
	 */
	private JLabel img_grupo_personajes;
	/**
	 * Selector de jugadores, con la cantidad de los mismos
	 */
	private JComboBox selector_jugadores;
	/**
	 * Arreglo que contiene las opciones del anterior selector
	 */
	private String[] jugadores = {"2 Jugadores", "3 Jugadores", "4 Jugadores"};
	/**
	 * Entrada de texto con las columnas
	 */
	private JTextField columnas_tablero;
	/**
	 * Entrada de texto con las filas
	 */
	private JTextField filas_tablero;
	/**
	 * Etiqueta auxiliar que tiene una 'x' en su interior
	 */
	private JLabel x_tablero;
	/**
	 * Boton para avanzar
	 */
	private JButton next;
	/**
	 * Boton para retroceder
	 */
	private JButton back;
	
	/**
	 * Metodo constructor
	 */
	public PanelJugadoresTablero() {
		titlefont = new Font("Monaco", 0, 50);
		buttonfont = new Font("Monaco", 0, 20);
		maincolor = new Color(15, 40, 76);
		
		setBounds(0, 0, 900, 700);
		setLayout(null);
		setVisible(true);
		init();
	}
	
	/**
	 * Metodo para inicializar todas las variables, y en caso de no encontrar las imagenes ponga colores de fondo
	 */
	private void init() {
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
		
		titulo_planeta = new JLabel("Planeta:");
		titulo_planeta.setBounds(130, 77, 240, 63);
		titulo_planeta.setForeground(Color.WHITE);
		titulo_planeta.setFont(titlefont);
		
		titulo_jugadores = new JLabel("Jugadores:");
		titulo_jugadores.setBounds(500, 77, 330, 63);
		titulo_jugadores.setForeground(Color.WHITE);
		titulo_jugadores.setFont(titlefont);
		
		img_grupo_planetas = new JLabel();
		img_grupo_planetas.setBounds(112, 193, 294, 225);
		BufferedImage bi1 = null;
		try {
			bi1 = ImageIO.read(new File("src/img/grupo_planetas.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado1 = bi1.getScaledInstance(img_grupo_planetas.getWidth(), img_grupo_planetas.getHeight(), Image.SCALE_SMOOTH);
		img_grupo_planetas.setIcon(new ImageIcon(redimensionado1));
		img_grupo_planetas.setVisible(true);
		
		img_grupo_personajes = new JLabel();
		img_grupo_personajes.setBounds(487, 173, 326, 267);
		BufferedImage bi2 = null;
		try {
			bi2 = ImageIO.read(new File("src/img/grupo_personajes.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado2 = bi2.getScaledInstance(img_grupo_personajes.getWidth(), img_grupo_personajes.getHeight(), Image.SCALE_SMOOTH);
		img_grupo_personajes.setIcon(new ImageIcon(redimensionado2));
		img_grupo_personajes.setVisible(true);
		
		selector_jugadores = new JComboBox<>(jugadores);
		selector_jugadores.setEditable(true);
		selector_jugadores.setBounds(520, 480, 260, 60);
		selector_jugadores.setFont(buttonfont);
		selector_jugadores.setVisible(true);
		
		columnas_tablero = new JTextField();
		columnas_tablero.setBounds(120, 490, 100, 40);
		columnas_tablero.setFont(buttonfont);
		columnas_tablero.setVisible(true);
		
		x_tablero = new JLabel("X");
		x_tablero.setBounds(235, 480, 30, 63);
		x_tablero.setForeground(Color.WHITE);
		x_tablero.setFont(titlefont);
		x_tablero.setVisible(true);
		
		filas_tablero = new JTextField();
		filas_tablero.setBounds(280, 490, 100, 40);
		filas_tablero.setFont(buttonfont);
		filas_tablero.setVisible(true);
		
		next = new JButton();
		next.setBounds(750, 560, 100, 70);
		BufferedImage bi3 = null;
		try {
			bi3 = ImageIO.read(new File("src/img/img_next.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado3 = bi3.getScaledInstance(next.getWidth(), next.getHeight(), Image.SCALE_SMOOTH);
		next.setIcon(new ImageIcon(redimensionado3));
		next.setVisible(true);
		
		back = new JButton();
		back.setBounds(50, 560, 100, 70);
		BufferedImage bi4 = null;
		try {
			bi4 = ImageIO.read(new File("src/img/img_back.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image redimensionado4 = bi4.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		back.setIcon(new ImageIcon(redimensionado4));
		back.setVisible(true);
		
		add(fondo);
		fondo.add(titulo_planeta);
		fondo.add(titulo_jugadores);
		fondo.add(img_grupo_planetas);
		fondo.add(img_grupo_personajes);
		fondo.add(selector_jugadores);
		fondo.add(columnas_tablero);
		fondo.add(x_tablero);
		fondo.add(filas_tablero);
		fondo.add(next);
		fondo.add(back);
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
	 * Metodo para devolver el Selector de jugadores
	 */
	public JComboBox getSelector_jugadores() {
		return selector_jugadores;
	}
	
	/**
	 * Metodo para cambiar el Selector de jugadores
	 */
	public void setSelector_jugadores(JComboBox selector_jugadores) {
		this.selector_jugadores = selector_jugadores;
	}

	/**
	 * Metodo para devolver el campo de texto con las columnas
	 */
	public JTextField getColumnas_tablero() {
		return columnas_tablero;
	}

	/**
	 * Metodo para cambiar el campo de texto con las columnas
	 */
	public void setColumnas_tablero(JTextField columnas_tablero) {
		this.columnas_tablero = columnas_tablero;
	}

	/**
	 * Metodo para devolver el campo de texto con las filas
	 */
	public JTextField getFilas_tablero() {
		return filas_tablero;
	}

	/**
	 * Metodo para cambiar el campo de texto con las filas
	 */
	public void setFilas_tablero(JTextField filas_tablero) {
		this.filas_tablero = filas_tablero;
	}
	
}
