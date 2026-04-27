import java.util.Scanner;

public class Main{
	static long x, y, ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long marbles = sc.nextLong();
            if (marbles == 0) {
                break;
            }
            long box1 = sc.nextLong();
            long costA = sc.nextLong();
            long box2 = sc.nextLong();
            long costB = sc.nextLong();

            recursiveLookForBestBox(costA, costB);

            int downRedond = (int) Math.ceil(1.0 * (-marbles) * x / costB);
            int upRedond = (int) Math.floor(1.0 * marbles * y / costA);

            if (marbles % ans != 0 || downRedond > upRedond) {
                System.out.println("failed");
            } else if (box1 * costB < box2 * costA) {
                x = x * marbles / ans + costB * upRedond / ans;
                y = y * marbles / ans - costA * upRedond / ans;
                System.out.println(x + " " + y);
            } else {
                x = x * marbles / ans + costB * downRedond / ans;
                y = y * marbles / ans - costA * downRedond / ans;
                System.out.println(x + " " + y);
            }
        }
        sc.close();
    }
    
    static void recursiveLookForBestBox(long a, long b) {
        if (b == 0) {
            x = 1;
            y = 0;
            ans = a;
        } else {
        	recursiveLookForBestBox(b, a % b);
            long temp = y;
            y = x - a / b * y;
            x = temp;
        }
    }
}