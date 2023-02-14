import java.util.*;
public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
        char[] car = s.toCharArray();
		int suma = 0; 
		for(int i=0; i<car.length; i++){
		    suma+=car[i];
		}
		suma /= car.length;
		
		System.out.println((char)suma);
	}
}
