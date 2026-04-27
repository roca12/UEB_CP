
package co.edu.unbosque.model;

import co.edu.unbosque.view.Console;

public class Sorts {
	private Console c = new Console();
	
	public String[] BubbleSort(String[] words, int type) {
		if(type == 0) {
			int it = 0;
			for (int i = 0; i < words.length; i++) {
				for (int j = 0; j < words.length-1; j++) {
					if(words[j].compareTo(words[j+1]) < 0) {
						String aux = words[j];
						words[j] = words[j+1];
						words[j+1] = aux;
						c.printArray(words, it);
						it++;
					}
				}
			}
		}
		else if(type == 1) {
			int it = 0;
			for (int i = 0; i < words.length; i++) {
				for (int j = 0; j < words.length-1; j++) {
					if(words[j].compareTo(words[j+1]) > 0) {
						String aux = words[j];
						words[j] = words[j+1];
						words[j+1] = aux;
						c.printArray(words, it);
						it++;
					}
				}
			}
		}
		
		return words;
	}
	
	public String[] selectionSort(String[] words, int type) {
		if (type == 0) {
			int it=0;

		    for (int i = 0; i < words.length - 1; i++) {
		      int min_idx = i;

		      for (int j = i + 1; j < words.length; j++) {
		        if (words[j].compareTo(words[min_idx]) < 0) {
		          min_idx = j;
		        }
		      }

		      String temp = words[i];
		      words[i] = words[min_idx];
		      words[min_idx] = temp;
		      c.printArray(words, it);
		      it++;
		    }	
			
		}else if (type == 1){
			int it=0;

		    for (int i = 0; i < words.length - 1; i++) {
		      int min_idx = i;

		      for (int j = i + 1; j < words.length; j++) {
		        if (words[j].compareTo(words[min_idx]) > 0) {
		          min_idx = j;
		        }
		      }

		      String temp = words[i];
		      words[i] = words[min_idx];
		      words[min_idx] = temp;
		      c.printArray(words, it);
		      it++;
		    }	
		}
		
		return words;
	}
	
	public String[] insertionSort (String[] words, int type) {
		if(type == 0) {
			int it = 0;
	        for (int i = 1; i < words.length; ++i) {
	            String key = words[i];
	            int j = i - 1;
	            
	            while (j >= 0 && words[j].compareTo(key) > 0) {
	                words[j + 1] = words[j];
	                j = j - 1;
	            }
	            words[j + 1] = key;
	            c.printArray(words, it);
	            it++;
	        }
		}
		else if(type == 1){
			int it = 0;
			for (int i = 1; i < words.length; ++i) {
	            String key = words[i];
	            int j = i - 1;
	            
	            while (j >= 0 && words[j].compareTo(key) < 0) {
	                words[j + 1] = words[j];
	                j = j - 1;
	            }
	            words[j + 1] = key;
	            c.printArray(words, it);
	            it++;
	            
	        }
		}
		
		
		return words;
	}
}
