package co.edu.unbosque.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import co.edu.unbosque.model.persistence.FileHandler;

/**
 * Implementacion del DAO de usuario
 * 
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class UserDAOImpl implements UserDAO {
	/**
	 * Lista de usuarios
	 */
	private ArrayList<UserDTO> users;
	/**
	 * La fecha de nacimiento
	 */
	private Date birth;
	/**
	 * Formato de la fecha
	 */
	private SimpleDateFormat format;

	/**
	 * Constructor
	 */
	public UserDAOImpl() {
		super();
	}
	/**
	 * Metodo para cargar el archivo serializado
	 */
	public void loadSerializable() {
		users = (ArrayList<UserDTO>) FileHandler.readSerializable("Usuarios.uebfa");
	}
	/**
	 * Metodo para cargar los datos del archivo .csv
	 */
	public void loadData() {
		String content = FileHandler.loadFile("datosArreglados.csv");
		String rows[]= content.split("\n");
		boolean gender=true;
		boolean status=true;
		format = new SimpleDateFormat("dd/MM/yyyy"); 
		for (String r : rows) {
			String columns[]= r.split(";");
			if(columns[15].equals("Inactivo")) {
				status=false;
			}else {
				status=true;
			}
			if(columns[4].equals("H")) {
				gender=true;
			}else if(columns[4].equals("M")) {
				gender=false;
			}
			try {
				birth= format.parse(columns[8]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			users.add(new UserDTO(columns[1], columns[2], columns[3], columns[5], columns[16], null, columns[7], gender, birth, Integer.parseInt(columns[9]), null, 1, null,Integer.parseInt(columns[12]) , Integer.parseInt(columns[13]), status, Integer.parseInt(columns[14]), null, null, null));
		}
	}

	@Override
	public void createUser(UserDTO u) {
		users.add(u);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
	}

	@Override
	public boolean updateUser(int index, String new_name) {
		users.get(index).setName(new_name);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;
	}

	@Override
	public boolean updateUserLastName1(int index, String new_last_name1) {

		users.get(index).setLastname1(new_last_name1);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserLastName2(int index, String new_last_name2) {
		users.get(index).setLastname2(new_last_name2);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;
	}

	@Override
	public boolean updateUserAlias(int index, String new_alias) {
		users.get(index).setAlias(new_alias);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserOrigin(int index, String new_origin) {
		users.get(index).setOrigin(new_origin);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return false;
	}

	@Override
	public boolean updateUserResidence(int index, String new_residence) {
		users.get(index).setResidence(new_residence);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserContact(int index, String new_contact) {
		users.get(index).setContact(new_contact);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserPhotos(int index, int new_photos) {
		users.get(index).setPhotos(new_photos);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserLikes(int index, int new_likes) {
		users.get(index).setLikes(new_likes);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserMatches(int index, int new_matches) {
		users.get(index).setMatches(new_matches);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserInterest(int index, ArrayList<String> new_interest) {
		users.get(index).setInterest(new_interest);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserUrlPhotos(int index, ArrayList<String> new_url_photos) {
		users.get(index).setUrl_photos(new_url_photos);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserOrientation(int index, String new_orientation) {
		users.get(index).setOrientation(new_orientation);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUser(int index, Date new_birth) {
		users.get(index).setBirth(new_birth);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUser(int index, boolean new_status) {
		users.get(index).setStatus(new_status);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;
	}

	@Override
	public boolean deleteUser(int index) {
		users.remove(index);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}
	
	@Override
	public ArrayList<UserDTO> showCompatibles(int index) {
		ArrayList<UserDTO> aux = new ArrayList<UserDTO>();
		String orientationaux = users.get(index).getOrientation();
		int indx = 0;
		for (int j = 0; j < OrientationDAO.orientations.size(); j++) {
			if (OrientationDAO.orientations.get(j).getOrientation().equals(orientationaux) && OrientationDAO.orientations.get(j).isGender() == users.get(index).isGender()) {
				indx = j;
				break;
			}
		}
		for (int j = 0; j < users.size(); j++) {
			String suf = "";
			if (users.get(j).isGender()) {
				suf = "H";
			} else if (!users.get(j).isGender()) {
				suf = "M";
			}

			for (int k = 0; k < OrientationDAO.orientations.get(indx).getCompatible().size(); k++) {
				if (users.get(j).getOrientation() + suf == OrientationDAO.orientations.get(indx).getCompatible()
						.get(k)) {
					aux.add(users.get(j));
				}
			}
		}

		return aux;
	}

}