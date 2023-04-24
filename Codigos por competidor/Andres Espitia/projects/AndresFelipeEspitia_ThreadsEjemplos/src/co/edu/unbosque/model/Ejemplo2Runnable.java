package co.edu.unbosque.model;

public class Ejemplo2Runnable implements Runnable{
	private String descripcion;
	
	public Ejemplo2Runnable(String str) {
		descripcion = str;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(descripcion + ": Este es el Thread "+ Thread.currentThread().getName());
		}
	}

}
