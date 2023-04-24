package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class VistaVentana {
		
		public VistaVentana() {
			
		}
		
		public void mostrarInfo(String mensaje) {
			JOptionPane.showMessageDialog(null, mensaje);
		}
		
		public int pedirDatoEntero(String mensaje) {
			boolean rep = false;
			int dato = 0;
			do {
				try {
					String temp = JOptionPane.showInputDialog(mensaje);
					dato = Integer.parseInt(temp);
					rep = false;
				} catch (Exception e) {
					rep = true;
				}
			}while(rep);
			return dato;
		}
		
		public String pedirString(String mensaje) {
			String dato = JOptionPane.showInputDialog(mensaje);
			return dato;
		}
	
}
