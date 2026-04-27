import java.util.Scanner;
import java.io.*;

public class Main {

    static long factorialDigit(long n) {
        if (n == 0 || n == 1)
            return 1;

        // Fórmula de Kamenetsky para contar los dígitos de n!
        double digitos = (n * Math.log10(n / Math.E)) + (Math.log10(2 * Math.PI * n) / 2.0);
        return (long) Math.floor(digitos) + 1;
    }

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int cases = read.nextInt();

        for (int x = 1; x <= cases; x++) {
            long number = read.nextLong(); 
            System.out.println(factorialDigit(number)); 
        }

        read.close();
    }
}