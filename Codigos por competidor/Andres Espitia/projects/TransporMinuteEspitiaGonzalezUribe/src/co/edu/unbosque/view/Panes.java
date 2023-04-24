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
	
	public int readOption(String message, String title, String[] options) {
		return  Integer.parseInt("" + ((String)JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options, options[0])).charAt(0) );
	}
}
