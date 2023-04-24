package co.edu.unbosque.util;

import java.util.ArrayList;

import co.edu.unbosque.model.SharkDTO;

public class MergeSort {

    /*Une dos subarrays de arr[]
    Primer subarray es arr[1...m]
    Segundo subarray es arr[m+1..r]*/
    public static ArrayList<SharkDTO> merge(ArrayList<SharkDTO> list, int l, int m, int r) {
        //Encuentra tamaños de dos subarrays a ser unidos
        int n1 = m - l + 1;
        int n2 = r - m;
        /* Crear arrays temporales */
        ArrayList<SharkDTO> L = new ArrayList<>();
        ArrayList<SharkDTO> R = new ArrayList<>();
        /*Copia datos en los arrays temporales*/
        for (int i = 0; i < n1; i++) {
        	L.add(list.get(l + i));
        }
        for (int j = 0; j < n2; j++) {
        	R.add(list.get(m + 1 + j));
        }
        /*Une los arreglos temporales*/
        // Indices iniciales del los dos subarrays
        int i = 0, j = 0;
        //indice inicial de array unido
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i).getAge() <= R.get(i).getAge()) {
                list.set(k, L.get(i));
                i++;
            } else {
            	list.set(k, R.get(j));
                j++;
            }
            k++;
        }
        /*Copia los elementos restanes de L[] si hay*/
        while (i < n1) {
        	list.set(k, L.get(i));
            i++;
            k++;
        }
        //Copia los elementos restanes de R[] si hay
        while (j < n2) {
        	list.set(k, R.get(j));
            j++;
            k++;
        }
        return list;
    }

    public static ArrayList<SharkDTO> sort(ArrayList<SharkDTO> list, int l, int r) {
        if (l < r) {
            //Encuentra el punto medio
            int m = (l + r) / 2;
            // Ordena los dos subarrays
            sort(list, l, m);
            sort(list, m + 1, r);
            // Une los subarrays
            return merge(list, l, m, r);
        }
        return list;
    }
}