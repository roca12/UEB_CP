package co.edu.unbosque.model;

public class VehiclesPaintDaoImpl implements VehiclesDAO{
	private VehicleDTO[] vpd;

	public VehiclesPaintDaoImpl(int size) {
		vpd = new VehicleDTO[size];
		for (int i = 0; i < vpd.length; i++) {
			vpd[i] = new VehicleDTO();
		}
	}

	@Override
	public boolean addVehicle(VehicleDTO v) {
		for (int i = 0; i < vpd.length; i++) {
			if (!vpd[i].isOccuped()) {
				vpd[i] = v;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateProgress(String id_driver, int progress) {
		for (int i = 0; i < vpd.length; i++) {
			if (vpd[i].getId_driver().equals(id_driver)) {
				vpd[i].setProgress(progress);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean payReceipt(String id_driver, int money) {
		for (int i = 0; i < vpd.length; i++) {
			if (vpd[i].getId_driver().equals(id_driver) && vpd[i].getCost() <= money && vpd[i].getProgress()==3) {
				vpd[i].setOccuped(false);
				return true;
			}
		}
		return false;
	}

	@Override
	public String showProgress(String plate) {
		StringBuilder sb = new StringBuilder("Placa: " + plate);
		for (int i = 0; i < vpd.length; i++) {
			if (vpd[i].getPlate().equals(plate) && vpd[i].isOccuped()) {
				sb.append(", ENCONTRADA\n Avance >> ");
				switch (vpd[i].getProgress()) {
				case 0:
					sb.append("INICIADO");
					break;
				case 1:
					sb.append("MEDIO");
					break;
				case 2:
					sb.append("TERMINADO");
					break;
				}
				return sb.toString();
			}
		}
		sb.append(", NO ENCONTRADA");
		return sb.toString();
	}

	@Override
	public String showActive() {
		StringBuilder sb = new StringBuilder("Los siguientes vehiculos se encuentran en el Taller de Pintura: ");
		for (int i = 0; i < vpd.length; i++) {
			if(vpd[i].isOccuped()) sb.append("\nVehiculo de placas: "+vpd[i].getPlate()+" en la plaza: "+i);
		}
		return sb.toString();
	}
	
	@Override
	public boolean isHere(String plate) {
		for (int i = 0; i < vpd.length; i++) {
			if(vpd[i].getPlate().equals(plate)) {
				return true;
			}
		}
		return false;
	}
}
