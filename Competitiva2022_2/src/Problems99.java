import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problems99 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int precio = Integer.parseInt(br.readLine());
		int arriba = precio, abajo = precio;
		while (true) {
			if (arriba % 100 == 99) {
				System.out.println(arriba);
				break;
			}
			if (abajo % 100 == 99) {
				System.out.println(abajo);
				break;
			}
			arriba++;
			abajo--;
		}

	}

}
