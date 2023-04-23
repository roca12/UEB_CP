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
public class VentanaJugadoresTablero extends JFrame {
	
	/**
	 * Panel que contiene todos los elementos de PanelJugadoresTablero
	 */
	private PanelJugadoresTablero panelJT;
	
	/**
	 * Metodo constructor
	 */
	public VentanaJugadoresTablero() {
		setSize(900, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		init();
	}
	
	/**
	 * Metodo que inicializa las variables
	 */
	private void init() {
		panelJT = new PanelJugadoresTablero();
		add(panelJT);
	}

	/**
	 * Metodo que devuelve el panel de jugadores
	 */
	public PanelJugadoresTablero getPanelJT() {
		return panelJT;
	}

	/**
	 * Metodo que cambia el panel de jugadores
	 */
	public void setPanelJT(PanelJugadoresTablero panelJT) {
		this.panelJT = panelJT;
	}
	
}
