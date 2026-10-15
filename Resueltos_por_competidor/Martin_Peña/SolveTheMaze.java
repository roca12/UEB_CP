/*
* Autor: pgms1103-afk
* Problema: D. Solve The Maze
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/1365/D
* Difficulty: 1700
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class SolveTheMaze {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String matriz[][];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static boolean sePuede;
	static boolean visitados[][];
	static int filas;
	static int columnas;
	static int cantidadG;
	static int gEncontradas;

	public static void main(String[] args) throws NumberFormatException, IOException {

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {

			String datos[] = br.readLine().split(" ");
			filas = Integer.parseInt(datos[0]);
			columnas = Integer.parseInt(datos[1]);
			matriz = new String[filas + 1][columnas + 1];
			sePuede = true;
			visitados = new boolean[filas+1][columnas+1];
			cantidadG = 0;
			gEncontradas = 0;

			for (int fila = 0; fila < filas; fila++) {
				String linea = br.readLine();
				for (int columna = 0; columna < columnas; columna++) {
					matriz[fila][columna] = String.valueOf(linea.charAt(columna));
					if(matriz[fila][columna].equals("G")) {
						cantidadG++;
					}

				}
			}


			boolean definitivamenteNo = false;
			for (int fila = 0; fila < filas; fila++) {
				for (int columna = 0; columna < columnas; columna++) {
					if(matriz[fila][columna].equals("B")) {
						//System.out.println("Entre, mi caracter es B");
						for (int j = 0; j < 4; j++) {
							if(fila+dx[j] >= 0 && fila+dx[j] < filas && columna+dy[j] >= 0 && columna+dy[j] < columnas) {
								if(matriz[fila+dx[j]][columna+dy[j]].equals("G")) {
									sePuede = false;
									break;
								}else if(matriz[fila+dx[j]][columna+dy[j]].equals("B")) {
									continue;
								}else {
									matriz[fila+dx[j]][columna+dy[j]] = "#";
								}
							}
							
						}
					}
				}
			}
			
			if(!sePuede) {
				definitivamenteNo = true;
			}
			
			if(matriz[filas-1][columnas-1].equals("#")) {
				sePuede = false;
			}else {
				bfs(filas-1, columnas-1);
			}
			
			
			

			if(gEncontradas == cantidadG) {
				sePuede = true;
			}else {
				sePuede = false;
			}
			
			

			if(sePuede && !definitivamenteNo) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		
		}
		

	}
	
	static void bfs(int filaInicio, int columnaInicio) {
		
		
		ArrayDeque<Integer> colaFila = new ArrayDeque<>();
		ArrayDeque<Integer> colaColumna = new ArrayDeque<>();
		colaFila.add(filaInicio);
		colaColumna.add(columnaInicio);
		visitados[filaInicio][columnaInicio] = true;
		
		while(!colaFila.isEmpty()) {
			int filaActual = colaFila.poll();
			int columnaActual = colaColumna.poll();
			
			for (int j = 0; j < 4; j++) {
				int filaVecino = filaActual+dx[j];
				int columnaVecino = columnaActual+dy[j];
				if(filaVecino>= 0 && filaVecino < filas && columnaVecino >= 0 && columnaVecino < columnas
						&& !visitados[filaVecino][columnaVecino] && (matriz[filaVecino][columnaVecino].equals(".") || matriz[filaVecino][columnaVecino].equals("G"))) {
					visitados[filaVecino][columnaVecino] = true;
					colaFila.add(filaVecino);
					colaColumna.add(columnaVecino);
					if(matriz[filaVecino][columnaVecino].equals("G")) {
						gEncontradas++;
						
					}
				}
			}
		}
		
	}

}
