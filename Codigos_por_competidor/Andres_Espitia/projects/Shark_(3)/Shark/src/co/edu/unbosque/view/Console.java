package co.edu.unbosque.view;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.InputMismatchException;
import java.util.Scanner;

import co.edu.unbosque.util.Capa8Exception;

public class Console {
	private Scanner reader;
	
	public Console() {
		reader= new Scanner(System.in);
	}
	
	public void printString(String str) {
		
		System.out.println(str);
	}
	
	public void printStringInLine(String str) {
		System.out.print(str);
	}
	
	public void burnLine() {
		reader.nextLine();
	}
	
	public int readInt() {
		int aux = 0;
		try {
			aux = reader.nextInt();
		} catch (InputMismatchException e) {
			throw new Capa8Exception("El valor dado no es un numero");
		}
		return aux;
	}
	
	public long readLong() {
		return reader.nextLong();
	}
	
	public float readFloat() {
		return reader.nextFloat();
	}
	
	public double readDouble() {
		return reader.nextDouble();
	}
	
	public String readStringLine() {
		return reader.nextLine();
	}
	
	public String readString() {
		return reader.next();
	}
	
	
	

}
