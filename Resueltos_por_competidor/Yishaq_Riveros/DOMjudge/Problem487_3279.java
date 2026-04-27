import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem487_3279 {
	
	public static HashMap<Character, Integer> map;
	
	public static void initMap() {
		map.put('A', 2);
        map.put('B', 2);
        map.put('C', 2);
        map.put('D', 3);
        map.put('E', 3);
        map.put('F', 3);
        map.put('G', 4);
        map.put('H', 4);
        map.put('I', 4);
        map.put('J', 5);
        map.put('K', 5);
        map.put('L', 5);
        map.put('M', 6);
        map.put('N', 6);
        map.put('O', 6);
        map.put('P', 7);
        map.put('R', 7);
        map.put('S', 7);
        map.put('T', 8);
        map.put('U', 8);
        map.put('V', 8);
        map.put('W', 9);
        map.put('X', 9);
        map.put('Y', 9);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('0', 0);
	}
	
	public static void process() throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		map = new HashMap<>();
		initMap();
		
		int numTests = sc.nextInt();
		for (int i = 0; i < numTests; i++) {
			if (i > 0) {
				System.out.println( );
			}
			
			TreeMap<String, Integer> phoneMap = new TreeMap<>();
			int numPhones = sc.nextInt();
			for (int j = 0; j < numPhones; j++) {
				String phone = sc.next();
				StringBuilder sb = new StringBuilder();
				for (int k = 0; k < phone.length(); k++) {
					if (phone.charAt(k)== '-') {
						continue;
					}
					if (sb.length()== 3) {
						sb.append("-");
					}
					sb.append(map.get(phone.charAt(k)));
				}
				phone = sb.toString();
				if (!phoneMap.containsKey(phone)) {
					phoneMap.put(phone, 0);
				}
				phoneMap.put(phone, phoneMap.get(phone)+1);
			}
			
			int count = 0;
			for (String s : phoneMap.keySet()) {
				if (phoneMap.get(s)>1) {
					System.out.println(s+ " "+ phoneMap.get(s));
					count++;
				}
			}
			if (count == 0) {
				System.out.println("No duplicates.");
			}
			
		}
		return;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Problem487_3279 p = new Problem487_3279();
		p.process();
		
	//	System.out.println(0);
		
	}

}
