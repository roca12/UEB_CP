package co.edu.unbosque.controller;

import co.edu.unbosque.model.CarDAO;
import co.edu.unbosque.model.CarDTO;
import co.edu.unbosque.view.Panes;

public class Controller {
	private CarDAO cdao;
	private Panes p;
	
	public Controller() {
		init();
		exe();
	}
	
	public void init() {
		cdao = new CarDAO();
		p = new Panes();
	}
	
	public void exe() {
		int opc = p.readInt("-- Bienvenido a TransPorMinute --\n"
							+ "1. ➢ Registrar solicitudes del Cliente.\r\n"
							+ "2. ➢ Mostrar todas las solicitudes de los clientes con sus características completas,\r\n"
							+ "según el orden en que se ingresaron.\r\n"
							+ "3. ➢ Generar la Distribución de solicitudes a los Transportistas\r\n"
							+ "4. ➢ Listar la forma en que se Distribuyeron las actividades del día\r\n"
							+ "5. ➢ Reportes de cada vehículo de la forma en que realizaron la entrega de la\r\n"
							+ "mercancía y/o giros asignados");
		switch (opc) {
		case 1:
			cdao.addToQueue(new CarDTO(p.readInt("Ingrese el NIT del cliente"), p.readString("Ingrese la direccion destino"), readSector()), readType());
			exe();
			break;
		case 2:
			p.printMessage(cdao.getQ().list());
			exe();
			break;
		case 3:
			cdao.passTo();
			exe();
			break;
		case 4:
			p.printMessage("A continuación se mostraran las actividades que se tendrá en el dia: ");
			p.printMessage(cdao.getC1().list());
			p.printMessage(cdao.getC2().list());
			p.printMessage(cdao.getC3().list());
			p.printMessage(cdao.getC4().list());
			p.printMessage(cdao.getV1().list());
			p.printMessage(cdao.getV2().list());
			p.printMessage(cdao.getV3().list());
			p.printMessage(cdao.getV4().list());
			exe();
			break;
		case 5:
			p.printMessage("A continuación se muestra la forma en que se entregaron las actividades del dia");
			p.printMessage(cdao.getC1().doActivities());
			p.printMessage(cdao.getC2().doActivities());
			p.printMessage(cdao.getC3().doActivities());
			p.printMessage(cdao.getC4().doActivities());
			p.printMessage(cdao.getV1().doActivities());
			p.printMessage(cdao.getV2().doActivities());
			p.printMessage(cdao.getV3().doActivities());
			p.printMessage(cdao.getV4().doActivities());
			exe();
			break;
		default:
			break;
		}
	}
	
	public int readSector() {
		String[] sectors = {"1. Sur", "2. Norte", "3. Oriente", "4. Occidente"};
		return p.readOption("Ingresa el sector: ", "Sector", sectors);
	}
	
	public int readType() {
		String[] types = {"1. Mercancia", "2. Giros"};
		return p.readOption("Ingresa el tipo: ", "Tipo", types);
	}
}
