package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * Clase DTO que contiene las orientaciones sexuales
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class OrientationDTO {
	/**
	 * Orientacion sexual
	 */
	private String orientation;
	/**
	 * Genero
	 */
	private boolean gender;
	/**
	 * Orientaciones sexuales con las que es compatible
	 */
	private ArrayList<String> compatible;
	
	/**
	 * @param orientation
	 * @param gender
	 * @param compatible
	 */
	public OrientationDTO(String orientation, boolean gender, ArrayList<String> compatible) {
		super();
		this.orientation = orientation;
		this.gender = gender;
		this.compatible = compatible;
	}
	/**
	 * @return the orientation
	 */
	public String getOrientation() {
		return orientation;
	}
	/**
	 * @param orientation the orientation to set
	 */
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	/**
	 * @return the compatible
	 */
	public ArrayList<String> getCompatible() {
		return compatible;
	}
	/**
	 * @param compatible the compatible to set
	 */
	public void setCompatible(ArrayList<String> compatible) {
		this.compatible = compatible;
	}
	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
}
