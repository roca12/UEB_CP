package co.edu.unbosque.model;

public class VehiclesMechanicDaoImpl implements VehiclesDAO {
	private VehicleDTO[] vmd;

	public VehiclesMechanicDaoImpl(int size) {
		vmd = new VehicleDTO[size];
		for (int i = 0; i < vmd.length; i++) {
			vmd[i] = new VehicleDTO();
		}
	}

	@Override
	public boolean addVehicle(VehicleDTO v) {
		for (int i = 0; i < vmd.length; i++) {
			if (!vmd[i].isOccuped()) {
				vmd[i] = v;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateProgress(String id_driver, int progress) {
		for (int i = 0; i < vmd.length; i++) {
			if (vmd[i].getId_driver().equals(id_driver)) {
				vmd[i].setProgress(progress);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean payReceipt(String id_driver, int money) {
		for (int i = 0; i < vmd.length; i++) {
			if (vmd[i].getId_driver().equals(id_driver) && vmd[i].getCost() <= money && vmd[i].getProgress()==3) {
				vmd[i].setOccuped(false);
				return true;
			}
		}
		return false;
	}

	@Override
	public String showProgress(String plate) {
		StringBuilder sb = new StringBuilder("Placa: " + plate);
		for (int i = 0; i < vmd.length; i++) {
			if (vmd[i].getPlate().equals(plate) && vmd[i].isOccuped()) {
				sb.append(", ENCONTRADA\n Avance >> ");
				switch (vmd[i].getProgress()) {
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
		StringBuilder sb = new StringBuilder("Los siguientes vehiculos se encuentran en el Taller Mecánico: ");
		for (int i = 0; i < vmd.length; i++) {
			if(vmd[i].isOccuped()) sb.append("\nVehiculo de placas: "+vmd[i].getPlate()+" en la plaza: "+i);
		}
		return sb.toString();
	}

	@Override
	public boolean isHere(String plate) {
		for (int i = 0; i < vmd.length; i++) {
			if(vmd[i].getPlate().equals(plate)) {
				return true;
			}
		}
		return false;
	}
	
	

}
