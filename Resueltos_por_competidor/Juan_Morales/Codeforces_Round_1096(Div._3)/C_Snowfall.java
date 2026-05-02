/*
 * Autor: OtherSpanish
 * Problema: Snowfall
 * Juez online: Codeforces
 * Veredicto: Accepted
 * https://codeforces.com/contest/2227/problem/C
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class C_Snowfall {

    public static void main(String[] args) throws IOException {
    	//lectura de datos rapida
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Test cases
        int tc = Integer.parseInt(br.readLine());
        //Ir uniendo la respuesta con StringBuilder
        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < tc; j++) {
        	//lee el tamaño del "array"
        	int n = Integer.parseInt(br.readLine());
        	//Division de input en tokens para usarlo como enteros
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            ArrayList<Integer> bothDiv  = new ArrayList<>(); //Lista para los números divisibles por 2 Y 3
            ArrayList<Integer> onlyDiv2 = new ArrayList<>(); //Lista para los números divisibles únicamente por 2
            ArrayList<Integer> onlyDiv3 = new ArrayList<>(); //Lista para los números divisibles únicamente por 3
            ArrayList<Integer> noneDiv  = new ArrayList<>(); //Lista para los números que no son divisibles por ninguno de los 2
            
            //Por cada item
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                //Revisar divisibilidad
                boolean div2 = x % 2 == 0;
                boolean div3 = x % 3 == 0;
                
                //Añadir a sus respectivas listas
                if (div2 && div3)
                    bothDiv.add(x);
                else if (div2)
                    onlyDiv2.add(x);
                else if (div3)
                    onlyDiv3.add(x);
                else
                    noneDiv.add(x);
            }
            
            /*
             * Se añaden al sb en orden especifico, primero los div 2 & 3
             * luego los div 2
             * luego los !div
             * y luego los div 3
             * Queda en orden
             * */
            for (int x : bothDiv) {
                sb.append(x).append(' ');
            }
            for (int x : onlyDiv2) {
                sb.append(x).append(' ');
            }
            for (int x : noneDiv) {
                sb.append(x).append(' ');
            }
            for (int x : onlyDiv3) {
                sb.append(x).append(' ');
            }

            sb.append('\n'); //Se mete esta basura porque mimimi PRESENTATION
        }
        
        System.out.print(sb);
    }
}
