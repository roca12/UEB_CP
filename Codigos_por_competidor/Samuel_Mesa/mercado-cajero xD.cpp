#include<iostream>
#include<windows.h>
#include<conio.h>
#include<cstdlib>
#include<ctime>
#include<cmath>

using namespace std;

void gotoxy(int x, int y);
void infcli();
void salac();
void cuadro();
void cuadro2();
void cuadro3();
void cent (const char *txt, int y);
void lista (int x,string p1[],int ca[],int pre2[]);
void fac (int x,string p1[],int ca[],int pre2[]);


string nom, apl;
int nc,mr, sd,cu, ban;
double valor;
string pro[3000],prof[300];
int cant[3000] , pre[3000],cantf[300],pref[300];


int main(){
	int a, c ;
	cout<<"HOLA!!,BIENVENIDO ADMINISTRADOR"<<endl;
	cout<<"¿QUE DESEAS ABRIR HOY?"<<endl;
	cout<<"1)EL MERCADO"<<endl;
	cout<<"2)EL CAJERO"<<endl;
	cin>>a;
	system("cls");
	switch (a){
	case 1:
	cout<<"Primero ingresa los productos del dia"<<endl;
	cout<<"Cuantos productos desea ingresar."<<endl;cin>>c;
	for(int i= 0;i<c;i++){cout<<"Ingresa el nombre del producto:  ";cin>>pro[i];
	cout<<"Ingresa la cantidad de existencias a ingresar:   ";cin>>cant[i];
	cout<<"Ingresa el precio que tendra el producto:   ";cin>>pre[i];system("cls");}
	cout<<"ESTAMOS LISTOS PARA INICIAR EL DIA"<<endl;
	cout<<"PRESIONA UNA TECLA PARA CONTINUAR...";getch();system("cls");
	cuadro();
	lista (c,pro,cant,pre);
	int pc;
	cent("CUANTOS PRODUCTOS DESEAS COMPRAR",15+c);gotoxy(56,16+c);cin>>pc;
	system("cls");
	for(int i=0;i<pc;i++){cuadro3();lista (c,pro,cant,pre);
	cent("PORFAVOR DIGITA EL NUMERO DEL PRODUCTO QUE DESEAS COMPRAR",17+c);
	int po=0;
	gotoxy(56,18+c);cin>>po;
	cent("PORFAVOR DIGITA QUE CANTIDAD DE ESTE DESEAS COMPRAR",19+c);
	int cant1;
	gotoxy(56,20+c);cin>>cant1;
	system("cls");
	cant[po-1]=cant[po-1]-cant1;
	prof[i]=pro[po-1];
	cantf[i]=cant1;
	pref[i]=pre[po-1]*cant1;}
	fac(pc,prof,cantf,pref);break;
	case 2:
	cuadro2();
	getch();
	system("cls");
	cout<<"Seleccione que banco requiere para el proceso de retiro"<<endl;
	cout<<"1. BANCOLOMBIA"<<endl;
	cout<<"2. DAVIVIENDA"<<endl;
	cout<<"3. CAJA SOCIAL"<<endl;
	cin>>ban;
	sd= 5000000;
	switch(ban){
		case 1:
			system("cls");
			cout<<"Seleccione opcion de retiro"<<endl;
			cout<<"1. Cuenta de ahorros"<<endl; 
			cout<<"2. Cuenta corriente"<<endl;
			cin>>cu;
			switch(cu){
				case 1:
					infcli();
					system("cls");
					cout<<"**********RESUMEN DEL RETIRO**********"<<endl;
					cout<<"Senor/a "<< nom<< " Con numero de cuenta "<< nc<<endl;
					cout<<"Su saldo anterior es de: "<< sd<<endl;
					cout<<"Saldo a retirar es de: "<< mr<<endl;
					salac();
					
					cout<<""<<endl;
					cout<<""<<endl;
					
					cout<<"PRESIONE CUALQUIER TECLA PARA CONTINUAR..."<<endl;
					getch();
					
					system("cls");
					cout<<"Ya puede ir a cualquier corresponsal BANCOLOMBIA para retirar su dinero"<<endl;
					srand(time(NULL));
					valor= rand();
					cout<<"-----------------------------------------"<<endl;
					cout<< "Su codigo generado es :  " <<valor<<endl;
					cout<<"-----------------------------------------"<<endl;
					cout<<"";
					cout<<"Gracias, vuelva pronto......";
				break;
				case 2:
					infcli();
					system("cls");
					cout<<"**********RESUMEN DEL RETIRO**********"<<endl;
					cout<<"Senor/a "<< nom<< " Con numero de cuenta "<< nc<<endl;
					cout<<"Su saldo anterior es de: "<< sd<<endl;
					cout<<"Saldo a retirar es de: "<< mr<<endl;
					salac();
					
					cout<<""<<endl;
					cout<<""<<endl;
					
					cout<<"PRESIONE CUALQUIER TECLA PARA CONTINUAR..."<<endl;
					getch();
					
					system("cls");
					cout<<"Ya puede ir a cualquier corresponsal BANCOLOMBIA para retirar su dinero"<<endl;

					srand(time(NULL));
					valor= rand();
					cout<<"-----------------------------------------"<<endl;
					cout<< "Su codigo generado es :  " <<valor<<endl;
					cout<<"-----------------------------------------"<<endl;
					cout<<"";
					cout<<"Gracias, vuelva pronto......";
					break;	 
			}
		break;
		case 2:
			system("cls");
			cout<<"Seleccione opcion de retiro"<<endl;
			cout<<"1. Cuenta de ahorros"<<endl; 
			cout<<"2. Cuenta corriente"<<endl;
			cin>>cu;
			switch(cu){
				case 1:
					infcli();
					system("cls");
					cout<<"**********RESUMEN DEL RETIRO**********"<<endl;
					cout<<"Senor/a "<< nom<< " Con numero de cuenta "<< nc<<endl;
					cout<<"Su saldo anterior es de: "<< sd<<endl;
					cout<<"Saldo a retirar es de: "<< mr<<endl;
					salac();
					
					cout<<""<<endl;
					cout<<""<<endl;
					
					cout<<"PRESIONE CUALQUIER TECLA PARA CONTINUAR..."<<endl;
					getch();
					
					system("cls");
					cout<<"Ya puede ir a cualquier corresponsal DAVIVIENDA para retirar su dinero"<<endl;
					double valor;
					srand(time(NULL));
					valor= rand();
					cout<<"-----------------------------------------"<<endl;
					cout<< "Su codigo generado es :  " <<valor<<endl;
					cout<<"-----------------------------------------"<<endl;
					cout<<"";
					cout<<"Gracias, vuelva pronto......";
					break;
				case 2: 
				infcli();
					system("cls");
					cout<<"**********RESUMEN DEL RETIRO**********"<<endl;
					cout<<"Senor/a "<< nom<< " Con numero de cuenta "<< nc<<endl;
					cout<<"Su saldo anterior es de: "<< sd<<endl;
					cout<<"Saldo a retirar es de: "<< mr<<endl;
					salac();
					
					cout<<""<<endl;
					cout<<""<<endl;
					
					cout<<"PRESIONE CUALQUIER TECLA PARA CONTINUAR..."<<endl;
					getch();
					
					system("cls");
					cout<<"Ya puede ir a cualquier corresponsal DAVIVIENDA para retirar su dinero"<<endl;
					srand(time(NULL));
					valor= rand();
					cout<<"-----------------------------------------"<<endl;
					cout<< "Su codigo generado es :  " <<valor<<endl;
					cout<<"-----------------------------------------"<<endl;
					cout<<"";
					cout<<"Gracias, vuelva pronto......";
					break;
			}
			case 3:
				system("cls");
			cout<<"Seleccione opcion de retiro"<<endl;
			cout<<"1. Cuenta de ahorros"<<endl; 
			cout<<"2. Cuenta corriente"<<endl;
			cin>>cu;
			switch(cu){
				case 1:
					infcli();
					system("cls");
					cout<<"**********RESUMEN DEL RETIRO**********"<<endl;
					cout<<"Senor/a "<< nom<< " Con numero de cuenta "<< nc<<endl;
					cout<<"Su saldo anterior es de: "<< sd<<endl;
					cout<<"Saldo a retirar es de: "<< mr<<endl;
					salac();
					cout<<""<<endl;
					cout<<""<<endl;
					
					cout<<"PRESIONE CUALQUIER TECLA PARA CONTINUAR..."<<endl;
					getch();
					
					system("cls");
					cout<<"Ya puede ir a cualquier corresponsal CAJA SOCIAL para retirar su dinero"<<endl;
					srand(time(NULL));
					valor= rand();
					cout<<"-----------------------------------------"<<endl;
					cout<< "Su codigo generado es :  " <<valor<<endl;
					cout<<"-----------------------------------------"<<endl;
					cout<<"";
					cout<<"Gracias, vuelva pronto......";
					break;
					case 2:
						infcli();
					system("cls");
					cout<<"**********RESUMEN DEL RETIRO**********"<<endl;
					cout<<"Senor/a "<< nom<< " Con numero de cuenta "<< nc<<endl;
					cout<<"Su saldo anterior es de: "<< sd<<endl;
					cout<<"Saldo a retirar es de: "<< mr<<endl;
					salac();
					cout<<""<<endl;
					cout<<""<<endl;
					cout<<"PRESIONE CUALQUIER TECLA PARA CONTINUAR..."<<endl;
					getch();
					
					system("cls");
					cout<<"Ya puede ir a cualquier corresponsal CAJA SOCIAL para retirar su dinero"<<endl;
					srand(time(NULL));
					valor= rand();
					cout<<"-----------------------------------------"<<endl;
					cout<< "Su codigo generado es :  " <<valor<<endl;
					cout<<"-----------------------------------------"<<endl;
					cout<<"";
					cout<<"Gracias, vuelva pronto......";
					break;
					}}
	getch();
	break;
}
	return 0;
}

void gotoxy(int x, int y){
	HANDLE con;
	COORD pos;
	
	pos.X = x;
	pos.Y = y;
	con = GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleCursorPosition(con,pos);
}

void salac(){
	int result = sd-mr;
	cout<<"Su saldo actual es de: "<<result<<endl;
}

void infcli(){
	cout<<"Para comenzar, por favor digite su nombre: "; cin>>nom;
	cout<<"Digite su apellido: "; cin>>apl;
	cout<<"\nDigite su numero de cuenta: "; cin>>nc;
	cout<<"\nDigite el monto a retirar: "; cin>>mr;
}

void cuadro(){
	for(int i=43; i < 74; i++){gotoxy (i, 3); printf ("%c", 205);Beep(2000,100);}
	gotoxy (74,3);    printf ("%c", 187);Beep(2000,100);
	for(int v=4; v < 6; v++){gotoxy(74,v);  printf ("%c", 186);Beep(2000,100);}
	gotoxy(74,6);printf ("%c", 188);Beep(2000,100);
	for(int i =73 ; i > 42; i--){gotoxy(i,6);printf("%c",205);Beep(2000,100);}
	gotoxy (42,6);   printf ("%c", 200);Beep(2000,100);
	for(int i =5 ; i > 3; i--){gotoxy(42,i);printf("%c",186);Beep(2000,100);}
	gotoxy(42,3);printf ("%c", 201);Beep(2000,100);
	Sleep(1000);
	Beep(4000,250);
	gotoxy(52,4.5);cout<<"BIENVENIDO A";gotoxy(54,5.5);cout<<"MERCAMAX";
}

void cuadro2(){
	for(int i=43; i < 74; i++){gotoxy (i, 3); printf ("%c", 205);}
	gotoxy (74,3);    printf ("%c", 187);
	for(int v=4; v < 6; v++){gotoxy(74,v);  printf ("%c", 186);}
	gotoxy(74,6);printf ("%c", 188);
	for(int i =73 ; i > 42; i--){gotoxy(i,6);printf("%c",205);}
	gotoxy (42,6);   printf ("%c", 200);
	for(int i =5 ; i > 3; i--){gotoxy(42,i);printf("%c",186);}
	gotoxy(42,3);printf ("%c", 201);
	Sleep(1000);
	Beep(4000,250);
	gotoxy(52,4.5);cout<<"BIENVENIDO A SU";gotoxy(51,5.5);cout<<"CAJERO VIRTUAL :D"<<endl;
}

void cuadro3(){
	for(int i=43; i < 74; i++){gotoxy (i, 3); printf ("%c", 205);}
	gotoxy (74,3);    printf ("%c", 187);
	for(int v=4; v < 6; v++){gotoxy(74,v);  printf ("%c", 186);}
	gotoxy(74,6);printf ("%c", 188);Beep(2000,100);
	for(int i =73 ; i > 42; i--){gotoxy(i,6);printf("%c",205);}
	gotoxy (42,6);   printf ("%c", 200);
	for(int i =5 ; i > 3; i--){gotoxy(42,i);printf("%c",186);}
	gotoxy(42,3);printf ("%c", 201);
	gotoxy(52,4.5);cout<<"BIENVENIDO A";gotoxy(54,5.5);cout<<"MERCAMAX";
}

void cent (const char *txt, int y) {
	int Ttxt = strlen(txt);
	gotoxy(57-(Ttxt/2),y);printf("%s",txt);
}
///////////////////////////////////////////////////

void lista (int x,string p1[],int ca[],int pre2[]){
cent ("PRODUCTOS DEL DIA",8);
for(int i=20; i < 95; i++){gotoxy (i, 9); printf ("%c", 205);}
gotoxy(25,11);cout<<"PRODUCTO";Beep(4000,250);
cent("EXISTENCIAS",11);Beep(4000,250);
gotoxy(80,11);cout<<"PRECIO";Beep(4000,250);
int p=13;
for(int p2=1;p2<=x;p2++){gotoxy(22,p);cout<<p2<<")"<<endl;p++;}
int i=13;int c=0;
while(c!=x){gotoxy(25,i);cout<<p1[c];c++,i++;}
int i1=13;int c1=0;
while(c1!=x){gotoxy(56,i1);cout<<ca[c1];c1++,i1++;}
int i2=13;int c2=0;
while(c2!=x){gotoxy(80,i2);cout<<pre2[c2];c2++,i2++;}
for(int i=20; i < 95; i++){gotoxy (i, 14+x); printf ("%c", 205);}	
}
void fac (int x,string p1[],int ca[],int pre2[]){
for(int i=20; i < 95; i++){gotoxy (i, 3); printf ("%c", 205);}
cent ("FACTURA",4);
for(int i=20; i < 95; i++){gotoxy (i, 5); printf ("%c", 205);}
gotoxy(25,7);cout<<"PRODUCTO";Beep(4000,250);
cent("CANTIDAD",7);Beep(4000,250);
gotoxy(80,7);cout<<"PRECIO";Beep(4000,250);
int p=8;
for(int p2=1;p2<=x;p2++){gotoxy(22,p);cout<<p2<<")"<<endl;p++;}
int i=8;int c=0;
while(c!=x){gotoxy(25,i);cout<<p1[c];c++,i++;}
int i1=8;int c1=0;
while(c1!=x){gotoxy(56,i1);cout<<ca[c1];c1++,i1++;}
int i2=8;int c2=0;
while(c2!=x){gotoxy(80,i2);cout<<pre2[c2];c2++,i2++;}
for(int i=20; i < 95; i++){gotoxy (i, 9+x); printf ("%c", 205);}
int tt=0;
for(int i =0;i<x;i++){tt=tt+pre2[i];}
gotoxy(80,11+x);cout<<"TOTAL:  ";cout<<tt;
getch();
system("cls");
cent("GRACIAS POR SU COMPRA!!,TENGA BUEN DIA",5);
}
