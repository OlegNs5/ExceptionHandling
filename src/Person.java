public class Person {
    private String name;
    private int age;

    //Constructor//Throws,aruncarea excepriilor in Constructori//
    public Person(String name, int age) throws CtrlNCheckedException {
        if (name == null || name.equals("")) {

            throw new CtrlNCheckedException("Numele trebuie sa aiba o valoare ! ");
        }
//        if (name==name){
//            System.out.println("Numele persoanei este " + name);
//        }
        if (age < 0) {
            throw new CtrlNCheckedException("Virsta trebuie sa fie pozitiva ! ");
        }
//            if (age > 0) {
//                System.out.println("Persoana are virsta " + age);
//            }
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        try {
            Person person = new Person("Aurelia", 18);
            System.out.println(person);
        } catch (CtrlNCheckedException cnce) {
            System.out.println("Persoana nu este creta bine " + cnce.getMessage());
        }
    }
}
