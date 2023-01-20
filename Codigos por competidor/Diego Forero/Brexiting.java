import java.util.Scanner;

public class Brexiting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int aux = 0;
		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'|| s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				aux = i;
				break;
			}
		}
		for(int i=0; i<=aux; i++){
            System.out.print(s.charAt(i));
        }
        System.out.println("ntry");
	}

}
