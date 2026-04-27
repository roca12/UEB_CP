import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

//estructuras colas (FIFO - el primero q entra el primero q sale)
//estructuras pilas (LIFO - primero q entra ultimo q sale)

public class EstructuraPilas {

	public static void main(String[] args) {
		Stack<Integer> pila= new Stack<Integer>();
		
		Random r = new Random();
		for (int i = 0; i < 10; i++){
			int siguiente = r.nextInt(400);
			System.out.println(siguiente);
			pila.push(siguiente);
		}
		System.out.println(pila.peek()); //saber quien es el dato de al frente sin necesidad de atenderlo
		System.out.println("-----------------------");
		while (!pila.isEmpty()) {
			int actual = pila.pop();
			System.out.println(actual);
		}
	}
}
