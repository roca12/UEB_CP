package co.edu.unbosque.model;

public class VehiclesTinDaoImpl implements VehiclesDAO{
	private VehicleDTO[] vtd;

	public VehiclesTinDaoImpl(int size) {
		vtd = new VehicleDTO[size];
		for (int i = 0; i < vtd.length; i++) {
			vtd[i] = new VehicleDTO();
		}
	}

	@Override
	public boolean addVehicle(VehicleDTO v) {
		for (int i = 0; i < vtd.length; i++) {
			if (!vtd[i].isOccuped()) {
				vtd[i] = v;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateProgress(String id_driver, int progress) {
		for (int i = 0; i < vtd.length; i++) {
			if (vtd[i].getId_driver().equals(id_driver)) {
				vtd[i].setProgress(progress);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean payReceipt(String id_driver, int money) {
		for (int i = 0; i < vtd.length; i++) {
			if (vtd[i].getId_driver().equals(id_driver) && vtd[i].getCost() <= money && vtd[i].getProgress()==3) {
				vtd[i].setOccuped(false);
				return true;
			}
		}
		return false;
	}

	@Override
	public String showProgress(String plate) {
		StringBuilder sb = new StringBuilder("Placa: " + plate);
		for (int i = 0; i < vtd.length; i++) {
			if (vtd[i].getPlate().equals(plate) && vtd[i].isOccuped()) {
				sb.append(", ENCONTRADA\n Avance >> ");
				switch (vtd[i].getProgress()) {
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
		StringBuilder sb = new StringBuilder("Los siguientes vehiculos se encuentran en el Taller de Latoneria: ");
		for (int i = 0; i < vtd.length; i++) {
			if(vtd[i].isOccuped()) sb.append("\nVehiculo de placas: "+vtd[i].getPlate()+" en la plaza: "+i);
		}
		return sb.toString();
	}
	
	@Override
	public boolean isHere(String plate) {
		for (int i = 0; i < vtd.length; i++) {
			if(vtd[i].getPlate().equals(plate)) {
				return true;
			}
		}
		return false;
	}
}
