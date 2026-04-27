package co.edu.unbosque.model;

public class Ej7 {
	private int n;
	private String res;
	
	public Ej7(){
		n = 0;
		res ="";
	}
	
	public void primoyNegativo() {
		
		if((n%2)==0 || (n%3)==0 || (n%5)==0 || (n%7)==0 || (n%11)==0) {
			res="No es primo";
		}
		else {
			res="Es primo";
		}
		if(n<0) {
			res=res+" y es negativo";
		}
		else {
			res=res+" y es positivo";
		}
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
