package co.edu.unbosque;

import java.util.Scanner;

public class MainRedirectURL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // consume the newline after the integer input

        for (int i = 1; i <= numTestCases; i++) {
            String inputUrl = scanner.nextLine();
            String redirectedUrl = redirectUrl(inputUrl);

            System.out.println("Case " + i + ": " + redirectedUrl);
        }

        scanner.close();
    }

    private static String redirectUrl(String url) {
        if (url.startsWith("http://")) {
            return "https://" + url.substring(7);
        } else {
            return url;
        }
    }

}

