import java.util.Scanner;

/**
 * Scrie un program ca se repecte urmatoarele cerinte:<br/>
 * <ol>
 *      <li>Citeste de la o tastatura doua linii diferite</li>
 *      <li>Transforma cele doua linii in doua numere de tip integer si de tip double</li>
 *      <li>Declara o metoda care sa calculeze suma celor doua numere</li>
 *      <li>Afiseaza pe consola suma celor doua numere</li>
 *      <li>Trateaza potentialele exceptii care pot aparea in aplicatie</li>
 */

public class ExceptionExercise {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in)) {

            String firstLine = "";
            String secondLine = "";
            firstLine = readNextLine(scanner, firstLine);
            secondLine = readNextLine(scanner, secondLine);
            System.out.println("First line: " + firstLine);
            System.out.println("Second line: " + secondLine);

            int firstNumber = Integer.parseInt(firstLine.trim());
            double  secondNumber = Double.parseDouble(secondLine.trim());

            System.out.println("Suma celor doua numere este " + sum(firstNumber, secondNumber));

        }catch (NumberFormatException nfe){
            System.out.println("Inputul dela tastatura nu este valid !" + nfe.getMessage());
            nfe.printStackTrace();
        }
        catch(Throwable throwable){
            System.out.println("A aparat aceasta exceptie !" + throwable.getMessage());
        }
    }
public static double sum (Integer firstNumber,Double secondNumber) {
        return firstNumber + secondNumber;
}
    private static String readNextLine(Scanner scanner, String firstLine) {
        if (scanner.hasNext()) {                     //se opreste si asteapta sa citeasca ceva
            firstLine = scanner.nextLine();
            while (firstLine.trim().equals("")){
                if (scanner.hasNext()) {
                    firstLine = scanner.nextLine();
                }
            }
        }
        return firstLine;
    }
}