import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class Lab11 {

    public static void main(String[] args) {
    Display.openDefaultWorld();
    Display.setSize(36, 32);
    Display.setSpeed(10);

    new One(1, 20).display();
    new One(9, 20).display();
    new Three(17, 20).display();
    new Zero(25, 20).display();
    new Seven(33, 20).display();
    new Zero(1, 10).display();
    new Zero(9, 10).display();
    new Eight(17, 10).display();

    }
}
