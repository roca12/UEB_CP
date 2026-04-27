package model;

public class Inventario {
	
	
	private Prenda[] prendas;
	private int tamanio;
	private int pos;
	
	public Inventario(int t) {
		prendas = new Prenda[t];
		tamanio = t;
		pos = 0;
	}
	public int agregarPrenda(Prenda pPren) {
		int posi;
		if (pos<tamanio) {
		prendas[pos] = pPren;
		posi = pos;
		pos++;
	   }else {
		   posi = -1;
	   }
		return posi;	
	}
	
	public void eliminar(int pos) {
		prendas[pos] = null;
	}
	
	public String listarArreglo() {
		int i;
		String cad = "Lista de prendas\n";	
		for(i=0;i<tamanio;i++) {
		cad = cad + prendas[i].toString()+"\n";
		}
		return cad;
	
	}
	public int buscarPrendaporCodigo(int cod) {
		int i,posic = -1;
		boolean encontrado = false;
		for(i=0;i<pos&&encontrado!=true;i++) {
			if(prendas[i].getNombre().equalsIgnoreCase(null))
				posic = i;
		}
		return posic;
	}
	
}	
