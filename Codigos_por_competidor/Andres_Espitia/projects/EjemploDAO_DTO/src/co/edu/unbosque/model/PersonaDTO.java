package co.edu.unbosque.model;

/**
 * 
 * @author Andrés Espitia
 * @author Diego Forero
 * Objeto DTO sobre personas
 */
public class PersonaDTO {
	/**
	 * Nombre de la persona
	 */
	private String nombre;
	/**
	 * Edad de la persona
	 */
	private int edad;
	/**
	 * Fecha de nacimiento de la persona
	 */
	private String fecha_nacimiento;
	/**
	 * Altura de la persona
	 */
	private float altura;
	
	/**
	 * Metodo constructor sin entradas
	 */
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor con entradas
	 * @param nombre nombre
	 * @param edad edad
	 * @param fecha_nacimiento fecha de nacimiento
	 * @param altura altura
	 */
	public PersonaDTO(String nombre, int edad, String fecha_nacimiento, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimiento;
		this.altura = altura;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the fecha_nacimiento
	 */
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void caminar() {
		
	}
}
