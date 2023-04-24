package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Date;
/**
 * DAO de Usuario
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public interface UserDAO {
	/**
	 * Metodo para crear usuario
	 * @param u
	 */
	public abstract void createUser(UserDTO u);
	//update Strings
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_name
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUser(int index, String new_name);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_last_name1
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserLastName1(int index, String new_last_name1);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_last_name2
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserLastName2(int index, String new_last_name2);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_orientation
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserOrientation(int index, String new_orientation);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_alias
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserAlias(int index, String new_alias);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_origin
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserOrigin(int index, String new_origin);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_residence
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserResidence(int index, String new_residence);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_contact
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserContact(int index, String new_contact);
	//update integers
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_photos
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserPhotos(int index, int new_photos);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_likes
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserLikes(int index, int new_likes);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_matches
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserMatches(int index, int new_matches);
	//update ArrayList<String>
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_interest
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserInterest(int index, ArrayList<String> new_interest);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_url_photos
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUserUrlPhotos(int index, ArrayList<String> new_url_photos);
	//update
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_birth
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUser(int index, Date new_birth);
	/**
	 * Metodo para actualizar el usuario
	 * @param name
	 * @param new_status
	 * @return actualizacion exitosa
	 */
	public abstract boolean updateUser(int index, boolean new_status);
	//delete
	/**
	 * Borrar usuario
	 * @return eliminacion exitosa
	 */
	public abstract boolean deleteUser(int index);
	/**
	 * Mostrar los compatibles
	 * @return Compatibles
	 */
	public abstract ArrayList<UserDTO> showCompatibles(int index);
}
