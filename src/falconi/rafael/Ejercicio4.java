package falconi.rafael;

// los arreglos se comiensa a contar de la posicion 0;
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo;
        int[][] matriz;
        arreglo = new int[5];
        matriz = new int[2][2];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 9);
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }

        int temporal = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < temporal) {
                temporal = arreglo[i];
            }

        }
        System.out.println("");
        System.out.println("el número menor es:" + temporal);
        System.out.println("");

        temporal = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > temporal) {
                temporal = arreglo[i];
            }

        }

        System.out.println("el número mayor es:" + temporal);
        System.out.println("");


        System.out.print("matriz \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 6);
            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }

    }
}
