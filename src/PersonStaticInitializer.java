public class PersonStaticInitializer {
    private static int age;
    static {
        age = 10;
        if (age % 10 ==0){
            throw  new CtrlNUncheckedException("Virsta nu este valida");
        }
        try {
            if (age == 10) {
                throw new CtrlNCheckedException("");
            }
        }catch(CtrlNCheckedException cnce){
            System.out.println("Exceptie la prima initializare age");
        }

    }
}
