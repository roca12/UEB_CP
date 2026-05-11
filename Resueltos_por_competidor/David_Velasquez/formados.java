/*
* Autor: DavsAlejo
* Problema: Formados en la cafetería
* Juez Online: omegaUp
* Veredicto: Accepted
* URL: https://omegaup.com/arena/problem/Formados-en-la-cafeteria/#problems
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {

		int t = Integer.parseInt(br.readLine());
		Queue<String> alumnos = new LinkedList<>();
		Queue<String> trabajadores = new LinkedList<>();
		for (int i = 0; i < t; i++) {
			
			String evento = br.readLine();


			if (evento.contains("ALUMNO")) {
				String nombreAlumno = evento.substring(13);
				alumnos.offer(nombreAlumno);
			} else if (evento.contains("TRABAJADOR")) {
				String nombreTrabajador = evento.substring(17);
				trabajadores.offer(nombreTrabajador);
			}else {
				if(trabajadores.isEmpty()){
					String estudianteAtendido = alumnos.poll();
					System.out.println(estudianteAtendido);
				}else {
					String trabajadorAtendido = trabajadores.poll();
					System.out.println(trabajadorAtendido);
				}
			}
		}

	}

}
