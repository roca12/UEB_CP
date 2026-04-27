package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaAnimales extends JFrame {
	
	/**
	 * Espacio donde se agregan elementos a la ventana
	 */
	private PanelAnimal p_animales; 
	
	/**
	 * Metodo Constructor
	 */
	public VentanaAnimales() {
		setSize(1000, 700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		init();
	}
	
	/**
	 * Metodo donde se inicializa y se agrega el panel a la ventana
	 */
	public void init() {
		p_animales = new PanelAnimal();
		add(p_animales);
	}

	/**
	 * Metodo a partir del cual se optiene el panel de esta ventana
	 * @return Retorna el panel que esta dentro de esta ventana
	 */
	public PanelAnimal getPa() {
		return p_animales;
	}

	/**
	 * Metodo que permite remplazar el panel de esta ventana
	 * @param Como parametro se pasa un nuevo panel
	 */
	public void setPg(PanelAnimal pa) {
		this.p_animales = pa;
	}
}
