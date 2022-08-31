import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMultipleCatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie un input de la tastatura!");
        int counter = 0;

        while (scanner.hasNext() && counter < 10) {
            try {
                if (counter == 5) {
                    scanner.close();
                }
                System.out.println("Numarul " + counter + " citit este: " + scanner.nextDouble());// metoda "nextLine" orice din linia urmatoare
                System.out.println("Scrie un numar de la tasratura!");
                counter++;

            } catch (InputMismatchException ime) {
                System.out.println("Inputul de la tastatura este invalid");
                scanner.next();
            } catch (IllegalStateException ise) {
                System.out.println("Scannerul este inchis! Nu mai avem cum citi numere");
                break;

            } finally {//aici scrim cod de curatare asitionala
                System.out.println("Acest cod se executa mereu");
                if (counter == 5) {
                    scanner.close();
                    break;
                }
            }
            //  System.out.println("Thread_ul main este incheiat");
        }
    }
}