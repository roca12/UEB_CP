/* Autor: Alejandra Carvajal
* Problema: Posada de Paula
* Juez online: OmegaUp
* Veredicto: Accepted
* URL: 
*/

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] familias = new int[N]; 
        int totalFamilias = 0;

        for (int i = 0; i < N; i++) {
            familias[i] = scanner.nextInt(); 
            totalFamilias += familias[i];
        }

        System.out.println(totalFamilias);

    }
}
