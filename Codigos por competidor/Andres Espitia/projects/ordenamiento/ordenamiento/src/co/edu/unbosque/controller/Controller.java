package co.edu.unbosque.controller;

import co.edu.unbosque.model.Sorts;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console c;
	private Sorts st;
	private String[] words;

	public Controller() {
		c = new Console();
		st = new Sorts();
		words = new String[10];
		c.printSomething("Por favor ingresa 10 palabras: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = c.readString();
		}
		menu();
	}

	private void menu() {
		c.printSomething("Elija una opción: \n"
		
				+"1) Ordenar por metodo burbuja en forma ascendente.\n"
				+"2) Ordenar por metodo burbuja en forma descendente.\n"
				+"3) Ordenar por metodo de Seleccion directa en forma ascendente.\n"
				+"4) Ordenar por metodo de Seleccion directa en forma descendente.\n"
				+"5) Ordenar por metodo de Seleccion indirecta en forma ascendente.\n"
				+"6) Ordenar por metodo de Seleccion indirecta en forma descendente.\n"
				+"7) Salir.\n");
		int opc = c.readInt();
		
		
		switch (opc) {
		case 1:
			st.BubbleSort(words, 1);
			menu();
			break;
		case 2:
			st.BubbleSort(words, 0);
			menu();
			break;
		case 3:
			st.selectionSort(words, 0);
			menu();
			break;
		case 4:
			st.selectionSort(words, 1);
			menu();
			break;
		case 5:
			st.insertionSort(words, 0);
			menu();
			break;
		case 6:
			st.insertionSort(words, 1);
			menu();
			break;
		case 7:
			break;
		default:
			menu();
			break;	
		}
	}
}
