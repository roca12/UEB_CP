package co.edu.unbosque.model;

public class Ej37 {
	private int n;
	private int n2;
	private String res;
	
	public Ej37(){
		n = 0;
		n2 = 0;
		res ="";
	}
	
	public void cualMultiplo() {
		if(n%n2==0) res = "El número "+n+" es multiplo del número: "+n2;
		else if(n2%n==0) res = "El número "+n2+" es multiplo del número: "+n;
		else res = "Ninguno de los números: "+n+", "+n2+" es multiplo del otro.";
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return res;
	}
}
