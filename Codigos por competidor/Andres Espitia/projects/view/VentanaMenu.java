package co.edu.unbosque.view;

import javax.swing.JFrame;

/**
 * 
 * Ventana inicial que permite ir a jugar, reglas o ver partidas anteriores
 * @author Andrés Espitia
 * @author Camilo Uribe
 * @author Diego Forero
 *
 */
public class VentanaMenu extends JFrame {
	
	/**
	 * Panel que contiene los elementos principales de esta ventana 'Principal'
	 */
	private Principal pr;
	
	/**
	 * Metodo constructor
	 */
	public VentanaMenu() {
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
		pr = new Principal();
		add(pr);
	}

	/**
	 * Metodo que devuelve el panel principal
	 */
	public Principal getPr() {
		return pr;
	}

	/**
	 * Metodo que cambia el panel principal
	 */
	public void setPr(Principal pr) {
		this.pr = pr;
	}
	
}
