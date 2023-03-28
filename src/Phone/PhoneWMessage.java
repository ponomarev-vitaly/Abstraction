package Phone;

public class PhoneWMessage extends RegularPhone{

    public PhoneWMessage(int Number){
        super(Number);
    }

    @Override
    public void message() {
        System.out.println("Please leave your message after the tone ... TONE ...");
    }
}
