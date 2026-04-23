import java.util.Scanner;

//2218A

//2
public class sixseveninteger {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();

            if (x < 67) {
                System.out.println(x + 1);
            } else {
                System.out.println(x);
            }

        }

    }

}
