package co.edu.unbosque.model;


public class EsPrimo {
	
	private int n;
	private String res;
	
	public EsPrimo() {
		n = 0;
		res = "";
	}
	
	public void resolver() {
		if(n==1 || n==2) {
			res="El número "+n+" es primo.";
		}
		for(int i=2; i<n; i++) {
			if((n%i)==0) {
				res="El número "+n+" NO es primo.";
				break;
			}
			else res="El número "+n+" es primo.";
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	
	public String toString() {
		return res;
	}
	
	
	
	
}
