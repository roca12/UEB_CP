package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Conjuntos {
	private ArrayList<String> primerTermino;
	private ArrayList<String> segundoTermino;
	private ArrayList<String> conjunto;
	
	public Conjuntos() {
		primerTermino = new ArrayList<>();
		segundoTermino = new ArrayList<>();
		conjunto = new ArrayList<>();
	}
	
	public void recibirConjunto(String cadena) {
		int c = 1, pos = 1;
		String[] dividir = cadena.split(",");
		for(int i=0; i<dividir.length; i++) {
			if(c==1) {
				primerTermino.add(dividir[i]);
				c++;
			}else if(c==2) {
				segundoTermino.add(dividir[i]);
				c--;
			}
		}
	}
	
	public void recibirConjuntoBase(String cadena) {
		String[] dividir = cadena.split(",");
		for(int i=0; i<dividir.length; i++) {
			conjunto.add(dividir[i]);
		}
	}
	
	public String impr() {
		String aux = "";
		
		aux = aux+"A = {";
		aux = aux + conjunto.get(0);
		for(int i = 1; i<conjunto.size(); i++) {
			aux = aux +","+conjunto.get(i);
		}
		aux = aux+"}\n";
		
		
		aux = aux + "R = {";
		for(int i = 0; i<primerTermino.size(); i++) {
			aux = aux + "("+primerTermino.get(i)+","+segundoTermino.get(i)+")";
		}
		aux = aux+"}\n";
		return aux;
	}
	
	public boolean reflexiva() {
		for(int i=0; i<conjunto.size(); i++) {
			boolean aux = false;
			for(int j=0; j<primerTermino.size(); j++) {
				if(primerTermino.get(j).equals(segundoTermino.get(j)) && conjunto.get(i).equals(primerTermino.get(j))) {
					aux = true;
					break;
				}
			}
			if(aux == false) {
				return false;
			}
		}
		return true;
	}
	
	public boolean simetrica() {
		for(int i=0; i<primerTermino.size(); i++) {
			boolean aux = false;
			for(int j=0; j<primerTermino.size(); j++) {
				if(i==j) break;
				if(primerTermino.get(i).equals(segundoTermino.get(j)) && segundoTermino.get(i).equals(primerTermino.get(j))) {
					aux = true;
					break;
				}
			}
			if(aux == false) {
				return false;
			}
		}
		return true;
	}
	
	public boolean antisimetrica() {
		for(int i=0; i<primerTermino.size(); i++) {
			if(primerTermino.get(i).equals(segundoTermino.get(i))) {
				
			}else {
				for(int j=0; j<primerTermino.size(); j++) {
					if(j!=i && primerTermino.get(i).equals(segundoTermino.get(j)) && segundoTermino.get(i).equals(primerTermino.get(j))){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public boolean transitiva() {
		for(int i=0; i<primerTermino.size(); i++) {
			for(int j=0; j<primerTermino.size(); j++) {
				if(segundoTermino.get(i).equals(primerTermino.get(j))) {
					String aux1 = primerTermino.get(i), aux2 = segundoTermino.get(j);
					boolean aux = false;
					for(int z=0; z<primerTermino.size(); z++) {
						if(primerTermino.get(z).equals(aux1) && segundoTermino.get(z).equals(aux2)) {
							aux = true;
							break;
						}
					}
					if(aux == false) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
