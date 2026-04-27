package co.edu.unbosque.main;

import java.util.*;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int K = scanner.nextInt(); 
        
        List<Integer> niñas = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            niñas.add(i);
        }

        int index = P - 1;
        
        niñas.remove(index);
        
        while (K > 0) {
            index = (index + 1) % niñas.size();
            K--;
        }

        int gansoIndex = (index) % niñas.size();
        

        System.out.println(niñas.get(gansoIndex));
        
        scanner.close();
    }
}