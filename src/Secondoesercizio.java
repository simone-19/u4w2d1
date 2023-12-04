import java.util.Scanner;

public class Secondoesercizio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("numero di chilometri percorsi: ");
            double kmPercorsi = scanner.nextDouble();

            System.out.print("litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();

            if (litriConsumati == 0) {
                throw new ArithmeticException("impossibile perchè hai messo 0.");
            }

            double kmPerLt = kmPercorsi / litriConsumati;
            System.out.println("I chilometri per litro percorsi sono: " + kmPerLt);
        } catch (Exception e) {
            System.out.println("senza benzina dove vai?");
        } finally {
            scanner.close();
        }
    }
}
