package co.edu.unbosque.model;

public class Bank extends CarDTO{

	/**
	 * 
	 */
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param client_id
	 * @param destination
	 * @param sector
	 */
	public Bank(int client_id, String destination, int sector) {
		super(client_id, destination, sector);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String sectorm = "";
		switch (sector) {
		case 1:
			sectorm = "Sur";
			break;
		case 2:
			sectorm = "Norte";
			break;
		case 3:
			sectorm = "Oriente";
			break;
		case 4:
			sectorm = "Occidente";
			break;

		default:
			break;
		}
		return "\nNit del Cliente:" + client_id + 
				"\nDireccion destino: " + destination + 
				"\nSector: " + sectorm +
				"\nTipo de servicio: Giro";
	}
}
