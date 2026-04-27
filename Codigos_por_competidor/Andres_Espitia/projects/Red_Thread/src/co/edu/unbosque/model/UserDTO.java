package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase DTO principal de usuario
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class UserDTO {
	/**
	 * Nombre 
	 */
	private String name;
	/**
	 * Primer apellido
	 */
	private String lastname1;
	/**
	 * Segundo apellido
	 */
	private String lastname2;
	/**
	 * Nombre de usuario
	 */
	private String alias;
	/**
	 * Orientacion sexual
	 */
	private String orientation;
	/**
	 * Intereses
	 */
	private ArrayList<String> interest;
	/**
	 * Correo electronico
	 */
	private String email;
	/**
	 * Genero
	 */
	private boolean gender;
	/**
	 * Fecha de nacimiento
	 */
	private Date birth;
	/**
	 * Edad
	 */
	private int age;
	/**
	 * Descripcion
	 */
	private String info;
	/**
	 * Cantidad de fotos
	 */
	private int photos;
	/**
	 * Ruta de fotos
	 */
	private ArrayList<String> url_photos;
	/**
	 * Cantidad de likes recibidos
	 */
	private int likes;
	/**
	 * Cantidad de likes enviados
	 */
	private int likes_sent;
	/**
	 * Estado
	 */
	private boolean status;
	/**
	 * Cantidad de matches
	 */
	private int matches;
	/**
	 * Pais de origen
	 */
	private String origin;
	/**
	 * Pais de residencia
	 */
	private String residence;
	/**
	 * Contacto
	 */
	private String contact;
	
	/**
	 * @param name
	 * @param lastname1
	 * @param lastname2
	 * @param alias
	 * @param orientation
	 * @param interest
	 * @param email
	 * @param gender
	 * @param birth
	 * @param age
	 * @param info
	 * @param photos
	 * @param url_photos
	 * @param likes
	 * @param likes_sent
	 * @param status
	 * @param matches
	 * @param origin
	 * @param residence
	 * @param contact
	 */
	public UserDTO(String name, String lastname1, String lastname2, String alias, String orientation,
			ArrayList<String> interest, String email, boolean gender, Date birth, int age, String info, int photos,
			ArrayList<String> url_photos, int likes, int likes_sent, boolean status, int matches, String origin,
			String residence, String contact) {
		super();
		this.name = name;
		this.lastname1 = lastname1;
		this.lastname2 = lastname2;
		this.alias = alias;
		this.orientation = orientation;
		this.interest = interest;
		this.email = email;
		this.gender = gender;
		this.birth = birth;
		this.age = age;
		this.info = info;
		this.photos = photos;
		this.url_photos = url_photos;
		this.likes = likes;
		this.likes_sent = likes_sent;
		this.status = status;
		this.matches = matches;
		this.origin = origin;
		this.residence = residence;
		this.contact = contact;
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
	 * @return the lastname1
	 */
	public String getLastname1() {
		return lastname1;
	}
	/**
	 * @param lastname1 the lastname1 to set
	 */
	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}
	/**
	 * @return the lastname2
	 */
	public String getLastname2() {
		return lastname2;
	}
	/**
	 * @param lastname2 the lastname2 to set
	 */
	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
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
	 * @return the interest
	 */
	public ArrayList<String> getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(ArrayList<String> interest) {
		this.interest = interest;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
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
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/**
	 * @return the photos
	 */
	public int getPhotos() {
		return photos;
	}
	/**
	 * @param photos the photos to set
	 */
	public void setPhotos(int photos) {
		this.photos = photos;
	}
	/**
	 * @return the url_photos
	 */
	public ArrayList<String> getUrl_photos() {
		return url_photos;
	}
	/**
	 * @param url_photos the url_photos to set
	 */
	public void setUrl_photos(ArrayList<String> url_photos) {
		this.url_photos = url_photos;
	}
	/**
	 * @return the likes
	 */
	public int getLikes() {
		return likes;
	}
	/**
	 * @param likes the likes to set
	 */
	public void setLikes(int likes) {
		this.likes = likes;
	}
	/**
	 * @return the likes_sent
	 */
	public int getLikes_sent() {
		return likes_sent;
	}
	/**
	 * @param likes_sent the likes_sent to set
	 */
	public void setLikes_sent(int likes_sent) {
		this.likes_sent = likes_sent;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the matches
	 */
	public int getMatches() {
		return matches;
	}
	/**
	 * @param matches the matches to set
	 */
	public void setMatches(int matches) {
		this.matches = matches;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the residence
	 */
	public String getResidence() {
		return residence;
	}
	/**
	 * @param residence the residence to set
	 */
	public void setResidence(String residence) {
		this.residence = residence;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
