package co.edu.unbosque.model;

public class CarDTO {
	int client_id;
	String destination;
	int sector;
	
	public CarDTO() {
		
	}
	
	/**
	 * @param client_id
	 * @param destination
	 * @param sector
	 */
	public CarDTO(int client_id, String destination, int sector) {
		super();
		this.client_id = client_id;
		this.destination = destination;
		this.sector = sector;
	}

	/**
	 * @return the client_id
	 */
	public int getClient_id() {
		return client_id;
	}

	/**
	 * @param client_id the client_id to set
	 */
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the sector
	 */
	public int getSector() {
		return sector;
	}

	/**
	 * @param sector the sector to set
	 */
	public void setSector(int sector) {
		this.sector = sector;
	}
	
	
}
