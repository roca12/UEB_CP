package co.edu.unbosque;

public class RegexBasico {    //regex = regular expresions
	//EXPRESIONES REGULARES Y MATCHING
	public static void main(String[] args) {
		String frase= "el cielo es azul";
		String frase2= "tengo sueño por que no se me ocurrio nada mas";
		
		//replace = reemplazar una subcadena con otra subcadena
		String res1=frase.replace(" ", "@");
		
		//todo lo q este dento [], cambielo por... a-z A-Z 
		String res2=frase2.replaceAll("[abc0-9]", "*"); //todas las letras a b y c o un numero de 0 a 9 cambielos por un asterisco
		
		String res3=frase2.replaceAll("[^a-z]", "*"); //todo lo q NO sea una letra de a - z, cambielo por asterisco
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		String bin=" |o  .o o |";
		System.out.println(bin.replaceAll("[^o ]", ""));
	}

}
