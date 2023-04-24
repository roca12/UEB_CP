package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAnimal extends JPanel {
	/**
	 * Etiqueta con el titulo "Guardar y Eliminar"
	 */
	private JLabel titulo;
	/**
	 * Etiqueta con el texto "Nombre:"
	 */
	private JLabel nombre;
	/**
	 * Etiqueta con el texto "habitat:"
	 */
	private JLabel habitat;
	/**
	 * Etiqueta con el texto "Fecha de Nacimiento:"
	 */
	private JLabel alimen;
	/**
	 * Etiqueta con el texto "Raza:"
	 */
	private JLabel nvl_peligro;
	/**
	 * Etiqueta con el texto "Nombre persona a Eliminar:"
	 */
	private JLabel nombre_eliminar;
	/**
	 * Campo de texto en el que el usuario digita el nombre de la persona
	 */
	private JTextField in_nom;
	/**
	 * Campo de texto en el que el usuario digita la habitat de la persona
	 */
	private JTextField in_habitat;
	/**
	 * Campo de texto en el que el usuario digita la raza de la persona
	 */
	private JTextField in_alimen;
	/**
	 * Campo de texto en el que el usuario digita la raza de la persona
	 */
	private JTextField in_nvl_peligro;
	/**
	 * Campo de texto en el que el usuario digita el nombre de la persona que desea
	 * eliminar de la base de datos
	 */
	private JTextField in_pos_eliminar;
	/**
	 * Boton que ejecuta la accion de guardar los datos que el usuario ingreso
	 */
	private JButton b_guardar;
	/**
	 * Boton que ejecuta la accion de eliminar de la base de datos el animal que el
	 * usuario desea
	 */
	private JButton b_eliminar;
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
	private Font f2 = new Font("Arial", Font.ITALIC, 25);
	
	/**
	 * Metodo Constructor
	 */
	public PanelAnimal() {
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
		titulo = new JLabel("Guardar y Eliminar Animal");
		titulo.setFont(f);
		titulo.setBounds(300, 100, 500, 35);
		titulo.setVisible(true);
		
		nombre = new JLabel("Nombre:");
		nombre.setFont(f2);
		nombre.setBounds(120, 250, 100, 25);
		nombre.setVisible(true);

		habitat = new JLabel("Habitat:");
		habitat.setFont(f2);
		habitat.setBounds(120, 300, 100, 25);
		habitat.setVisible(true);

		alimen = new JLabel("Alimentacion:");
		alimen.setFont(f2);
		alimen.setBounds(120, 350, 200, 25);
		alimen.setVisible(true);
		
		nvl_peligro = new JLabel("Nvl P. Extincion:");
		nvl_peligro.setFont(f2);
		nvl_peligro.setBounds(110, 400, 300, 25);
		nvl_peligro.setVisible(true);
		
		in_nom = new JTextField();
		in_nom.setFont(f2);
		in_nom.setBounds(300, 250, 200, 25);
		in_nom.setVisible(true);
		
		in_habitat = new JTextField();
		in_habitat.setFont(f2);
		in_habitat.setBounds(300, 300, 200, 25);
		in_habitat.setVisible(true);
		
		in_alimen = new JTextField();
		in_alimen.setFont(f2);
		in_alimen.setBounds(300, 350, 200, 25);
		in_alimen.setVisible(true);
		
		in_nvl_peligro = new JTextField();
		in_nvl_peligro.setFont(f2);
		in_nvl_peligro.setBounds(300, 400, 200, 25);
		in_nvl_peligro.setVisible(true);
		
		b_guardar = new JButton("GUARDAR");
		b_guardar.setFont(f2);
		b_guardar.setBackground(new Color(255, 233, 174));
		b_guardar.setBounds(210, 450, 200, 35);
		b_guardar.setVisible(true);
		
		nombre_eliminar = new JLabel("Posicion Animal a Eliminar:");
		nombre_eliminar.setFont(f2);
		nombre_eliminar.setBounds(570, 275, 400, 25);
		nombre_eliminar.setVisible(true);
		
		in_pos_eliminar = new JTextField();
		in_pos_eliminar.setFont(f2);
		in_pos_eliminar.setBounds(670, 325, 100, 25);
		in_pos_eliminar.setVisible(true);
		
		b_eliminar = new JButton("ELIMINAR");
		b_eliminar.setFont(f2);
		b_eliminar.setBackground(new Color(255, 233, 174));
		b_eliminar.setBounds(620, 450, 200, 35);
		b_eliminar.setVisible(true);
		
		b_volver = new JButton("VOLVER");
		b_volver.setFont(f2);
		b_volver.setBackground(new Color(255, 233, 174));
		b_volver.setBounds(400, 550, 200, 35);
		b_volver.setVisible(true);
		
		add(titulo);
		add(nombre);
		add(habitat);
		add(alimen);
		add(nvl_peligro);
		add(in_nom);
		add(in_habitat);
		add(in_alimen);
		add(in_nvl_peligro);
		add(b_guardar);
		add(nombre_eliminar);
		add(in_pos_eliminar);
		add(b_eliminar);
		add(b_volver);
	}

	/**
	 * Metodo que devuelve el campo del nombre de la persona
	 * @return campo que contiene un nombre
	 */
	public JTextField getIn_nom() {
		return in_nom;
	}

	/**
	 * Metodo para remplazar el campo de texto donde se guarda el nombre
	 * @param Como parametro se pasa un nuevo campo de texto
	 */
	public void setIn_nom(JTextField in_nom) {
		this.in_nom = in_nom;
	}

	/**
	 * Metodo que devuelve el campo de la habitat de la persona
	 * @return campo que contiene una habitat
	 */
	public JTextField getIn_habitat() {
		return in_habitat;
	}

	/**
	 * Metodo para remplazar el campo de texto donde se guarda la habitat
	 * @param Como parametro se pasa un nuevo campo de texto
	 */
	public void setIn_habitat(JTextField in_habitat) {
		this.in_habitat = in_habitat;
	}

	/**
	 * Metodo que devuelve el campo de la raza de la persona
	 * @return campo que contiene una raza
	 */
	public JTextField getIn_alimen() {
		return in_alimen;
	}

	/**
	 * Metodo para remplazar el campo de texto donde se guarda la raza
	 * @param Como parametro se pasa un nuevo campo de texto
	 */
	public void setIn_alimen(JTextField in_alimen) {
		this.in_alimen = in_alimen;
	}

	/**
	 * Metodo que devuelve el campo del nombre de la persona que se desea eliminar de
	 * la base de datos
	 * @return campo que contiene un nombre
	 */
	public JTextField getIn_pos_eliminar() {
		return in_pos_eliminar;
	}

	/**
	 * Metodo para remplazar el campo de texto donde se guarda el nombre de la
	 * Persona que se desea eliminar
	 * @param Como parametro se pasa un nuevo campo de texto
	 */
	public void setIn_pos_eliminar(JTextField in_nom_eliminar) {
		this.in_pos_eliminar = in_nom_eliminar;
	}

	public JTextField getIn_nvl_peligro() {
		return in_nvl_peligro;
	}

	public void setIn_nvl_peligro(JTextField in_nvl_peligro) {
		this.in_nvl_peligro = in_nvl_peligro;
	}

	/**
	 * Metodo que devuelve el boton guardar
	 * @return el boton que llama la funcion de guardar
	 */
	public JButton getB_guardar() {
		return b_guardar;
	}

	/**
	 * Metodo que devuelve el boton eliminar
	 * @return el boton que llama la funcion de eliminar
	 */
	public JButton getB_eliminar() {
		return b_eliminar;
	}

	/**
	 * Metodo que devuelve el boton volver
	 * @return el boton que llama la funcion de volver a la ventana principal
	 */
	public JButton getB_volver() {
		return b_volver;
	}
}
