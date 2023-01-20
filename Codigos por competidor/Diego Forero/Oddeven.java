import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashSet<Character> letras = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			letras.add(s.charAt(i));
		}
		int[] contador = new int[letras.size()];
		
		int p = 0;
		Iterator it = letras.iterator();
        while (it.hasNext()) {
        	char aux = (char) it.next();
        	for (int i = 0; i < s.length(); i++) {
        		if (aux == s.charAt(i)) {
        			contador[p]++;
        		} 
			}
        	p++;
        }
		
        int odd = 0;
		for (int i : contador) {
			if (i%2 != 0) {
				odd++;
			}
		}
		if (odd == 0) {
			System.out.println(0);
		} else if (odd == contador.length) {
			System.out.println(1);
		} else {
			System.out.println("0/1");
		}
	}

}
