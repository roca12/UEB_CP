package co.edu.unbosque.model.persistance;

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

public class FileHandler {

	private static File file;
	private static Scanner reader;
	private static PrintWriter writer;
	private static Properties prop;
	
	//lectura
	private static FileInputStream fis;
	private static ObjectInputStream ois;
	
	//escritura
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	
	public static Object readSerializable(String filename) {
		
		try {
			fis = new FileInputStream("src/co/edu/unbosque/model/persistance/"+filename);
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
	
	public static void writeSerializable(Object o, String filename) {
		//buscar el archivo
		try {
			fos = new FileOutputStream("src/co/edu/unbosque/model/persistance/"+filename);
		} catch (FileNotFoundException e) {
			System.out.println("file not found(serializable)");
			System.out.println(e.getMessage());
		}
		//escribir el archivo
		try {
			oos = new ObjectOutputStream(fos);
			//escribimos el objeto
			oos.writeObject(o);
		} catch (IOException e) {
			System.out.println("error on writing(serializable)");
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

	public static String loadFile(String filename) {
		file = new File("src/co/edu/unbosque/model/persistance/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can´t create new file");
				System.out.println(e.getMessage());
			}
		}
		String content = "";
		try {
			reader = new Scanner(file);
			while (reader.hasNext()) {
				content += reader.nextLine()+"\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("file don´t exists");
			e.printStackTrace();
		}
		reader.close();
		return content;

	}

	public static void writeFile(String filename, String content) {
		file = new File("src/co/edu/unbosque/model/persistance/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can´t create new file");
				System.out.println(e.getMessage());
			}
		}
		try {
			writer = new PrintWriter(file);
			writer.print(content);
		} catch (FileNotFoundException e) {
			System.out.println("file don´t exists");
			e.printStackTrace();
		}
		writer.close();
	}

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
