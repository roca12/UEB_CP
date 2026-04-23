import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String a = sc.next();
            int y = sc.nextInt();
            BigDecimal x = new BigDecimal(a);
            String result = x.pow(y).toPlainString(); // Resultado sin notación científica

            // Eliminar ceros a la izquierda
            int start = 0;
            boolean flag = true;
            for (int i = 0; i < result.length(); i++) {
                if (flag && result.charAt(i) == '0') {
                	start++;
                } else {
                    break;
                }
            }

            // Eliminar ceros a la derecha (solo si hay punto decimal)
            int end = result.length();
            if (result.contains(".")) {
                for (int i = result.length() - 1; i >= 0; i--) {
                    if (result.charAt(i) == '0') {
                    	end--;
                    } else {
                        if (result.charAt(i) == '.') {
                        	end--; // También eliminar punto si termina con él
                        }
                        break;
                    }
                }
            }

            System.out.println(result.substring(start, end));
        }

        sc.close();
    }
}
