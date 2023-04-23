package co.edu.unbosque.model;

public class Ej36 {
	private int n;
	private String res; 
	
	public Ej36(){
		n=0;
		res="";
	}
	
	public void determinarParesImpares() {
		int m = n/1000;
		int c = (n/100)%10;
		int d = (n/10)%10;
		int u = n%10;
		int imp=0, par =0;
		
		if(m%2==0) par++;
		else imp++;

		if(c%2==0) par++;
		else imp++;
				
		if(d%2==0) par++;
		else imp++;
				
		if(u%2==0) par++;
		else imp++;
		
		if(par>imp) res = "Hay m�s numeros pares en el n�mero: "+n;
		else if(imp>par) res = "Hay m�s numeros impares en el n�mero: "+n;
		else res = "Hay misma cantidad de n�meros pares e impares en el n�mero: "+n;
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
