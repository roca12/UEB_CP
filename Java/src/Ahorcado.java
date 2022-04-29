import java.util.Random;
import java.util.Scanner;

public class Ahorcado{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] COLORES = { "rojo", "verde", "amarillo" };
		String[] PAISES = { "rusia", "alemania", "peru" };
		String[] ANIMALES = { "pinguino", "oso", "tiburon" };

		System.out.println("Escoja la categoria");
		//leyendo categoria
		String cat = sc.nextLine();
		Random r = new Random();

		String palabra = "";
		switch (cat.toLowerCase()) {
		case "color":
			palabra = COLORES[r.nextInt(3)];
			break;
		case "pais":
			palabra = PAISES[r.nextInt(3)];
			break;
		case "animal":
			palabra = ANIMALES[r.nextInt(3)];
			break;
		}
		
		//este string solo se usa para mostrar todo tapado al principio
		String oculto = palabra;
		//se reemplaza todas las letras por #
		oculto = oculto.replaceAll("[a-z]", "#");
		//se separa toda la cadena en caracteres separados
		char[] letrasseparadas = oculto.toCharArray();
		//se imprime el oculto de solo ###
		System.out.println("La palabra es: " + oculto);
		//voy contando los falls
		int fallos = 0;
		//mientras no haya fallado 7 veces
		while (fallos < 7) {
			//lea la letra a entrar
			System.out.println("inserte la letra a buscar");
			String letra = sc.nextLine();
			
			//verifique caracter por carcater si existe la letra
			for (int i = 0; i < palabra.length(); i++) {
				//si existe reemplacelas en los caracteres separados
				if (letra.equals(palabra.charAt(i) + "")) {
					
					//si existen mas de 2 de la misma letra, reemplace
					// ejemplo:
					// rojo -> r#j#
					// #### -> #o#o
					for (int j = 0; j < oculto.length(); j++) {
						if (palabra.charAt(j) == letra.charAt(0)) {
							letrasseparadas[j] = letra.charAt(0);
						}
					}
					//voy quitando todos los caracteres que ya revise
					// es decir que si entro dos veces la misma letra me da un fallo
					palabra.replace(letra, "#");

				}
			}
			//si la letra no esta en la palabra, sume un fallo
			if (!palabra.contains(letra)) {
				fallos++;
			}
			// muestro como voy hasta este momento
			System.out.println("la palabra oculta se encuentra asi:");
			for (char c : letrasseparadas) {
				System.out.print(c);
			}
			System.out.println();
			System.out.println("Fallos: "+fallos);
			
			//convierto los caracteres separados en string de nuevo
			//para compararlos y ver si ya perdi
			String aux = String.copyValueOf(letrasseparadas);
			
			//si ya la palabra esta completamente adivinada, rompa el ciclo
			if (palabra.equals(aux)) {
				break;
			}

		}
	}
}
