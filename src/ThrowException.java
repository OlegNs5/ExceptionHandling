public class ThrowException {
public static void doSomething(Integer a){
    System.out.println("Do something here with " + a + " !");
    if (a > 5){
        throw new IllegalArgumentException("a este mai mare decit 5! ");
    }

}
    public static void main(String[] args) {
    try {
        doSomething(3);
        doSomething(10);
    }catch (IllegalArgumentException illegalArgumentException){
        System.out.println("Numarul transmis nu este ok! ");
    }
    }
}

