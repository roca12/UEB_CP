package co.edu.unbosque.view;

import javax.swing.JFrame;

/**
 * 
 * Ventana que permite seleccionar las preferencias por jugador
 * @author Andrés Espitia
 * @author Camilo Uribe
 * @author Diego Forero
 *
 */
public class VentanaPersonajes extends JFrame {
	
	/**
	 * Panel principal de los personajes 'PanelPersonajes'
	 */
	private PanelPersonajes pp;
	
	/**
	 * Metodo constructor
	 */
	public VentanaPersonajes() {
		setSize(500, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		init();
	}

	/**
	 * Metodo que inicializa las variables
	 */
	public void init() {
		pp = new PanelPersonajes();
		add(pp);
	}

	/**
	 * Metodo que devuelve el panel de los personajes
	 */
	public PanelPersonajes getPp() {
		return pp;
	}

	/**
	 * Metodo que cambia el panel de los personaes
	 */
	public void setPp(PanelPersonajes pp) {
		this.pp = pp;
	}
}
