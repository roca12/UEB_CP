package co.edu.unbosque.controller;

import co.edu.unbosque.model.VehicleDTO;
import co.edu.unbosque.model.VehiclesMechanicDaoImpl;
import co.edu.unbosque.model.VehiclesPaintDaoImpl;
import co.edu.unbosque.model.VehiclesTinDaoImpl;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console c;
	private VehiclesMechanicDaoImpl vmd;
	private VehiclesPaintDaoImpl vpd;
	private VehiclesTinDaoImpl vtd;

	public Controller() {
		init();
		exe();
	}

	private void init() {
		c = new Console();
		c.printMessageLn(
				"Bienvenido, lo felicitamos por su nuevo taller, por favor indique el número de plazas disponible para mecánica: ");
		int mechanics = c.nextInt();
		c.printMessageLn("Ahora por favor indique el número de plazas disponible para latoneria: ");
		int tin = c.nextInt();
		c.printMessageLn("Y por último, por favor indique el número de plazas disponible para pintura: ");
		int paint = c.nextInt();

		vmd = new VehiclesMechanicDaoImpl(mechanics);
		vpd = new VehiclesPaintDaoImpl(paint);
		vtd = new VehiclesTinDaoImpl(tin);
	}

	private void exe() {
		c.printMessageLn("\nBienvenido a su taller de confianza, elija una opcion para continuar \n"
				+ "1)Ingresar vehiculo al taller.\n2)Actualizar avance del trabajo.\n3)Retirar vehiculo por el propietario.\n"
				+ "4)Consultar Estado del vehiculo según la placa.\n5)Lista de vehiculos dentro del taller.\n6) Salir.");

		int opc = c.nextInt();

		switch (opc) {
		case 1:
			c.printMessageLn("Ingresa la placa de tu vehiculo: ");
			String plate = c.nextLine();
			c.printMessage("Ingresa tu identificación: ");
			String id_driver = c.nextLine();
			c.printMessageLn("Ingresa tu nombre: ");
			String name_driver = c.nextLine();
			c.printMessage("Ingresa tu numero de contacto: ");
			String contact_number = c.nextLine();
			
			c.printMessageLn("Por favor ingrese el servicio para su vehiculo:\n" + "1.)Mecánica\n" + "2.)Latoneria\n"
					+ "3.)Pintura\n" + "4.)Volver al menú inicial");
			switch (c.nextInt()) {
			case 1:
				if(vmd.addVehicle(new VehicleDTO(plate, id_driver, name_driver, contact_number, 10000))) {
					c.printMessageLn("Ingresado con exito");
				}else {
					c.printMessageLn("No hay suficiente espacio, vuelva más tarde");
				}
				break;
			case 2:
				if(vtd.addVehicle(new VehicleDTO(plate, id_driver, name_driver, contact_number, 8000))) {
					c.printMessageLn("Ingresado con exito");
				}else {
					c.printMessageLn("No hay suficiente espacio, vuelva más tarde");
				}
				break;
			case 3:
				if(vpd.addVehicle(new VehicleDTO(plate, id_driver, name_driver, contact_number, 5000))) {
					c.printMessageLn("Ingresado con exito");
				}else {
					c.printMessageLn("No hay suficiente espacio, vuelva más tarde");
				}
				break;
			default:
				exe();
				break;
			}
			exe();
			break;
		case 2:
			c.printMessageLn("Por favor ingrese su identificación: ");
			String id_u = c.nextLine();
			c.printMessageLn("Nuevo estado del Vehiculo: \n"
					+ "1.)Iniciando\n"
					+ "2.)Medio\n"
					+ "3.)Terminado");
			int progress = c.nextInt();
			c.printMessageLn("Iniciando busqueda en el taller de mecánica\n"
					+ "Por favor espere.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(vmd.updateProgress(id_u, progress)) {
				c.printMessage("Actualizado con exito el estado del vehiculo");
			}else {
				c.printMessageLn("Iniciando busqueda en el taller de pintura\n"
						+ "Por favor espere.....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(vpd.updateProgress(id_u, progress)) {
					c.printMessage("Actualizado con exito el estado del vehiculo");	
				}else {
					c.printMessageLn("Iniciando busqueda en el taller de latoneria\n"
							+ "Por favor espere.....");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(vtd.updateProgress(id_u, progress)) {
						c.printMessage("Actualizado con exito el estado del vehiculo");								
					}else {
						c.printMessage("Vehiculo no encontrado, lo sentimos!");
					}
				}
			}
			exe();
			break;
		case 3:
			c.printMessageLn("Ingresa tu identificación para poder retirar el vehiculo: ");
			String id_r = c.nextLine();
			c.printMessageLn("Ingresa el valor a pagar:_");
			int money = c.nextInt();
			
			
			c.printMessageLn("Iniciando busqueda en el taller de mecánica\n"
					+ "Por favor espere.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(vmd.payReceipt(id_r, money)) {
				c.printMessage("Hasta luego, vuelva pronto!!");
			}else {
				c.printMessageLn("Puede que no te haya alcanzado para pagar, no esté terminado tu trabajo o el auto no se encuentra en este taller.");
				c.printMessageLn("Iniciando busqueda en el taller de pintura\n"
						+ "Por favor espere.....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(vpd.payReceipt(id_r, money)) {
					c.printMessage("Hasta luego, vuelva pronto!!");	
				}else {
					c.printMessageLn("Puede que no te haya alcanzado para pagar, no esté terminado tu trabajo o el auto no se encuentra en este taller.");
					c.printMessageLn("Iniciando busqueda en el taller de latoneria\n"
							+ "Por favor espere.....");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(vtd.payReceipt(id_r, money)) {
						c.printMessage("Hasta luego vuelva pronto!!");								
					}else {
						c.printMessage("Vehiculo no encontrado, lo sentimos!");
					}
				}
			}
			exe();
			break;

		case 4:
			c.printMessage("Ingrese la placa del vehiculo: ");
			String plate_s = c.nextLine();
			
			if(vmd.isHere(plate_s)) {
				c.printMessageLn(vmd.showProgress(plate_s));
			}else if(vtd.isHere(plate_s)) {
				c.printMessageLn(vtd.showProgress(plate_s));
			}else if(vpd.isHere(plate_s)) {
				c.printMessageLn(vpd.showProgress(plate_s));
			}else {
				c.printMessage("Esa placa no se encuentra en ningun taller, lo sentimos!");
			}
			exe();
			break;

		case 5:
			c.printMessageLn(vmd.showActive());
			c.printMessageLn(vtd.showActive());
			c.printMessageLn(vpd.showActive());
			exe();
			break;
		case 6:
			break;
		default:
			c.printMessageLn("Ingrese una opción válida");
			exe();
		}

	}

}
