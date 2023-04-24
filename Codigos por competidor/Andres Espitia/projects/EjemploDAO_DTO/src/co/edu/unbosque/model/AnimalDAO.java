package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * 
 * @author Andrés Espitia
 * @author Diego Forero
 * 
 * DAO que permite acceder a los animales guardados
 *
 */
public class AnimalDAO {
	/**
	 * Lista dinamica que permite guardar los animales guardados
	 */
	private ArrayList<AnimalDTO> animales;

	/**
	 * Metodo Constructor
	 */
	public AnimalDAO() {
		animales = new ArrayList<>();
	}

	/**
	 * @return the animales
	 */
	public ArrayList<AnimalDTO> getAnimales() {
		return animales;
	}

	/**
	 * @param animales the animales to set
	 */
	public void setAnimales(ArrayList<AnimalDTO> animales) {
		this.animales = animales;
	}

	/**
	 * Metodo para crear un animal
	 * @param n nombre
	 * @param hab habitat
	 * @param ali alimentacion
	 * @param nvl nivel de peligro
	 */
	public void createAnimal(String n, String hab, String ali, int nvl) {
		AnimalDTO aux = new AnimalDTO(n, hab, ali, nvl);
		animales.add(aux);
	}

	/**
	 * Metodo que elimina un animal
	 * @param pos posicion a eliminar
	 * @return si se pudo eliminar o no el personaje
	 */
	public boolean deleteAnimal(int pos) {
		try {
			animales.remove(pos);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Metodo que permite mostrar la lista de animales
	 * @return Lista de animales en formato string
	 */
	public String showAnimal() {
		StringBuilder sb = new StringBuilder("Lista de animales");
		for (AnimalDTO p : animales) {
			sb.append("\n");
			sb.append("Nombre: " + p.getNombre());
			sb.append("\n");
			sb.append("Habitat: " + p.getHabitat());
			sb.append("\n");
			sb.append("Alimentacion: " + p.getAlimentacion());
			sb.append("\n");
			sb.append("Nivel Peligro Extincion: " + p.getNvl_peligro());
			sb.append("______________________________\n");
		}
		return sb.toString();
	}

	/**
	 * Metodo que permite mostrar un solo animal
	 * @param pos posicion a mostrar
	 * @return animal en formato string que se queria mostrar
	 */
	public String mostrarUnAnimal(int pos) {
		StringBuilder sb = new StringBuilder("");
		sb.append(animales.get(pos).getNombre());
		sb.append(" - ");
		sb.append(animales.get(pos).getHabitat());
		sb.append(" - ");
		sb.append(animales.get(pos).getAlimentacion());
		sb.append(" - ");
		sb.append(animales.get(pos).getNvl_peligro());
		return sb.toString();
	}

	/**
	 * Metodo que permite cambiar un animal
	 * @param pos posicion a cambiar
	 * @param new_name nuevo nombre del animal
	 * @return si se pudo cambiar o no
	 */
	public boolean updateAnimal(int pos, String new_name) {
		try {
			animales.get(pos).setNombre(new_name);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
