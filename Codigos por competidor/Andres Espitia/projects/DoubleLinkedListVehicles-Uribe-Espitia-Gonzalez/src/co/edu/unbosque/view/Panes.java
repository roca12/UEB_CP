package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Panes {
	
	public void printMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public int readInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	public String readString(String message) {
		return JOptionPane.showInputDialog(message);
	}
}
