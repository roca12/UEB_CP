package co.edu.unbosque.model;

/**
 * 
 * @author Andrés Espitia
 * @author Diego Forero
 * Objeto DTO de tipo animal
 *
 */
public class AnimalDTO {
	/**
	 * Nombre del animal
	 */
	private String nombre;
	/**
	 * Habitat del animal
	 */
	private String habitat;
	/**
	 * Alimentacion del animal
	 */
	private String alimentacion;
	/**
	 * Nivel de peligro de extincion del animal
	 */
	private int nvl_peligro;
	
	/**
	 * Metodo Constructor sin entradas
	 */
	public AnimalDTO() {
		
	}

	/**
	 * Metodo constructor con entradas
	 * @param nombre nombre del animal
	 * @param habitat habitat del animal
	 * @param alimentacion alimentacion del animal
	 * @param nvl_peligro nivel de peligro del animal
	 */
	public AnimalDTO(String nombre, String habitat, String alimentacion, int nvl_peligro) {
		super();
		this.nombre = nombre;
		this.habitat = habitat;
		this.alimentacion = alimentacion;
		this.nvl_peligro = nvl_peligro;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the habitat
	 */
	public String getHabitat() {
		return habitat;
	}

	/**
	 * @param habitat the habitat to set
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	/**
	 * @return the alimentacion
	 */
	public String getAlimentacion() {
		return alimentacion;
	}

	/**
	 * @param alimentacion the alimentacion to set
	 */
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	/**
	 * @return the nvl_peligro
	 */
	public int getNvl_peligro() {
		return nvl_peligro;
	}

	/**
	 * @param nvl_peligro the nvl_peligro to set
	 */
	public void setNvl_peligro(int nvl_peligro) {
		this.nvl_peligro = nvl_peligro;
	}

	public void comer() {
		
	}
}
