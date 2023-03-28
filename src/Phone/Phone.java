package Phone;

public abstract class Phone {
    // We are not allowed to use access modifiers such as private, static, final.
    private int number;

    // Create a constructor.
    public Phone(int number){
        this.number = number;
    }

    // The benefits are: STH must be handled in child level; the methods we use will not be overridden; all the abstract methods are properly handled.
    // The similarities with the inheritance are: can use extend to define more classes.
    // Can gather arraylists under one "umbrella" arraylist.

    public abstract void call();
    public abstract void message();
    public abstract void ring();

    public String toString(){
        return "Phone{" +
                "number=" + this.number +
                '}';
    }
}
