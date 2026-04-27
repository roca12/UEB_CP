package co.edu.unbosque.controller;

import java.util.Properties;

import co.edu.unbosque.model.PlanetDAOImpl;
import co.edu.unbosque.model.persistance.FileHandler;
import co.edu.unbosque.view.Console;

/**
 * Controlador
 * @author Esteban Mejia
 * @author Andres Espitia
 *
 */
public class Controller {
	private Console con;
	private Properties prop;
	private PlanetDAOImpl pdi;

	public Controller() {
		con = new Console();
		pdi = new PlanetDAOImpl();
		run();
	}

	public void run() {
		// verifica si ya se habia escogido un lenguaje antes
		int runinit = checkInit();
		if (runinit == 0) {
			con.printString("Welcome to the new Solar System.\nChoose Your Language 1) SPA 2) ENG");
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
		int selection = Integer.parseInt(content);
		return selection;
	}

	public void mainMenu() {
		mainloop: while (true) {
			con.printString(prop.getProperty("persistance.planet.menu"));
			con.printString(prop.getProperty("persistance.planet.menu.add"));
			con.printString(prop.getProperty("persistance.planet.menu.deleteid"));
			con.printString(prop.getProperty("persistance.planet.menu.deletename"));
			con.printString(prop.getProperty("persistance.planet.menu.updateid"));
			con.printString(prop.getProperty("persistance.planet.menu.updatename"));
			con.printString(prop.getProperty("persistance.planet.menu.showall"));
			con.printString(prop.getProperty("persistance.planet.menu.exit"));

			int select = con.readInt();
			switch (select) {
			case 1: {
				con.burnLine();
				con.printString(prop.getProperty("persistance.planet.add.name"));
				String name = con.readString();
				con.printString(prop.getProperty("persistance.planet.add.gravity"));
				float gravity = con.readFloat();
				con.printString(prop.getProperty("persistance.planet.add.radio"));
				float radio = con.readFloat();
				con.printString(prop.getProperty("persistance.planet.add.orbital_period"));
				int orbital_period = con.readInt();
				con.printString(prop.getProperty("persistance.planet.add.age"));
				int age = con.readInt();
				pdi.addPlanet(name, gravity, radio, orbital_period, age);;
				con.printString(prop.getProperty("persistance.planet.add.success"));
				break;
			}
			case 2: {
				con.printString(prop.getProperty("persistance.planet.delete.getid"));
				int index = con.readInt();
				if (pdi.deleteByIndex(index)) {
					con.printString(prop.getProperty("persistance.planet.delete.success"));
				} else {
					con.printString(prop.getProperty("persistance.planet.delete.error"));
				}
				break;
			}
			case 3: {
				con.burnLine();
				con.printString(prop.getProperty("persistance.planet.delete.getname"));
				String name = con.readStringLine();
				if (pdi.deleteByName(name)) {
					con.printString(prop.getProperty("persistance.planet.delete.success"));
				} else {
					con.printString(prop.getProperty("persistance.planet.delete.error"));
				}

				break;
			}
			case 4: {

				con.printString(prop.getProperty("persistance.planet.update.getid"));
				int index = con.readInt();
				con.printString(prop.getProperty("persistance.planet.update.orbital_period"));
				int orbital_period = con.readInt();
				con.printString(prop.getProperty("persistance.planet.update.age"));
				int age = con.readInt();
				con.printString(prop.getProperty("persistance.planet.update."));
				if (pdi.updateByIndex(index, orbital_period, age)) {
					con.printString(prop.getProperty("persistance.planet.update.success"));
				} else {
					con.printString(prop.getProperty("persistance.planet.update.error"));
				}

				break;
			}
			case 5: {
				con.burnLine();
				con.printString(prop.getProperty("persistance.planet.update.name"));
				String name = con.readStringLine();
				con.printString(prop.getProperty("persistance.planet.update.age"));
				int age = con.readInt();
				if (pdi.updateByName(name, age)) {
					con.printString(prop.getProperty("persistance.planet.update.success"));
				} else {
					con.printString(prop.getProperty("persistance.planet.update.error"));
				}

				break;
			}
			case 6: {
				con.printString(prop.getProperty("persistance.planet.show.title"));
				con.printString(pdi.showAll());
				break;
			}
			case 7: {
				con.printString(prop.getProperty("persistance.planet.menu.exited"));
				break mainloop;
			}
			default:
				con.printString(prop.getProperty("persistance.planet.menu.badselection"));
				break;
			}

		}

	}
}
