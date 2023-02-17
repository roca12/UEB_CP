import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Rotating {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		linea = br.readLine();
		int mayorlen = 0;
		ArrayList<String> entradas = new ArrayList<>();
		while (linea != null && !linea.equals("")) {
			entradas.add(linea);
			mayorlen = linea.length() > mayorlen ? linea.length() : mayorlen;
			linea = br.readLine();
		}
		char[][] mat = new char[entradas.size()][mayorlen];

		for (int j = 0; j < entradas.size(); j++) {
			mat[j] = entradas.get(j).toCharArray();
		}

		for (int j = 0; j < mayorlen; j++) {
			for (int i = entradas.size()-1; i >=0; i--) {
				try {
					System.out.print(mat[i][j]);
				} catch (Exception e) {
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
