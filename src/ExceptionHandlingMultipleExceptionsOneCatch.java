import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;

public class ExceptionHandlingMultipleExceptionsOneCatch {

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BigDecimal bigDecimal = new BigDecimal("2.72");

        try {                                                                       //asta preinde exceptiile
            System.out.println(vector[7]);
            bigDecimal = null;
            System.out.println(bigDecimal.intValue());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException exception ) {//asta preinde exceptiile
            if (exception instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Nu exista acest index! ");
            }
            if(exception instanceof NullPointerException){
                System.out.println("Obiectul referit este null");
            }
//        } catch (NullPointerException npe) {
//            System.out.println("Obiectul referit este null !");
        }finally {
            System.out.println("Suntem in blocul finally!");
        }
    }
}
