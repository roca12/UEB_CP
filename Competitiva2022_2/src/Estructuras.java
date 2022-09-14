
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.TreeSet;

public class Estructuras {

	public static void main(String[] args) {
		Stack<Integer> pila= new Stack<Integer>();
		
		Random r = new Random();
		for (int i = 0; i <10; i++) {
			int siguiente= r.nextInt(400);
			System.out.println(siguiente);
			pila.push(siguiente);			
		}
		System.out.println(pila.peek());
		System.out.println("----------------------");
		while (!pila.isEmpty()) {
			int actual= pila.pop();
			System.out.println(actual);
		}
	}

}
