package Problemas.Leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        boolean xd;
		
        String originalString = Integer.toString(x);
        String reverseString = "";
        
        for (int i = originalString.length()-1; i >= 0; i--) {
        	reverseString += originalString.charAt(i);
        }
        
        if(reverseString.equals(originalString)){
        	xd = true;
        }
        else {
        	xd = false;
        }
        
		
		return xd;
    }
}
