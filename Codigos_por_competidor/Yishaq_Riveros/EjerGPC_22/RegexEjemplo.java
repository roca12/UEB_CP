package co.edu.unbosque;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEjemplo {
	public static void main(String[] args) {
		Pattern patron = Pattern.compile("abc");
		Matcher comparar = patron.matcher("abcdefghijk");
		if(comparar.matches()) {
			System.out.println("si coincide");
		}else {
			System.out.println("no");
		}
		
		Pattern patron2 = Pattern.compile(".*abc.*");
		/*
		(.*  .*) = no importa si es antes o despues
		si estan al inicio = si la palabra empieza con
		si estan al final = si la palabra termina con
		*/
		Matcher comparar2 = patron2.matcher("abcdefghijk");
		if(comparar2.matches()) {
			System.out.println("si coincide");
		}else {
			System.out.println("no");
		}
		
		Pattern patron3 = Pattern.compile("[_a-zA-Z+]+[0-9]{8,24}"); //{ } VERIFICA EL TAMAñO SI ES ENTRE 8 Y 24
		Matcher comparar3 = patron3.matcher("clavefacil");
		if(comparar3.matches()) {
			System.out.println("si coincide");
		}else {
			System.out.println("no");
		}
	}

}
