import java.util.Scanner;

public class ProblemasNoIntentados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int todos = sc.nextInt();
		int intentados = sc.nextInt();
		int result = todos - intentados;
		System.out.println(result);
   }
}
