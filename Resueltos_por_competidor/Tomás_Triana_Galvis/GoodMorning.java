import java.util.Arrays;
import java.util.Scanner;

/*
 * Autor: Tomás Triana Galvis
 * Problema: Good Morning!
 * Juez online: Kattis goodmorning
 * Veredicto: Accepted
 * Url: https://open.kattis.com/problems/goodmorning
 **/ 
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr  = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,23,25,26,28,29,33,36,39,40,44,45,46,47,48
            ,49,50,55,56,58,59,66,69,70,77,78,79,80,88,89,99,100,110,111,112,113,114,115,116,117,118,119,120,
            122,123,125,126,128,129,133,136,139,140,144,145,146,147,148
            ,149,150,155,156,158,159,166,169,170,177,178,179,180,188,189,199,200};
        Arrays.sort(arr);
        long t = sc.nextLong();
        int k,ans1,ans2,me,ma;
        for (int i = 0; i < t; i++) {
            k = sc.nextInt();
            ans1 =k;
            ans2=k;
            me=0;
            ma=0;
            while(Arrays.binarySearch(arr, ans1)<0) {
                ans1--;
                me++;
            }
            while(Arrays.binarySearch(arr, ans2)<0) {
                ans2++;
                ma++;
            }
            if(ma==me) {
                if(ans2<=ans1) {
                    k = ans2;
                }else {
                    k = ans1;
                }
            }else if(ma>me){
                k = ans1;
            }else if(ma<me) {
                k=ans2;
            }

            System.out.println(k);
        }
                
    }

}
