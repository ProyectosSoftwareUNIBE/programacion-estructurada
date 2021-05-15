package falconi.rafael;

import java.util.Arrays;

//ordenar arreglo de menor a mayor y mayor a menor
public class Ejercicio5 {

    public static void main(String[] args) {
        int[] a = {7, 2, 4, 8, 3, 9, 1, 5, 10, 6};
        int temporal = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] < a[j]) {
                    temporal = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temporal;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
