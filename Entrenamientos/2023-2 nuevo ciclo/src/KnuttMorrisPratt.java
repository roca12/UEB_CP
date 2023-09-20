// Matching de strings en masa
public class KnuttMorrisPratt {

	static void computarLPSArray(String pat, int M, int[] lps) {
		int len = 0;
		int i = 1;
		lps[0] = 0;
		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len!=0) {
					len=lps[len-1];
				}else {
					lps[i]=len;
					i++;
				}
			}
		}
	}
	//    hola
	//hol mundo
	
	static void KMPSearch(String pat,String txt) {
		int M =pat.length();
		int N =txt.length();
		int lps[]=new int [M];
		int j=0;
		computarLPSArray(pat,M,lps);
		int i=0;
		while (i<N) {
			if (pat.charAt(j)==txt.charAt(i)) {
				j++;
				i++;
			}
			if (j==M){
				System.out.println("Encontrado patron en el indice "+(i-j)+ "-"+(i-1));
				j=lps[j-1];
			}else if (i<N && pat.charAt(j)!= txt.charAt(i)) {
				if (j!=0) {
					j=lps[j-1];
				}else {
					i+=1;
				}
			}
			
		}
		
	}
	


	public static void main(String[] args) {
		
		String pat="sol";
		String text="El Sol (del latín sol, solis, ‘dios Sol invictus’ o ‘sol’, a su vez de la raíz protoindoeuropea sauel-, ‘luz’)4​ es una estrella de tipo-G de la secuencia principal y clase de luminosidad V que se encuentra en el centro del sistema solar y constituye la mayor fuente de radiación electromagnética de este sistema planetario.5​ Es una esfera casi perfecta de plasma, con un movimiento convectivo interno que genera un campo magnético a través de un proceso de dinamo. Cerca de tres cuartas partes de la masa del Sol constan de hidrógeno; el resto es principalmente helio, con cantidades mucho más pequeñas de elementos, incluyendo el oxígeno, carbono, neón y hierro.";
		text=text.toLowerCase();
		KMPSearch(pat, text);
	}

}
