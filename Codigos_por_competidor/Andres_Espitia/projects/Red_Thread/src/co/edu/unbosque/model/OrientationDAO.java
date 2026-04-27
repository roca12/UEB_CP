package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * DAO de orientaciones sexuales
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class OrientationDAO {
	static public ArrayList<OrientationDTO> orientations;
	
	/**
	 * Constructor
	 */
	public OrientationDAO() {
		super();
		orientations = new ArrayList<OrientationDTO>();
		init();
	}
	
	private void init() {
		//Heterosexual Hombre
		ArrayList<String> aux = new ArrayList<>();
		aux.add("HeterosexualM");
		aux.add("BisexualM");
		aux.add("PansexualM");
		aux.add("DemisexualM");
		orientations.add(new OrientationDTO("Heterosexual", true, aux));
		//Heterosexual Mujer
		aux = new ArrayList<>();
		aux.add("HeterosexualH");
		aux.add("BisexualH");
		aux.add("PansexualH");
		aux.add("DemisexualH");
		orientations.add(new OrientationDTO("Heterosexual", false, aux));
		//Homosexual Hombre
		aux = new ArrayList<>();
		aux.add("HomosexualH");
		aux.add("BisexualH");
		aux.add("PansexualH");
		aux.add("DemisexualH");
		orientations.add(new OrientationDTO("Homosexual", true, aux));
		//Homosexual Mujer
		aux = new ArrayList<>();
		aux.add("HomosexualM");
		aux.add("BisexualM");
		aux.add("PansexualM");
		aux.add("DemisexualM");
		orientations.add(new OrientationDTO("Homosexual", false, aux));
		//Bisexual Hombre
		aux = new ArrayList<>();
		aux.add("HeterosexualM");
		aux.add("HomosexualM");
		aux.add("HomosexualH");
		aux.add("BisexualM");
		aux.add("BisexualH");
		aux.add("PansexualM");
		aux.add("PansexualH");
		aux.add("DemisexualM");
		aux.add("DemisexualH");
		orientations.add(new OrientationDTO("Bisexual", true, aux));
		//Bisexual Mujer
		aux = new ArrayList<>();
		aux.add("HeterosexualH");
		aux.add("HomosexualM");
		aux.add("HomosexualH");
		aux.add("BisexualM");
		aux.add("BisexualH");
		aux.add("PansexualM");
		aux.add("PansexualH");
		aux.add("DemisexualM");
		aux.add("DemisexualH");
		orientations.add(new OrientationDTO("Bisexual", false, aux));
		//Pansexual Hombre
		aux = new ArrayList<>();
		aux.add("HeterosexualM");
		aux.add("HomosexualM");
		aux.add("HomosexualH");
		aux.add("BisexualM");
		aux.add("BisexualH");
		aux.add("PansexualM");
		aux.add("PansexualH");
		aux.add("DemisexualM");
		aux.add("DemisexualH");
		aux.add("AsexualH");
		aux.add("AsexualM");
		orientations.add(new OrientationDTO("Pansexual", true, aux));
		//Pansexual Mujer
		aux = new ArrayList<>();
		aux.add("HeterosexualH");
		aux.add("HomosexualM");
		aux.add("HomosexualH");
		aux.add("BisexualM");
		aux.add("BisexualH");
		aux.add("PansexualM");
		aux.add("PansexualH");
		aux.add("DemisexualM");
		aux.add("DemisexualH");
		aux.add("AsexualH");
		aux.add("AsexualM");
		orientations.add(new OrientationDTO("Pansexual", false, aux));
		//Demisexual Hombre
		aux = new ArrayList<>();
		aux.add("DemisexualM");
		aux.add("HeterosexualM");
		aux.add("BisexualM");
		aux.add("PansexualM");
		orientations.add(new OrientationDTO("Demisexual", true, aux));
		//Demisexual Mujer
		aux = new ArrayList<>();
		aux.add("DemisexualH");
		aux.add("HeterosexualH");
		aux.add("BisexualH");
		aux.add("PansexualH");
		orientations.add(new OrientationDTO("Demisexual", false, aux));
		//Asexual Hombre
		aux = new ArrayList<>();
		aux.add("AsexualH");
		aux.add("AsexualM");
		orientations.add(new OrientationDTO("Asexual", true, aux));
		//Asexual Mujer
		aux = new ArrayList<>();
		aux.add("AsexualH");
		aux.add("AsexualM");
		orientations.add(new OrientationDTO("Asexual", false, aux));
	}
	
}
