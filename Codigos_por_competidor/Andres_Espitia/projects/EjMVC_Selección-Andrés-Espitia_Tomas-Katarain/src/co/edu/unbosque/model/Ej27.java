package co.edu.unbosque.model;

public class Ej27 {
	private int n;
	private int cont;
	private String res;
	
	public Ej27(){
		n = 0;
		cont = 0;
		res ="";
	}
	
	public void cuantosPares() {
		int m = n/1000;
		int c = (n/100)%10;
		int d = (n/10)%10;
		int u = n%10;
		
		if(m%2==0) {
			cont++;
		}
		if(c%2==0) {
			cont++;
		}
		if(d%2==0) {
			cont++;
		}
		if(u%2==0) {
			cont++;
		}
		
		res = "El número "+n+" tiene un total de "+cont+" digitos pares";
		
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
