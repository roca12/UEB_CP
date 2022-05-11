
import java.awt.Color;
import java.awt.Font;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;

class Main {

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner lector = new Scanner(System.in);
				int num1 = lector.nextInt();
				int num2 = lector.nextInt();
				int res = num1 / num2;
				System.out.println(res);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Se ha realizado una division entre cero");
				System.out.println(e.getMessage());
			}catch (InputMismatchException f) {
				System.out.println("El numero insertado no es valido");
				f.printStackTrace();
			}catch (Exception e) {
				System.out.println("error desconocido");
			}
		}

	}
}
