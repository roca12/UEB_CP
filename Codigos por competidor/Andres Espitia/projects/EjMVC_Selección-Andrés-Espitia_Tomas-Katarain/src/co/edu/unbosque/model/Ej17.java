package co.edu.unbosque.model;

public class Ej17 {
	private int n;
	private String res;
	
	public Ej17(){
		n = 0;
		res ="";
	}
	
	public void digitoMayor() {
		int c = n/100;
		int d = (n/10)%10;
		int u = n%10;
		
		if(c>=d && c>=u) {
			res="El digito mayor es: "+c+" y est� en la posici�n de las centenas(n�mero 1 desde la izquierda)";
		}
		else if(d>=u && d>=c) {
			res="El digito mayor es: "+d+" y est� en la posici�n de las decenas(n�mero 2 desde la izquierda)";
		}
		else {
			res="El digito mayor es: "+u+" y est� en la posici�n de las unidades(n�mero 3 desde la izquierda)";
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
