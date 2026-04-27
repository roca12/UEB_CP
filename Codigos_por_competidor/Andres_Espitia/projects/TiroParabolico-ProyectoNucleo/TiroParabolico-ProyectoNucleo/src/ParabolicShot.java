/**
 * File containing the ParabolicShot entity definition. 
 */

import pai.pract12.parabolicshot.guicomponents.MainWindow;

/**
 * Class which contains the main method of the Parabolic Shot program. This
 * program can be executed as an applet. It was created for the eleventh
 * practice of PAI (Programación de Aplicaciones Interactivas) course of ULL
 * (Universidad de la Laguna).
 * 
 * @author Daute Rodríguez Rodríguez (alu0100973914@ull.edu.es)
 * @version 1.0
 * @since 27 abr. 2018
 */
public class ParabolicShot{

	/**
	 * Main method.
	 * 
	 * @param args Arguments given to the program.
	 */
	public static void main(String[] args) {
		final int GUI_WIDTH = 1000;
		final int GUI_HEIGHT = 800;
		MainWindow window = new MainWindow(GUI_WIDTH, GUI_HEIGHT, false);
	}

}
