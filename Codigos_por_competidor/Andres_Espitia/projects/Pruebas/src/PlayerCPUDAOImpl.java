import java.util.Scanner;

public class PlayerCPUDAOImpl{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m[][] = new int[7][8];
		for(int i=0; i<7; i++) {
			for(int j=0; j<8; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		System.out.println(compare(m, 1));
	}
	
	public PlayerCPUDAOImpl(){
		
	}


	public void createPlayer(String name, String team) {
		// TODO Auto-generated method stub
		
	}

	public void play(int colum) {
		
	}
	
	public static int compare(int matrix[][], int team){
		int column = 0;
		int cont[] = new int[6];
		
		
		for (int j = 1; j < 8-1; j++) {
			int contaux = 0;
			int pos = 0;
			for(int i=0; i<7; i++) {
				if(matrix[i][j]!=0) {
					pos = i-1;
					break;
				}
				else if(i==6 && matrix [i][j]==0) {
					pos = i;
					break;
				}
			}
			System.out.println("Posicion: "+pos);
			if(pos < 0) {
				cont[j-1] = 0;
				break;
			}
			if(matrix[pos][j-1] == team) {
				contaux++;
			}
			if(pos+1 < 7 && matrix[pos+1][j] == team) {
				contaux++;
			}
			if(matrix[pos][j+1] == team) {
				contaux++;
			}
			if(pos+1 < 7 && matrix[pos+1][j-1] == team) {
				contaux++;
			}
			if(pos+1 < 7 && matrix[pos+1][j+1] == team) {
				contaux++;
			}
			
			cont[j-1] = contaux;
		}
		
		int aux = cont[0];
		for(int i=1; i<cont.length; i++) {
			if(aux<=cont[i]) {
				column = i+1;
				aux = cont[i];
			}
		}
		
		return column;
	}
}
