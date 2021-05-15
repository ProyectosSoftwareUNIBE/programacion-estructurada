package falconi.rafael;

public class Ejercicio6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("[i=" + i + "- j=" + j + "]");
            }
            System.out.println("");
        }
        System.out.println("------");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("[i=" + i + "- j=" + j + "]");
            }
            System.out.println("");
        }
        System.out.println("------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");

        }
        System.out.println("------");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("------");

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}
