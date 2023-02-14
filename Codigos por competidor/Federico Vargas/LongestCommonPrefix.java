package Problemas.Leetcode;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
		
			//Comprobar que no esté vacio 
		    if (strs.length == 0) {
		    	return "";
		    }
		    
		    //Ir "restando" al primer elemento hasta donde comparte con los demás elementos.
		    String res = strs[0];
		    for (int i = 1; i < strs.length; i++) {
		    	while (strs[i].indexOf(res) != 0) {
		    		res = res.substring(0, res.length() -1);
		    		//Si "resta" todo el primer elemento, entonces significa que no comparten nada.
		    		if (res.isEmpty()) {
		    			return "";
		    		}
		    	}
		    }
		    return res;
		
		
		
    }
}
