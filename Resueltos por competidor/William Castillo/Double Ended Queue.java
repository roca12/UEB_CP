import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int j = 0; j < t; j++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();
			LinkedList<Integer> lst = new LinkedList<>();
			System.out.println("Case " + (j+1)+":");
			for (int i = 0; i < m; i++) {
				String orden = sc.nextLine();
				
				if (orden.contains("pushLeft")) {
					if (lst.size() < n) {
						lst.addFirst(Integer.parseInt(orden.substring(orden.indexOf(" ") + 1, orden.length())));
						System.out.println("Pushed in left: " + orden.substring(orden.indexOf(" ") + 1, orden.length()));
					} else {
						System.out.println("The queue is full");
					}

				} else if (orden.contains("pushRight")) {
					if (lst.size() < n) {
						lst.addLast(Integer.parseInt(orden.substring(orden.indexOf(" ") + 1, orden.length())));
						System.out.println("Pushed in right: " + orden.substring(orden.indexOf(" ") + 1, orden.length()));
					} else {
						System.out.println("The queue is full");
					}
				} else if (orden.contains("popLeft")) {
					if (!lst.isEmpty()) {
						String aux = lst.get(0) + "";
						lst.removeFirst();
						System.out.println("Popped from left: " + aux);
					} else {
						System.out.println("The queue is empty");
					}
				} else if (orden.contains("popRight")) {
					if (!lst.isEmpty()) {
						String aux = lst.get(lst.size()-1) + "";
						lst.removeLast();
						System.out.println("Popped from right: " + aux);
					} else {
						System.out.println("The queue is empty");
					}
				}

			}

		}

	}
}
