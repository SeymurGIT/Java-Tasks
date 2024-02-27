package mainpackage;

public class Person {
    private int Id;
    String FullName;

    //Elave numune
    private byte Age;
    public static String Gender; //Hami ucun eyni olacaq, Country de yazila biler
    public Person() {

    }
    Person(String fullName) {
        this.FullName = fullName;
    }

    //Getter metodu
    public byte getAge() {
        return Age;
    }

    //Setter metodu
    public void setAge(byte age) {
        this.Age = age;
    }
}
