import java.util.Scanner;

public class RobotInstructions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int result = 0;

		for (int i = 0; i < casos; i++) {
			int ins = sc.nextInt();
			sc.nextLine();
			String[] in = new String[ins];
			for (int j = 0; j < ins; j++) {
				in[j] = sc.nextLine();
				if (in[j].equalsIgnoreCase("LEFT")) {
					result = result - 1;
				} else if (in[j].equalsIgnoreCase("RIGHT")) {
					result++;
				} else {
					int k = (Integer.parseInt(in[j].substring(8) + "")) - 1;
					if (in[k].equalsIgnoreCase("LEFT")) {
						in[j] = "LEFT";
						result--;
					} else if (in[k].equalsIgnoreCase("RIGHT")) {
						in[j] = "RIGHT";
						result++;
					}
				}
			}
			System.out.println(result);
			result = 0;
		}
	}
}