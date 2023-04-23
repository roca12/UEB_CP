package co.edu.unbosque.model;

public class Ej16 {
	private int n;
	private String res;
	
	public Ej16(){
		n = 0;
		res = "";
	}
	
	public void minimo2Iguales() {
		int c = n/100;
		int d = (n/10)%10;
		int u = n%10;
		
		if(c==d || c==u || u==d) res = "Dos numeros son iguales dentro del numero: "+n;
		else res = "Ninguno de los numeros son iguales dentro del numero: " +n;
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
