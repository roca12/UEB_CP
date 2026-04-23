import java.util.Scanner;

//1
public class watermelon {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int w = sc.nextInt();

        if (w > 2 && w % 2 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
