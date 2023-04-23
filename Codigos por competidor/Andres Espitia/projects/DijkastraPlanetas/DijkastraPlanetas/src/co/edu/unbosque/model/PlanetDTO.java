package co.edu.unbosque.model;
/**
 * Clase dto de planetas
 * @author Esteban Mejia
 * @author Andres Espitia
 *
 */
public class PlanetDTO {
	/**
	 * nombre
	 */
 private String name;
 /**
  * gravedad
  */
 private float gravity;
 /**
  * radio
  */
 private float radio;
 /**
  * Periodo orbital
  */
 private int orbital_period;
 /**
  * edad
  */
 private int age;
 /**
  * Metodo constructor
  */
 public PlanetDTO() {
	// TODO Auto-generated constructor stub
}
/**
 * @param name el nombre
 * @param gravity la gravedad
 * @param radio el radio
 * @param orbital_period el perido
 * @param age la edad
 */
public PlanetDTO(String name, float gravity, float radio, int orbital_period, int age) {
	super();
	this.name = name;
	this.gravity = gravity;
	this.radio = radio;
	this.orbital_period = orbital_period;
	this.age = age;
}
/**
 * Metodo para mostrar
 */
@Override
	public String toString() {
	String res="";
	res+=this.name+","+this.gravity+","+this.radio+","+this.orbital_period+","+this.age+"\n";
	return res;
	}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the gravity
 */
public float getGravity() {
	return gravity;
}
/**
 * @param gravity the gravity to set
 */
public void setGravity(float gravity) {
	this.gravity = gravity;
}
/**
 * @return the radio
 */
public float getRadio() {
	return radio;
}
/**
 * @param radio the radio to set
 */
public void setRadio(float radio) {
	this.radio = radio;
}
/**
 * @return the orbital_period
 */
public int getOrbital_period() {
	return orbital_period;
}
/**
 * @param orbital_period the orbital_period to set
 */
public void setOrbital_period(int orbital_period) {
	this.orbital_period = orbital_period;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
 
}
