package co.edu.unbosque.model;

import java.util.ArrayList;

public class Descomposicion {
	
	private int n;
	private ArrayList<Integer> descomp;
	private ArrayList<Integer> primos;
	
	public Descomposicion() {
		n = 0; 
		descomp = new ArrayList<Integer>();
		primos = new ArrayList<Integer>();
	}
	
	public void factoresPrimos() {
		descomp.clear();
		primosHasta(n);
		int aux = n;
		int i=0;
		while(true) {
			if(aux==1) break;
			else if(aux%primos.get(i)==0) {
				descomp.add(primos.get(i));
				aux = aux/primos.get(i);
				i = 0;
			}
			else i++;
		}
	}

	public String imprimirArreglo() {
		String res = descomp.toString();
		return res;
	}
	
	public void primosHasta(int n) {
		for(int i=2; i<=n; i++) {
			boolean pr = true;
			for(int j=2; j<i; j++) {
				if((i%j)==0) {
					pr = false;
					break;
				}
			}
			if(pr) primos.add(i);
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	

	public ArrayList<Integer> getPrimos() {
		return primos;
	}

	public void setPrimos(ArrayList<Integer> primos) {
		this.primos = primos;
	}

	public ArrayList<Integer> getDescomp() {
		return descomp;
	}

	public void setDescomp(ArrayList<Integer> descomp) {
		this.descomp = descomp;
	}
	
	
	
}
