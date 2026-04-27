import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++) {
            String[] lines = br.readLine().split(" ");
            double sum = 0;

            for (int j = 1; j < lines.length; j++) {
                sum += Integer.parseInt(lines[j]);
            }

            double avr = sum / (lines.length - 1);

            int aboveAverageCount = 0;
            for (int j = 1; j < lines.length; j++) {
                if (Integer.parseInt(lines[j]) > avr) {
                    aboveAverageCount++;
                }
            }
            Locale.setDefault(Locale.US);
            System.out.printf("%.3f%%\n", (double) aboveAverageCount / (lines.length - 1) * 100);
        }
    }
}
