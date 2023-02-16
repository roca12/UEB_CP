import java.util.ArrayList;
import java.util.Random;

public class Estructuras {
	
	public static void main(String[] args) {
		//arrays
//		int [] arr = new int [10];
//		Random r = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=r.nextInt(100);
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("pos "+i+" -> "+arr[i]);
//		}
		
		
//		int filas=10; int columnas=10;
//		long [][] matrix = new long [filas][columnas];
//		Random r = new Random();
//		for (int i = 0; i < filas; i++) {
//			for (int j = 0; j < columnas; j++) {
//				matrix[i][j]=r.nextInt(100);
//			}
//		}
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				System.out.print(matrix[i][j]+"\t");
//			}
//			System.out.println();
//		}
//	}
//}
		
		
		
		
		//LISTAS
//		Random r = new Random();
//		ArrayList<Integer> lista=new ArrayList<Integer>();
//		for (int i = 0; i < 10; i++) {
//			lista.add(r.nextInt(40));
//		}
//		for (int i=0; i < lista.size();i++) {
//			System.out.print(lista.get(i)+" ");
//		}
//		System.out.println();
//	}	
//}		
		//listas BIDIMENSIONALES
		Random r = new Random();
		ArrayList<ArrayList<String>> listadelistas=new ArrayList<ArrayList<String>>();
		for (int i=0; i < 10; i++) {
			listadelistas.add(new ArrayList<String>());
		}
	}
}