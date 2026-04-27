import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MainFeynman {

	public static void main (String args[]) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int num = 1;
		int resultado;
		while(true) {
			num = Integer.parseInt(sc.readLine());
			if (num == 0) {
				break;
			}
			if (num == 1) {
				out.println(1);
				out.flush();
				continue;
			}
			resultado=(int)Math.pow(num, 2)+1;
			for (int i = num-1; i > 1; i--) {
				resultado=resultado+(int)Math.pow(i, 2);
			}
			out.println(resultado);
			out.flush();
		}
	}
}
