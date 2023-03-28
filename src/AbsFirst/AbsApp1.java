package AbsFirst;

public class AbsApp1 {
    public static void main(String[] args) {
        AnimalInhert ai1 = new AnimalInhert(); // For the inherited classes we can use methods.
        ai1.makesound();
        ai1.jump();
        ai1.name();

//        AnimalAbs aa1 = new AnimalAbs() {
        // WE CAN NOT DEFINE AN OBJECT FROM AN ABSTRACT CLASS.
//            @Override
//            public void makesound() {
//
//            }
//        }
        AnimalAbs aa2 = new Cat();
    }

}
