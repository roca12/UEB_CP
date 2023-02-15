package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.view.Consola;

public class Controller {
	
	static Scanner scanner = new Scanner(System.in);
	static char[][] matrix = new char[8][8];

	private Consola con;
	
	public Controller() {
		con = new Consola();
	}
	
	public void ejecutar() {
		con.imprimirConSalto("Bienvenido");
		int option;
		do {
			con.imprimirConSalto("1. Leer matriz de 8 caracteres");
			con.imprimirConSalto("2. Imprimir la matriz de caracteres");
			con.imprimirConSalto("3. Buscar un caracter");
			con.imprimirConSalto("4. Buscar una palabra");
			con.imprimirConSalto("5. Coordenadas");
			con.imprimirConSalto("6. Salir");
			con.imprimirSinSalto("Enter option: ");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				leermatriz();
				break;
			case 2:
				imprimirmatriz();
				break;
			case 3:
				buscarcaracter();
				break;
			case 4:
				buscarPalabra();
				break;
			case 5:
				showCharacters();
				break;
			case 6:
				con.imprimirConSalto("Saliendo del programa");
				break;
			default:
				con.imprimirConSalto("Opcion invalida, intente de nuevo");
			}
		} while (option != 6);
		scanner.close();
	}
	
	static void leermatriz() {
		System.out.println("Ingresa caracteres para la matriz: ");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				matrix[i][j] = scanner.next().charAt(0);
			}
		}
	}

	static void imprimirmatriz() {
		System.out.println("Caracter de la matriz:");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void buscarcaracter() {
		System.out.print("Ingresa un caracter: ");
		char ch = scanner.next().charAt(0);
		System.out.print("Filas con caracter '" + ch + "': ");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (matrix[i][j] == ch) {
					System.out.print(i + " ");
					break;
				}
			}
		}
		System.out.println();
	}

	public static void buscarPalabra() {
        System.out.print("Introduzca una palabra: ");
        String word = scanner.next();
        if (word.length() > 8) {
            System.out.println("La palabra es demasiado larga");
            return;
        }
        boolean found = false;
        for (int i = 0; i < 8; i++) {
            String row = new String(matrix[i]);
            if (row.contains(word)) {
                System.out.println("La palabra se encuentra en la fila " + (i + 1));
                found = true;
            }
        }
        if (!found) {
            System.out.println("La palabra no se encuentra en la matriz");
        }
    }
	
	public static void showCharacters() {
        System.out.print("Introduzca una serie de coordenadas (Ejemplo: 2-3,3-1,0-4): ");
        String input = scanner.next();
        String[] coordinates = input.split(",");
        System.out.println("Los caracteres son:");
        for (String coordinate : coordinates) {
            String[] indices = coordinate.split("-");
            int i = Integer.parseInt(indices[0]);
            int j = Integer.parseInt(indices[1]);
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

}
		

