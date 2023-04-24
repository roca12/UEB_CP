package co.edu.unbosque.model;

public class Atm {
	public int costumers = 0;
	public int time = 0;
	
	public Atm() {
		costumers = 0;
	}
	
	public void addCustomer() {
		costumers = 1;
	}
	
	public void removeCustomer() {
		try {
			Thread.sleep(time/100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		costumers = 0;
	}
	
	public void setTime(int timeaux) {
		time = timeaux;
	}

	public boolean isOccupied() {
		if (this.costumers == 1) {			
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
