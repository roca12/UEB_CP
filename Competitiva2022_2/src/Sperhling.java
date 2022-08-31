import java.util.Scanner;

public class Sperhling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String malo = sc.nextLine();
		String bueno = sc.nextLine();
		String compare = bueno;
		String revision = "";
		int pasos = 0;
		while (true) {
			if (malo.isEmpty()) {
				break;
			}
			String actual = bueno.substring(bueno.length() - 1, bueno.length());
			if (malo.lastIndexOf(actual) > -1) {
				
				revision = malo.charAt(malo.lastIndexOf(actual)) + revision;
				
				malo = malo.substring(0, malo.lastIndexOf(actual));
				
				bueno = bueno.substring(0, bueno.length() - 1);
				
			} else {
				bueno = bueno.substring(0, bueno.lastIndexOf(actual));
				
			}

		}
		int index1 = compare.length() - 1;
		int index2 = revision.length() - 1;
		int conta=0; int contb=0;
		while (!revision.equals(compare)) {

			if (revision.charAt(index2) == compare.charAt(index1)) {
				index1--;
				index2--;
				conta++;
				
			} else {
				revision = revision.substring(0, index2+1) + compare.charAt(index1) + revision.substring(index2+1);
				index1--;
				contb++;
				
			}
		}
		System.out.println(revision);
		System.out.println(compare);

	}

}
