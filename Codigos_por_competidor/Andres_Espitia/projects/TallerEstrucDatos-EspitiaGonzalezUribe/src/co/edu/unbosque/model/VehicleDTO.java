package co.edu.unbosque.model;

public class VehicleDTO {
	private int progress;
	private String plate;
	private String id_driver;
	private String name_driver;
	private String contact_number;
	private boolean occuped;
	private int cost;
	
	public VehicleDTO() {
		plate = "";
		id_driver = "";
		occuped = false;
	}
	
	public VehicleDTO(String plate, String id_driver, String name_driver, String contact_number, int cost) {
		this.progress = 1;
		this.cost = cost;
		this.plate = plate;
		this.id_driver = id_driver;
		this.name_driver = name_driver;
		this.contact_number = contact_number;
		this.occuped = true;
	}


	/**
	 * @return the progress
	 */
	public int getProgress() {
		return progress;
	}


	/**
	 * @param progress the progress to set
	 */
	public void setProgress(int progress) {
		this.progress = progress;
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
	 * @return the id_driver
	 */
	public String getId_driver() {
		return id_driver;
	}


	/**
	 * @param id_driver the id_driver to set
	 */
	public void setId_driver(String id_driver) {
		this.id_driver = id_driver;
	}

	/**
	 * @return the name_driver
	 */
	public String getName_driver() {
		return name_driver;
	}

	/**
	 * @param name_driver the name_driver to set
	 */
	public void setName_driver(String name_driver) {
		this.name_driver = name_driver;
	}

	/**
	 * @return the contact_number
	 */
	public String getContact_number() {
		return contact_number;
	}


	/**
	 * @param contact_number the contact_number to set
	 */
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}


	/**
	 * @return the occuped
	 */
	public boolean isOccuped() {
		return occuped;
	}


	/**
	 * @param occuped the occuped to set
	 */
	public void setOccuped(boolean occuped) {
		this.occuped = occuped;
	}


	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}


	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
}
