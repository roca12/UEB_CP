package ClasificaroriaNacional;

import java.util.Scanner;

public class Paralelogramo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int ax = sc.nextInt(), ay = sc.nextInt(), bx = sc.nextInt(), by = sc.nextInt(), cx = sc.nextInt(), cy = sc.nextInt(), dx, dy;
			
			dx = ax + cx - bx;
			dy = ay + cy - by;
			
			int a = (((ax * by) + (bx * cy) + (cx * dy) + (dx * ay)) - ((ay * bx) + (by * cx) + (cy * dx) + (dy * ax))) / 2;
			
			if (a < 0) {
				a *= -1;
			}
			
			System.out.println("Case "+(i+1)+": "+dx+" "+dy+" "+a);
		}
	}
}
