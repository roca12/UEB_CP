/*
* Autor: pgms1103-afk
* Problema: C. Maximum Median
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/1201/C
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumMedian {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static long datosEnElArreglo[];
	static long numeroOperaciones;
	static int longitudArray;
	static boolean sePuede;
	static boolean stopEmergencia;

	public static void main(String[] args) throws IOException {
		String datos[] = br.readLine().split(" ");
		longitudArray = Integer.parseInt(datos[0]);
		numeroOperaciones = Long.parseLong(datos[1]);

		stopEmergencia = false;

		String arreglo[] = br.readLine().split(" ");
		datosEnElArreglo = new long[longitudArray];
		for (int i = 0; i < longitudArray; i++) {
			datosEnElArreglo[i] = Long.parseLong(arreglo[i]);
		}

		Arrays.sort(datosEnElArreglo);

		long min = datosEnElArreglo[(longitudArray / 2)];
		long max = datosEnElArreglo[longitudArray - 1] + numeroOperaciones;
		long rta = 0;

		while (min <= max) {
			long mid = (min + max) / 2;
			//System.out.println("Primera mitad es: " + mid);
			if (!verificacion(mid)) {
				max = mid - 1;
			} else {
				rta = mid;
				min = mid + 1;
			}
//			 if(stopEmergencia) {
//			 System.out.println(rta);
//			 return;
//			 }
		}

		System.out.println(rta);

	}

	static boolean verificacion(long mitad) { 
		long operacionesGastadas = 0;
		
		for (int i = datosEnElArreglo.length/2; i <= datosEnElArreglo.length-1; i++) {
			if(datosEnElArreglo[i] < mitad) {
				operacionesGastadas += mitad - datosEnElArreglo[i];
			}
			if(operacionesGastadas > numeroOperaciones) {
				return false;
			}
		}
		
		return true;
	}
//		sePuede = true;
//		long promedio = datosEnElArreglo[(longitudArray / 2)];
//		//System.out.println("Soy el promedio: " + promedio);
//		long maxPosible = promedio + numeroOperaciones;// 4
//		if (maxPosible > mitad) {
//			//System.out.println("Entre al if, max posible: " + maxPosible + " Es mayor o igual a la mitad: " + mitad);
//			long movimientosRestantes = maxPosible - mitad;
//			//System.out.println("Soy los movimientos restantes que quedan en total: " + movimientosRestantes);
//			//System.out.println("Movimientos restantes: " + movimientosRestantes);
//			promedio = maxPosible - movimientosRestantes; // = 3
//			//System.out.println("Soy el nuevo promedio: " + promedio);
//
//			for (int j = 1; j <= datosEnElArreglo.length / 2; j++) {
//				//System.out.println("Entre al for");
//				long siguientePosicion = datosEnElArreglo[(longitudArray / 2) + j];
//				//System.out.println("Soy la siguiente posicion: " + siguientePosicion);
//				if (siguientePosicion < promedio) {
//					long puntosQueFaltan = promedio - siguientePosicion;
//					//System.out.println("Soy los puntos que faltan para igualar al promedio: " + puntosQueFaltan);
//					if (puntosQueFaltan > movimientosRestantes) {
////						System.out.println("Cai en que los puntos que faltan son mayores a los movimientos restantes"
////								+ puntosQueFaltan + " y " + movimientosRestantes);
//						sePuede = false;
//						return false;
//					} else {
//						siguientePosicion += puntosQueFaltan;
//						movimientosRestantes -= puntosQueFaltan;
////						System.out.println(
////								"Soy los movimientos restantes que quedan despues de igualar el anterior numero: "
////										+ movimientosRestantes);
//					}
//					// Si, con los movimientos restantes que quedan, no se pueden igualar los
//					// numeros que le siguen al promedio, se elimina de la mitad para delante
//					// Si, de lo ocntrario, con los movimientos que quedan si se pueden igualar los
//					// numeros que le siguen al promedio, esa es la rta (creo, depronto singifica
//					// que se borra de la mitad para atras y se verifica si hay un promedio mayor)
//				}
////				} else if (siguientePosicion == datosEnElArreglo[(longitudArray - 1)]) {
////					stopEmergencia = true;
////					return true;
////				} 
//				else {
//					continue;
//				}
//			}
//		} else if (maxPosible == mitad) {
//			//System.out.println("Estoy en donde maxPosible == mitad" + maxPosible+ " y "+mitad);
//			stopEmergencia = true;
//			return true;
//			// Esta en la parte izq, se elimina de mitad para atras (creo que sin ninguna
//			// lógica adicional)
//		} else {
//			if (sePuede) {
//				//System.out.println("Estoy en el else del sePuede" + sePuede);
//				return true;
//			}
//
//			return false;
//		}
//		//System.out.println("Llegue aqui?");
//		if (sePuede) {
//			//System.out.println("Estoy en el else del sePuede" + sePuede);
//			return true;
//		}
//
//		return false;
//	}

}
