package co.edu.unbosque;

import java.util.Scanner;

public class MainPalindromes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] str;
		String s;
		boolean mir,reg;
		while(in.hasNext())	{
		    s=in.nextLine();
		    str=s.toCharArray();
		    mir=reg=true;
		    for (int i=0;i<str.length/2;i++){
				if (reg) {
					if (str[i]!=str[str.length-i-1])
						reg=false;
				}
				if (mir) {
					if (str[i]=='E') {
						str[i]='3';
					}else if (str[i]=='J') {
						str[i]='L';
					}else if(str[i]=='S') {
						str[i]='2';
					}else if (str[i]=='Z') {
						str[i]='5';
					}else if (str[i]=='3') {
						str[i]='E';
					}else if (str[i]=='L') {
						str[i]='J';
					}else if (str[i]=='2') {
						str[i]='S';
					}else if (str[i]=='5') {
						str[i]='Z';
					}
					if (str[i]=='B' || str[i]=='C' || str[i]=='D'|| str[i]=='F' || str[i]=='G'|| str[i]=='K' || 
							str[i]=='N'	|| str[i]=='P' || str[i]=='Q'|| str[i]=='R' || str[i]=='4'|| 
							str[i]=='6' || str[i]=='7'|| str[i]=='9') {
						mir=false;
					}else if (str[i]!=str[str.length - i - 1]) {
						mir=false;
					}	
				}
			}
			if (mir&&str.length%2==1){
				int mid =str.length/2;
				if (!(str[mid]=='A' || str[mid]=='H' || str[mid]=='I'|| str[mid]=='T' || str[mid]=='Y'
						|| str[mid]=='U' || str[mid]=='O' || str[mid]=='X' || str[mid]=='M'
						|| str[mid]=='V' || str[mid]=='8' || str[mid]=='W' || str[mid]=='1')) {
					mir=false;
				}	
			}
			System.out.print(s + " -- is ");
			if (mir&&reg) {
				System.out.println("a mirrored palindrome.");
			}else if (mir) {
				System.out.println("a mirrored string.");
			}else if (reg) {
				System.out.println("a regular palindrome.");
			}else {
				System.out.println("not a palindrome.");
			}	
			System.out.println();
		}
	}
}
