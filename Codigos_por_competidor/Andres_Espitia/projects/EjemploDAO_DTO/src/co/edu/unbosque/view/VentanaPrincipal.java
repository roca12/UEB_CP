package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	/**
	 * Espacio donde se agregan elementos a la ventana
	 */
	private PanelPrincipal pp;
	
	/**
	 * Metodo Constructor
	 */
	public VentanaPrincipal() {
		setSize(1000, 700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		init();
		setVisible(true);
	}
	
	/**
	 * Metodo donde se inicializa y se agrega el panel a la ventana
	 */
	public void init() {
		pp = new PanelPrincipal();
		add(pp);
	}

	/**
	 * Metodo a partir del cual se optiene el panel de esta ventana
	 * @return Retorna el panel que esta dentro de esta ventana
	 */
	public PanelPrincipal getPp() {
		return pp;
	}

	/**
	 * Metodo que permite remplazar el panel de esta ventana
	 * @param Como parametro se pasa un nuevo panel
	 */
	public void setPp(PanelPrincipal pp) {
		this.pp = pp;
	}
	
	
}
