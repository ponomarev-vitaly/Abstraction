package Phone;

public class PhoneApplication {
    public static void main(String[] args) {
        Phone ph01 = new PhoneWMessage(123456); // The left side can be abstract, but the right side must be abstract.
        ph01.call();
        ph01.message();
        ph01.ring();
        System.out.println(ph01.toString());
    }
}
