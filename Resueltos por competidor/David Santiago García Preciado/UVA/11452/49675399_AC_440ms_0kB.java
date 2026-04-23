import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(sc.readLine());

        for (int i = 0; i < n; i++) {
            String input = sc.readLine();
            String res = "";
            for (int j = input.length(); j > 0; j--) {
                String s = input.substring(j);
                if (s.startsWith(input.substring(0, j))) {
                    res = input.substring(0, j);
                    break;
                }
            }

            int inicio = input.length()%res.length();
            for (int l = 0; l < 8; ++l) {
                System.out.print(res.charAt(inicio));
                if((inicio+1)<res.length()){
                    inicio++;
                }else {
                    inicio=0;
                }
            }
            System.out.println("...");
        }
        sc.close();
    }

}