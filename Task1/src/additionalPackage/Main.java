package additionalPackage;
import mainpackage.Person;


public class Main {
    public static void main(String[] args) {

        Person additionalPerson = new Person();
        additionalPerson.setAge((byte) 19);

        Account account = new Account();
        account.isValid = true;
        Account account2 = new Account("Nubar", "5433-0012-3910-2093");
    }
}
