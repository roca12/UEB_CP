/*
* Autor: pgms1103-afk
* Problema: Alumnos calificación
* Juez Online: omegaUp
* Veredicto: Accepted
* URL: https://omegaup.com/arena/problem/Alumnos-calificacion/#problems
*/
import java.util.Scanner;

public class AlumnosCalificacion {
	
	static Scanner sc = new Scanner (System.in);
	static double examen = 0.6; 
	static double asistencia = 0.2; 
	static double tareas = 0.2; 
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int resultadoA = (int) (a * examen);
		int resultadoB = (int) (b * asistencia);
		int resultadoC = (int) (c * tareas);
		
		int resultadoFinal = resultadoA+resultadoB+resultadoC;
		
		System.out.println(resultadoFinal);
	}
}
