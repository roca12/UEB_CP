import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Lapindromes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int t=Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String s= br.readLine();
			String ladoizquierdo="",ladoderecho="";
			if (s.length()%2==0) {
				ladoizquierdo=s.substring(0, s.length()/2);
				ladoderecho=s.substring(s.length()/2,s.length());
			}else {
				ladoizquierdo=s.substring(0, (s.length()/2));
				ladoderecho=s.substring((s.length()/2)+1,s.length());
			}
			char[] izq= ladoizquierdo.toCharArray();
			char[] der=ladoderecho.toCharArray();
			Arrays.sort(izq);
			Arrays.sort(der);
			if (String.copyValueOf(der).equals(String.copyValueOf(izq))) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}

		}

	}

}
