import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // array di 5 interi casuali
        int[] array = generaArrayCasuale(5, 1, 10);

        // Stampa l'array originale
        System.out.println("Array originale: " + Arrays.toString(array));

        // Chiede all'utente di inserire un nuovo numero e una posizione
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un nuovo numero: ");
        int nuovoNumero = scanner.nextInt();
        System.out.print("Inserisci la posizione (da 0 a 4) dove vuoi inserirlo: ");
        int posizione = scanner.nextInt();

        // Verifica se la posizione inserita è valida
        if (posizione < 0 || posizione >= array.length) {
            System.out.println("Posizione non valida. Il programma termina.");
            return;
        }

        // Inserisce il nuovo numero nella posizione specificata
        array[posizione] = nuovoNumero;

        // Stampa il nuovo stato dell'array
        System.out.println("Nuovo stato dell'array: " + Arrays.toString(array));

        scanner.close();
    }

    // Metodo per generare un array di interi casuali
    public static int[] generaArrayCasuale(int lunghezza, int min, int max) {
        int[] array = new int[lunghezza];
        Random random = new Random();

        for (int i = 0; i < lunghezza; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
}
