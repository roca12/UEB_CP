package co.edu.unbosque.model.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;
/**
 * Manejo de archivos
 * @author Esteban Mejia
 * @author Andres Espitia
 *
 */
public class FileHandler {
/**
 * archivo
 */
	private static File file; 
	/**
	 * Lector
	 */
	private static Scanner reader;
	/**
	 * Escritor
	 */
	private static PrintWriter writer;
	/**
	 * Propiedades
	 */
	private static Properties prop;
/**
 * Metodo para cargar archivo
 * @param filename nombre
 * @return contenido
 */
	public static String loadFile(String filename) {
		file = new File("src/co/edu/unbosque/model/persistance/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can�t create new file");
				System.out.println(e.getMessage());
			}
		}
		String content = "";
		try {
			reader = new Scanner(file);
			while (reader.hasNext()) {
				content += reader.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("file don�t exists");
			e.printStackTrace();
		}
		reader.close();
		return content;

	}
/**
 * Escribir archivo
 * @param filename nombre
 * @param content contenido
 */
	public static void writeFile(String filename, String content) {
		file = new File("src/co/edu/unbosque/model/persistance/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can�t create new file");
				System.out.println(e.getMessage());
			}
		}
		try {
			writer = new PrintWriter(file);
			writer.print(content);
		} catch (FileNotFoundException e) {
			System.out.println("file don�t exists");
			e.printStackTrace();
		}
		writer.close();
	}
/**
 * Metodo para cargar propiedades
 * @param sel opcion
 * @return propiedades
 */
	public static Properties loadProperties(int sel) {
		prop = new Properties();
		if (sel == 1) {
			try {
				prop.load(new FileInputStream(new File("src/co/edu/unbosque/model/persistance/spa.properties")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (sel == 2) {
			try {
				prop.load(new FileInputStream(new File("src/co/edu/unbosque/model/persistance/eng.properties")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return prop;
	}
}
