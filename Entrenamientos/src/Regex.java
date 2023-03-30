import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	//expresiones regulares y matching
	public static void main(String[] args) {
		Pattern patron = Pattern.compile("abc");
		Matcher comparar= patron.matcher("abcdefghijk");
		if (comparar.matches()) {
			System.out.println("si coincide");
		}else {
			System.out.println("no");
		}
		
		
		Pattern patron2 = Pattern.compile(".*Andres.*");
		Matcher comparar2= patron2.matcher("Jaime Andres Alonso Troncoso");
		if (comparar2.matches()) {
			System.out.println("si coincide");
		}else {
			System.out.println("no");
		}
		
		Pattern patron3 = Pattern.compile("[a-zA-Z0-9]{8,24}");
		Matcher comparar3= patron3.matcher("clavefacil");
		if (comparar3.matches()) {
			System.out.println("si coincide");
		}else {
			System.out.println("no");
		}
		
		
	}

}
