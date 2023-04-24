package co.edu.unbosque.model;

public class Nodeq {
	private CarDTO car;
	private int type;
    private Nodeq next;
    
    public void Nodo(){
        this.car = null;
        this.next = null;
        this.type = 0;
    }

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}



	public CarDTO getCar() {
        return car;
    }

    public void setCar(CarDTO car) {
        this.car = car;
    }

    public Nodeq getNext() {
        return next;
    }

    public void setNext(Nodeq next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
    	String types = "";
    	String sectors = "";
    	switch (type) {
		case 1:
			types = "Mercancia";
			break;
		case 2:
			types = "Giro";
			break;
		}
    	
    	switch (car.getSector()) {
		case 1:
			sectors = "Sur";
			break;
		case 2:
			sectors = "Norte";
			break;
		case 3:
			sectors = "Oriente";
			break;
		case 4:
			sectors = "Occidente";
			break;
		}
    	
    	return "\nNit del Cliente:" + car.getClient_id()+ 
				"\nDireccion destino: " + car.getDestination() + 
				"\nSector: " + sectors +
				"\nTipo de servicio: "+types;
    }
}
