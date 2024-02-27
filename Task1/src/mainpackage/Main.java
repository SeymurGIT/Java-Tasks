package mainpackage;
import additionalPackage.Account;
public class Main {
    public static void main(String[] args) {

        //Object of Person
        Person person = new Person("Seymour Zeynalli");
        //static field
        Person.Gender = "Boy";

        //Objects of Account
        Account account1 = new Account("Seymur", "2403-1002-3650-2073");
        Account account = new Account();
        account.isValid = false;



    }
}



