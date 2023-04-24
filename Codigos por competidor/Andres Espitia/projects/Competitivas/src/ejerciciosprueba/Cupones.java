package ejerciciosprueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Cupones {
	
	static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	
	static final int MAX = 10005;
	static final int INF=1<<30;
	
	static class Nodo implements Comparable<Nodo>{
		int hasta, peso;
		
		public Nodo(int hasta, int peso) {
			this.hasta = hasta;
			this.peso = peso;
		}

		@Override
		public int compareTo(Nodo otro) {
			if(peso>otro.peso) {
				return 1;
			}
			
			if(peso<otro.peso) {
				return -1;
			}
			
			return 0;
		}
	}
	
	static FastReader sc = new FastReader();
	static List<List<Nodo>> ady = new ArrayList<>();
	static int distancia[] = new int[MAX];
	static boolean visitado[] = new boolean[MAX];
	static PriorityQueue<Nodo> Q = new PriorityQueue<>();
	static int V; //nodos del grafo
	static int previo[] = new int[MAX];
	static int restar = 0;
	
	static void init() {
		for (int i = 0; i < V; i++) {
			distancia[i] = INF;
			visitado[i]=false;
			previo[i]=-1;
		}
	}
	
	static void relajacion(int actual, int adyacente, int peso) {
		if(distancia[actual]+peso < distancia[adyacente]) {
			if(peso>restar && peso!=INF) restar = peso;
			distancia[adyacente] = distancia[actual]+peso;
			previo[adyacente] = actual;
			Q.add(new Nodo(adyacente, distancia[adyacente]));
		}
	}
	
	static void dijkstra(int inicial) {
		init();
		Q.add(new Nodo(inicial, 0));
		distancia[inicial]=0;
		int actual, adyacente, peso;
		while(!Q.isEmpty()) {
			actual = Q.element().hasta;
			Q.remove();
			if(visitado[actual]) {
				continue;
			}
			visitado[actual] = true;
			for (int i = 0; i < ady.get(actual).size(); i++) {
				adyacente = ady.get(actual).get(i).hasta;
				peso = ady.get(actual).get(i).peso;
				if(!visitado[adyacente]) {
					relajacion(actual, adyacente, peso);
				}
			}
		}
		
		if(distancia[V-1] == INF) {
			System.out.println(-1);
		}else {
			
			System.out.println(distancia[V-1]-restar);
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int E, origen, destino, peso, inicial;
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		for (int i = 0; i < V; i++) {
			ady.add(new ArrayList<>());
		}
		
		for (int i = 0; i < E; i++) {
			origen = sc.nextInt();
			destino = sc.nextInt();
			peso = sc.nextInt();
			ady.get(origen).add(new Nodo(destino, peso));
		}
		inicial = 0;
		dijkstra(inicial);
	}
}
