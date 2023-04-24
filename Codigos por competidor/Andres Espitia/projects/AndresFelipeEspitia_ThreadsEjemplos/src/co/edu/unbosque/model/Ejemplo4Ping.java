package co.edu.unbosque.model;

public class Ejemplo4Ping extends Thread{
	private String palabra;
	private int tiempoDeEspera;
	
	public Ejemplo4Ping(String queImprimir, int cantidadSegundos) {
		palabra = queImprimir;
		tiempoDeEspera = cantidadSegundos;
	}
	
	public void run() {
		while(true) {
			System.out.println(palabra + "");
			try {
				sleep(tiempoDeEspera);
			}catch (InterruptedException e) {
				return;
			}
		}
	}
}
