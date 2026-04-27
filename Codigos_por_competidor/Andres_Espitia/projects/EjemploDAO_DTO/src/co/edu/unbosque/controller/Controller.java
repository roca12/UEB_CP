package co.edu.unbosque.controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.AnimalDAO;
import co.edu.unbosque.model.PersonaDAO;
import co.edu.unbosque.view.VentanaAnimales;
import co.edu.unbosque.view.VentanaPersonas;
import co.edu.unbosque.view.VentanaMostrar;
import co.edu.unbosque.view.VentanaPrincipal;

/**
 * Clase principal que hace las operaciones entre vista y modelo
 * 
 * @author Andrés Espitia
 * @author Diego Forero
 *
 */
public class Controller implements ActionListener {
	/**
	 * Ventana principal que contiene el menú inicial
	 */
	private VentanaPrincipal vp;
	/**
	 * Ventana de gatos que contiene el menu al seleccionar los animales
	 */
	private VentanaAnimales va;
	/**
	 * Ventana de perros que contiene el menu al seleccionar las personas
	 */
	private VentanaPersonas vpe;
	/**
	 * Ventana que contiene un menu de botones para mostrar las bases de datos
	 * guardadas
	 */
	private VentanaMostrar vm;
	/**
	 * DAO que permite acceder a la persona
	 */
	private PersonaDAO pdao;
	/**
	 * DAO que permite acceder a los animales
	 */
	private AnimalDAO adao;

	/**
	 * Metodo Constructor
	 */
	public Controller() {
		vp = new VentanaPrincipal();
		vpe = new VentanaPersonas();
		va = new VentanaAnimales();
		vm = new VentanaMostrar();
		pdao = new PersonaDAO();
		adao = new AnimalDAO();
		asignarOyentes();
		eventos();
	}

	/**
	 * Metodo que permite asignar los oyentes para cada botón
	 */
	public void asignarOyentes() {
		vp.getPp().getB_personas().addActionListener(this);
		vp.getPp().getB_animales().addActionListener(this);
		vp.getPp().getB_mostrar().addActionListener(this);
		vpe.getPpe().getB_guardar().addActionListener(this);
		vpe.getPpe().getB_eliminar().addActionListener(this);
		vpe.getPpe().getB_volver().addActionListener(this);
		va.getPa().getB_guardar().addActionListener(this);
		va.getPa().getB_eliminar().addActionListener(this);
		va.getPa().getB_volver().addActionListener(this);
		vm.getPm().getB_animales().addActionListener(this);
		vm.getPm().getB_personas().addActionListener(this);
		vm.getPm().getB_todos().addActionListener(this);
		vm.getPm().getB_volver().addActionListener(this);
	}

	/**
	 * Metodo que permite hacer que los botones generen un comando al ser utilizados
	 */
	public void eventos() {
		vp.getPp().getB_personas().setActionCommand("PERSONA");
		vp.getPp().getB_animales().setActionCommand("ANIMAL");
		vp.getPp().getB_mostrar().setActionCommand("MOSTRAR");
		vpe.getPpe().getB_guardar().setActionCommand("GUARDAR_P");
		vpe.getPpe().getB_eliminar().setActionCommand("ELIMINAR_P");
		vpe.getPpe().getB_volver().setActionCommand("VOLVER");
		va.getPa().getB_guardar().setActionCommand("GUARDAR_A");
		va.getPa().getB_eliminar().setActionCommand("ELIMINAR_A");
		va.getPa().getB_volver().setActionCommand("VOLVER");
		vm.getPm().getB_animales().setActionCommand("M_ANIMALES");
		vm.getPm().getB_personas().setActionCommand("M_PERSONAS");
		vm.getPm().getB_todos().setActionCommand("M_TODOS");
		vm.getPm().getB_volver().setActionCommand("VOLVER");
	}

	/**
	 * Metodo que hace la funcion principal de escuchar las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("PERSONA")) {
			vp.setVisible(false);
			vpe.setVisible(true);
		}
		if (e.getActionCommand().equals("ANIMAL")) {
			vp.setVisible(false);
			va.setVisible(true);
		}
		if (e.getActionCommand().equals("MOSTRAR")) {
			vp.setVisible(false);
			vm.setVisible(true);
		}
		if (e.getActionCommand().equals("GUARDAR_P")) {
			try {
				int edad = Integer.parseInt(vpe.getPpe().getIn_edad().getText());
				float altura = Float.parseFloat(vpe.getPpe().getIn_altura().getText());
				pdao.createPersona(vpe.getPpe().getIn_nom().getText(), edad, vpe.getPpe().getIn_dof().getText(),
						altura);
				JOptionPane.showMessageDialog(null, "Persona guardada con exito.");
				vpe.getPpe().getIn_nom().setText("");
				vpe.getPpe().getIn_edad().setText("");
				vpe.getPpe().getIn_dof().setText("");
				vpe.getPpe().getIn_altura().setText("");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null,
						"La edad debe ser un numero entero y la altura debe tener decimales (Ej: 1.70).");
			}
		}
		if (e.getActionCommand().equals("ELIMINAR_P")) {
			try {
				int pos = Integer.parseInt(vpe.getPpe().getIn_pos_eliminar().getText());
				if (pdao.deletePersona(pos)) {
					JOptionPane.showMessageDialog(null, "Persona eliminada con exito.");
				} else {
					JOptionPane.showMessageDialog(null, "La posicion excede la longitud de la lista.");
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "La posicion debe ser un entero.");
			}
		}
		if (e.getActionCommand().equals("VOLVER")) {
			vpe.setVisible(false);
			va.setVisible(false);
			vp.setVisible(true);
		}
		if (e.getActionCommand().equals("GUARDAR_A")) {
			try {
				int nvl = Integer.parseInt(va.getPa().getIn_nvl_peligro().getText());
				adao.createAnimal(va.getPa().getIn_nom().getText(), va.getPa().getIn_habitat().getText(),
						va.getPa().getIn_alimen().getText(), nvl);
				JOptionPane.showMessageDialog(null, "Animal guardado con exito.");
				va.getPa().getIn_nom().setText("");
				va.getPa().getIn_alimen().setText("");
				va.getPa().getIn_habitat().setText("");
				va.getPa().getIn_nvl_peligro().setText("");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "El nivel de peligro de extincion debe ser un numero entero.");
			}
		}
		if (e.getActionCommand().equals("ELIMINAR_A")) {
			try {
				int pos = Integer.parseInt(va.getPa().getIn_pos_eliminar().getText());
				if (adao.deleteAnimal(pos)) {
					JOptionPane.showMessageDialog(null, "Animal eliminado con exito.");
					va.getPa().getIn_pos_eliminar().setText("");
				} else {
					JOptionPane.showMessageDialog(null, "La posicion excede la longitud de la lista.");
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "La posicion debe ser un entero.");
			}
		}

		if (e.getActionCommand().equals("M_PERSONAS")) {

			vm.getPm().ponerEnBlanco();

			if (pdao.getPersonas().isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay nada que listar", "Ojito!", JOptionPane.WARNING_MESSAGE);
				;
			} else {
				crearAuxiliarTitulo("Nombre  -  Edad  -  DoB  -  Altura", 150, 10);
				int pos = 50;
				for (int i = 0; i < pdao.getPersonas().size(); i++) {
					crearAuxiliar(pdao.mostrarUnaPersona(i), 180, pos);
					pos += 30;
				}
			}
			vm.repaint();
		}

		if (e.getActionCommand().equals("M_ANIMALES")) {
			vm.getPm().ponerEnBlanco();

			if (adao.getAnimales().isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay nada que listar", "Ojito!", JOptionPane.WARNING_MESSAGE);
				;
			} else {
				crearAuxiliarTitulo("Nombre  -  Habitat  -  Alimentacion  -  Nvl de Peligro", 60, 10);
				int pos = 50;
				for (int i = 0; i < adao.getAnimales().size(); i++) {
					crearAuxiliar(adao.mostrarUnAnimal(i), 160, pos);
					pos += 30;
				}
			}
			vm.repaint();
		}

		if (e.getActionCommand().equals("M_TODOS")) {
			vm.getPm().ponerEnBlanco();
			if (pdao.getPersonas().isEmpty() && adao.getAnimales().isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay nada que listar", "Ojito!", JOptionPane.WARNING_MESSAGE);
			} else {
				crearAuxiliarTitulo("Nombre  -  Edad  -  DoB  -  Altura", 150, 10);
				int pos = 50;
				for (int i = 0; i < pdao.getPersonas().size(); i++) {
					crearAuxiliar(pdao.mostrarUnaPersona(i), 180, pos);
					pos += 30;
				}
				crearAuxiliarTitulo("Nombre  -  Habitat  -  Alimentacion  -  Nvl de Peligro", 60, pos);
				pos+=30;
				for (int i = 0; i < adao.getAnimales().size(); i++) {
					crearAuxiliar(adao.mostrarUnAnimal(i), 180, pos);
					pos += 30;
				}
				
			}
			vm.repaint();

		}

	}

	/**
	 * Metodo para crear un titulo en la ventana mostrar
	 * 
	 * @param m mensaje a mostrar en el titulo
	 * @param x posicion x en el panel del titulo
	 * @param y posicion y en el panel del titulo
	 */
	public void crearAuxiliarTitulo(String m, int x, int y) {
		JLabel aux;
		aux = new JLabel(m);
		aux.setFont(new Font("Arial", Font.BOLD, 20));
		aux.setBounds(x, y, 500, 25);
		aux.setVisible(true);
		vm.getPm().getBox().add(aux);
	}

	/**
	 * Metodo para crear un texto en la ventana mostrar
	 * 
	 * @param m mensaje a mostrar
	 * @param x posicion en x
	 * @param y posicion en y
	 */
	public void crearAuxiliar(String m, int x, int y) {
		JLabel aux;
		aux = new JLabel(m);
		aux.setFont(new Font("Arial", Font.ITALIC, 20));
		aux.setBounds(x, y, 350, 25);
		aux.setVisible(true);
		vm.getPm().getBox().add(aux);
	}
}
