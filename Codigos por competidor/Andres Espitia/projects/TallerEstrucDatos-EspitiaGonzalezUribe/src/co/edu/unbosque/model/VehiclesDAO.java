package co.edu.unbosque.model;

public interface VehiclesDAO {
	public abstract boolean addVehicle(VehicleDTO v);
	public abstract boolean updateProgress(String id_driver, int progress);
	public abstract boolean payReceipt(String id_driver, int money);
	public abstract String showProgress(String plate);
	public abstract String showActive();
	public abstract boolean isHere(String plate);
}
