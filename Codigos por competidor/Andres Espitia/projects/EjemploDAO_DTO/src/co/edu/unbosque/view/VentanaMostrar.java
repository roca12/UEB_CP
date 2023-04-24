package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaMostrar extends JFrame{
	
	/**
	 * Espacio donde se agregan elementos a la ventana
	 */
	private PanelMostrar pm;
	
	/**
	 * Metodo Constructor
	 */
	public VentanaMostrar() {
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
		pm = new PanelMostrar();
		add(pm);
	}

	/**
	 * Metodo a partir del cual se optiene el panel de esta ventana
	 * @return Retorna el panel que esta dentro de esta ventana
	 */
	public PanelMostrar getPm() {
		return pm;
	}

	/**
	 * Metodo que permite remplazar el panel de esta ventana
	 * @param Como parametro se pasa un nuevo panel
	 */
	public void setPm(PanelMostrar pm) {
		this.pm = pm;
	}
	
	
	
}
