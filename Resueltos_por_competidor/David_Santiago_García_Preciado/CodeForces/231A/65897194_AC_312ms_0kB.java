import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        int problems = 0;
        for (int i = 1; i <= cases; i++) {
            String data = sc.nextLine();
            String temp = data.replace("1", "");
            if(data.length()-temp.length()>=2) {
            	problems++;
            }
        }
        System.out.println(problems);
    }
}
