package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPersonas extends JFrame {
	
	/**
	 * Espacio donde se agregan elementos a la ventana
	 */
	private PanelPersona p_personas; 
	
	/**
	 * Metodo Constructor
	 */
	public VentanaPersonas() {
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
		p_personas = new PanelPersona();
		add(p_personas);
	}

	/**
	 * Metodo a partir del cual se optiene el panel de esta ventana
	 * @return Retorna el panel que esta dentro de esta ventana
	 */
	public PanelPersona getPpe() {
		return p_personas;
	}

	/**
	 * Metodo que permite remplazar el panel de esta ventana
	 * @param Como parametro se pasa un nuevo panel
	 */
	public void setPg(PanelPersona p_pe) {
		this.p_personas = p_pe;
	}
}
