package additionalPackage;

import java.util.Date;

public class Account {

    private static int Id=1;
    private int AccountId;
    private static final String Bank = "Kapital";
    public String accountHolder;
    public boolean isValid;
    String cardNumber;

    public Account() {
        this.AccountId = Id++; //avtomatik id artiran
    }
    public Account(String accountHolder, String cardNumber) {
        this.accountHolder = accountHolder;
        this.cardNumber = cardNumber;
        this.AccountId = Id++;

    }
}
