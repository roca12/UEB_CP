package co.edu.unbosque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPalindromicNumbers {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        int casoactual = 1;
        for (int i = 0; i < cases; i++) {
            String numero = br.readLine();
            if (numero.length() == 1) {
                System.out.println("Case " + casoactual + ": Yes");

            } else if (numero.length() % 2 == 0) {
                String num1 = numero.substring(0, (numero.length() / 2));
                String num2 = numero.substring((numero.length() / 2), numero.length());
                StringBuilder sb = new StringBuilder(num2);
                sb.reverse();
                if (num1.equals(sb.toString())) {
                    System.out.println("Case " + casoactual + ": Yes");
                } else {
                    System.out.println("Case " + casoactual + ": No");
                }
            } else {
                String num1 = numero.substring(0, (numero.length() / 2) + 1);
                String num2 = numero.substring((numero.length() / 2), numero.length());
                // System.out.println(num1);
                // System.out.println(num2);
                StringBuilder sb = new StringBuilder(num2);
                sb.reverse();
                if (num1.equals(sb.toString())) {
                    System.out.println("Case " + casoactual + ": Yes");
                } else {
                    System.out.println("Case " + casoactual + ": No");
                }

            }
            casoactual++;

        }

    }

}