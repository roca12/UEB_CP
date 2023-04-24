package co.edu.unbosque.controller;

import java.util.Properties;

import co.edu.unbosque.model.SharkDAOImpl;
import co.edu.unbosque.model.persistance.FileHandler;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;
	private Properties prop;
	private SharkDAOImpl sdi;

	public Controller() {
		con = new Console();
		sdi = new SharkDAOImpl();
	}

	public void run() {
		// verifica si ya se habia escogido un lenguaje antes
		int runinit = checkInit();
		if (runinit == 0) {
			con.printString("Shark program, choose the language 1) SPA 2) ENG");
			int select = con.readInt();
			switch (select) {
			case 1: {
				prop = FileHandler.loadProperties(select);
				con.printString(prop.getProperty("persistance.languageinitial"));
				FileHandler.writeFile("conf.ini", "1");
				break;
			}
			case 2: {
				prop = FileHandler.loadProperties(select);
				con.printString(prop.getProperty("persistance.languageinitial"));
				FileHandler.writeFile("conf.ini", "2");
				break;
			}

			default:
				con.printString("Language not supported yet");
			}
		} else {
			// si llega aqui, ya habia un lenguaje
			prop = FileHandler.loadProperties(runinit);
			con.printString(prop.getProperty("persistance.languageinitial"));
		}
		mainMenu();

	}

	public int checkInit() {
		String content = FileHandler.loadFile("conf.ini");
		content = content.strip();
		int selection = Integer.parseInt(content);
		return selection;
	}

	public void mainMenu() {
		mainloop: while (true) {
			con.printString(prop.getProperty("persistance.shark.menu"));
			con.printString(prop.getProperty("persistance.shark.menu.add"));
			con.printString(prop.getProperty("persistance.shark.menu.deleteid"));
			con.printString(prop.getProperty("persistance.shark.menu.deletename"));
			con.printString(prop.getProperty("persistance.shark.menu.updateid"));
			con.printString(prop.getProperty("persistance.shark.menu.updatename"));
			con.printString(prop.getProperty("persistance.shark.menu.showall"));
			con.printString(prop.getProperty("persistance.shark.menu.exit"));

			int select = con.readInt();
			switch (select) {
			case 1: {
				con.burnLine();
				con.printString(prop.getProperty("persistance.shark.add.name"));
				String name = con.readString();
				con.printString(prop.getProperty("persistance.shark.add.age"));
				int age = con.readInt();
				sdi.create(name, age);
				con.printString(prop.getProperty("persistance.shark.add.success"));
				break;
			}
			case 2: {
				con.printString(prop.getProperty("persistance.shark.delete.getid"));
				int index = con.readInt();
				if (sdi.deleteByIndex(index)) {
					con.printString(prop.getProperty("persistance.shark.delete.success"));
				} else {
					con.printString(prop.getProperty("persistance.shark.delete.error"));
				}
				break;
			}
			case 3: {
				con.burnLine();
				con.printString(prop.getProperty("persistance.shark.delete.getname"));
				String name = con.readStringLine();
				if (sdi.deleteByName(name)) {
					con.printString(prop.getProperty("persistance.shark.delete.success"));
				} else {
					con.printString(prop.getProperty("persistance.shark.delete.error"));
				}

				break;
			}
			case 4: {

				con.printString(prop.getProperty("persistance.shark.update.getid"));
				int index = con.readInt();
				con.printString(prop.getProperty("persistance.shark.update.name"));
				con.burnLine();
				String name = con.readStringLine();
				con.printString(prop.getProperty("persistance.shark.update.age"));
				int age = con.readInt();
				if (sdi.updateByIndex(index, name, age)) {
					con.printString(prop.getProperty("persistance.shark.update.success"));
				} else {
					con.printString(prop.getProperty("persistance.shark.update.error"));
				}

				break;
			}
			case 5: {
				con.burnLine();
				con.printString(prop.getProperty("persistance.shark.update.name"));
				String name = con.readStringLine();
				con.printString(prop.getProperty("persistance.shark.update.age"));
				int age = con.readInt();
				if (sdi.updateByName(name, age)) {
					con.printString(prop.getProperty("persistance.shark.update.success"));
				} else {
					con.printString(prop.getProperty("persistance.shark.update.error"));
				}

				break;
			}
			case 6: {
				con.printString(prop.getProperty("persistance.shark.show.title"));
				con.printString(sdi.showAll());
				break;
			}
			case 7: {
				con.printString(prop.getProperty("persistance.shark.menu.exited"));
				break mainloop;
			}
			default:
				con.printString(prop.getProperty("persistance.shark.menu.badselection"));
				break;
			}

		}

	}

}
