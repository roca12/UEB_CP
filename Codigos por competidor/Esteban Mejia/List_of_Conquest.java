import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		String[] paises= new String[t];
		TreeSet<String> pais= new TreeSet<String>();
		for (int i = 0; i < t; i++) {
			paises[i]=sc.next();
			pais.add(paises[i]);
			String s=sc.nextLine();
			}
		String[] paisArray=pais.toArray(new String[pais.size()]);
		Arrays.sort(paises);
		Arrays.sort(paisArray);
		for (int i = 0; i < paisArray.length; i++) {
			int cont=0;
			for (int j = 0; j < t; j++) {
				if(paisArray[i].equals(paises[j])) {
					cont++;
				}
			}
			System.out.println(paisArray[i]+" "+cont);
		}
	}
}