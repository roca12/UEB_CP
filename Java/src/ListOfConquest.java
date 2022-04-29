import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class ListOfConquest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		TreeMap<String, Integer> map= new TreeMap<String, Integer>();
		for (int i = 0; i < t; i++) {
			String linea=br.readLine();
			String pais=linea.substring(0, linea.indexOf(" "));
			if (map.containsKey(pais)) {
				int num=map.get(pais);
				map.put(pais, num+1);
			}else {
				map.put(pais, 1);
			}
		}
		
		for (String s : map.keySet()) {
			System.out.println(s+" "+map.get(s));
		}
	}

}
