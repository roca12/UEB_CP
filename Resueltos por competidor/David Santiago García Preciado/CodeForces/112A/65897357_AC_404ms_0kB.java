import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        
        int value = 0;
        int compare = n1.compareToIgnoreCase(n2);
        
        if(compare < 0) {
        	value = -1;
        }else if (compare > 0){
        	value = 1;
        }
        
        System.out.println(value);
        
    }
}
