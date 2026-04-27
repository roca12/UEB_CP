package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
	
	/**
	 * Etiqueta con el titulo "Perreo & Gateo"
	 */
	private JLabel titulo;
	/**
	 * Boton por el cual se accede a la ventana para administrar las personas
	 */
	private JButton b_personas;
	/**
	 * Boton por el cual se accede a la ventana para administrar los gatos
	 */
	private JButton b_animales;
	/**
	 * Boton por el cual se accede a la ventana donde se muestran los datos
	 */
	private JButton b_mostrar;
	/**
	 * Fuente utilizada en los titulos principales
	 */
	private Font f = new Font("Arial", Font.BOLD, 25);
	/**
	 * Fuente utilizada en los textos que no son titulos
	 */
	private Font f2 = new Font("Arial", Font.ITALIC, 20);
	
	/**
	 * Metodo Constructor
	 */
	public PanelPrincipal() {
		setBounds(0, 0, 1000, 700);
		setLayout(null);
		init();
		setVisible(true);
	}
	
	/**
	 * Metodo para agregar e inicializar los componentes dentro del panel
	 */
	public void init() {
		setBackground(new Color(193, 239, 255));
		titulo = new JLabel("Personitas & Animalitos");
		titulo.setFont(f);
		titulo.setBounds(350, 100, 300, 30);
		titulo.setVisible(true);
		
		b_personas = new JButton("Op. Personas");
		b_personas.setBounds(100, 400, 300, 50);
		b_personas.setFont(f2);
		b_personas.setBackground(new Color(255, 233, 174));
		b_personas.setVisible(true);
		
		b_animales = new JButton("Op. Animales");
		b_animales.setBounds(600, 400, 300, 50);
		b_animales.setFont(f2);
		b_animales.setBackground(new Color(255, 233, 174));
		b_animales.setVisible(true);
		
		b_mostrar = new JButton("Mostrar");
		b_mostrar.setBounds(350, 500, 300, 50);
		b_mostrar.setFont(f2);
		b_mostrar.setBackground(new Color(255, 233, 174));
		b_mostrar.setVisible(true);
		
		add(titulo);
		add(b_personas);
		add(b_animales);
		add(b_mostrar);
	}

	/**
	 * Metodo por el cual se obtiene el boton que nos lleva a la ventana para administrar
	 * los perros en la base de datos
	 * @return Retorna el boton que nos da las opciones para administrar datos sobre los
	 * perros en la base de datos
	 */
	public JButton getB_personas() {
		return b_personas;
	}

	/**
	 * Metodo por el cual se obtiene el boton que nos lleva a la ventana para administrar
	 * los gatos en la base de datos
	 * @return Retorna el boton que nos da las opciones para administrar datos sobre los
	 * gatos en la base de datos
	 */
	public JButton getB_animales() {
		return b_animales;
	}

	/**
	 * Metodo por el cual se obtiene el boton que nos lleva a la ventana donde se muestran los datos
	 * @return Retorna el boton que nos lleva a la ventana donde se muestran los datos
	 */
	public JButton getB_mostrar() {
		return b_mostrar;
	}
	
}
