package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public int sumar( Numero otro) {
		return n + otro.n;
	}
	
	public int restar( Numero otro) {
		return n - otro.n;
	}

}
