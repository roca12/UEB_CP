package co.edu.unbosque.view;

import javax.swing.JFrame;

/**
 * 
 * Ventana que muestra las reglas o instrucciones
 * @author Andrés Espitia
 * @author Camilo Uribe
 * @author Diego Forero
 *
 */
public class VentanaReglas extends JFrame{
	
	/**
	 * Panel principal de las reglas 'PanelReglas'
	 */
	private PanelReglas preglas;
	
	/**
	 * Metodo constructor
	 */
	public VentanaReglas() {
		setSize(600, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		init();
	}
	
	/**
	 * Metodo que inicializa las variables
	 */
	private void init() {
		preglas = new PanelReglas();
		add(preglas);
	}
}
