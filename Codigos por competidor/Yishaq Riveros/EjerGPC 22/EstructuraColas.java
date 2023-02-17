import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//estructuras colas (FIFO - el primero q entra el primero q sale)
//estructuras pilas (LIFO - primero q entra ultimo q sale)

public class EstructuraColas {
	
	public static void main(String[] args) {
		Queue<Integer> cola= new LinkedList<Integer>();
		
		Random r = new Random();
		for (int i = 0; i < 10; i++){
			int siguiente = r.nextInt(400);
			System.out.println(siguiente);
			cola.offer(siguiente); //offer, manda el dato para atras
		}
		System.out.println(cola.peek()); //saber quien es el dato de al frente sin necesidad de atenderlo
		System.out.println("-----------------------");
		while (!cola.isEmpty()) {
			int actual = cola.poll(); //poll saca el primer dato y lo muesta y luego con los otros "atiende al dato"
			System.out.println(actual);
		}
	}
}

