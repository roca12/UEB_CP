package co.edu.unbosque.model;

public class Ej47 {
	private int n;
	private int n2;
	private int rest;
	private int m1, c1, d1, u1;
	private int m2, c2, d2, u2;
	private String res;
	
	public Ej47(){
		n = 0;
		n2 = 0;
		rest = 0;
		res ="";
	}
	
	public void resolverG(boolean ord) {
		if(ord) {
			if(n2>n) {
				int aux = n;
				n = n2;
				n2 = aux;
			}
		}
		rest = n-n2;
		if(rest%2==0) resolverPar();
		if(rest==2 ||rest==3 || rest==5 || rest==7) resolverPrimo();
		if((rest%10)==4) resolverCuatro();
		if((rest%2!=0) && (rest!=2 ||rest!=3 || rest!=5 || rest!=7) && ((rest%10)!=4)) res = "No cumple ninguna condición, deberia intentar otro par de números :)";
	}
	
	public void cifras1() {
		m1 = n/1000;
		c1 = (n/100)%10;
		d1 = (n/10)%10;
		u1 = n%10;
	}
	
	public void cifras2() {
		m2 = n/1000;
		c2 = (n/100)%10;
		d2 = (n/10)%10;
		u2 = n%10;
	}	
	
	public void resolverPar() {
		int sum = m1 + m2 + c1 + c2 + d1 + d2 + u1 + u2;
		res = res+"La resta de su número: "+rest+" ha dado un número par, por lo cual la suma de todos los digitos de: "+n+" y "+n2+" es de "+sum+"\n";
	}
	
	public void resolverPrimo() {
		int prod = n*n2;
		res = res+"\n La resta de su número: "+rest+" ha dado un número primo menor a 10, por lo cual el producto de ambos numeros es: "+n+"x"+n2+"="+prod+"\n";
	}
	
	public void resolverCuatro() {
		res = res+"\n La resta de su número; "+rest+" ha finalizado en el digito 4, por lo cual los digitos de los números son: \nN1: "+m1+" "+c1+" "+d1+" "+u1+"\nN2: "+m2+" "+c2+" "+d2+" "+u2;
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
