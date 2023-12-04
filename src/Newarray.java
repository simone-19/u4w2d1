import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Newarray {
    public static void main(String[] args) {
        int[] array = generaArrayCasuale(5, 1, 10);
        System.out.println("Array originale: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci un nuovo numero: ");
            int nuovoNumero = scanner.nextInt();

            System.out.print("Inserisci la posizione (da 0 a 4) dove vuoi inserirlo: ");
            int posizione = scanner.nextInt();

            if (posizione < 0 || posizione >= array.length) {
                throw new IndexOutOfBoundsException("Posizione non valida.");
            }

            array[posizione] = nuovoNumero;
            System.out.println("Nuovo stato dell'array: " + Arrays.toString(array));
        } catch (Exception e) {
            System.out.println("Input non valido. Il programma termina.");
        } finally {
            scanner.close();
        }
    }

    public static int[] generaArrayCasuale(int lunghezza, int min, int max) {
        int[] array = new int[lunghezza];
        Random random = new Random();

        for (int i = 0; i < lunghezza; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
}
