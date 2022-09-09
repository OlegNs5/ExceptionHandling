public class MethodThrowingExceptions {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {


            System.out.println(appLogic(vector, 3, "12"));
            System.out.println(appLogic(vector, 3, "44f"));
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Indexul specificat nu exista !");
        }catch (NumberFormatException nfe){
            System.out.println("numarul transmis nu este un intreg !");
        }
    }

    public static int appLogic(int[] vector, int index, String number) throws ArrayIndexOutOfBoundsException, NumberFormatException {
        return vector[index] + Integer.parseInt(number);
    }

}