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

public class FileHandler {

	private static File file;
	private static Scanner reader;
	private static PrintWriter writer;
	private static Properties prop;

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
				content += reader.nextLine();
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
