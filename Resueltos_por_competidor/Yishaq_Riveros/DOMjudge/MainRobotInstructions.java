import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MainRobotInstructions {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int i = Integer.parseInt(br.readLine());
		while (i --> 0) {  
			int j = Integer.parseInt(br.readLine());
			int[] arr = new int [j];
			int k = 0;
			for (int k2 = 0; k2 < j; k2++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				if(s.charAt(0)=='R') {
					arr[k2]=1;
					k++;
				}else {
					if(s.charAt(0)=='L') {
						arr[k2]= -1;
						k--;
					}else {
						st.nextToken();
						int x = Integer.parseInt(st.nextToken());
						k+=arr[x-1];
						arr[k2]=arr[x-1];
					}
				}
			}
			out.append(k+"\n");
		}
		out.flush();
	}
}
