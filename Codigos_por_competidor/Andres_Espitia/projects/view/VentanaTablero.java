package co.edu.unbosque.view;

import javax.swing.JFrame;

/**
 * 
 * Ventana de juego
 * @author Andrés Espitia
 * @author Camilo Uribe
 * @author Diego Forero
 *
 */
public class VentanaTablero extends JFrame {
	
	/**
	 * Panel principal de la ventana 'PanelTablero'
	 */
	private PanelTablero pt;

	/**
	 * Metodo constructor
	 */
	public VentanaTablero() {
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		init();
	}
	
	/**
	 * Metodo que inicializa todas las variables
	 */
	private void init() {
		pt = new PanelTablero();
		add(pt);
	}
	
	/**
	 * Metodo que devuelve el panel del tablero
	 */
	public PanelTablero getPt() {
		return pt;
	}

	/**
	 * Metodo que cambia el panel del tablero
	 */
	public void setPt(PanelTablero pt) {
		this.pt = pt;
	}
}
