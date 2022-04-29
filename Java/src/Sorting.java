import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

	public static void main(String[] args) {
		Competidor[] arr= {
				new Competidor("Andres Lozada", 32, "Cazuela"),
				new Competidor("Diego Forero", 3, "Empanada"),
				new Competidor("Andres Espitia", 16,"Spaghetti"),
				new Competidor("Nicolas Infante", 19, "Costillas")
		};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].nombre+" "+arr[i].edad+" "+arr[i].comida_favorita);
		}

	}

	static class Competidor implements Comparable<Competidor> {
		String nombre;
		int edad;
		String comida_favorita;

		public Competidor() {
		} 
		public Competidor(String nombre, int edad, String comida_favorita) {
			this.nombre = nombre;
			this.edad = edad;
			this.comida_favorita = comida_favorita;
		}
		@Override
		public int compareTo(Sorting.Competidor o) {
			if (this.edad > o.edad) {
				return 1;
			} else if (this.edad < o.edad) {
				return -1;
			}
			return 0;
		}
	}
}
