import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //HashMap<Integer, Integer> map = new HashMap<>();

        int n = sc.nextInt();
        int res = 0;
        int streak = 0;
        int last = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(last<= temp) {
            	streak++;
            }else {
            	streak = 1;
            }
            last = temp;
            res = Math.max(res, streak);
        }
        System.out.println(res);
    }
}
