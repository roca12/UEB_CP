package co.edu.unbosque.model;

public class Ej26 {
	private int n;
	private String res;
	
	public Ej26() {
		n = 0;
		res = "";
	}
	
	public void sumaDe4Cifras() {
		int m = n/1000;
		int c = (n/100)%10;
		int d = (n/10)%10;
		int u = n%10;
		
		int sum = m+c+d+u;
		res = "La suma es: "+sum;
		
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return res;
	}
	
	
	
}
