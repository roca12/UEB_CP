import java.util.LinkedList;
import java.util.Random;

public class EstructuraDobleLaso {
	
	public static void main(String[] args) {
		LinkedList<Integer> listadoble = new LinkedList<Integer>();
		int cont=0;
		 Random r = new Random();
		 while (cont < 15) {
			 int num=r.nextInt(100);
			 if (num%2==0) {
				 listadoble.addLast(num);
			 }else {
				 listadoble.addFirst(num);
			 }
			 cont++;
		 }
		 for (Integer i :listadoble) {
			 System.out.print(i+" ");
		 }
	}

}
