package Clasificatorio;



import java.util.Scanner;

public class Paralelogramo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		for(int caso=1; caso<=t; caso++){
			int ax = sc.nextInt(), ay = sc.nextInt();
			int bx = sc.nextInt(), by = sc.nextInt();
			int cx = sc.nextInt(), cy = sc.nextInt();
			int dx, dy;
			
			dx = ax + cx - bx;
			dy = ay + cy - by;
			
			int area = (((ax * by) + (bx * cy) + (cx * dy) + (dx * ay)) - ((ay * bx) + (by * cx) + (cy * dx) + (dy * ax)))/2;
			
			if(area < 0) area *= -1;
			
			System.out.println("Case "+caso+": "+dx+" "+dy+" "+area);
		}
	}

}
