import java.util.Arrays;

public class arrelo_java {
    public static void main(String[] args) {

        int[] arreglo = {0, 3, 5, 1, 10, 2};

        Arrays.sort(arreglo);

        System.out.println("Orden ascendente:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("Orden descendente:");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
    }
}