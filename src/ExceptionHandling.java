public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            recover(-10);
        } catch (CtrlNCheckedException cnce) {
            System.out.println("Trebuie o valoare mai matr decit 0 !");
        }
    }
        public static void recover ( int a) throws CtrlNCheckedException {
            if (a < 0) {
                throw new CtrlNCheckedException("a trebuie sa fie mai >= decit 0 !");
            }
            System.out.println("a este valid " + a);
        }

}