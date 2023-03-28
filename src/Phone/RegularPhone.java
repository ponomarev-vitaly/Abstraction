package Phone;

public abstract class RegularPhone extends Phone{
    public RegularPhone(int Number){ // Create the constructor.
        super(Number);
    }
    public void call(){
        System.out.println("Dial the number and wait...");
    }

    public void ring(){
        System.out.println("RRRRR...RRRRR...RRRRR");
    }
}
