import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eruption {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        double r = Math.sqrt(a / Math.PI);
        double c = 2 * Math.PI * r;
        System.out.printf("%.9f", c);
    }
}

