import java.util.Scanner;

public class Circle_in_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            String input = sc.next();
            double r = Double.parseDouble(input);
            double side = 2 * r;
            double squareArea = side * side;
            double circleArea = 2 * Math.acos(0.0) * r * r;
            double shadedArea = squareArea - circleArea;
            System.out.printf("Case %d: %.2f\n", i, shadedArea);
        }
    }
}