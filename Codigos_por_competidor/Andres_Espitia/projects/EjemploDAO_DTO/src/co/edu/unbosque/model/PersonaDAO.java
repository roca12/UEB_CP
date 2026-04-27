package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * 
 * @author Andrés Espitia
 * @author Diego Forero
 * 
 * DAO que permite acceder a las personas
 *
 */
public class PersonaDAO {
	/**
	 * Lista dinamica que almacena las personas
	 */
	private ArrayList<PersonaDTO> personas;

	/**
	 * Metodo constructor
	 */
	public PersonaDAO() {
		personas = new ArrayList<>();
	}

	/**
	 * @return the personas
	 */
	public ArrayList<PersonaDTO> getPersonas() {
		return personas;
	}

	/**
	 * @param personas the personas to set
	 */
	public void setPersonas(ArrayList<PersonaDTO> personas) {
		this.personas = personas;
	}

	/**
	 * Metodo para crear una persona
	 * @param n nombre de la persona
	 * @param e edad de la persona
	 * @param dof fecha de nacimiento de la persona
	 * @param a altura de la persona
	 */
	public void createPersona(String n, int e, String dof, float a) {
		PersonaDTO aux = new PersonaDTO(n, e, dof, a);
		personas.add(aux);
	}

	/**
	 * Metodo para eliminar una persona
	 * @param pos posicion a eliminar
	 * @return si se elimino la persona
	 */
	public boolean deletePersona(int pos) {
		try {
			personas.remove(pos);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Metodo que permite mostrar todas las personas
	 * @return Lista de personas en formato string
	 */
	public String showPersona() {
		StringBuilder sb = new StringBuilder("Lista de personas");
		for (PersonaDTO p : personas) {
			sb.append("\n");
			sb.append("Nombre: " + p.getNombre());
			sb.append(" - ");
			sb.append("Edad: " + p.getEdad());
			sb.append(" - ");
			sb.append("Fecha Nacimiento: " + p.getFecha_nacimiento());
			sb.append(" - ");
			sb.append("Altura: " + p.getAltura());
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Metodo para mostrar una sola persona
	 * @param pos posicion a mostrar
	 * @return persona que se queria mostrar en formato string
	 */
	public String mostrarUnaPersona(int pos) {
		StringBuilder sb = new StringBuilder("");
		sb.append(personas.get(pos).getNombre());
		sb.append(" - ");
		sb.append(personas.get(pos).getEdad());
		sb.append(" - ");
		sb.append(personas.get(pos).getFecha_nacimiento());
		sb.append(" - ");
		sb.append(personas.get(pos).getAltura());
		return sb.toString();
	}

	/**
	 * Metodo que permite actualizar a la persona
	 * @param pos posicion a actualizar
	 * @param new_name nuevo nombre
	 * @return si se pudo actualizar
	 */
	public boolean updatePersona(int pos, String new_name) {
		try {
			personas.get(pos).setNombre(new_name);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
