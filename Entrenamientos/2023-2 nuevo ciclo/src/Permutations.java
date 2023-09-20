import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutations {

	static Set<String> permutaciones = new HashSet<>();
	static Set<String> resultado = new HashSet<>();
	static int cont = 0;

	static void permWithRep(String str) {
		int l = str.length();
		char[] data = new char[l + 1];
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		str = new String(temp);
		permWithRepUtil(str, data, l - 1, 0);
	}
	static void permWithRepUtil(String str, char[] data, int last, int index) {
		int l = str.length();
		for (int i = 0; i < l; i++) {
			data[index] = str.charAt(i);
			if (index == last) {
				System.out.println(new String(data));
				cont++;
			} else {
				permWithRepUtil(str, data, last, index + 1);
			}
		}
	}

	public static void main(String[] args) {
		
		permWithRep("A%yH");
		System.out.println(cont);
	}

}
