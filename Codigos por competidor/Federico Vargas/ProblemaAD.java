import java.math.BigInteger;
import java.util.Scanner;

public class ProblemaAD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger resultado = BigInteger.valueOf(0);
        BigInteger big;
        entrada: while (true){
            big = sc.nextBigInteger();
            resultado = resultado.add(big);
            if (big.signum() == 0){
                break entrada;
            }
        }
        System.out.println(resultado);
    }

}