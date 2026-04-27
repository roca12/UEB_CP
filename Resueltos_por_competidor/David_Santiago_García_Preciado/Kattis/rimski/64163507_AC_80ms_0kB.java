import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static String[] unidad = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    static String[] decena = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    
    static int valorChar(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            default: return 0;
        }
    }
    
    static String toRoman(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(decena[num / 10]);
        sb.append(unidad[num % 10]);
        return sb.toString();
    }
    
    static int toDecimal(String num) {
        int sum = 0;
        int last = 0;
        int next;
        for (int i = num.length() - 1; i >= 0; i--) {
            next = valorChar(num.charAt(i));
            if (last <= next) {
                sum += next;
            } else {
                sum -= next;
            }
            last = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> diccionarioMap = new HashMap<>();

        for (int i = 1; i <= 99; i++) {
            String romano = toRoman(i);
            char[] charList = romano.toCharArray();
            Arrays.sort(charList);
            String sortedRomano = new String(charList);
            
            if (!diccionarioMap.containsKey(sortedRomano)) {
            	diccionarioMap.put(sortedRomano, i);
            }
        }

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            char[] charList = line.toCharArray();
            Arrays.sort(charList);
            String sortedLine = new String(charList);

            if (diccionarioMap.containsKey(sortedLine)) {
                System.out.println(toRoman(diccionarioMap.get(sortedLine)));
            }
        }

        sc.close();
    }
}
