package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

/**
 * FileHandler
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class FileHandler {
	/**
	 * Objeto de tipo File que buscara un fichero
	 */
	private static File file;
	/**
	 * Scanner que permite leer los archivos
	 */
	private static Scanner reader;
	/**
	 * PrintWriter que permite escribir en los archivos
	 */
	private static PrintWriter writer;
	/**
	 * Propiedades a cargar
	 */
	private static Properties prop;
	/**
	 * Objeto que nos permite leer archivos orientados a bytes
	 */
	private static FileInputStream fis;
	/**
	 * Convierte serializado a objeto
	 */
	private static ObjectInputStream ois;
	/**
	 * Objeto que escribe en los archivos
	 */
	private static FileOutputStream fos;
	/**
	 * Objeto que permite serializar otro objeto
	 */
	private static ObjectOutputStream oos;
	
	/**
	 * Metodo para leer archivos serializados
	 * @param filename archivo
	 * @return Objeto del serializado
	 */
	public static Object readSerializable(String filename) {
		
		try {
			fis = new FileInputStream("src/co/edu/unbosque/model/persistence/"+filename);
		} catch (FileNotFoundException e) {
			System.out.println("error on find file (serializable - read)");
			System.out.println(e.getMessage());
		}
		
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			System.out.println("error on reading (serializable - read)");
			System.out.println(e.getMessage());
		}
		Object aux = null;
		try {
			aux = ois.readObject();
		} catch (ClassNotFoundException e) {
			System.out.println("error on integrity (serializable - read)");
		} catch (IOException e) {
			System.out.println("error on permissions (serializable - read)");
		}
		
		return aux;
	}
	
	/**
	 * Objeto que nos permite escribir archivos serializados
	 * @param o Objeto 
	 * @param filename
	 */
	public static void writeSerializable(Object o, String filename) {
		try {
			fos = new FileOutputStream("src/co/edu/unbosque/model/persistence/"+filename);
		} catch (FileNotFoundException e) {
			System.out.println("File not found(serializable)");
			System.out.println(e.getMessage());
		}
		try {
			oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
		} catch (IOException e) {
			System.out.println("Error on writing(serializable)");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("error on closing file (serializable)");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Metodo para cargar un archivo
	 * @param filename Archivo
	 * @return Una cadena con el contenido del archivo
	 */
	public static String loadFile(String filename) {
		file = new File("src/co/edu/unbosque/model/persistence/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("cant create new file");
				System.out.println(e.getMessage());
			}
		}
		String content = "";
		try {
			reader = new Scanner(file);
			boolean aux=true;
			while (reader.hasNext()) {
				while(!aux) {
				content += reader.nextLine()+"\n";	
				}
				aux=false;
			}
		} catch (FileNotFoundException e) {
			System.out.println("file dont exists");
			e.printStackTrace();
		}
		reader.close();
		return content;

	}

	/**
	 * Metodo para esciribir sobre un archivo
	 */
	public static void writeFile(String filename, String content) {
		file = new File("src/co/edu/unbosque/model/persistence/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can't create new file");
				System.out.println(e.getMessage());
			}
		}
		try {
			writer = new PrintWriter(file);
			writer.print(content);
		} catch (FileNotFoundException e) {
			System.out.println("file dont exists");
			e.printStackTrace();
		}
		writer.close();
	}

	/**
	 * Metodo para cargar propiedades
	 * @param sel Seleccion
	 * @return Propiedades del programa
	 */
	public static Properties loadPropertiesLang(int sel) {
		prop = new Properties();
		if (sel == 1) {
			try {
				prop.load(new FileInputStream(new File("src/co/edu/unbosque/model/persistence/spa.properties")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (sel == 2) {
			try {
				prop.load(new FileInputStream(new File("src/co/edu/unbosque/model/persistence/eng.properties")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return prop;
	}
}