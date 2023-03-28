package AbsFirst;

public abstract class AnimalAbs { // The differences between inherited classes and abstract classes.
    // 1. Class has abstract keyword. 2. Method use abstract keyword. 3. We are not allowed to use {}
    public abstract void makesound(); // Abstract method can not have a body.

    public void jump(){}
    // Abstract classes can have non-abstract methods in their body.
    // Non-abstract methods also called as CONCRETE METHODS.
}
