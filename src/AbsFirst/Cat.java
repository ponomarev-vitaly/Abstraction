package AbsFirst;

import AbsFirst.AnimalAbs;

public class Cat extends AnimalAbs { // If we do inherets from abstract class we have to
    public void makesound(){
        System.out.println("Meow...");
    }

    public void move() {}
}
