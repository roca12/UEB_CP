package ClasificaroriaNacional;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue_i {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			Deque<String> queue = new LinkedList<>();
			System.out.println("Case "+(i+1)+":");
			int n = sc.nextInt(), m = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < m; j++) {
				String[] act = sc.nextLine().split(" ");
				switch (act[0]) {
				case "pushLeft":
					if (queue.size() < n) {
						queue.addFirst(act[1]);	
						System.out.println("Pushed in left: "+queue.getFirst());
					} else {
						System.out.println("The queue is full");
					}
					break;
				case "pushRight":
					if (queue.size() < n) {
						queue.addLast(act[1]);	
						System.out.println("Pushed in right: "+queue.getLast());
					} else {
						System.out.println("The queue is full");
					}
					break;
				case "popLeft":
					if (queue.isEmpty()) {
						System.out.println("The queue is empty");
					} else {			
						System.out.println("Popped from left: "+queue.getFirst());
						queue.removeFirst();
					}
					break;
				case "popRight":
					if (queue.isEmpty()) {
						System.out.println("The queue is empty");
					} else {			
						System.out.println("Popped from right: "+queue.getLast());
						queue.removeLast();
					}
					break;
				}
			}
		}

	}

}
