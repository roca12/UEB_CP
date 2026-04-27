package co.edu.unbosque.Modelo;


public class Info {
	private String nombre;
	private String numero;
	private String residencia;
	

	public Info(String nombre, String numero, String residencia) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.residencia = residencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

		
	
}
