package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.FileHandler;
/**
 * Dao de planetas
 * @author Esteban Mejia
 * @author Andres Espitia
 *
 */
public class PlanetDAOImpl implements PlanetDAO{
	/**
	 * Lista de planetas
	 */
	private ArrayList<PlanetDTO>list;
	/**
	 * Metodo Constructor
	 */
	public PlanetDAOImpl() {
		list=new ArrayList<>();
		loadFile();
	}
	/**
	 * Metodo para sobreescribir el archivo
	 */
	public void writeFile() {
		String content = showAll();
		FileHandler.writeFile("planets.EM", content);
	}
/**
 * Metodo para cargar los datos
 */
	public void loadFile() {
		String content = FileHandler.loadFile("planets.EM");
		String[] lines = content.split("\n");
		for (String s : lines) {
			if (s.equals(""))
				continue;
			String[] columns = s.split(",");
			list.add(new PlanetDTO(columns[0],Float.parseFloat(columns[1]),Float.parseFloat(columns[2]),Integer.parseInt(columns[3]),Integer.parseInt(columns[4])));
		}

	}
	/**
	 * Metodo para agregar
	 */
	@Override
	public void addPlanet(String name, float gravity, float radio, int orbital_period, int age) {
		list.add(new PlanetDTO(name, gravity, radio, orbital_period, age));
		writeFile();

	}
	/**
	 * metodo para actualizar por index
	 */
	@Override
	public boolean updateByIndex(int index, int norbital_period, int nage) {
		if(index < list.size()) {
			list.get(index).setOrbital_period(norbital_period);
			list.get(index).setAge(nage);
			return true;
		}
		return false;
	}
	/**
	 * Metodo para actualizar por nombre
	 */
	@Override
	public boolean updateByName(String name, int nage) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).setAge(nage);
				return true;
			}
		}
		return false;
	}
	/**
	 * Metodo para eliminar por index
	 */
	@Override
	public boolean deleteByIndex(int index) {
		if(index < list.size()) {
			list.remove(index);
			return true;
		}
		return false;
	}
	/**
	 * Metodo para eliminar por nombre
	 */
	@Override
	public boolean deleteByName(String name) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
	/**
	 * Metodo para mostrar todo
	 */
	@Override
	public String showAll() {
		String res = "";
		for (PlanetDTO p : list) {
			res += p.toString();
		}
		return res;	
	}


}
