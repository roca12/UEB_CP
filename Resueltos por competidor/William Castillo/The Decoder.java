import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		while (sc.hasNext()) {
			String a = sc.nextLine();
			char [] lst = a.toCharArray();
			String salida = "";
			
			for (int i = 0; i < lst.length; i++) {
				int val = (int) lst[i] - 7;
				char aux2 = (char) val;
				salida += aux2 + "";
			}
			
			System.out.println(salida);
			
		}
	}
}
