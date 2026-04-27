package model;

public class Prenda {	
	
	
	private String nombre;
	private int codigo;
	private int talla;
	private String color;
	private int cantidad;
	private int preciov;
	private int precioc;
	
	public Prenda (int pCod, String pNom, int pTall, String pCol, int pCant, int pPreV, int pPreC) {
		nombre = pNom;
		codigo = pCod;
		talla = pTall;
		color = pCol;
		cantidad = pCant;
		preciov = pPreV;
		precioc = pPreC;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNom) {
		this.nombre = pNom;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int pCod) {
		this.codigo = pCod;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int pTall) {
		this.talla = pTall;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String pCol) {
		this.color = pCol;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int pCant) {
		this.cantidad = pCant;
	}

	public int getPreciov() {
		return preciov;
	}

	public void setPreciov(int pPreV) {
		this.preciov = pPreV;
	}

	public int getPrecioc() {
		return precioc;
	}

	public void setPrecioc(int pPreC) {
		this.precioc = pPreC;
	}
	
	
}



