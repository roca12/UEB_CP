package ClasificaroriaNacional;

import java.util.Scanner;
import java.util.Stack;

public class WebBrowser {
	
	static Stack<String> s_back;
	static Stack<String> s_forw;
	static String temp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < t; i++) {
			s_back = new Stack<>();
			s_forw = new Stack<>();
			System.out.println("Case "+(i+1)+":");
			s_forw.push("http://www.lightoj.com/");
			boolean skip = true;
			while(skip) {
				String[] op = sc.nextLine().split(" ");
				switch (op[0]) {
				case "VISIT":
					visit(op[1]);
					break;
				case "FORWARD":
					forward();
					break;
				case "BACK":
					back();
					break;
				case "QUIT":
					skip = false;
					break;
				}
			}
		}
	}
	
	static void visit(String url) {
		temp = s_forw.peek();
		s_forw.pop();
		s_back.push(temp);
		s_forw.clear();
		s_forw.push(url);
		System.out.println(s_forw.peek());
	}
	
	static void back() {
		if (s_back.isEmpty()) {
			System.out.println("Ignored");
		} else {
			temp = s_back.peek();
			s_back.pop();
			s_forw.push(temp);
			System.out.println(s_forw.peek());
		}
	}
	
	static void forward() {
		if (s_forw.size() < 2) {
			System.out.println("Ignored");
		} else {
			temp = s_forw.peek();
			s_forw.pop();
			s_back.push(temp);
			System.out.println(s_forw.peek());
		}
	}

}
