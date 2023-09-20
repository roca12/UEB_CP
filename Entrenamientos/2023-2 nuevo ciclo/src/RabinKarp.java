
public class RabinKarp {
	
	
	public final static int d=256;
	
	static void search(String pat,String txt,int q) {
		int M=pat.length();
		int N=txt.length();
		int p=0;
		int t=0;
		int h=1;
		for (int i = 0; i < M-1; i++) {
			h=(h*d)%q;
		}
		int i,j;
		//hola mundo
		//hola
		for (i = 0; i < M; i++) {
			p=(d*p+pat.charAt(i))%q;
			t=(d*t+txt.charAt(i))%q;
		}
		
		for (i = 0; i <=N-M; i++) {
			if (p==t) {
				for (j = 0; j < M; j++) {
					if(txt.charAt(i+j)!=pat.charAt(j)) {
						break;
					}
				}
				if(j==M) {
					System.out.println("patron encontrado en el indice "+i);
				}
				
			}
			
			if (i<N-M) {
				t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+M))%q;
				if(t<0) {
					t=(t+q);
				}
			}
			
			
		}
	}

	public static void main(String[] args) {
		String txt="El anime, también escrito ánime y animé en español,2​ es un estilo de animación tradicional o por computadora de origen japonés.3​\r\n"
				+ "\r\n"
				+ "En sus inicios, la animación japonesa recibe el nombre de Senga Eiga (literalmente “películas de líneas dibujadas”), más tarde y, finalmente, sobre 1960 pasará a llamarse \"Animeeshon\" originalmente (アニメーション animēshon?). De ahí que se abrevie a «anime» (アニメ). Por otra parte, se cree que es una palabra de origen francés.4​ El anime es un medio de gran expansión en Japón, siendo al tiempo un producto de entretenimiento comercial y cultural, lo que ha ocasionado un fenómeno cultural en de masas y una forma de arte tecnológico.5​ Está potencialmente dirigido a todos los públicos, desde niños, adolescentes y adultos; hasta especializaciones de clasificación esencialmente tomada de la existente para el manga, con clases base diseñadas para especificaciones sociodemográficos tales como empleados, amas de casa, estudiantes, etc. Suelen tratar sobre sujetos, temas y géneros tan diversos como el amor, aventura, ciencia ficción, cuentos infantiles, literatura, deportes, horror, fantasía, comedia y muchos otros.6";
		txt=txt.toLowerCase();
		String pat="el";
		int q=11;
		search(pat, txt, d);

	}

}
