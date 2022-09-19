import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNext()) {
                System.out.println("numarul citit este " + scanner.nextDouble());
            }
            recover(66);
        } catch (CtrlNCheckedException cnce) {
            System.out.println("a trebuie sa fie mai mare decit 0");

        } catch (
                InputMismatchException ime) {
            System.out.println("Imputul intrudus nu este valid");
        }
    }


    public static void recover(int a) throws CtrlNCheckedException {
        if (a < 0) {
            throw new CtrlNCheckedException("a trebuie sa fie mai >= decit 0");
        }
        System.out.println("a este egal cu " + a);
    }
}
