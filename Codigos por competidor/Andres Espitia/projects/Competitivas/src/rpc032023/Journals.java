

import java.util.Scanner;

public class Journals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int contmas = 0, contmenos = 0;
		for(int i=0; i<s.length()-3; i++){
		    if(Character.compare(s.charAt(i), s.charAt(i+1)) == 0 && Character.compare(s.charAt(i), (char) 43)  == 0){
		        contmas++;
		    } 
		    if(Character.compare(s.charAt(i), s.charAt(i+1)) == 0 && Character.compare(s.charAt(i), (char) 45)  == 0){
		    	contmenos++;
		    } 
		}
		if(contmas >= contmenos) System.out.println(contmas);
		else System.out.println(contmenos);
	}
}
