import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class controlador {

	public static void main(String args[]) {

		String nombre, Apellido;
		int telefono;

		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader("./datos/DatosPersonales.txt"));
			nombre = br.readLine();
			Apellido = br.readLine();
			telefono = Integer.parseInt(br.readLine());

			br.close();

			JOptionPane.showMessageDialog(null, "Sus datos personales son:" + nombre);
			JOptionPane.showMessageDialog(null, "Sus datos personales son: " + nombre + "es" + Apellido);
			JOptionPane.showMessageDialog(null, "Su numero telefonico es:" + telefono);

		}

		catch (FileNotFoundException e)

		{

			JOptionPane.showMessageDialog(null, "El archivo no existe" + e.getMessage());

		} catch (IOException f) {
			JOptionPane.showMessageDialog(null, "El error es " + f.getMessage());

		} catch (NumberFormatException r) {
			JOptionPane.showMessageDialog(null, "El erro es " + r.getMessage());

		}

		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}