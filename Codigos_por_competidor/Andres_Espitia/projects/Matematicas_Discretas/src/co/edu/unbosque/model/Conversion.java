package co.edu.unbosque.model;

public class Conversion {
	private int dec;
	private String hex;
	private String oct;
	private String bin;
	
	public Conversion() {
		dec = 0;
		hex = "";
		oct = "";
		bin = "";
	}
	
	public String decimalABinario() {
		bin="";
		int base = 2;
		int aux = dec;
		int res = 0;
		while(aux>=1) {
			res = aux%base;
			aux = aux/base;
			bin = res + bin;
		}
		return bin;
	}
	
	public int binarioADecimal() {
		dec = 0;
		int base = 2;
		int pot = 0;
		
		for(int i=bin.length()-1; i>=0; i--) {
			if(bin.charAt(i)=='1') {
				dec = dec + (int) Math.round(Math.pow(base,  pot));
			}
			pot++;
		}
		return dec;
	}
	
	public String decimalAOctal() {
		dec = 0;
		oct="";
		int base = 8;
		int aux = dec;
		int res = 0;
		while(aux>=1) {
			res = aux%base;
			aux = aux/base;
			oct = res + oct;
		}
		return oct;
	}
	
	public int octalADecimal() {
		int base = 8;
		int pot = 0;
		
		for(int i=oct.length()-1; i>=0; i--) {
			if(oct.charAt(i)!='0') {
				dec = dec + Integer.parseInt(oct.charAt(i)+"") * (int)Math.round(Math.pow(base,  pot));
			}
			pot++;
		}
		return dec;
	}
	
	public String decimalAHexadecimal() {
		hex="";
		int base = 16;
		int aux = dec;
		int res = 0;
		while(aux>=1) {
			res = aux%base;
			if(res<10) {
				hex = res + hex;
			}
			else if(res==10) {
				hex = "A" + hex;
			}
			else if(res==11) {
				hex = "B" + hex;
			}
			else if(res==12) {
				hex = "C" + hex;
			}
			else if(res==13) {
				hex = "D" + hex;
			}
			else if(res==14) {
				hex = "E" + hex;
			}
			else if(res==15) {
				hex = "F" + hex;
			}
			aux = aux/base;
		}
		return hex;
	}
	
	public int hexadecimalADecimal() {
		int base = 16;
		int pot = 0;
		dec = 0;
		hex.toUpperCase();
		for(int i=hex.length()-1; i>=0; i--) {
			if(hex.charAt(i)!='A' && hex.charAt(i)!='B' && hex.charAt(i)!='C' && hex.charAt(i)!='D' && hex.charAt(i)!='E' && hex.charAt(i)!='F' && hex.charAt(i)!='0') {
				dec = dec + Integer.parseInt(hex.charAt(i)+"") * (int) Math.round(Math.pow(base,  pot));
			}
			else if(hex.charAt(i)=='A') {
				dec = dec + 10 * (int) Math.round(Math.pow(base,  pot));
			}
			else if(hex.charAt(i)=='B') {
				dec = dec + 11 * (int) Math.round(Math.pow(base,  pot));
			}
			else if(hex.charAt(i)=='C') {
				dec = dec + 12 * (int) Math.round(Math.pow(base,  pot));
			}
			else if(hex.charAt(i)=='D') {
				dec = dec + 13 * (int) Math.round(Math.pow(base,  pot));
			}
			else if(hex.charAt(i)=='E') {
				dec = dec + 14 * (int) Math.round(Math.pow(base,  pot));
			}
			else if(hex.charAt(i)=='F') {
				dec = dec + 15 * (int) Math.round(Math.pow(base,  pot));
			}
			pot++;
		}
		return dec;
	}

	public double getDec() {
		return dec;
	}

	public void setDec(int dec) {
		this.dec = dec;
	}

	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		hex.toUpperCase();
		this.hex = hex;
	}

	public String getOct() {
		return oct;
	}

	public void setOct(String oct) {
		this.oct = oct;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}
	
	
}

