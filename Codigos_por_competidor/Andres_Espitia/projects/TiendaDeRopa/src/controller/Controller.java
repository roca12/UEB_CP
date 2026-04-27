package controller;

import model.Inventario;
import model.Prenda;
import view.VistaConsola;

public class Controller {

	private Inventario inv;
	private Prenda pre;
	private VistaConsola view;

	public Controller() {

		view = new VistaConsola();
		inv = new Inventario(view.leerEntero("Ingrese el numero de tipos de prendas total: "));
		funcionar();

	}

	public void funcionar() {
		int opc;
		String menu = "Bienvenido Usuario\n" + 
		              "1.Registrar Prenda\n" + 
				      "2.Buscar Prenda por codigo\n"+ 
		              "3.Actualizar producto vendidos\n"+
				      "4.Reabastecimiento del inventario\n"+
		              "5.Eliminar Prenda con el codigo\n" + 
				      "6.Lista del inventario\n" + 
		              "7.Valor total de compra y venta\n"+ 
				      "8. Salir\n";

		do {
			view.mostrarMensaje(menu);
			opc = view.leerEntero("Seleccione su opción:");
			switch (opc) {
			case 1:
				RegistrarPrenda();
				break;
			case 2:
				BuscarPrenda();
				break;
			case 3:
				ActualizarInventarioVenta();
				break;
			case 4:
				ActualizarInventarioAbastecer();
				break;
			case 5:
				EliminarPrendaCodigo();
				break;
			case 6:
				ListarInventario();
				break;
			case 7:
				ValorTotalDeComprayVenta();
				break;
			case 8:
				view.mostrarMensaje("Hasta prento");
				break;
			default:
				view.mostrarMensaje("Opción incorrecta");
			}
		} while (opc != 9);
	}

	private void ActualizarInventarioVenta() {
		

	}

	private void ValorTotalDeComprayVenta() {
		// TODO Auto-generated method stub

	}

	private void ListarInventario() {
		// TODO Auto-generated method stub

	}

	private void EliminarPrendaCodigo() {
		// TODO Auto-generated method stub

	}

	private void ActualizarInventarioAbastecer() {
		// TODO Auto-generated method stub

	}

	public void RegistrarPrenda() {
		int posic;
		int cod, tall, can, ven, com;
		String nom, col;
		cod = view.leerEntero("Digite el codigo de la prenda");
		nom = view.leerString("Digite el nombre de la prenda");
		tall = view.leerEntero("Digite la talla de la prenda ");
		col = view.leerString("Digite el color de la prenda");
		can = view.leerEntero("Digite la cantidad de prendas");
		ven = view.leerEntero("Digite el precio de venta ");
		com = view.leerEntero("Digite el precio de compra");
		pre = new Prenda(cod, nom, tall, col, can, ven, com);
		posic = inv.agregarPrenda(pre);
		if (posic < 0) {
			view.mostrarMensaje("No se pudo agregar la prenda");
		} else {
			view.mostrarMensaje("La prenda se agrego a la posicion " + posic);
		}
	}

	public void BuscarPrenda() {
		int i, posic = -1;
		cod = view.leerEntero("Digite el codigo a buscar: ");
		pre = inv.buscarPrendaporCodigo(cod);
		if (
			view.mostrarMensaje(null));
		else
			view.mostrarMensaje("Codigo NO encontrado: ");
	}

	public void EliminarPrenda() {
		int cod;
		cod = view.leerEntero("Digite el codigo a eliminar:");
		inv.eliminar(cod);
	}

	public void ListarPrenda() {

		view.mostrarMensaje(inv.listarArreglo());

	}

}
