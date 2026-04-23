import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        Set<Character> hashSet = new HashSet<>();

        for (char c : data.toCharArray()) {
            hashSet.add(c);
        }
        
        if(hashSet.size()%2==0) {
        	System.out.println("CHAT WITH HER!");
        }else {
        	System.out.println("IGNORE HIM!");
        }
    }
}
