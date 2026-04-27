package co.edu.unbosque;

import java.util.Scanner;

public class MainRotatingSentences {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sentences = new String[100];
        int maxLength = 0;

        
        for (int i = 0; i < 100 && scanner.hasNextLine(); i++) {
            String sentence = scanner.nextLine();
            sentences[i] = sentence;
            maxLength = Math.max(maxLength, sentence.length());
        }

        
        for (int i = 0; i < maxLength; i++) {
            for (int j = sentences.length - 1; j >= 0; j--) {
                String sentence = sentences[j];
                if (sentence != null && i < sentence.length()) {
                    System.out.print(sentence.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
