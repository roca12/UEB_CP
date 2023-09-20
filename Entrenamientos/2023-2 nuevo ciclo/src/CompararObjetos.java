import java.util.PriorityQueue;

public class CompararObjetos {

	static class Estudiante  implements Comparable<Estudiante>{
		public String nombre;
		public int edad;
		
		public Estudiante(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		}

		@Override
		public int compareTo(CompararObjetos.Estudiante o) {
			if (this.edad>o.edad) {
				return 1;
			}else if (this.edad<o.edad) {
				return-1;
			}else {
				return 0;
			}
		}

	}
	

	public static void main(String[] args) {
		PriorityQueue<Estudiante> lista = new PriorityQueue<>();
		lista.add(new Estudiante("Sebastian Ernesto Carroz Añez", 18));
		lista.add(new Estudiante("Cristhian Camilo Diaz Romero", 17));
		lista.add(new Estudiante("Oscar Eduardo Chavarro Pedroza", 18));
		lista.add(new Estudiante("Harold Mauricio Duarte Samboni", 18));
		lista.add(new Estudiante("Andres Santiago Rueda Vega", 17));
		lista.forEach((a)->{
			System.out.println(a.nombre+" "+a.edad);
		});
		
		
	}
}
