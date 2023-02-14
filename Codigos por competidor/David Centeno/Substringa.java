package codechef;

import java.util.Scanner;

public class Substringa {
//Substring toma una nueva string desde la posicion ingresada
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int k=0;k<testcase;k++){
		    int n=sc.nextInt();
		String str=sc.next();
		for(int i=0;i<n;i=i+2){
		    if(str.substring(i,i+2).equals("00")){
		        System.out.print("A");
		    }
		    else if(str.substring(i,i+2).equals("01")){
		        System.out.print("T");
		    }
		    else if(str.substring(i,i+2).equals("10")){
		        System.out.print("C");
		    }
    	    else {
    	        System.out.print("G");
    	    }
		}
		System.out.println();
	}

	}

}
