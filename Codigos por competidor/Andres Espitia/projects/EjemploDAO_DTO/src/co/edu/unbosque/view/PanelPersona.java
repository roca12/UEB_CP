package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPersona extends JPanel {
	/**
	 * Etiqueta con el titulo "Guardar y Eliminar"
	 */
	private JLabel titulo;
	/**
	 * Etiqueta con el texto "Nombre:"
	 */
	private JLabel nombre;
	/**
	 * Etiqueta con el texto "Edad:"
	 */
	private JLabel edad;
	/**
	 * Etiqueta con el texto "Fecha de Nacimiento:"
	 */
	private JLabel dof;
	/**
	 * Etiqueta con el texto "Raza:"
	 */
	private JLabel altura;
	/**
	 * Etiqueta con el texto "Nombre persona a Eliminar:"
	 */
	private JLabel nombre_eliminar;
	/**
	 * Campo de texto en el que el usuario digita el nombre de la persona
	 */
	private JTextField in_nom;
	/**
	 * Campo de texto en el que el usuario digita la edad de la persona
	 */
	private JTextField in_edad;
	/**
	 * Campo de texto en el que el usuario digita la raza de la persona
	 */
	private JTextField in_dof;
	/**
	 * Campo de texto en el que el usuario digita la raza de la persona
	 */
	private JTextField in_altura;
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
	public PanelPersona() {
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
		titulo = new JLabel("Guardar y Eliminar Persona");
		titulo.setFont(f);
		titulo.setBounds(300, 100, 500, 35);
		titulo.setVisible(true);
		
		nombre = new JLabel("Nombre:");
		nombre.setFont(f2);
		nombre.setBounds(150, 250, 100, 25);
		nombre.setVisible(true);

		edad = new JLabel("Edad:");
		edad.setFont(f2);
		edad.setBounds(150, 300, 100, 25);
		edad.setVisible(true);

		dof = new JLabel("DoB:");
		dof.setFont(f2);
		dof.setBounds(150, 350, 100, 25);
		dof.setVisible(true);
		
		altura = new JLabel("Altura:");
		altura.setFont(f2);
		altura.setBounds(150, 400, 100, 25);
		altura.setVisible(true);
		
		in_nom = new JTextField();
		in_nom.setFont(f2);
		in_nom.setBounds(250, 250, 200, 25);
		in_nom.setVisible(true);
		
		in_edad = new JTextField();
		in_edad.setFont(f2);
		in_edad.setBounds(250, 300, 200, 25);
		in_edad.setVisible(true);
		
		in_dof = new JTextField();
		in_dof.setFont(f2);
		in_dof.setBounds(250, 350, 200, 25);
		in_dof.setVisible(true);
		
		in_altura = new JTextField();
		in_altura.setFont(f2);
		in_altura.setBounds(250, 400, 200, 25);
		in_altura.setVisible(true);
		
		b_guardar = new JButton("GUARDAR");
		b_guardar.setFont(f2);
		b_guardar.setBackground(new Color(255, 233, 174));
		b_guardar.setBounds(210, 450, 200, 35);
		b_guardar.setVisible(true);
		
		nombre_eliminar = new JLabel("Posicion Persona a Eliminar:");
		nombre_eliminar.setFont(f2);
		nombre_eliminar.setBounds(550, 275, 400, 25);
		nombre_eliminar.setVisible(true);
		
		in_pos_eliminar = new JTextField();
		in_pos_eliminar.setFont(f2);
		in_pos_eliminar.setBounds(650, 325, 100, 25);
		in_pos_eliminar.setVisible(true);
		
		b_eliminar = new JButton("ELIMINAR");
		b_eliminar.setFont(f2);
		b_eliminar.setBackground(new Color(255, 233, 174));
		b_eliminar.setBounds(600, 420, 200, 35);
		b_eliminar.setVisible(true);
		
		b_volver = new JButton("VOLVER");
		b_volver.setFont(f2);
		b_volver.setBackground(new Color(255, 233, 174));
		b_volver.setBounds(400, 550, 200, 35);
		b_volver.setVisible(true);
		
		add(titulo);
		add(nombre);
		add(edad);
		add(dof);
		add(altura);
		add(in_nom);
		add(in_edad);
		add(in_dof);
		add(in_altura);
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
	 * Metodo que devuelve el campo de la edad de la persona
	 * @return campo que contiene una edad
	 */
	public JTextField getIn_edad() {
		return in_edad;
	}

	/**
	 * Metodo para remplazar el campo de texto donde se guarda la edad
	 * @param Como parametro se pasa un nuevo campo de texto
	 */
	public void setIn_edad(JTextField in_edad) {
		this.in_edad = in_edad;
	}

	/**
	 * Metodo que devuelve el campo de la raza de la persona
	 * @return campo que contiene una raza
	 */
	public JTextField getIn_dof() {
		return in_dof;
	}

	public JTextField getIn_altura() {
		return in_altura;
	}

	public void setIn_altura(JTextField in_altura) {
		this.in_altura = in_altura;
	}

	/**
	 * Metodo para remplazar el campo de texto donde se guarda la raza
	 * @param Como parametro se pasa un nuevo campo de texto
	 */
	public void setIn_dof(JTextField in_dof) {
		this.in_dof = in_dof;
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
	public void setIn_pos_eliminar(JTextField in_pos_eliminar) {
		this.in_pos_eliminar = in_pos_eliminar;
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
