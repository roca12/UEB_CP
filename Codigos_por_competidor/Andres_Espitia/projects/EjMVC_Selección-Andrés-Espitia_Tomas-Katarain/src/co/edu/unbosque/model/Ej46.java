package co.edu.unbosque.model;

public class Ej46 {
	private int n;
	private String res;
	
	public Ej46(){
		n = 0;
		res ="";
	}
	
	public void determinarNum() {
		int d = n/10;
		int u = n%10;
		
		switch (u) {
			case 1:
				res = "El primero digito es: "+d;
				break;
			case 2:
				int sum =d+u;
				res = "La suma de los digitos es: "+sum;
				break;
			case 3:
				int mul = d*u;
				res ="El producto de los digitos es: "+mul;
				break;
			default:
				res = "No sea imbecil y que el numero termine en 1-2-3, su numero terminó en: "+u;
				break;
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
