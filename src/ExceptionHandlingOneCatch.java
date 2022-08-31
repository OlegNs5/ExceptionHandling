import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingOneCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie un input de la tastatura!");
        int counter = 0;
        while(scanner.hasNext()&& counter < 10){
            try {
                System.out.println("Numarul " + counter + " citit este: " + scanner.nextDouble());// metoda "nextLine" orice din linia urmatoare
                System.out.println("Scrie un numar de la tasratura!");
                counter++;
            }catch(InputMismatchException ime){
                System.out.println("Inputul de la tastatura este invalid");
                scanner.next();
            }
        }
    }
}