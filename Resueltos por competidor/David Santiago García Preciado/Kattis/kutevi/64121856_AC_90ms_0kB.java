import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] info = new int[N];
        int[] jobs = new int[K];
        for(int i=0;i<N;i++) {
        	info[i] = sc.nextInt();
        }
        for(int i=0;i<K;i++) {
        	jobs[i] = sc.nextInt();
        }

        boolean[] possible = new boolean[360];
        Queue<Integer> angles = new ArrayDeque<>();

        for(int a: info){
            if(!possible[a]){
                possible[a]=true;
                angles.add(a);
            }
        }

        while(!angles.isEmpty()){
            int x=angles.poll();
            for(int i=0;i<360;i++){
                if(possible[i]){
                    int add=(x+i)%360;
                    int sub=Math.abs(x-i)%360;
                    if(!possible[add]){
                        possible[add]=true;
                        angles.add(add);
                    }
                    if(!possible[sub]){
                        possible[sub]=true;
                        angles.add(sub);
                    }
                }
            }
        }

        for(int a: jobs){
            System.out.println(possible[a] ? "YES":"NO");
        }
    }
}
