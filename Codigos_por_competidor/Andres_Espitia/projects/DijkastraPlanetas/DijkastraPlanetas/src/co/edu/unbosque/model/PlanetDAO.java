package co.edu.unbosque.model;
/**
 * Interface de dao de planetas
 * @author Esteban Mejia
 * @author Andres Espitia
 *
 */
public interface PlanetDAO {
	/**
	 * Metodo que agrega planetas
	 * @param name nombre
	 * @param gravity gravedad
	 * @param radio radio 
	 * @param orbital_period periodo orbital
	 * @param age edad
	 */
public abstract void addPlanet(String name, float gravity,float radio, int orbital_period, int age);
/**
 * Metodo que elimina por index
 * @param index index
 */
public abstract boolean deleteByIndex(int index);
/**
 * metodo que elimina por nombre
 * @param name nombre
 */
public abstract boolean deleteByName(String name);
/**
 * Metodo que actualiza por index 
 * @param index index
 * @param ngravity nueva gravedad
 * @param nradio nuevo radio
 * @param norbital_period nuevo periodo orbital
 * @param nage nueva edad
 */
public abstract boolean updateByIndex(int index, int norbital_period, int nage);
/**
 * Metodo que actualiza por nombre
 * @param name nombre
 * @param ngravity nueva gravedad
 * @param nradio nuevo radio
 * @param norbital_period nuevo periodo orbital
 * @param nage nueva edad
 */
public abstract boolean updateByName(String name, int nage);
/**
 * Metodo que muestra todo
 * @return String
 */
public abstract String showAll();

}
