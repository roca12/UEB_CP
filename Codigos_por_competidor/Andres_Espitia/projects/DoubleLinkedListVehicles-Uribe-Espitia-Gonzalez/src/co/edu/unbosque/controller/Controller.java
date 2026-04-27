package co.edu.unbosque.controller;

import co.edu.unbosque.model.VehicleDAO;
import co.edu.unbosque.model.VehicleDTO;
import co.edu.unbosque.view.Panes;

public class Controller {
	private VehicleDAO vdao;
	private Panes v;
	
	public Controller() {
		init();
		exe();
	}

	private void init() {
		vdao = new VehicleDAO();
		v = new Panes();
	}

	private void exe() {
		int opc = v.readInt("1. Insertar un vehículo a la Lista\r\n"
				+ "\r\n"
				+ "2. Imprimir contenido de la Lista\r\n"
				+ "\r\n"
				+ "3. Buscar un vehículo por una placa dada\r\n"
				+ "\r\n"
				+ "4. Insertar después de un Modelo de carro dado (En caso de que el modelo se repita, debe estar después del último carro que tenga ese modelo, si el modelo no está no se inserta.\r\n"
				+ "\r\n"
				+ "5. Eliminar un vehículo de la lista según una placa dada\r\n"
				+ "\r\n"
				+ "6. Ordenar la lista por orden ascendente a la placa e imprimir (Sin modificar la lista original)\r\n"
				+ "\r\n"
				+ "7. Ordenar la lista por orden descendente del modelo e imprimir (Sin modificar la lista original)\r\n"
				+ "\r\n"
				+ "8. Salir del Programa");
		switch (opc) {
		case 1:
			String owner1 = v.readString("Ingrese el nombre del propietario");
			String plate1 = v.readString("Ingresa la placa del auto");
			int model1 = v.readInt("Ingresa el modelo del auto");
			String city1 = v.readString("Ingresa la ciudad de origen");
			
			VehicleDTO vaux = new VehicleDTO(plate1, model1, owner1, city1);
			vdao.insert(vaux);
			exe();
			break;
		case 2:
			v.printMessage(vdao.printList());
			exe();
			break;
		case 3:
			v.printMessage(vdao.findVehicle(v.readString("Ingrese la placa a buscar")));
			exe();
			break;
		case 4:
			if(vdao.insertPos(v.readInt("Ingresa el modelo del auto a insertar despues"), new VehicleDTO(v.readString("Ingresa la placa"), v.readInt("Ingresa el modelo"), v.readString("Ingresa el propietario"), v.readString("Ingresa la ciudad de origen")))) {
				v.printMessage("Ingresado con exito!!");
			}else {
				v.printMessage("No se ha podido ingresar, no se ha encontrado el modelo");
			}
			exe();
			break;
		case 5:
			vdao.delete(v.readString("Ingresa la placa del auto"));
			exe();
			break;
		case 6:
			v.printMessage(vdao.printAscendent());
			exe();
			break;
		case 7:
			v.printMessage(vdao.printDescendent());
			exe();
			break;
		default:
			break;
		}
	}
}
