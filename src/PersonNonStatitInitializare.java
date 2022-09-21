public class PersonNonStatitInitializare {

    private int age;
    private String name;

    //Bloc de initializare non-static  sau bloc de instanta de initializare
    //Acest bloc este chemat in momentul care se incearca initializarea unui obiect nou
    {
    age=10;
    name="John";
    if (age<0){
        throw new CtrlNCheckedException("Age nu este valid");
    }
    }
    public PersonNonStatitInitializare() throws CtrlNCheckedException{}

    public PersonNonStatitInitializare(int age,String name) throws CtrlNCheckedException{
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        try {
            PersonNonStatitInitializare personOne = new PersonNonStatitInitializare();
            PersonNonStatitInitializare personTwo = new PersonNonStatitInitializare(-40,"Mary");
            System.out.println(personOne);
            System.out.println(personTwo);
        }catch(CtrlNCheckedException cnce){
            System.out.println("obiectul nu este initializat bine");
        }
    }

    @Override
    public String toString() {
        return "PersonNonStatitInitializare{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
