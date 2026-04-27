import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < cases; t++) {
            String time = sc.nextLine();
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3));

            while (true) {
                m++;
                if (m == 60) {
                    m = 0;
                    h = (h + 1) % 24;
                }

                String hoursPrint = String.format("%02d", h);
                String minutesPrint = String.format("%02d", m);

                String hours = String.valueOf(Integer.parseInt(hoursPrint));
                String min = minutesPrint;
                
                String palidrome = hours + min;

                if (h == 0) {
                	min = String.valueOf(Integer.parseInt(minutesPrint));
                	palidrome = min;
                }

                if (isPalindrome(palidrome)) {
                    System.out.println(hoursPrint+":"+minutesPrint);
                    break;
                }
            }
        }
    }
    static boolean isPalindrome(String data) {
        StringBuilder sb = new StringBuilder(data);
        return data.equals(sb.reverse().toString());
    }
}
