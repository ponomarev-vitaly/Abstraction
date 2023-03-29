package GameController;

public class Mario extends Game{
    public void up() {
        System.out.println("----------");
    }


    public void down() {
        System.out.println("Mario goes in the pipes.");
    }


    public void right() {
        System.out.println("Mario stops / moves forward.");
    }


    public void left() {
        System.out.println("Mario stops / move backward.");
    }


    public void A() {
        System.out.println("Mario jumps.");
    }


    public void B() {
        System.out.println("Mario throws fire balls.");
    }
}
