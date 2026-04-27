package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMostrar extends JPanel {
	
	/**
	 * Etiqueta con el titulo "Mascotas en Base de Datos"
	 */
	private JLabel titulo;
	/**
	 * Espacio en donde se van a mostrar los animeles de la base de datos
	 */
	private JPanel box;
	/**
	 * Boton que ejecuta la funcion de mostrar los gatos de la base de datos
	 */
	private JButton b_animales;
	/**
	 * Boton que ejecuta la funcion de mostrar los perros de la base de datos
	 */
	private JButton b_personas;
	/**
	 * Boton que ejecuta la funcion de mostrar todas las mascotas 
	 * de la base de datos
	 */
	private JButton b_todos;
	/**
	 * Boton para volver a la pagina principal
	 */
	private JButton b_volver;
	/**
	 * Fuente utilizada en los titulos principales
	 */
	private Font f = new Font("Arial", Font.BOLD, 30);
	/**
	 * Fuente utilizada en los textos que no son titulos
	 */
	private Font f2 = new Font("Arial", Font.ITALIC, 20);
	
	/**
	 * Metodo Constructor
	 */
	public PanelMostrar() {
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
		titulo = new JLabel("Personas y Animales en Base de Datos");
		titulo.setFont(f);
		titulo.setBounds(220, 70, 800, 35);
		titulo.setVisible(true);
		
		box = new JPanel();
		box.setBackground(Color.WHITE);
		box.setBounds(200, 130, 600, 400);
		box.setVisible(true);
		
		b_animales = new JButton("Animales");
		b_animales.setFont(f2);
		b_animales.setBackground(new Color(255, 233, 174));
		b_animales.setBounds(200, 550, 200, 35);
		b_animales.setVisible(true);
		
		b_personas = new JButton("Personas");
		b_personas.setFont(f2);
		b_personas.setBackground(new Color(255, 233, 174));
		b_personas.setBounds(400, 550, 200, 35);
		b_personas.setVisible(true);
		
		b_todos = new JButton("Todos");
		b_todos.setFont(f2);
		b_todos.setBackground(new Color(255, 233, 174));
		b_todos.setBounds(600, 550, 200, 35);
		b_todos.setVisible(true);
		
		b_volver = new JButton("VOLVER");
		b_volver.setFont(f2);
		b_volver.setBackground(new Color(255, 233, 174));
		b_volver.setBounds(400, 600, 200, 35);
		b_volver.setVisible(true);
		
		add(titulo);
		add(box);
		add(b_animales);
		add(b_personas);
		add(b_volver);
		add(b_todos);
	}
	
	/**
	 * Metodo para poner en blanco el panel en donde se muestran los datos
	 */
	public void ponerEnBlanco() {
		remove(box);
		box = new JPanel();
		box.setBackground(Color.WHITE);
		box.setBounds(200, 130, 600, 400);
		box.setVisible(true);
		add(box);
	}

	/**
	 * Metodo que devuelve el boton de volver a la pagina principal
	 * @return retorna el boton volver
	 */
	public JButton getB_volver() {
		return b_volver;
	}

	/**
	 * Metodo para obtener el panel en donde se muestran los datos
	 * @return Retorna el panel donde se muestran los datos
	 */
	public JPanel getBox() {
		return box;
	}

	/**
	 * Metodo por el cual se accede al boton para mostrar los gatos de la base de datos
	 * @return retorna el boton para mostrar los gatos
	 */
	public JButton getB_animales() {
		return b_animales;
	}

	/**
	 * Metodo por el cual se accede al boton para mostrar los perros de la base de datos
	 * @return retorna el boton para mostrar los perros
	 */
	public JButton getB_personas() {
		return b_personas;
	}

	/**
	 * Metodo por el cual se accede al boton para mostrar todos las mascotas
	 * de la base de datos
	 * @return retorna el boton para mostrar todas las mascotas
	 */
	public JButton getB_todos() {
		return b_todos;
	}
}
