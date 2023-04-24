package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileHandler {
	private Scanner reader;
	private File file;
	private PrintWriter writer;
	
	public FileHandler(String url) {
		file = new File("src/co/edu/unbosque/model/persistence/"+url);		
	}
	
	public String read() {
		StringBuilder sb = new StringBuilder();
		try {
			reader = new Scanner(file);
			while(reader.hasNext()) {
				sb.append(reader.nextLine()+"\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("quejesooooo!");
			e.printStackTrace();
		}
		reader.close();
		return sb.toString();
	}
	
	public void write(String contenido) {
		try {
			writer = new PrintWriter(file);
			writer.print(contenido);
			writer.close();
		} catch (Exception e) {
			System.out.println("No hay archivo pa");
			e.printStackTrace();
		}
		
	}
	
//	public static void main(String[] args) {
//		FileHandler fh = new FileHandler("a.txt");
//		while(fh.reader.hasNext()) {
//			String name = fh.reader.nextLine();
//			int age = fh.reader.nextInt();
//			fh.reader.nextLine();
//			String food = fh.reader.nextLine();
//			String color = fh.reader.nextLine();
//			JOptionPane.showMessageDialog(null, name+"\n"+age+"\n"+food+"\n"+color);
//		}
//	}
	
	
}
