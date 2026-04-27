#include <iostream>
#include <string>
using namespace std;

const int Max = 100;

void suma(int A[][Max], int B[][Max], int C[][Max], int filas, int columnas) {
	for (int i = 0; i < filas; i++) {
		for (int j = 0; j < columnas; j++) {
			C[i][j] = A[i][j] + B[i][j];
		}
	}
}

void resta(int A[][Max], int B[][Max], int C[][Max], int filas, int columnas) {
	for (int i = 0; i < filas; i++) {
		for (int j = 0; j < columnas; j++) {
			C[i][j] = A[i][j] - B[i][j];
		}
	}
}

void multiplicacion(int A[][Max], int B[][Max], int C[][Max], int filasA, int columnasA, int filasB, int columnasB) {
	for (int i = 0; i < filasA; i++) {
		for (int j = 0; j < columnasB; j++) {
			C[i][j] = 0;
			for (int k = 0; k < columnasA; k++) {
				C[i][j] += A[i][k] * B[k][j];
			}
		}
	}
}

void traspuesta(int A[][Max], int C[][Max], int filas, int columnas) {
	for (int i = 0; i < filas; i++) {
		for (int j = 0; j < columnas; j++) {
			C[j][i] = A[i][j];
		}
	}
	
}

void imprimirMatriz(int matriz[][Max], int filas, int columnas) {
	for (int i = 0; i < filas; i++) {
		for (int j = 0; j < columnas; j++) {
			cout << matriz[i][j];
			if (j < columnas - 1) {
				cout << " ";
			}
		}
		cout << endl;
	}
}

int main() {
	int Ax, Ay, Bx, By;
	cin >> Ax >> Ay;
	
	int A[Max][Max];
	for (int i = 0; i < Ax; i++) {
		for (int j = 0; j < Ay; j++) {
			cin >> A[i][j];
		}
	}
	
	cin >> Bx >> By;
	
	int B[Max][Max];
	for (int i = 0; i < Bx; i++) {
		for (int j = 0; j < By; j++) {
			cin >> B[i][j];
		}
	}
	
	string operacion;
	
	while (cin >> operacion) {
		if (operacion == "SUMA") {
			int C[Max][Max];
			if (Ax == Bx && Ay == By) {
				suma(A, B, C, Ax, Ay);
				imprimirMatriz(C, Ax, Ay);
			} else {
				cout << "X" << endl;
			}
		} else if (operacion == "RESTA") {
			int C[Max][Max];
			if (Ax == Bx && Ay == By) {
				resta(A, B, C, Ax, Ay);
				imprimirMatriz(C, Ax, Ay);
			} else {
				cout << "X" << endl;
			}
		} else if (operacion == "MULTIPLICACION") {
			int C[Max][Max];
			if (Ay == Bx) {
				multiplicacion(A, B, C, Ax, Ay, Bx, By);
				imprimirMatriz(C, Ax, By);
			} else {
				cout << "X" << endl;
			}
		} else if (operacion == "TRASPUESTA") {
			int C[Max][Max];
			traspuesta(A, C, Ax, Ay);
			imprimirMatriz(C, Ay, Ax);
		} else if (operacion == "SALIR") {
			break;
		}
	}
	
	return 0;
}
