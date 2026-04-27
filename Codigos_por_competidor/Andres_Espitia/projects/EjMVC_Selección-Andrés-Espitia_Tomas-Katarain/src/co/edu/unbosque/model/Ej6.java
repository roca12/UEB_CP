package co.edu.unbosque.model;

public class Ej6 {
	private int n;
	String res;
	
	public Ej6() {
		n=0;
		res = "";
	}
	
	public void esPrimo() {
		boolean pr = false;
		if(n==2 || n==3 || n==5 || n==7 || n==11 || n==13 || n==17 || n==19) pr=true;
		else pr=false;
		if(pr) res = "El número: "+n+", es primo";
		else res = "El número: "+n+", NO es primo";
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
