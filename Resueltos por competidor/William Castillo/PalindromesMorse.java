import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = ".-";
		String b = "-...";
		String c = "-.-.";
		String d = "-..";
		String e = ".";
		String f = "..-.";
		String g = "--.";
		String h = "....";
		String i = "..";
		String j = ".---";
		String k = "-.-";
		String l = ".-..";
		String m = "--";
		String n = "-.";
		String o = "---";
		String p = ".--.";
		String q = "--.-";
		String r = ".-.";
		String s = "...";
		String t = "-";
		String u = "..-";
		String v = "...-";
		String w = ".--";
		String x = "-..-";
		String y = "-.--";
		String z = "--..";
		String b0 = "-----";
		String b1 = ".----";
		String b2 = "..---";
		String b3 = "...--";
		String b4 = "....-";
		String b5 = ".....";
		String b6 = "-....";
		String b7 = "--...";
		String b8 = "---..";
		String b9 = "----.";

		
			String pal = sc.nextLine();
			String codex = "";
			for (int i1 = 0; i1 < pal.length(); i1++) {

				String aux = pal.charAt(i1) + "";

				if (aux.equalsIgnoreCase("a")) {
					codex += a;
				}
				if (aux.equalsIgnoreCase("b")) {
					codex += b;
				}
				if (aux.equalsIgnoreCase("c")) {
					codex += c;
				}
				if (aux.equalsIgnoreCase("d")) {
					codex += d;
				}
				if (aux.equalsIgnoreCase("e")) {
					codex += e;
				}
				if (aux.equalsIgnoreCase("f")) {
					codex += f;
				}
				if (aux.equalsIgnoreCase("g")) {
					codex += g;
				}
				if (aux.equalsIgnoreCase("h")) {
					codex += h;
				}
				if (aux.equalsIgnoreCase("i")) {
					codex += i;
				}
				if (aux.equalsIgnoreCase("j")) {
					codex += j;
				}
				if (aux.equalsIgnoreCase("k")) {
					codex += k;
				}
				if (aux.equalsIgnoreCase("l")) {
					codex += l;
				}
				if (aux.equalsIgnoreCase("m")) {
					codex += m;
				}
				if (aux.equalsIgnoreCase("n")) {
					codex += n;
				}
				if (aux.equalsIgnoreCase("o")) {
					codex += o;
				}
				if (aux.equalsIgnoreCase("p")) {
					codex += p;
				}
				if (aux.equalsIgnoreCase("q")) {
					codex += q;
				}
				if (aux.equalsIgnoreCase("r")) {
					codex += r;
				}
				if (aux.equalsIgnoreCase("s")) {
					codex += s;
				}
				if (aux.equalsIgnoreCase("t")) {
					codex += t;
				}
				if (aux.equalsIgnoreCase("u")) {
					codex += u;
				}
				if (aux.equalsIgnoreCase("v")) {
					codex += v;
				}
				if (aux.equalsIgnoreCase("w")) {
					codex += w;
				}
				if (aux.equalsIgnoreCase("x")) {
					codex += x;
				}
				if (aux.equalsIgnoreCase("y")) {
					codex += y;
				}
				if (aux.equalsIgnoreCase("z")) {
					codex += z;
				}
				if (aux.equalsIgnoreCase("0")) {
					codex += b0;
				}
				if (aux.equalsIgnoreCase("1")) {
					codex += b1;
				}
				if (aux.equalsIgnoreCase("2")) {
					codex += b2;
				}
				if (aux.equalsIgnoreCase("3")) {
					codex += b3;
				}
				if (aux.equalsIgnoreCase("4")) {
					codex += b4;
				}
				if (aux.equalsIgnoreCase("5")) {
					codex += b5;
				}
				if (aux.equalsIgnoreCase("6")) {
					codex += b6;
				}
				if (aux.equalsIgnoreCase("7")) {
					codex += b7;
				}
				if (aux.equalsIgnoreCase("8")) {
					codex += b8;
				}
				if (aux.equalsIgnoreCase("9")) {
					codex += b9;
				}
			}
			int i3 = codex.length() - 1;
			int cont = 0;
			for (int i2 = 0; i2 < codex.length() / 2; i2++) {
				if (codex.charAt(i2) == codex.charAt(i3)) {
				} else {
					cont++;
				}
				i3--;
			}
			if (cont != 0) {
				System.out.println("NO");
			} else if (codex.length() == 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}

