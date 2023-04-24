package co.edu.unbosque.model;

public class VehicleDTO {
	private String plate;
	private int model;
	private String owner;
	private String city_origin;
	
	public VehicleDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param plate
	 * @param model
	 * @param owner
	 * @param city_origin
	 */
	public VehicleDTO(String plate, int model, String owner, String city_origin) {
		super();
		this.plate = plate;
		this.model = model;
		this.owner = owner;
		this.city_origin = city_origin;
	}

	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}

	/**
	 * @param plate the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}

	/**
	 * @return the model
	 */
	public int getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(int model) {
		this.model = model;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the city_origin
	 */
	public String getCity_origin() {
		return city_origin;
	}

	/**
	 * @param city_origin the city_origin to set
	 */
	public void setCity_origin(String city_origin) {
		this.city_origin = city_origin;
	}

	@Override
	public String toString() {
		return "Placa: "+plate+"\n"
				+ "Modelo: "+model+"\n"
				+ "Propietario: "+owner+"\n"
				+ "Ciudad: "+city_origin+"\n";
	}
}
