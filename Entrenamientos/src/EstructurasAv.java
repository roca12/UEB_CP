import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class EstructurasAv {

	public static void main(String[] args) {
		LinkedList<Integer> listaDobleLazo= new LinkedList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int num= r.nextInt(100);
			if (num%2==0) {
				listaDobleLazo.addFirst(num);
			}else {				
				listaDobleLazo.addLast(num);
			}
		}
		
		System.out.println(listaDobleLazo.toString());

		
		TreeSet<Integer> listaSinRep= new TreeSet<>();
		for (int i = 0; i < 10; i++) {
			int num2=r.nextInt(10);
			if (!listaSinRep.add(num2)) {
				System.out.println("el numero ya se encuentra "+num2);
			}else {
				System.out.println("se inserto por primera vez el numero "+num2);
			}
		}
		for (Iterator it = listaSinRep.iterator(); it.hasNext();) {
			System.out.print (it.next()+" ");
		}
		System.out.println();
		TreeMap<String,String> diccionario = new TreeMap<>();
		diccionario.put("charlar", "intercambio de informacion de forma verbal entre 2 o mas personas");
		diccionario.put("hablar", "intercambio de informacion de forma verbal entre 2 o mas personas");
		for (String s: diccionario.keySet()) {
			System.out.println(s+" -> "+diccionario.get(s));
		}
		
		
	}
	
	static class Persona{
		int edad;
		String nombre;
	}

}
