import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class EstructurasHashSet {
	
	public static void main(String[] args) {
		TreeSet<String> conjunto = new TreeSet<String>();
		Random r = new Random();
		int cont=0;
		
		for (int i = 0; i<10; i++) {
			if(conjunto.add((char)r.nextInt(256)+"")) {
				cont++;
			}else {
				System.out.println("dato existente");
			}
		}
		conjunto.forEach((dato)->{System.out.println(dato);});
	}

}
