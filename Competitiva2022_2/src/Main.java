import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}

	static class Grafo {
		int nodos;
		LinkedList<Integer> adj[];

		Grafo(int v) {
			this.nodos = v;
			adj = new LinkedList[this.nodos];
			for (int i = 0; i < adj.length; i++) {
				adj[i] = new LinkedList<Integer>();
			}
		}

		void agregarCamino(int desde, int hasta) {
			adj[desde].add(hasta);
			adj[hasta].add(desde);
		}

		boolean visitado[];

		void DFS(int origen) {
			visitado = new boolean[nodos];
			DFSUtil(origen, visitado);

		}

		void DFSUtil(int actual, boolean visitado[]) {
			visitado[actual] = true;
			// System.out.print(actual+" -> ");
			cont++;
			Iterator<Integer> i = adj[actual].listIterator();
			while (i.hasNext()) {
				int nuevoactual = i.next();
				if (!visitado[nuevoactual]) {
					DFSUtil(nuevoactual, visitado);
				}
			}
			
			if (cont>contmayor) {
				contmayor=cont;
				rev=visitado;
			}
		}
	}
	static boolean [] rev;
	static int cont=0,contmayor=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		FastReader fr = new FastReader();
		int casos = fr.nextInt();
		for (int i = 0; i < casos; i++) {
			int nodos = fr.nextInt();
			int caminos = fr.nextInt();
			Grafo g = new Grafo(nodos);
			for (int j = 0; j < caminos; j++) {
				int desde = fr.nextInt() ,hasta = fr.nextInt();;
				g.agregarCamino(desde, hasta);
			}
			for (int j = 0; j < nodos; j++) {
				g.DFS(j);
				cont=0; cont=0;
			}
			
			
			int solicitudes =fr.nextInt();
			for (int j = 0; j < solicitudes; j++) {
				int a = fr.nextInt(), b = fr.nextInt();;
				
				if (rev[a] && rev[b]) {
					System.out.println("YO");
				} else {
					System.out.println("NO");
				}
			}
		}

	}

}
