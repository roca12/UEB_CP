package co.edu.unbosque.view;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
/**
 * Vista por consola
 * @author Esteban Mejia
 * @author Andres Espitia
 *
 */
public class Console {
	/**
	 * lector
	 */
	private Scanner reader;
	/**
	 * Constructor
	 */
	public Console() {
		reader= new Scanner(System.in);
	}
	/**
	 * Imprimir string
	 * @param str str
	 */
	
	public void printString(String str) {
		
		System.out.println(str);
	}
	/**
	 * Imprimir string sin linea
	 * @param str str
	 */
	public void printStringInLine(String str) {
		System.out.print(str);
	}
	/**
	 * Quemar linea
	 */
	public void burnLine() {
		reader.nextLine();
	}
	/**
	 * Leer entero 
	 * @return entero
	 */
	public int readInt() {
		return reader.nextInt();
	}
	/**
	 * Leer long
	 * @return long
	 */
	public long readLong() {
		return reader.nextLong();
	}
	/**
	 * Leer float
	 * @return float
	 */
	public float readFloat() {
		return reader.nextFloat();
	}
	/**
	 * leer Double
	 * @return double
	 */
	public double readDouble() {
		return reader.nextDouble();
	}
	/**
	 * Leer String son salto
	 * @return string 
	 */
	public String readStringLine() {
		return reader.nextLine();
	}
	/**
	 * Leer string sin salto
	 * @return String
	 */
	public String readString() {
		return reader.next();
	}
	
	
	

}
